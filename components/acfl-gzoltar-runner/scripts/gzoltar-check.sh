#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
DIR_RESULTS=$(realpath ${DIR_SCRIPT}/../results)

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
# Assert the test cases are executed correctly
# ------------------------------------------------------------------------------
header "Assert instrumentation"
message "OK" "Check failed and success test case count"

GZOLTAR_LOG=$(realpath ${DIR_RESULTS}/logs_run-test-methods.log)
COUNT_PASSING_TESTS=$(cat ${GZOLTAR_LOG} | grep 'false' | wc -l)
COUNT_FAILED_TESTS=$(cat ${GZOLTAR_LOG} | grep 'true' | wc -l)

EXPECTED_COUNT_PASSING_TESTS=$(cat ${DIR_RESULTS}/pass.tests | wc -l)
EXPECTED_COUNT_FAILING_TESTS=$(cat ${DIR_RESULTS}/fail.tests | wc -l)

if [[ ${EXPECTED_COUNT_PASSING_TESTS} -ne ${COUNT_PASSING_TESTS} ]]; then
  die "Incorrect passing test cases! Expected ${EXPECTED_COUNT_PASSING_TESTS} was ${COUNT_PASSING_TESTS}"
fi

if [[ ${EXPECTED_COUNT_FAILING_TESTS} -ne ${COUNT_FAILED_TESTS} ]]; then
  die "Incorrect failing test cases! Expected ${EXPECTED_COUNT_FAILING_TESTS} was ${COUNT_FAILED_TESTS}"
fi

# ------------------------------------------------------------------------------
# Check if the failing test cases fail
# ------------------------------------------------------------------------------
message "OK" "Check failing test case"

if [[ "${EXPECTED_COUNT_FAILING_TESTS}" -gt 0 ]]; then
  grep -v '^ *#' <"${DIR_RESULTS}/fail.tests" | while IFS= read -r LINE; do
    if [[ $(grep "${LINE#*,} " "${GZOLTAR_LOG}" | grep -c 'true') -ne 1 ]]; then
      die "Test case ${LINE} did not fail"
    fi

    if [[ $(grep -c "${LINE#*,} " "${GZOLTAR_LOG}") -ne 1 ]]; then
      die "Test case ${LINE} is executed multiple times"
    fi
  done
fi

# ------------------------------------------------------------------------------
# ACheck if the passing test cases fail
# ------------------------------------------------------------------------------
message "OK" "Check passing test case"

if [[ "${EXPECTED_COUNT_PASSING_TESTS}" -gt 0 ]]; then
  grep -v '^ *#' <"${DIR_RESULTS}/pass.tests" | while IFS= read -r LINE; do
    if [[ $(grep "${LINE#*,} " "${GZOLTAR_LOG}" | grep -c 'false') -ne 1 ]]; then
      die "Test case ${LINE} did fail"
    fi

    if [[ $(grep -c "${LINE#*,} " "${GZOLTAR_LOG}") -ne 1 ]]; then
      die "Test case ${LINE} is executed multiple times"
    fi
  done
fi
