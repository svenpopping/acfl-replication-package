<?php

namespace AFLCR\Evaluation\Scheduler;

use Katzgrau\KLogger\Logger;
use Psr\Log\LogLevel;

/**
 * Class JobRunner
 *
 * @package Scheduler
 */
class JobRunner
{

    const COMMAND_CHECK_IF_PID_ALIVE      = 'ps -p %d | grep php | wc -l';

    const COMMAND_START_WORKER            = 'php %s/script/worker.php "%s" > /dev/null 2>&1 & echo $!';

    /**
     * Log messages
     */
    const LOG_DEBUG_WAITING_JOBS_FINISHED = 'Waiting for current jobs to finish (%s)';

    const LOG_FINISHED_JOB                = 'Finished new job with pid = %d';

    const LOG_START_NEW_JOB               = '[%s/%s] Starting new job with pid = %d';

    const LOG_WAITING_JOB_FINISH          = 'Max number of jobs running (%s). Waiting for process to finish';

    /**
     * Settings constants
     */
    const NUMBER_MAX_RUNNING_PROCESSES = 20;

    const TIMEOUT_IN_SECONDS           = 30;

    /** @var array */
    private $currentJobs = [];

    /** @var JobRunner */
    private static $instance;

    /** @var Job[] */
    private $listJob = [];

    /** @var Logger */
    private $logger;

    /**
     * JobRunner constructor.
     */
    private function __construct()
    {
        $this->logger = new Logger('php://stdout', LogLevel::DEBUG);
    }

    /**
     * Get an instance of the JobRunner.
     *
     * @return static
     */
    public static function getInstance(): self
    {
        if (!isset(static::$instance)) {
            static::$instance = new static();
        }

        return static::$instance;
    }

    /**
     * Add a new job to the cluster.
     *
     * @param Job $job
     */
    public function addJob(Job $job): void
    {
        $this->listJob[$job->getUuid()] = $job;
    }

    /**
     * Run the JobRunner for each job it creates it own Process to run it in.
     */
    public function run(): void
    {
        $totalCount = count($this->listJob);

        while (count($this->listJob)) {
            $this->checkLimitRunningProcesses();

            $job = array_shift($this->listJob);
            $pid = $this->executeJob($job);

            $this->logger->info(sprintf(self::LOG_START_NEW_JOB, count($this->listJob), $totalCount, $pid));
            $this->currentJobs[$pid] = $pid;
        }

        $this->waitUntilEverythingFinished();
    }

    /**
     * Execute a Job.
     *
     * @param Job $job the job to execute.
     *
     * @return int
     */
    protected function executeJob(Job $job): int
    {
        $command = sprintf(self::COMMAND_START_WORKER, __SCRIPT_DIR__, addslashes(json_encode($job)));
        exec($command, $output);

        return $output[0];
    }

    /**
     * Wait until every process is finished.
     */
    protected function waitUntilEverythingFinished(): void
    {
        while (count($this->currentJobs)) {
            $this->logger->debug(sprintf(self::LOG_DEBUG_WAITING_JOBS_FINISHED, count($this->currentJobs)));
            $this->removeStoppedJobs();

            sleep(self::TIMEOUT_IN_SECONDS);
        }
    }

    /**
     * Check if the limit of running processes has been exceeded.
     */
    private function checkLimitRunningProcesses(): void
    {
        while (count($this->currentJobs) >= self::NUMBER_MAX_RUNNING_PROCESSES) {
            $this->removeStoppedJobs();
            $this->logger->debug(sprintf(self::LOG_WAITING_JOB_FINISH, count($this->currentJobs)));

            sleep(self::TIMEOUT_IN_SECONDS);
        }
    }

    /**
     * Remove stopped jobs.
     */
    private function removeStoppedJobs(): void
    {
        foreach ($this->currentJobs as $pid) {
            if (intval(exec(sprintf(self::COMMAND_CHECK_IF_PID_ALIVE, $pid))) === 0) {
                $this->logger->debug(sprintf(self::LOG_FINISHED_JOB, $pid));
                unset($this->currentJobs[$pid]);
            }
        }
    }
}
