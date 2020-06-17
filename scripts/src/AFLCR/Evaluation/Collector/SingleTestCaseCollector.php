<?php

namespace AFLCR\Evaluation\Collector;

use AFLCR\Database\DB;
use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\JobRunner;
use PDO;
use RuntimeException;

/**
 * Class SingleTestCaseCollector
 *
 * @package Evaluation
 */
class SingleTestCaseCollector extends EvaluationTaskCollector
{

    private $bugId;

    private $optionalDirectory;

    private $projectId;

    private $targetFrame;

    /**
     * @param JobRunner   $jobRunner
     * @param string      $experimentName
     * @param string      $projectId
     * @param string      $bugId
     * @param string      $targetFrame
     * @param string|null $optionalDirectory
     */
    public static function collectOne(
        JobRunner $jobRunner,
        string $experimentName,
        string $projectId,
        string $bugId,
        string $targetFrame,
        string $optionalDirectory = null
    ): void {
        [$failing, $passing] = explode('-', $experimentName);
        $experimentDbName = implode('_', [$failing, $passing]);

        $settingTestPassing = 'data.test-cases.passing.' . $passing;
        $settingTestFailing = 'data.test-cases.failing.' . $failing;

        $collector = new static(
            $jobRunner,
            $experimentName,
            $experimentDbName,
            $settingTestPassing,
            $settingTestFailing
        );

        $collector->projectId         = $projectId;
        $collector->bugId             = $bugId;
        $collector->targetFrame       = $targetFrame;
        $collector->optionalDirectory = $optionalDirectory;

        $collector->main();
    }

    /**
     * @param JobRunner $jobRunner
     */
    public
    static function collect(JobRunner $jobRunner
    ): void {
        throw new RuntimeException('Do not use me');
    }

    /**
     * Assert is the problem should be executed.
     *
     * @param Problem $problem
     *
     * @return bool
     */
    protected
    function assertProblemShouldBeExecuted(Problem $problem
    ): bool {
        return true;
    }

    /**
     * Get all the runnable problems.
     *
     * @return array
     */
    protected
    function getAllRunnableProblem(): array
    {
        $statement = DB::getConnection()->prepare('SELECT ths_software.project_id, ths_software.bug_id, ths_problems.*, ths_experiments_runs.* 
                FROM ths_experiments_runs
                INNER JOIN ths_problems ON ths_experiments_runs.problems_id = ths_problems.id
                INNER JOIN ths_software ON ths_problems.software_id = ths_software.id
                WHERE ths_software.project_id = ?
                AND ths_software.bug_id = ?
                AND ths_problems.target_frame = ?
                LIMIT 1;');
        $statement->execute([$this->projectId, $this->bugId, $this->targetFrame]);
        $oneProblem = $statement->fetchAll(PDO::FETCH_CLASS);

        if ($this->optionalDirectory !== null) {
            $oneProblem[0]->target_frame = $this->optionalDirectory;
        }

        return $oneProblem;
    }
}