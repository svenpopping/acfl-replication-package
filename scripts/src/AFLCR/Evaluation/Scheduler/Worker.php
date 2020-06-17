<?php

namespace AFLCR\Evaluation\Scheduler;

use AFLCR\Database\DB;
use dophpsdk\Docker;
use Katzgrau\KLogger\Logger;

/**
 * Class Worker.
 *
 * @package Scheduler
 */
class Worker
{

    const COMMAND_OPTIONS_GLUE = ' ';

    const CONTAINER_EXIT_CODE = 'ExitCode';

    const CONTAINER_EXIT_CODE_SUCCESSFUL = 0;

    const CONTAINER_STATE = 'State';

    const FORCE_REMOVE = '-f';

    const LOG_ERROR_FAILED_RUN = 'Exited %s with status %s';

    const LOG_INFO_RUNNING_DOCKER = "Running %s";

    const LOG_INFO_START_JOB = "Starting job %s at pid %s";

    const LOG_INFO_SUCCESSFUL_RUN = 'Successfully run ';

    /** @var Docker */
    private $docker;

    /** @var Job */
    private $job;

    /** @var Logger */
    private $logger;

    /**
     * Worker constructor.
     *
     * @param Job $job
     */
    public function __construct(Job $job)
    {
        $this->docker = new Docker();
        $this->logger = new Logger(sprintf('logs/worker/%s/', $job->getContainerName()));
        $this->job    = $job;
    }

    /**
     * Run the Worker.
     */
    public function run(): void
    {
        $this->removeOldDockerContainer($this->job);
        $containerUuid = $this->startDockerContainer($this->job);

        $this->waitUntilDockerContainerFinished($containerUuid);
        $this->handleContainerExit($this->job, $containerUuid);
    }

    /**
     * Remove any old docker container using the same name.
     *
     * @param Job $job
     */
    private function removeOldDockerContainer(Job $job): void
    {
        $this->logger->info(sprintf(self::LOG_INFO_START_JOB, $job->getUuid(), getmypid()));
        $this->docker->ContainerRm($job->getContainerName(), self::FORCE_REMOVE);
    }

    /**
     * Start docker container.
     *
     * @param Job $job
     *
     * @return string
     */
    private function startDockerContainer(Job $job): string
    {
        $this->logger->info(
            sprintf(self::LOG_INFO_RUNNING_DOCKER, $job->getContainerName()),
            $job->getContainerOptions()
        );
        $containerUuid = $this->docker->ContainerRun(
            $job->getImage(),
            $job->getContainerName(),
            false,
            implode(self::COMMAND_OPTIONS_GLUE, $job->getContainerOptions())
        );

        return $containerUuid[0];
    }

    /**
     * Wait until the container running.
     *
     * @param string $containerUuid
     */
    private function waitUntilDockerContainerFinished(string $containerUuid): void
    {
        while ($this->docker->ContainerIsRunning($containerUuid)) {
            sleep(10);
        }
    }

    /**
     * Handle when a container is finished.
     *
     * @param Job    $job
     * @param string $containerUuid
     */
    private function handleContainerExit(Job $job, string $containerUuid): void
    {
        $exitCode = $this->docker->ContainerInspect(
            $containerUuid
        )[$containerUuid][self::CONTAINER_STATE][self::CONTAINER_EXIT_CODE];

        if ($exitCode === self::CONTAINER_EXIT_CODE_SUCCESSFUL) {
            $this->logger->info(self::LOG_INFO_SUCCESSFUL_RUN . $job->getContainerName());
            $this->updateDatabaseRecord($job);

            $this->docker->ContainerRm($containerUuid);
        } else {
            $this->logger->critical(
                sprintf(self::LOG_ERROR_FAILED_RUN, $job->getContainerName(), $exitCode),
                $this->docker->ContainerLogs($containerUuid)
            );
        }
    }

    /**
     * Update the database Problems record.
     *
     * @param Job $job
     */
    private function updateDatabaseRecord(Job $job): void
    {
        $query = $job->getOnFinishquery();

        if ($query !== null) {
            $statement = DB::getConnection()->prepare($query);
            $statement->execute([$job->getProblem()->getId()]);

            $this->logger->error(sprintf("%s %s", $statement->errorCode(), $job->getProblem()->getId()), $statement->errorInfo());
        }
    }

}