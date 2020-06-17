<?php

namespace AFLCR\Evaluation\Runner;

use AFLCR\Database\DB;
use AFLCR\Evaluation\Model\Problem;
use AFLCR\Evaluation\Scheduler\Job;
use AFLCR\Evaluation\Scheduler\JobRunner;
use PDO;

/**
 * Class EvoSuiteRunner
 *
 * @package Runner
 */
abstract class AbstractRunner
{

    /** @var string */
    private $dockerImage;

    /** @var JobRunner */
    protected $runner;

    /**
     * EvoSuiteRunner constructor.
     *
     * @param JobRunner $runner
     * @param string    $dockerImage
     */
    protected function __construct(JobRunner $runner, string $dockerImage)
    {
        $this->runner      = $runner;
        $this->dockerImage = $dockerImage;
    }

    /**
     * The Main function.
     */
    protected function main()
    {
        $statement = DB::getConnection()->prepare(static::QUERY_SELECT_PROBLEMS);
        $statement->execute();
        $jobs = $statement->fetchAll(PDO::FETCH_CLASS);

        foreach ($jobs as $job) {
            $problem = new Problem($job);
            $job     = new Job();
            $job->setImage($this->dockerImage)
                ->setContainerName($this->getContainerName($problem))
                ->setContainerOptions($this->getContainerOptions($problem))
                ->setProblem($problem)
                ->setOnFinishquery(static::QUERY_ON_FINISH);

            $this->runner->addJob($job);
        }
    }

    /**
     * Get container name based on the Problem.
     *
     * @param Problem $problem
     *
     * @return string
     */
    protected abstract function getContainerName(Problem $problem): string;

    /**
     * Get container options based on the Problem.
     *
     * @param Problem $problem
     *
     * @return array
     */
    protected abstract function getContainerOptions(Problem $problem): array;

}