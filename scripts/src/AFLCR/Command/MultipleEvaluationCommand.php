<?php

namespace AFLCR\Command;

use AFLCR\Evaluation\Collector\BotsingEvoSuiteTaskCollector;
use AFLCR\Evaluation\Collector\BotsingManualTaskCollector;
use AFLCR\Evaluation\Collector\ManualManualTaskCollector;
use AFLCR\Evaluation\Collector\MultipleBotsingEvoSuiteTaskCollector;
use AFLCR\Evaluation\Collector\MultipleBotsingManualTaskCollector;
use AFLCR\Evaluation\Scheduler\JobRunner;
use GetOpt\Command;
use GetOpt\GetOpt;

/**
 * Class MultipleEvaluationCommand
 *
 * @package AFLCR\Command
 */
class MultipleEvaluationCommand extends Command
{

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('multiple-evaluation', [$this, 'handle'], []);

        $this->setDescription('Run all the evaluation for all the instances.');
    }

    /**
     * Handle the call to the command.
     *
     * @param GetOpt $getOpt
     */
    public function handle(GetOpt $getOpt)
    {
        $jobRunner = JobRunner::getInstance();

        ManualManualTaskCollector::collect($jobRunner);
        BotsingManualTaskCollector::collect($jobRunner);
        MultipleBotsingManualTaskCollector::collect($jobRunner);
        BotsingEvoSuiteTaskCollector::collect($jobRunner);
        MultipleBotsingEvoSuiteTaskCollector::collect($jobRunner);

        $jobRunner->run();
    }
}