#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_RESULTS=$(realpath ${DIR_SCRIPT}/../results)

DIR_BUILD=$(realpath ${DIR_SCRIPT}/../.build/)
DIR_INSTRUMENT=$(realpath ${DIR_SCRIPT}/../.build-instrument/)
DIR_APPLICATION=$(realpath ${DIR_SCRIPT}/../data/application)
DIR_APPLICATION_TARGET=$(defects4j export -p dir.bin.classes -w ${DIR_APPLICATION} 2>/dev/null)

DIR_BUILD_APPLICATION=$(realpath ${DIR_APPLICATION}/${DIR_APPLICATION_TARGET})
DIR_BUILD_TEST_PASS=$(realpath ${DIR_SCRIPT}/../data/tests-pass)
DIR_BUILD_TEST_FAIL=$(realpath ${DIR_SCRIPT}/../data/tests-fail)

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

GZOLTAR_AGENT_JAR=${DIR_SCRIPT}/../jars/gzoltaragent.jar
[[ -s "$GZOLTAR_AGENT_JAR" ]] || die "${GZOLTAR_AGENT_JAR} does not exist or it is empty!"

EVOSUITE_JAR=${DIR_SCRIPT}/../jars/evosuite-standalone-runtime-1.0.6.jar
[[ -s "$EVOSUITE_JAR" ]] || die "${EVOSUITE_JAR} does not exist or it is empty!"

JUNIT_JAR=$(realpath ${DIR_SCRIPT}/../jars/junit.jar)
[[ -s "$JUNIT_JAR" ]] || die "${JUNIT_JAR} does not exist or it is empty!"

JAVAX_JAR=$(realpath ${DIR_SCRIPT}/../jars/javax.servlet-api-4.0.1.jar)
[[ -s "$JAVAX_JAR" ]] || die "${JAVAX_JAR} does not exist or it is empty!"

# ------------------------------------------------------------------------------
# Copy the classes needed for the instrumentation
# ------------------------------------------------------------------------------
header "Code instrumentation"

message "OK" "Create build and instrumentation directory"
mkdir -p ${DIR_BUILD} ${DIR_INSTRUMENT}

message "OK" "Copy application to build"
cp -R ${DIR_BUILD_APPLICATION}/* ${DIR_BUILD}

message "OK" "Copy pass tests cases to build"
cp -R ${DIR_BUILD_TEST_PASS}/* ${DIR_BUILD}

message "OK" "Copy fail test cases to build"
cp -R ${DIR_BUILD_TEST_FAIL}/* ${DIR_BUILD}

message "OK" "Clean up build jar"
find ${DIR_BUILD} -name '*.bak' -exec rm {} \; -or -name '*_cleaned.java' -exec rm {} \;

# ------------------------------------------------------------------------------
# Install the GZoltar instrumentation
# ------------------------------------------------------------------------------
D4J_JARS=$(defects4j export -p cp.test -w ${DIR_APPLICATION} 2>/dev/null)
CLASS_PATH=${D4J_JARS}:${EVOSUITE_JAR}:${JUNIT_JAR}:${JAVAX_JAR}:${GZOLTAR_AGENT_JAR}:${GZOLTAR_CLI_JAR}

message "OK" "GZoltar code instrumentation"
java -cp ${DIR_BUILD}:${CLASS_PATH} \
  com.gzoltar.cli.Main instrument \
  --outputDirectory ${DIR_INSTRUMENT} \
  ${DIR_BUILD} \
  --quiet

# ------------------------------------------------------------------------------
# Install the GZoltar instrumentation
# ------------------------------------------------------------------------------
LIST_TEST_GZOLTAR=$(realpath ${DIR_RESULTS}/gzoltar.tests)
rm -f ${LIST_TEST_GZOLTAR} && touch ${LIST_TEST_GZOLTAR}

LIST_TEST_GREEN=$(realpath ${DIR_RESULTS}/pass.tests)
LIST_TEST_RED=$(realpath ${DIR_RESULTS}/fail.tests)

cat ${LIST_TEST_GREEN} >>${LIST_TEST_GZOLTAR}
cat ${LIST_TEST_RED} >>${LIST_TEST_GZOLTAR}

# ------------------------------------------------------------------------------
# Run each test case in isolation
# ------------------------------------------------------------------------------
message "OK" "Run all test separately"

GZOLTAR_LOG=$(realpath ${DIR_RESULTS}/logs_run-test-methods.log)
SER_FILE=$(realpath ${DIR_RESULTS}/coverage.gzoltar.ser)

java -cp ${DIR_INSTRUMENT}:${CLASS_PATH}: \
  -Dgzoltar-agent.destfile="${SER_FILE}" \
  -Dgzoltar-agent.output="file" \
  com.gzoltar.cli.Main runTestMethods \
  --testMethods ${LIST_TEST_GZOLTAR} \
  --offline \
  --collectCoverage >${GZOLTAR_LOG}

# ------------------------------------------------------------------------------
# Remove the instrumentation classes
# ------------------------------------------------------------------------------
rm -rf ${DIR_INSTRUMENT}
