#!/usr/bin/env bash
set -e


# ------------------------------------------------------------------------------

cat <<"EOF"
  ____        _       _                _____                           _             
 |  _ \      | |     (_)              / ____|                         | |            
 | |_) | ___ | |_ ___ _ _ __   __ _  | |  __  ___ _ __   ___ _ __ __ _| |_ ___  _ __ 
 |  _ < / _ \| __/ __| | '_ \ / _` | | | |_ |/ _ \ '_ \ / _ \ '__/ _` | __/ _ \| '__|
 | |_) | (_) | |_\__ \ | | | | (_| | | |__| |  __/ | | |  __/ | | (_| | || (_) | |   
 |____/ \___/ \__|___/_|_| |_|\__, |  \_____|\___|_| |_|\___|_|  \__,_|\__\___/|_|   
                               __/ |                                                 
                              |___/                                                  

EOF

# ------------------------------------------------------------------------------

DIR_SCRIPT=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

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

BOTSING_REPRODUCTION_JAR=${DIR_SCRIPT}/botsing/botsing-reproduction-1.0.8-SNAPSHOT.jar
[[ -s ${BOTSING_REPRODUCTION_JAR} ]] || die "$BOTSING_REPRODUCTION_JAR does not exist or it is empty!"

EVOSUITE_JAR=${DIR_SCRIPT}/botsing/evosuite.jar
[[ -s ${EVOSUITE_JAR} ]] || die "$EVOSUITE_JAR does not exist or it is empty!"

HAMCREST_JAR=${DIR_SCRIPT}/botsing/hamcrest-core-1.1.jar
[[ -s ${HAMCREST_JAR} ]] || die "$HAMCREST_JAR does not exist or it is empty!"

JUNIT_JAR=${DIR_SCRIPT}/botsing/junit.jar
[[ -s ${JUNIT_JAR} ]] || die "$JUNIT_JAR does not exist or it is empty!"


# ------------------------------------------------------------------------------

if [[ $1 != "" ]]; then
    PROJECT_ID=$1
fi

if [[ $2 != "" ]]; then
    BUG_ID=$2
fi

if [[ $3 != "" ]]; then
    TARGET_FRAME=$3
fi

if [[ $4 != "" ]]; then
    MAX_RETRIES=$4
fi

if [[ $5 != "" ]]; then
    MULTIPLE=$5
fi


# ------------------------------------------------------------------------------

USAGE='Environment variables PROJECT_ID, BUG_ID, TARGET_FRAME, MAX_RETRIES and MULTIPLE are required!'

[[ "${PROJECT_ID}" != "" ]] || die "${USAGE}"
[[ "${BUG_ID}" != "" ]] || die "${USAGE}"
[[ "${TARGET_FRAME}" != "" ]] || die "${USAGE}"
[[ "${MAX_RETRIES}" != "" ]] || die "${USAGE}"
[[ "${MULTIPLE}" != "" ]] || die "${USAGE}"
[[ "${MULTIPLE}" == "true" ]] && MULTIPLE=1 || MULTIPLE=0


# ------------------------------------------------------------------------------

header 'APPLICATION CHECKOUT'

DIR_APPLICATION=${DIR_SCRIPT}/application

message "INFO" "Checkout ${PROJECT_ID}-${BUG_ID}b"
defects4j checkout -p ${PROJECT_ID} -v ${BUG_ID}b -w ${DIR_APPLICATION}

message "INFO" "Compile project and test suite"
defects4j compile -w ${DIR_APPLICATION} 2> /dev/null


# ------------------------------------------------------------------------------

function main() {
    header 'RUN BOTSING'

    CRASH_LOG=${DIR_SCRIPT}/crashes/${PROJECT_ID}-${BUG_ID}b.log
    DIR_BUILD_SOURCE=${DIR_APPLICATION}/$(defects4j export -p dir.bin.classes -w ${DIR_APPLICATION} 2> /dev/null)
    DIR_BUILD_TEST=${DIR_APPLICATION}/$(defects4j export -p dir.bin.tests -w ${DIR_APPLICATION} 2> /dev/null)

    DIR_RESULTS=${DIR_SCRIPT}/results
    mkdir -p ${DIR_RESULTS}
    rm -rf ${DIR_RESULTS:?}/*

    REPRODUCTION_LOGS=${DIR_RESULTS}/logs/botsing.reproduction.log
    mkdir -p ${DIR_RESULTS}/logs

    one_run
    message 'DONE' 'Done'
}

# ------------------------------------------------------------------------------
# Run Botsing once.
# ------------------------------------------------------------------------------
function run_botsing() {
    BUILD_JARS=$(defects4j export -p cp.test -w ${DIR_APPLICATION} 2> /dev/null)

    java -jar ${BOTSING_REPRODUCTION_JAR} \
        -project_cp ${DIR_BUILD_SOURCE}:${DIR_BUILD_TEST}:${BUILD_JARS} \
        -search_algorithm SPEA2 \
        -fitness WeightedSum:TestLen:CallDiversity \
        $([[ ${MULTIPLE} == '1' ]] && echo '-continue_after_reproduction' || echo '') \
        -crash_log ${CRASH_LOG} \
        -Dtest_dir=${DIR_RESULTS} \
        -Dno_runtime_dependency=false \
        -target_frame ${TARGET_FRAME} \
        -Dsearch_budget=180 \
        -Dpopulation=100 \
        -Dcatch_undeclared_exceptions=false > ${REPRODUCTION_LOGS}
}

# ------------------------------------------------------------------------------
# One run of Botsing.
# ------------------------------------------------------------------------------
function one_run () {
    message 'INFO' 'Running Botsing on the problem'
    SUCCESSFUL=false

    for (( TRY = 0; TRY < ${MAX_RETRIES}; ++TRY )); do
        run_botsing

        TEST_CASE_NAME=$(find ${DIR_RESULTS} -name '*_ESTest.java' | head -n 1)
        if grep -Fq 'notGeneratedAnyTest' ${TEST_CASE_NAME}; then
            message 'ERROR' 'Generated an empty test case. Re-try'
        else
            if [[ ${MULTIPLE} == 1 ]]; then
                if grep -Fq 'Detect a new crash reproducing test case' ${REPRODUCTION_LOGS}; then
                    message 'SUCCESS' 'Found the optimal solution'
                    SUCCESSFUL=true
                    break;
                else
                    message 'ERROR' 'Failed to find a solution. Re-try'
                fi
            else
                if grep -Fq 'target crash is covered' ${REPRODUCTION_LOGS}; then
                    message 'SUCCESS' 'Found the optimal solution'
                    SUCCESSFUL=true
                    break;
                else
                    message 'ERROR' 'Failed to find a solution. Re-try'
                fi
            fi
        fi
    done

    if [[ "${SUCCESSFUL}" == false ]]; then
        cd ${DIR_RESULTS}
        find * ! -name 'logs' -type d -exec rm -rf {} +
        cd ${DIR_SCRIPT}
        die "Failed to generate a test case"
    fi

    tail -n 10 ${REPRODUCTION_LOGS}
}

# ------------------------------------------------------------------------------
#
# ------------------------------------------------------------------------------
main
exit $?
