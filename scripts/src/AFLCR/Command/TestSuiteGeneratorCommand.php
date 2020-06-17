<?php

namespace AFLCR\Command;

use AFLCR\Command\Lib\CommandConstants;
use AFLCR\Evaluation\Runner\BotsingMultipleRunner;
use AFLCR\Evaluation\Runner\BotsingRunner;
use AFLCR\Evaluation\Runner\Defects4jRunner;
use AFLCR\Evaluation\Runner\EvoSuiteRunner;
use AFLCR\Evaluation\Scheduler\JobRunner;
use GetOpt\Command;
use GetOpt\GetOpt;
use GetOpt\Operand;

/**
 * Class TestSuiteGeneratorCommand
 *
 * @package AFLCR\Command
 */
class TestSuiteGeneratorCommand extends Command
{

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('test-suite-generator', [$this, 'handle'], []);
        $this->addOperands([
            Operand::create('component', Operand::REQUIRED),
        ]);

        $this->setDescription('Run the generation for each of the components.');
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

        switch ($getOpt->getOperand('component')) {
            case 'botsing':
                BotsingRunner::run($jobRunner);
                break;
            case 'multiple-botsing':
                BotsingMultipleRunner::run($jobRunner);
                break;
            case 'evosuite':
                EvoSuiteRunner::run($jobRunner);
                break;
            case 'defects4j':
                Defects4jRunner::run($jobRunner);
                break;
        }

        $jobRunner->run();
    }

    /**
     * @param GetOpt $getOpt
     */
    protected function assertValidExperimentMode(GetOpt $getOpt): void
    {
        if (isset(CommandConstants::VALID_TEST_SUITE_MODES[$getOpt->getOperand('component')]) === false) {
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