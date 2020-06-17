<?php

namespace AFLCR\Evaluation\Collector;

use AFLCR\Database\DB;
use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\Job;
use AFLCR\Evaluation\Scheduler\JobRunner;
use AFLCR\Util\Output;
use AFLCR\Util\Settings;
use PDO;

/**
 * Class EvaluationTaskCollector
 *
 * @package Evaluation
 */
abstract class EvaluationTaskCollector
{

    private const DOCKER_CONTAINER_NAME = "gzoltar-runner-%s-%s-%s-frame-%s";

    private const DOCKER_ENV_BUG_ID     = '-e BUG_ID=%s';
    private const DOCKER_ENV_PROJECT_ID = '-e PROJECT_ID=%s';

    private const LOG_JOB_ADDED                     = "Adding problem %s to the scheduler.";
    private const QUERY_SELECT_ALL_RUNNABLE_PROBLEM = 'SELECT ths_software.project_id, ths_software.bug_id, ths_problems.*, ths_experiments_runs.* FROM ths_experiments_runsINNER JOIN ths_problems ON ths_experiments_runs.problems_id = ths_problems.idINNER JOIN ths_software ON ths_problems.software_id = ths_software.id WHERE exp_%s = -1';
    private const QUERY_UPDATE_EXPERIMENT_RUN       = 'UPDATE ths_experiments_runs SET exp_%s = 1 WHERE ths_experiments_runs.id = ?';

    private const SETTING_DOCKER_GZOLTAR_IMAGE = 'docker.gzoltar.image';
    private const SETTING_DOCKER_OPTIONS       = 'docker.gzoltar.options';

    /** @var string */
    private $experimentDbName;

    /** @var string */
    private $experimentName;

    /** @var JobRunner */
    private $jobRunner;

    /** @var string */
    private $settingTestFailing;

    /** @var string */
    private $settingTestPassing;

    /**
     * EvaluationTaskCollector constructor.
     *
     * @param JobRunner $jobRunner
     * @param string    $experimentName
     * @param string    $experimentDbName
     * @param string    $settingTestPassing
     * @param string    $settingTestFailing
     */
    protected function __construct(JobRunner $jobRunner, string $experimentName, string $experimentDbName, string $settingTestPassing, string $settingTestFailing)
    {
        $this->jobRunner          = $jobRunner;
        $this->experimentName     = $experimentName;
        $this->experimentDbName   = $experimentDbName;
        $this->settingTestPassing = $settingTestPassing;
        $this->settingTestFailing = $settingTestFailing;
    }

    /**
     * Collect the tasks.
     *
     * @param JobRunner $jobRunner
     */
    public abstract static function collect(JobRunner $jobRunner): void;

    /**
     * Main function.
     */
    protected function main(): void
    {
        foreach ($this->getAllRunnableProblem() as $item) {
            $problem = new Problem($item);

            if ($this->assertProblemShouldBeExecuted($problem)) {
                Output::log(sprintf(self::LOG_JOB_ADDED, $this->getContainerName($problem)));

                $job = new Job();
                $job->setImage(Settings::get(self::SETTING_DOCKER_GZOLTAR_IMAGE))
                    ->setContainerName($this->getContainerName($problem))
                    ->setContainerOptions($this->getContainerOptions($problem))
                    ->setProblem($problem)
                    ->setOnFinishquery($this->getOnFinishQuery());

                $this->jobRunner->addJob($job);
            }
        }
    }

    /**
     * Get all the runnable problem in form the database.
     *
     * @return array
     */
    protected function getAllRunnableProblem(): array
    {
        $statement =
            DB::getConnection()->prepare(sprintf(self::QUERY_SELECT_ALL_RUNNABLE_PROBLEM, $this->experimentDbName));
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * Assert is the problem should be executed.
     *
     * @param Problem $problem
     *
     * @return bool
     */
    protected abstract function assertProblemShouldBeExecuted(Problem $problem): bool;

    /**
     * Get the container name.
     *
     * @param Problem $problem
     *
     * @return string
     */
    private function getContainerName(Problem $problem): string
    {
        return strtolower(
            sprintf(
                self::DOCKER_CONTAINER_NAME,
                $this->experimentName,
                $problem->getProjectId(),
                $problem->getBugId(),
                $problem->getTargetFrame()
            )
        );
    }

    /**
     * Get the container options.
     *
     * @param Problem $problem
     *
     * @return array
     */
    private function getContainerOptions(Problem $problem): array
    {
        $containerOptions = Settings::get(self::SETTING_DOCKER_OPTIONS);

        $containerOptions[] = sprintf(self::DOCKER_ENV_PROJECT_ID, $problem->getProjectId());
        $containerOptions[] = sprintf(self::DOCKER_ENV_BUG_ID, $problem->getBugId());

        $containerOptions[] = EvaluationTaskCollectorLib::getBindMountPassingTest($this->settingTestPassing, $problem);
        $containerOptions[] = EvaluationTaskCollectorLib::getBindMountFailingTest($this->settingTestFailing, $problem);
        $containerOptions[] = EvaluationTaskCollectorLib::getBindMountResults($this->experimentName, $problem);

        return $containerOptions;
    }

    /**
     * Get the on job finish query.
     *
     * @return string
     */
    private function getOnFinishQuery(): string
    {
        return sprintf(self::QUERY_UPDATE_EXPERIMENT_RUN, $this->experimentDbName);
    }
}