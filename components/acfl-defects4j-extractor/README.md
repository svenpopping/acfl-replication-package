# Defects4J test case extractor

This component generates a single crash-reproducing test case or multiple crash-reproducing test cases for a given Defect4J project and a target frame.

## Run the component

An example command to run the `defects4j-extractor` is shown in below, which extracts the relevant passing and failing test cases from `LANG-19b` and stores them in the current directory.

```
docker run \
  -e PROJECT_ID=Lang \
  -e BUG_ID=9 \
  -v $(pwd)/tests-pass:/opt/runner/results/tests-pass \
  -v $(pwd)/tests-fail:/opt/runner/results/tests-fail \
  docker.pkg.github.com/svenpopping/acfl-replication-package/defects4j-extractor:latest
```

After the successful execution of the `defects4j-extractor`, the results are stored in the following directories:
- `tests-pass/` containing test classes with at least one relevant passing test case.
- `tests-pass/EXCLUDE_TEST_CASES` containing a line for each failing test cases in the format `className#testMethod`. The test cases in this file should be excluded from fault localization to ensure only passing test cases are executed.
- `tests-fail/` containing test classes with at least one relevant failing test case.
- `tests-fail/INCLUDE_TEST_CASES` containing a line for each bug triggering test cases in the format `className#testMethod`. The test cases in this file should be included in fault localization to ensure that the bug triggering test cases are executed.