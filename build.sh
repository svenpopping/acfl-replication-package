#!/usr/bin/env bash
set -e

docker build -t docker.pkg.github.com/svenpopping/acfl-replication-package/acfl-base-image:latest components/acfl-base-image
docker build -t docker.pkg.github.com/svenpopping/acfl-replication-package/botsing-generator:latest components/acfl-botsing-generator
docker build -t docker.pkg.github.com/svenpopping/acfl-replication-package/evosuite-generator:latest components/acfl-evosuite-generator
