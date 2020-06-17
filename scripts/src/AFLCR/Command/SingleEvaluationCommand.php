<?php

namespace AFLCR\Command;

use AFLCR\Command\Lib\CommandConstants;
use AFLCR\Evaluation\Collector\SingleTestCaseCollector;
use AFLCR\Evaluation\Scheduler\JobRunner;
use GetOpt\Command;
use GetOpt\GetOpt;
use GetOpt\Operand;
use GetOpt\Option;

/**
 * Class SingleEvaluationCommand
 *
 * @package AFLCR\Command
 */
class SingleEvaluationCommand extends Command
{

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('single-evaluation', [$this, 'handle'], [
            Option::create('p', 'project_id', GetOpt::REQUIRED_ARGUMENT)->setDescription('Defects4j project_id name e.g. Lang'),
            Option::create('b', 'bug_id', GetOpt::REQUIRED_ARGUMENT)->setDescription('Defects4j bug_id number e.g. 9'),
            Option::create('t', 'target_frame', GetOpt::REQUIRED_ARGUMENT)->setDescription('Target frame of the stack-trace reproduction e.g. 5'),
            Option::create('o', 'optional_dir', GetOpt::OPTIONAL_ARGUMENT)->setDescription('Another dir with the required files'),
        ]);
        $this->addOperands([
            Operand::create('experiment', Operand::REQUIRED),
        ]);

        $this->setDescription('Run the evaluation for a single instance.');
    }

    /**
     * Handle the call to the command.
     *
     * @param GetOpt $getOpt
     */
    public function handle(GetOpt $getOpt)
    {
        $this->assertValidExperimentMode($getOpt);
        $this->assertAllRequiredOptionSet($getOpt);
        $jobRunner = JobRunner::getInstance();

        SingleTestCaseCollector::collectOne(
            $jobRunner,
            $getOpt->getOperand('experiment'),
            $getOpt->getOption('p'),
            $getOpt->getOption('b'),
            $getOpt->getOption('t'),
            $getOpt->getOption('o')
        );

        $jobRunner->run();
    }

    /**
     * @param GetOpt $getOpt
     */
    protected function assertValidExperimentMode(GetOpt $getOpt): void
    {
        if (isset(CommandConstants::VALID_EXPERIMENT_MODES[$getOpt->getOperand('experiment')]) === false) {
            echo $getOpt->getHelpText();
            exit(-1);
        }
    }

    /**
     * @param GetOpt $getOpt
     */
    protected function assertAllRequiredOptionSet(GetOpt $getOpt): void
    {
        foreach ($getOpt->getOptionObjects() as $key => $option) {
            if ($option->getMode() === GetOpt::REQUIRED_ARGUMENT && $option->getValue() == null) {
                echo $getOpt->getHelpText();
                exit(-1);
            }
        }
    }
}