#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_RESULTS=$(realpath ${DIR_SCRIPT}/../results)
DIR_BUILD_TEST_GREEN=$(realpath ${DIR_SCRIPT}/../data/tests-pass)
DIR_BUILD_TEST_RED=$(realpath ${DIR_SCRIPT}/../data/tests-fail)

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
# Remove compile classes
# ------------------------------------------------------------------------------
find ${DIR_BUILD_TEST_GREEN} -name '*.class' -delete
find ${DIR_BUILD_TEST_RED} -name '*.class' -delete

# ------------------------------------------------------------------------------
# Move necessary files
# ------------------------------------------------------------------------------
mv ${DIR_RESULTS}/pass.tests ${DIR_RESULTS}/sfl/txt/
mv ${DIR_RESULTS}/fail.tests ${DIR_RESULTS}/sfl/txt/
mv ${DIR_RESULTS}/gzoltar.tests ${DIR_RESULTS}/sfl/txt/
mv ${DIR_RESULTS}/logs_run-test-methods.log ${DIR_RESULTS}/sfl/txt/

# ------------------------------------------------------------------------------
# Cleanup the SFL file
# ------------------------------------------------------------------------------
message "OK" "Cleanup SFL file"
php $(realpath ${DIR_SCRIPT}/../cleanup.php)

# ------------------------------------------------------------------------------
# Remove build and resources
# ------------------------------------------------------------------------------
RESOURCE_DIRECTORY=$(realpath ${DIR_SCRIPT}/../src/)
rm -rf ${RESOURCE_DIRECTORY}
DIR_BUILD=$(realpath ${DIR_SCRIPT}/../.build)
rm -rf ${DIR_BUILD}
