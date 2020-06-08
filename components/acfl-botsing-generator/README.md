# Botsing test case generator

This component generates a single crash-reproducing test case or multiple crash-reproducing test cases for a given Defect4J project and a target frame.

## Run the component

An example command to run the `botsing-generator` is shown in below, which generates multiple crash-reproducing test cases for `LANG-19b` and target frame `4` with a maximum number of retries of `2`. The results are stored the results in the current directory.

```
docker run \
  -e PROJECT_ID=Lang \
  -e BUG_ID=9 \
  -e TARGET_FRAME=4 \
  -e MAX_RETRIES=2 \
  -e MULTIPLE=true \
  -v $(pwd)/tests-botsing:/opt/runner/results \
  docker.pkg.github.com/svenpopping/acfl-replication-package/botsing-generator:latest
```

After the successful execution of the `botsing-generator`, the results are stored in the following directories:
- `tests-botsing/` containing the crash-reproducing test class with one or multiple test cases, depending on the mode (single or multiple). For each test class, there is a file containing the test classes itself (denoted by `className_ESTest`), and a file containing the EvoSuite scaffolding (denoted by `className_scaffolding_ESTest`).
- `tests-botsing/logs` containing the logs of the latest Botsing execution.
