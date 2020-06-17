<?php

namespace AFLCR\Evaluation\Scheduler;

use AFLCR\Evaluation\Model\Problem;
use stdClass;

/**
 * Class Job
 *
 * @package Scheduler
 */
class Job
{

    /** @var string */
    public $container_name;

    /** @var array */
    public $container_options;

    /** @var string */
    public $image;

    /** @var string */
    public $on_finish_query;

    /** @var Problem */
    public $problem;

    /** @var string */
    public $uuid;

    /**
     * Job constructor.
     */
    public function __construct()
    {
        $this->uuid = uniqid();
    }

    /**
     * @param stdClass $jobStdClass
     *
     * @return Job
     */
    public static function createFromStdClass(stdClass $jobStdClass): Job
    {
        $job                    = new Job();
        $job->uuid              = $jobStdClass->uuid;
        $job->problem           = new Problem($jobStdClass->problem);
        $job->image             = $jobStdClass->image;
        $job->container_name    = $jobStdClass->container_name;
        $job->container_options = $jobStdClass->container_options;
        $job->on_finish_query   = $jobStdClass->on_finish_query;

        return $job;
    }

    /**
     * Get the UUID of the Job.
     *
     * @return string
     */
    public function getUuid(): string
    {
        return $this->uuid;
    }

    /**
     * @return Problem
     */
    public function getProblem(): Problem
    {
        return $this->problem;
    }

    /**
     * @param Problem $problem
     *
     * @return Job
     */
    public function setProblem(Problem $problem): Job
    {
        $this->problem = $problem;

        return $this;
    }

    /**
     * @return string|null string
     */
    public function getOnFinishquery(): ?string
    {
        return $this->on_finish_query;
    }

    /**
     * @param string|null $on_finish_query
     *
     * @return Job
     */
    public function setOnFinishquery(?string $on_finish_query): Job
    {
        $this->on_finish_query = $on_finish_query;

        return $this;
    }

    /**
     * @return string
     */
    public function getImage(): string
    {
        return $this->image;
    }

    /**
     * @param string $image
     *
     * @return Job
     */
    public function setImage(string $image): Job
    {
        $this->image = $image;

        return $this;
    }

    /**
     * @return string
     */
    public function getContainerName(): string
    {
        return $this->container_name;
    }

    /**
     * @param string $container_name
     *
     * @return Job
     */
    public function setContainerName(string $container_name): Job
    {
        $this->container_name = $container_name;

        return $this;
    }

    /**
     * @return array
     */
    public function getContainerOptions(): array
    {
        return $this->container_options;
    }

    /**
     * @param array $container_options
     *
     * @return Job
     */
    public function setContainerOptions(array $container_options): Job
    {
        $this->container_options = $container_options;

        return $this;
    }

}