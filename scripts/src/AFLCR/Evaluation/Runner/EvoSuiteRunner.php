<?php

namespace AFLCR\Evaluation\Runner;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;
use AFLCR\Util\Settings;

/**
 * Class EvoSuiteRunner
 *
 * @package Runner
 */
class EvoSuiteRunner extends AbstractRunner
{

    private const DOCKER_CONTAINER_NAME = 'docker-evosuite-%s-%s-frame-%s';
    private const DOCKER_ENV_BUG_ID     = '-e BUG_ID=%s';
    private const DOCKER_ENV_PROJECT_ID = '-e PROJECT_ID=%s';
    private const DOCKER_VOL_TEST_CASES = '-v %s:/opt/runner/results';

    const QUERY_ON_FINISH       = 'UPDATE ths_problems SET docker_evosuite_runner = 1 WHERE ths_problems.id = ?';
    const QUERY_SELECT_PROBLEMS = 'SELECT ths_problems.*, ths_software.project_id, ths_software.bug_id FROM ths_problems INNER JOIN ths_software ON ths_problems.software_id = ths_software.id WHERE docker_evosuite_runner = 0';

    private const SETTING_DOCKER_EVOSUITE_IMAGE = 'docker.evosuite.image';
    private const SETTING_DOCKER_OPTIONS        = 'docker.evosuite.options';
    private const SETTING_PASSING_TEST_CASES    = 'data.test-cases.passing.evosuite';

    /**
     * Run the EvoSuiteRunner.
     *
     * @param JobRunner $jobRunner
     */
    public static function run(JobRunner $jobRunner)
    {
        $evoSuiteRunner = new EvoSuiteRunner($jobRunner, Settings::get(self::SETTING_DOCKER_EVOSUITE_IMAGE));
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
                static::DOCKER_CONTAINER_NAME,
                $problem->getProjectId(),
                $problem->getBugId(),
                $problem->getTargetFrame()
            )
        );
    }

    /**
     * Create a container for a specific problem.
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

        $options[] = sprintf(static::DOCKER_VOL_TEST_CASES, sprintf(Settings::get(static::SETTING_PASSING_TEST_CASES),
            $problem->getProjectId(),
            $problem->getBugId(),
            $problem->getTargetFrame()
        ));

        return $options;
    }
}
