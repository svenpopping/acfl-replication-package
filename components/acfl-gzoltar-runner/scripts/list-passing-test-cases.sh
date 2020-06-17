#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_BUILD_TEST_PASS=$(realpath ${DIR_SCRIPT}/../data/tests-pass)
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
GZOLTAR_CLI_JAR=$(realpath ${DIR_SCRIPT}/../jars/gzoltarcli.jar)
[[ -s "$GZOLTAR_CLI_JAR" ]] || die "${GZOLTAR_CLI_JAR} does not exist or it is empty!"

EVOSUITE_JAR=$(realpath ${DIR_SCRIPT}/../jars/evosuite-standalone-runtime-1.0.6.jar)
[[ -s "$EVOSUITE_JAR" ]] || die "${EVOSUITE_JAR} does not exist or it is empty!"

JUNIT_JAR=$(realpath ${DIR_SCRIPT}/../jars/junit.jar)
[[ -s "$JUNIT_JAR" ]] || die "${JUNIT_JAR} does not exist or it is empty!"

# ------------------------------------------------------------------------------
# List the passing test cases
# ------------------------------------------------------------------------------
header "List passing test cases"

LIST_TEST_GREEN=$(realpath ${DIR_SCRIPT}/../results/pass.tests)
JARS=$(defects4j export -p cp.test -w ${DIR_APPLICATION} 2>/dev/null)
CLASS_PATH_TESTS=${DIR_BUILD_TEST_PASS}:${JARS}:${EVOSUITE_JAR}:${JUNIT_JAR}

# ------------------------------------------------------------------------------
# Compile test cases
# ------------------------------------------------------------------------------
message "OK" "Compile test cases"

for TEST_CASE in $(find ${DIR_BUILD_TEST_PASS} -name '*.java'); do
  javac -cp ${CLASS_PATH_TESTS} ${TEST_CASE} 2>/dev/null
done

# ------------------------------------------------------------------------------
# List the passing test cases
# ------------------------------------------------------------------------------
message "OK" "List passing test cases"

java -cp ${CLASS_PATH_TESTS}:${GZOLTAR_CLI_JAR} \
  com.gzoltar.cli.Main listTestMethods ${DIR_BUILD_TEST_PASS} \
  --outputFile ${LIST_TEST_GREEN} \
  --quiet

message "OK" "Found $(cat ${LIST_TEST_GREEN} | wc -l) passing test cases"

# ------------------------------------------------------------------------------
# List the test cases to exclude in the SFL
# ------------------------------------------------------------------------------
EXCLUDE_TEST_CASES=$(realpath ${DIR_BUILD_TEST_PASS}/EXCLUDE_TEST_CASES)

if [[ -f ${EXCLUDE_TEST_CASES} ]]; then
  message "OK" "Remove exclude test cases"
  for LINE in $(cat ${EXCLUDE_TEST_CASES}); do
    sed -i "/${LINE}/d" ${LIST_TEST_GREEN}
  done

  message "OK" "Found $(cat ${LIST_TEST_GREEN} | wc -l) pass test cases"
fi
