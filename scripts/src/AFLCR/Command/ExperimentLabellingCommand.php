<?php

namespace AFLCR\Command;

use AFLCR\Command\Lib\CommandConstants;
use AFLCR\Labelling\ExperimentLabelling;
use GetOpt\Command;
use GetOpt\GetOpt;
use GetOpt\Operand;

/**
 * Class ExperimentLabelling
 *
 * @package AFLCR\Command
 */
class ExperimentLabellingCommand extends Command
{

    const OPERAND_EXPERIMENT = 'experiment';

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('experiment-labelling', [$this, 'handle']);
        $this->addOperands([
            Operand::create(self::OPERAND_EXPERIMENT, Operand::REQUIRED),
        ]);

        $this->setDescription('Extract the result from the gathered data');
    }

    /**
     * Handle the call to the command.
     *
     * @param GetOpt $getOpt
     */
    public function handle(GetOpt $getOpt)
    {
        $this->assertValidExperimentMode($getOpt);

        ExperimentLabelling::run($getOpt);
    }

    /**
     * @param GetOpt $getOpt
     */
    protected function assertValidExperimentMode(GetOpt $getOpt): void
    {
        $experimentMode = $getOpt->getOperand(ExperimentLabellingCommand::OPERAND_EXPERIMENT);

        if (isset(CommandConstants::VALID_EXPERIMENT_MODES[$experimentMode]) === false) {
            echo $getOpt->getHelpText();
            exit(-1);
        }
    }
}
