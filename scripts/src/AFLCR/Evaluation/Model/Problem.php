<?php

namespace AFLCR\Evaluation\Model;

use stdClass;

/**
 * Class Problem
 */
class Problem
{

    /** @var int */
    public $bug_id;

    /** @var bool */
    private $docker_botsing_multiple_runner;

    /** @var bool */
    private $docker_botsing_runner;

    /** @var bool */
    private $docker_defects4j_runner;

    /** @var bool */
    private $docker_evosuite_runner;

    /** @var int */
    public $id;

    /** @var string */
    public $project_id;

    /** @var string */
    public $target_frame;

    /**
     * Problem constructor.
     *
     * @param stdClass $stdClass
     */
    public function __construct(stdClass $stdClass)
    {
        $this->id           = $stdClass->id;
        $this->project_id   = $stdClass->project_id;
        $this->bug_id       = $stdClass->bug_id;
        $this->target_frame = $stdClass->target_frame;

        $this->docker_defects4j_runner        = $stdClass->docker_defects4j_runner;
        $this->docker_botsing_runner          = $stdClass->docker_botsing_runner;
        $this->docker_botsing_multiple_runner = $stdClass->docker_botsing_multiple_runner;
        $this->docker_evosuite_runner         = $stdClass->docker_evosuite_runner;
    }

    /**
     * @return string
     */
    public function getProjectId(): string
    {
        return $this->project_id;
    }

    /**
     * @return int
     */
    public function getBugId(): int
    {
        return $this->bug_id;
    }

    /**
     * @return mixed
     */
    public function getTargetFrame()
    {
        return $this->target_frame;
    }

    /**
     * @return int
     */
    public function getId(): int
    {
        return $this->id;
    }

    /**
     * @return bool
     */
    public function isDockerDefects4jRunner(): bool
    {
        return $this->docker_defects4j_runner;
    }

    /**
     * @return bool
     */
    public function isDockerBotsingRunner(): bool
    {
        return $this->docker_botsing_runner;
    }

    /**
     * @return bool
     */
    public function isDockerBotsingMultipleRunner(): bool
    {
        return $this->docker_botsing_multiple_runner;
    }

    /**
     * @return bool
     */
    public function isDockerEvosuiteRunner(): bool
    {
        return $this->docker_evosuite_runner;
    }

    /**
     * Convert object to String.
     *
     * @return string
     */
    public function __toString(): string
    {
        return '{ project_id=' . $this->project_id . ' bug_id=' . $this->bug_id . ' target_frame=' . $this->target_frame . ' }';
    }

}