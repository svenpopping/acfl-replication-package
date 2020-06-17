<?php

namespace AFLCR\Evaluation\Runner;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;
use AFLCR\Util\Settings;

/**
 * Class Defects4jRunner
 *
 * @package Runner
 */
class Defects4jRunner extends AbstractRunner
{

    private const DOCKER_CONTAINER_NAME      = 'docker-defects4j-%s-%s-frame-%s';
    private const DOCKER_ENV_BUG_ID          = '-e BUG_ID=%s';
    private const DOCKER_ENV_PROJECT_ID      = '-e PROJECT_ID=%s';
    private const DOCKER_VOL_TEST_FAIL_HUMAN = '-v  %s:/opt/runner/results/test-red';
    private const DOCKER_VOL_TEST_PASS_HUMAN = '-v  %s:/opt/runner/results/test-green';

    const QUERY_ON_FINISH       = 'UPDATE ths_problems SET docker_defects4j_runner = 1 WHERE ths_problems.id = ?';
    const QUERY_SELECT_PROBLEMS = 'SELECT ths_problems.*, ths_software.project_id, ths_software.bug_id FROM ths_problems INNER JOIN ths_software ON ths_problems.software_id = ths_software.id WHERE docker_defects4j_runner = 0';

    private const SETTING_DOCKER_DEFECTS4J_IMAGE = 'docker.defects4j.image';
    private const SETTING_DOCKER_OPTIONS         = 'docker.defects4j.options';
    private const SETTING_FAILING_TEST_CASES     = 'data.test-cases.failing.human';
    private const SETTING_PASSING_TEST_CASES     = 'data.test-cases.passing.human';

    /**
     * Run the Defects4jRunner.
     *
     * @param JobRunner $jobRunner
     */
    public static function run(JobRunner $jobRunner)
    {
        $evoSuiteRunner = new Defects4jRunner($jobRunner, Settings::get(self::SETTING_DOCKER_DEFECTS4J_IMAGE));
        $evoSuiteRunner->main();
    }

    /**
     * Get container name based on the Problem.
     *
     * @param Problem $problem
     *
     * @return string
     */
    protected function getContainerName(Problem $problem): string
    {
        return strtolower(
            sprintf(
                self::DOCKER_CONTAINER_NAME,
                $problem->getProjectId(),
                $problem->getBugId(),
                $problem->getTargetFrame()
            )
        );
    }

    /**
     * Get container options based on the Problem.
     *
     * @param Problem $problem
     *
     * @return array
     */
    protected function getContainerOptions(Problem $problem): array
    {
        $options   = Settings::get(self::SETTING_DOCKER_OPTIONS);
        $options[] = sprintf(self::DOCKER_ENV_PROJECT_ID, $problem->getProjectId());
        $options[] = sprintf(self::DOCKER_ENV_BUG_ID, $problem->getBugId());

        $options[] = sprintf(self::DOCKER_VOL_TEST_FAIL_HUMAN, sprintf(self::SETTING_FAILING_TEST_CASES,
            $problem->getProjectId(),
            $problem->getBugId(),
            $problem->getTargetFrame()
        ));

        $options[] = sprintf(self::DOCKER_VOL_TEST_PASS_HUMAN, sprintf(self::SETTING_PASSING_TEST_CASES,
            $problem->getProjectId(),
            $problem->getBugId(),
            $problem->getTargetFrame()
        ));

        return $options;
    }

}
