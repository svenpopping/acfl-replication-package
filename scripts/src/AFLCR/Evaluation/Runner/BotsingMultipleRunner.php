<?php

namespace AFLCR\Evaluation\Runner;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;
use AFLCR\Util\Settings;

/**
 * Class BotsingRunner
 *
 * @package Runner
 */
class BotsingMultipleRunner extends AbstractRunner
{

    private const DOCKER_CONTAINER_NAME            = 'docker-botsing-multiple-%s-%s-frame-%s';
    private const DOCKER_ENV_BUG_ID                = '-e BUG_ID=%s';
    private const DOCKER_ENV_MAX_NUMBER_OF_RETRIES = '-e MAX_NUMBER_OF_RETRIES=%s';
    private const DOCKER_ENV_MULTIPLE              = '-e MULTIPLE=%s';
    private const DOCKER_ENV_PROJECT_ID            = '-e PROJECT_ID=%s';
    private const DOCKER_ENV_TARGET_FRAME          = '-e TARGET_FRAME=%s';
    private const DOCKER_VOL_BOTSING_TEST_CASE     = '-v ' . __SCRIPT_DIR__ . '/../data/problems/%s-%s/frame-%s/red-botsing-multiple:/opt/runner/results';

    const QUERY_ON_FINISH       = 'UPDATE ths_problems SET docker_botsing_multiple_runner = 1 WHERE ths_problems.id = ?';
    const QUERY_SELECT_PROBLEMS = 'SELECT ths_problems.*, ths_software.project_id, ths_software.bug_id FROM ths_problems INNER JOIN ths_software ON ths_problems.software_id = ths_software.id WHERE docker_botsing_multiple_runner = -1';

    private const SETTING_DOCKER_BOTSING_IMAGE = 'docker.botsing.image';
    private const SETTING_DOCKER_OPTIONS       = 'docker.botsing.options';
    private const SETTING_NUMBER_OF_RETRIES    = 'docker.botsing.config.numberOfRetries';
    private const SETTING_TEST_CASES           = 'data.test-cases.failing.botsing';

    /**
     * Run the BotsingRunner.
     *
     * @param JobRunner $jobRunner
     */
    public static function run(JobRunner $jobRunner)
    {
        $botsingRunner = new self($jobRunner, Settings::get(self::SETTING_DOCKER_BOTSING_IMAGE));
        $botsingRunner->main();
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
        return strtolower(sprintf(static::DOCKER_CONTAINER_NAME, $problem->getProjectId(), $problem->getBugId(), $problem->getTargetFrame()));
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
        $options[] = sprintf(self::DOCKER_ENV_TARGET_FRAME, $problem->getTargetFrame());
        $options[] = sprintf(self::DOCKER_ENV_MAX_NUMBER_OF_RETRIES, Settings::get(self::SETTING_NUMBER_OF_RETRIES));
        $options[] = sprintf(self::DOCKER_ENV_MULTIPLE, 'true');

        $options[] = sprintf(self::DOCKER_VOL_BOTSING_TEST_CASE, sprintf(self::SETTING_TEST_CASES,
            $problem->getProjectId(),
            $problem->getBugId(),
            $problem->getTargetFrame()
        ));

        return $options;
    }
}
