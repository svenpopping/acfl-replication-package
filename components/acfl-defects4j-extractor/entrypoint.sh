#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Intro
# ------------------------------------------------------------------------------
cat <<"EOF"
  _____        __          _       _  _       _   ______      _                  _             
 |  __ \      / _|        | |     | || |     | | |  ____|    | |                | |            
 | |  | | ___| |_ ___  ___| |_ ___| || |_    | | | |__  __  _| |_ _ __ __ _  ___| |_ ___  _ __ 
 | |  | |/ _ \  _/ _ \/ __| __/ __|__   _|   | | |  __| \ \/ / __| '__/ _` |/ __| __/ _ \| '__|
 | |__| |  __/ ||  __/ (__| |_\__ \  | || |__| | | |____ >  <| |_| | | (_| | (__| || (_) | |   
 |_____/ \___|_| \___|\___|\__|___/  |_| \____/  |______/_/\_\\__|_|  \__,_|\___|\__\___/|_|   
                                                                                               
                                                                                               
EOF

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_APPLICATION=${DIR_SCRIPT}/application
DIR_RESULTS=${DIR_SCRIPT}/results

# ------------------------------------------------------------------------------
# Helper function
# ------------------------------------------------------------------------------
function header() {
    echo ''
    echo "##################################################################################"
    echo -e "#                                                                                #\r# $1"
    echo "##################################################################################"
}

function message() {
    echo -e "........................................................................... $1\r$2" >&2
}

function die() {
    message "ERROR" "$@" >&2
    exit 1
}

# ------------------------------------------------------------------------------
# Check usage
# ------------------------------------------------------------------------------
USAGE='Environment variables PROJECT_ID, BUG_ID are required!'

[[ "${PROJECT_ID}" != "" ]] || die "${USAGE}"
[[ "${BUG_ID}" != "" ]] || die "${USAGE}"

# ------------------------------------------------------------------------------
# Checkout & Compile the Defects4J project
# ------------------------------------------------------------------------------
function checkout_and_compile() {
    header 'APPLICATION CHECKOUT'

    message "INFO" "Checkout ${PROJECT_ID}-${BUG_ID}f"
    defects4j checkout -p ${PROJECT_ID} -v ${BUG_ID}f -w ${DIR_APPLICATION}

    message "INFO" "Compile project and test suite"
    defects4j compile -w ${DIR_APPLICATION}
}

# ------------------------------------------------------------------------------
# List all the relevant classes.
# ------------------------------------------------------------------------------
function list_relevant_classes() {
    header 'LIST RELEVANT CLASSES'

    RELEVANT_CLASSES=()
    for LINE in $(cat ${DIR_SCRIPT}/crashes/${PROJECT_ID}-${BUG_ID}b.log | tail -n +2); do
        if [[ "${LINE}" == "at" ]]; then
            continue
        fi

        ELEMENT=$(echo ${LINE} | sed -e 's/.[^.]*(.*)$//')
        message "ADDED" "${ELEMENT}"
        RELEVANT_CLASSES+=("${ELEMENT}")
    done

    RELEVANT_CLASSES=$(echo ${RELEVANT_CLASSES[@]} | tr " " "\n" | sort | uniq)
}

# ------------------------------------------------------------------------------
# List all the relevant test classes
# ------------------------------------------------------------------------------
function list_relevant_test_classes() {
    header 'LIST RELEVANT PASSING TEST CLASSES'

    RELEVANT_TEST_CLASSES=()
    defects4j export -p tests.all -w ${DIR_APPLICATION} >/tmp/all-test-cases.txt 2>/dev/null

    echo -n 'Total number of test cases: '
    cat /tmp/all-test-cases.txt | wc -l
    echo ''

    for LINE in $(cat /tmp/all-test-cases.txt); do
        defects4j monitor.test -t ${LINE} -w ${DIR_APPLICATION} >/tmp/loaded-classes 2>/dev/null || continue
        MESSAGE="SKIP"

        for RELEVANT_CLASS in ${RELEVANT_CLASSES[@]}; do
            if grep -q ${RELEVANT_CLASS} "/tmp/loaded-classes"; then
                RELEVANT_TEST_CLASSES+=("${LINE}")
                MESSAGE="ADDED"
                break
            fi
        done

        message ${MESSAGE} ${LINE}
    done </tmp/all-test-cases.txt
}

# ------------------------------------------------------------------------------
# Check if not missing any test classes based on the Defects4J list
# ------------------------------------------------------------------------------
function check_missing_test_cases() {
    header 'RESULTS'

    message "INFO" "List relevant test classes"

    printf "%s\n" "${RELEVANT_TEST_CLASSES[@]}" >/tmp/relevant-test-cases
    defects4j export -p tests.relevant -w ${DIR_APPLICATION} -o /tmp/defects4j-relevant-test-cases 2>/dev/null

    if [[ $(grep -Fxv -f /tmp/relevant-test-cases /tmp/defects4j-relevant-test-cases | wc -l) -gt 0 ]]; then
        message 'ERROR' "Did not find all relevant test cases"

        grep -Fxv -f /tmp/relevant-test-cases /tmp/defects4j-relevant-test-cases >>/tmp/relevant-test-cases
        message 'INFO' 'Adding missing relevant test cases'
    fi

    message "INFO" "Found $(grep -Fxv -f /tmp/defects4j-relevant-test-cases /tmp/relevant-test-cases | wc -l) additional test cases"
}

# ------------------------------------------------------------------------------
# Copy the relevant test cases
# ------------------------------------------------------------------------------
function copy_relevant_test_cases() {
    message "INFO" "Copy relevant test cases"
    BUILD_DIR_TEST=$(defects4j export -p dir.src.tests -w ${DIR_APPLICATION} 2>/dev/null)

    DIR_TEST_PASS=${DIR_RESULTS}/tests-pass
    rm -rf ${DIR_TEST_PASS}/*

    for CLASS in $(cat /tmp/relevant-test-cases); do
        SOURCE_FILE_NAME=${DIR_APPLICATION}/${BUILD_DIR_TEST}/${CLASS//./\/}.java
        TARGET_FILE_NAME=${DIR_TEST_PASS}/${CLASS//./\/}.java

        mkdir -p $(dirname ${TARGET_FILE_NAME})
        cp ${SOURCE_FILE_NAME} ${TARGET_FILE_NAME}
    done
}

# ------------------------------------------------------------------------------
# Exclude the failing test cases
# ------------------------------------------------------------------------------
function exclude_test_cases() {
    message "INFO" "Checkout ${PROJECT_ID}-${BUG_ID}b"
    defects4j checkout -p ${PROJECT_ID} -v ${BUG_ID}b -w ${DIR_APPLICATION} 2>/dev/null

    message "INFO" "Compile project and test suite"
    defects4j compile -w ${DIR_APPLICATION} 2>/dev/null

    message "INFO" "Compress test suite"
    TAR_FILE_NAME=${PROJECT_ID}-${BUG_ID}b-relevant.1.tar.bz2
    TAR_FILE=${DIR_SCRIPT}/${TAR_FILE_NAME}

    cd ${DIR_TEST_PASS}
    tar -cjf ${TAR_FILE} org
    cd ${DIR_SCRIPT}

    message "INFO" "List failing test cases"
    printf "%s\n" $(defects4j test -s ${TAR_FILE} -w ${DIR_APPLICATION} 2>/dev/null) >/tmp/failing-tests

    cat > ${DIR_TEST_PASS}/EXCLUDE_TEST_CASES
    for LINE in $(tail -n +4 /tmp/failing-tests); do
        if [[ "${LINE}" == "-" ]]; then
            continue
        fi

        echo ${LINE} | sed -e 's/::/#/g' >>${DIR_TEST_PASS}/EXCLUDE_TEST_CASES
    done

    rm ${TAR_FILE}
}

# ------------------------------------------------------------------------------
# List the failing test cases
# ------------------------------------------------------------------------------
function list_failing_test_cases() {
    header "LIST FAILING TEST CASE"

    DIR_TEST_FAIL=${DIR_RESULTS}/tests-fail
    mkdir -p ${DIR_TEST_FAIL}
    rm -rf ${DIR_TEST_FAIL}/*

    touch ${DIR_TEST_FAIL}/INCLUDE_TEST_CASES
    echo $(defects4j export -p tests.trigger -w ${DIR_APPLICATION} 2>/dev/null) | sed -e 's/::/#/g' >>${DIR_TEST_FAIL}/INCLUDE_TEST_CASES

    for LINE in $(cat ${DIR_TEST_FAIL}/INCLUDE_TEST_CASES); do
        CLASS_NAME=$(echo ${LINE} | sed -e 's/#.*//' | sed -e 's/\./\//g').java
        SOURCE_FILE_NAME=${DIR_APPLICATION}/${BUILD_DIR_TEST}/${CLASS_NAME}
        TARGET_FILE_NAME=${DIR_TEST_FAIL}/${CLASS_NAME}

        mkdir -p $(dirname ${TARGET_FILE_NAME})
        cp ${SOURCE_FILE_NAME} ${TARGET_FILE_NAME}

        message "ADDED" ${LINE}
    done
}

# ------------------------------------------------------------------------------
# Startup
# ------------------------------------------------------------------------------
function main() {
    checkout_and_compile
    
    list_relevant_classes
    list_relevant_test_classes
    check_missing_test_cases
    copy_relevant_test_cases
    exclude_test_cases

    list_failing_test_cases
}

main
exit $?
