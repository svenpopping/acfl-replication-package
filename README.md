# Automated Crash Fault Localization - Replication package

Welcome! This repository contains the replication package of my thesis entitled 'Automated Crash Fault Localization'. It has been written to obtain the degree of Master of Science at the Delft University of Technology within the Computer Science program.


## Depending on

- [Botsing](https://github.com/STAMP-Project/botsing) - Botsing is a Java framework for crash reproduction.
- [GZoltar](https://github.com/GZoltar/gzoltar) - Java Library for Automatic Debugging
- [EvoSuite](https://github.com/EvoSuite/evosuite) - Automated generation of JUnit test suites for Java classes
- [Defects4J](https://github.com/rjust/defects4j) - Database of real faults and an experimental infrastructure to enable controlled experiments in Software Engineering Research 


## Structure

```text
acfl-replication-package:
|--- components:                        The components created for the evaluation
|   |--- acfl-base-image:               Docker base images
|   |--- acfl-botsing-generator:        Botsing generator component
|   |--- acfl-defects4j-extractor:      Defects4J extractor component
|   |--- acfl-evosuite-generator:       EvoSuite generator component
|--- data:
|   |--- problems:                      The test suites used for the evaluation     
|   |   |--- <project_id>-<bug_id>:     Defects4J reproducible bugs
|   |   |   |--- frame-<target_frame>:  Target frame used for crash-reproduction
|   |   |   |   |--- tests-fail-bot-+:  Multiple failing generated crash-reproducing test cases
|   |   |   |   |--- tests-fail-bot-1:  Single failing generated crash-reproducing test cases
|   |   |   |   |--- tests-fail-man-+:  Relevant failing hand-written test cases
|   |   |   |   |--- tests-pass-evo-+:  Automatically generated passing unit test cases
|   |   |   |   |--- tests-pass-man-+:  Relevant passing hand-written test cases
|   |   |   |--- ...
|   |   |--- ...
|   |--- results:                               The results used of the evaluation
|       |--- <project_id>-<bug_id>:             Defects4J reproducible bugs
|       |   |--- frame-<target_frame>:          Target frame used for crash-reproduction
|       |   |   |--- fail-bot-+_pass-evo-+:     Results of the evaluation containing multiple failing
|       |   |   |                               crash-reproducing test cases and the automatically
|       |   |   |                               generated passing unit test cases
|       |   |   |--- fail-bot-+_pass-man-+:     Results of the evaluation containing multiple failing
|       |   |   |                               generated crash-reproducing test cases and the
|       |   |   |                               hand-written relevant passing test cases
|       |   |   |--- fail-bot-1_pass-evo-+:     Results of the evaluation containing one failing
|       |   |   |                               crash-reproducing test case and the automatically
|       |   |   |                               generated passing unit test cases
|       |   |   |--- fail-bot-1_pass-man-+:     Results of the evaluation containing one failing generated 
|       |   |   |                               crash-reproducing test case and the hand-written
|       |   |   |                               relevant passing test cases
|       |   |   |--- fail-man-+_pass-man-+:     Results of the evaluation containing only hand-written
|       |   |                                   test cases, for both the crash exposing test cases as
|       |   |                                   well as the relevant passing test cases
|       |   |--- ...
|       |--- ...
|--- dashboard:
|--- scripts:
```

## License

MIT