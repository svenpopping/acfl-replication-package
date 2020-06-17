<?php

namespace AFLCR\Evaluation\Collector;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;

/**
 * Class HumanHumanTaskCollector
 *
 * @package Evaluation
 */
class BotsingManualTaskCollector extends EvaluationTaskCollector
{

    private const EXPERIMENT_DB_NAME = 'fail-bot-1_pass-man-+';
    private const EXPERIMENT_NAME    = 'fail-bot-1_pass-man-+';

    private const SETTING_FAILING_TEST_CASES = 'data.test-cases.failing.botsing';
    private const SETTING_PASSING_TEST_CASES = 'data.test-cases.passing.human';

    /**
     * @param JobRunner $jobRunner
     */
    public static function collect(JobRunner $jobRunner): void
    {
        $collector = new static(
            $jobRunner,
            self::EXPERIMENT_NAME,
            self::EXPERIMENT_DB_NAME,
            self::SETTING_PASSING_TEST_CASES,
            self::SETTING_FAILING_TEST_CASES
        );
        $collector->main();
    }

    /**
     * Assert is the problem should be executed.
     *
     * @param Problem $problem
     *
     * @return bool
     */
    protected function assertProblemShouldBeExecuted(Problem $problem): bool
    {
        return $problem->isDockerDefects4jRunner() && $problem->isDockerBotsingRunner();
    }
}