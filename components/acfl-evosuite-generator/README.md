# EvoSuite test case generator

This component generates a test class for each distinct class in the stack trace corresponding to the crash.

## Run the component

An example command to run the `evosuite-generator` is shown in below, which generates the unit test classes for `LANG-19b` and stores the results in the current directory.

```
docker run
  -e PROJECT_ID=Lang
  -e BUG_ID=9
  -v $(pwd)/tests-evosuite:/opt/runner/results
  docker.pkg.github.com/svenpopping/acfl-replication-package/evosuite-generator:latest
```

After the successful execution of the `evosuite-generator`, the results are stored in the following directories:

- `tests-botsing/` containing the unit test classes relevant for the given Defects4J project. For each test class, a file containing the test classes itself (denoted by `className\_\-ESTest`), and a file containing the EvoSuite scaffolding (denoted by `className\_\-scaffolding\_\-ESTest`).
