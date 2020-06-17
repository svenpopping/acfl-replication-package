#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_APPLICATION=$(realpath ${DIR_SCRIPT}/../data/application)
DIR_BUILD=$(realpath ${DIR_SCRIPT}/../.build)
DIR_RESULTS=$(realpath ${DIR_SCRIPT}/../results)

# ------------------------------------------------------------------------------
# Variables
# ------------------------------------------------------------------------------
FORMULA=$1

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
# Generate the fault localization report
# ------------------------------------------------------------------------------
D4J_JARS=$(defects4j export -p cp.test -w ${DIR_APPLICATION} 2>/dev/null)
CLASS_PATH=${D4J_JARS}:${EVOSUITE_JAR}:${JUNIT_JAR}:${JAVAX_JAR}:${GZOLTAR_AGENT_JAR}:${GZOLTAR_CLI_JAR}

message "OK" "Computing ranking with ${FORMULA}"
SER_FILE=$(realpath ${DIR_SCRIPT}/../results/coverage.gzoltar.ser)
java -cp ${DIR_BUILD}:${CLASS_PATH} \
  com.gzoltar.cli.Main faultLocalizationReport \
  --buildLocation ${DIR_BUILD} \
  --granularity "line" \
  --inclPublicMethods \
  --inclStaticConstructors \
  --inclDeprecatedMethods \
  --dataFile ${SER_FILE} \
  --outputDirectory ${DIR_RESULTS} \
  --family "sfl" \
  --formula ${FORMULA} \
  --metric "entropy" \
  --formatter "txt" \
  --quiet