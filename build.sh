#!/usr/bin/env bash
set -e

DOCKER_REPO="docker.pkg.github.com/svenpopping/acfl-replication-package"

docker build -t ${DOCKER_REPO}/acfl-base-image:latest components/acfl-base-image
docker build -t ${DOCKER_REPO}/botsing-generator:latest components/acfl-botsing-generator
docker build -t ${DOCKER_REPO}/evosuite-generator:latest components/acfl-evosuite-generator
docker build -t ${DOCKER_REPO}/defects4j-extractor:latest components/acfl-defects4j-extractor
docker build -t ${DOCKER_REPO}/gzoltar-runner:latest components/acfl-gzoltar-runner