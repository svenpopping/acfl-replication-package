#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Intro
# ------------------------------------------------------------------------------
cat <<"EOF"
  ______                    _ _          _____                           _             
 |  ____|                  (_) |        / ____|                         | |            
 | |____   _____  ___ _   _ _| |_ ___  | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
 |  __\ \ / / _ \/ __| | | | | __/ _ \ | | |_ |/ _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
 | |___\ V / (_) \__ \ |_| | | ||  __/ | |__| |  __/ | | |  __/ | | (_| | || (_) | |   
 |______\_/ \___/|___/\__,_|_|\__\___|  \_____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
                                                                                       
                                                                                       
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
# Libraries
# ------------------------------------------------------------------------------
EVO_SUITE_JAR=${DIR_SCRIPT}/libs/evosuite-1.0.6.jar

[[ -s "$EVO_SUITE_JAR" ]] || die "$EVO_SUITE_JAR does not exist or it is empty!"

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

    message "INFO" "Checkout ${PROJECT_ID}-${BUG_ID}b"
    defects4j checkout -p ${PROJECT_ID} -v ${BUG_ID}b -w ${DIR_APPLICATION}

    message "INFO" "Compile project and test suite"
    defects4j compile -w ${DIR_APPLICATION}
}

# ------------------------------------------------------------------------------
# List all the relevant classes based on the stack trace of the crash
# ------------------------------------------------------------------------------
function list_relevant_classes() {
    header 'RELEVANT CLASSES'

    RELEVANT_CLASSES=()
    for LINE in $(cat ${DIR_SCRIPT}/crashes/${PROJECT_ID}-${BUG_ID}b.log | tail -n +2); do
        if [[ "${LINE}" == "at" ]]; then
            continue
        fi

        ELEMENT=$(echo ${LINE} | sed -e 's/.[^.]*(.*)$//')
        message "ADDED" "${ELEMENT}"
        RELEVANT_CLASSES+=("${ELEMENT}")
    done

    UNIQUE_RELEVANT_CLASSES=$(echo ${RELEVANT_CLASSES[@]} | tr " " "\n" | sort | uniq)
}

# ------------------------------------------------------------------------------
# Run EvoSuite
# ------------------------------------------------------------------------------
function run_evosuite() {
    header 'EVOSUITE'

    BUILD_DIR_TEST=${DIR_APPLICATION}/$(defects4j export -p dir.bin.classes -w ${DIR_APPLICATION} 2>/dev/null)
    EVO_SUITE="java -jar ${EVO_SUITE_JAR}"

    for RELEVANT_CLASS in ${UNIQUE_RELEVANT_CLASSES}; do
        ${EVO_SUITE} -class ${RELEVANT_CLASS} -projectCP ${BUILD_DIR_TEST} -Dtest_dir=${DIR_RESULTS}
    done
}

# ------------------------------------------------------------------------------
# Startup
# ------------------------------------------------------------------------------
function main() {
    checkout_and_compile
    list_relevant_classes
    run_evosuite
}

main
exit $?
