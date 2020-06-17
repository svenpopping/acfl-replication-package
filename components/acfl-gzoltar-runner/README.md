# GZoltar runner

This component generates applies spectrum-based fault localization to different combinations of test suites.

## Run the component

An example command to run the `gzoltar-runner` is shown in below, which generates the unit test classes for `LANG-19b` and stores the results in the current directory.

```
docker run \
  -e PROJECT_ID=Lang \
  -e BUG_ID=9 \
  -v <path-to-passing-tests>:/opt/runner/data/tests-pass \
  -v <path-to-failing-tests>:/opt/runner/data/tests-fail \
  -v $(pwd)/results:/opt/runner/results/sfl/txt \
  docker.pkg.github.com/svenpopping/acfl-replication-package/gzoltar-runner:latest
```

After the successful execution of the `gzoltar-runner`, the results are stored in the following directories:

- `barinel.ranking.csv, dstar.ranking.csv, ochiai.ranking.csv, tarantula.ranking.csv` containing the ranking of the statements in the project, sorted by their suspiciousness level, calculated using the Barinel, DStar, Ochiai and Tarantula coefficient, respectively.
- `matrix.txt` containing the program spectrum matrix, where each row represents a test case and its outcome, and each column represents a statement (1 means that a test case covered a line of code, 0 otherwise).
- `tests.csv` a list of all test cases and its outcome, runtime in nanoseconds, and the stack trace (in case of a failing test case).
- `spectra.csv` a list of all lines of code executed by a test case. Each row follows the following format: `className\#methodName(methodParameters):lineNumber`.
- `gzoltar.tests` containing a list of all the test cases used in the fault localization process.
- `logs_run-test-methods.log` containing the outcome of all the test cases. If a test case fails, the logs contain also the produced stack trace.