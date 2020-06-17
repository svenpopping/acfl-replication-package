<?php

namespace AFLCR\Evaluation\Collector;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;

/**
 * Class MultipleBotsingEvoSuiteTaskCollector
 *
 * @package Evaluation
 */
class MultipleBotsingEvoSuiteTaskCollector extends EvaluationTaskCollector
{

    private const EXPERIMENT_DB_NAME = 'fail-bot-+_pass-evo-+';
    private const EXPERIMENT_NAME    = 'fail-bot-+_pass-evo-+';

    private const SETTING_FAILING_TEST_CASES = 'data.test-cases.failing.mult_botsing';
    private const SETTING_PASSING_TEST_CASES = 'data.test-cases.passing.evosuite';

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
        return $problem->isDockerBotsingMultipleRunner() && $problem->isDockerEvosuiteRunner();
    }
}