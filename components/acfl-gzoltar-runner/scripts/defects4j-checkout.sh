#!/usr/bin/env bash
set -e

# ------------------------------------------------------------------------------
# Default folders
# ------------------------------------------------------------------------------
DIR_SCRIPT=$(cd $(dirname ${BASH_SOURCE[0]}) && pwd)
PROJECT_ID=$1
BUG_ID=$2

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
# Checkout & compile the application
# ------------------------------------------------------------------------------
header "Checkout application"

message "OK" "Checkout application"
DIR_APPLICATION=$(realpath ${DIR_SCRIPT}/../data/application)
rm -rf ${DIR_APPLICATION}
defects4j checkout -p ${PROJECT_ID} -v ${BUG_ID}b -w ${DIR_APPLICATION}

message "OK" "Compile application"
defects4j compile -w ${DIR_APPLICATION}

# ------------------------------------------------------------------------------
# Copy the required resources (For the TIME projects)
# ------------------------------------------------------------------------------
message "OK" "Copy test resources"

RESOURCE_DIRECTORY="src/test/resources"
if [[ -d "${DIR_APPLICATION}/${RESOURCE_DIRECTORY}" ]]; then
  mkdir -p ${RESOURCE_DIRECTORY}
  cp -R ${DIR_APPLICATION}/${RESOURCE_DIRECTORY}/* ${RESOURCE_DIRECTORY}
fi
