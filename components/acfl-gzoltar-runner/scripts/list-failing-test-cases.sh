#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_BUILD_TEST_FAIL=$(realpath ${DIR_SCRIPT}/../data/tests-fail)
DIR_APPLICATION=$(realpath ${DIR_SCRIPT}/../data/application)

# ------------------------------------------------------------------------------
# Helper functions
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
GZOLTAR_CLI_JAR=${DIR_SCRIPT}/../jars/gzoltarcli.jar
[[ -s "$GZOLTAR_CLI_JAR" ]] || die "${GZOLTAR_CLI_JAR} does not exist or it is empty!"

EVOSUITE_JAR=$(realpath ${DIR_SCRIPT}/../jars/evosuite-standalone-runtime-1.0.6.jar)
[[ -s "$EVOSUITE_JAR" ]] || die "${EVOSUITE_JAR} does not exist or it is empty!"

JUNIT_JAR=$(realpath ${DIR_SCRIPT}/../jars/junit.jar)
[[ -s "$JUNIT_JAR" ]] || die "${JUNIT_JAR} does not exist or it is empty!"

# ------------------------------------------------------------------------------
# List the failing test cases
# ------------------------------------------------------------------------------
header "List failing tests cases"

LIST_TEST_RED=$(realpath ${DIR_SCRIPT}/../results/fail.tests)
JARS=$(defects4j export -p cp.test -w ${DIR_APPLICATION} 2>/dev/null)
CLASS_PATH_TESTS=${DIR_BUILD_TEST_FAIL}:${JARS}:${EVOSUITE_JAR}:${JUNIT_JAR}

# ------------------------------------------------------------------------------
# Compile test cases
# ------------------------------------------------------------------------------
message "OK" "Compile test cases"

for TEST_CASE in $(find ${DIR_BUILD_TEST_FAIL} -name '*.java'); do
  javac -cp ${CLASS_PATH_TESTS} ${TEST_CASE} 2>/dev/null
done

# ------------------------------------------------------------------------------
# List the test cases to include in the SFL
# ------------------------------------------------------------------------------
message "OK" "List the test methods"

INCLUDE_TEST_CASES_FILE=$(realpath ${DIR_BUILD_TEST_FAIL}/INCLUDE_TEST_CASES)

if [[ -f ${INCLUDE_TEST_CASES_FILE} ]]; then
  INCLUDE_TEST_CASES_STRING=$(cat ${INCLUDE_TEST_CASES_FILE} | sed -e 's/ /\n/g' | tr "\n" ":")

  java -cp ${CLASS_PATH_TESTS}:${GZOLTAR_CLI_JAR} \
    com.gzoltar.cli.Main listTestMethods ${DIR_BUILD_TEST_FAIL} \
    --includes ${INCLUDE_TEST_CASES_STRING} \
    --outputFile ${LIST_TEST_RED} \
    --quiet
else
  java -cp ${CLASS_PATH_TESTS}:${GZOLTAR_CLI_JAR} \
    com.gzoltar.cli.Main listTestMethods ${DIR_BUILD_TEST_FAIL} \
    --outputFile ${LIST_TEST_RED} \
    --quiet
fi

message "OK" "Found $(cat ${LIST_TEST_RED} | wc -l) failing test cases"
