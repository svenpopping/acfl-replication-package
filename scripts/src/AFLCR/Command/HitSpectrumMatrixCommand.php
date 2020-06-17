<?php

namespace AFLCR\Command;

use AFLCR\Matrix\HitSpectrumMatrixParser;
use GetOpt\Command;
use GetOpt\GetOpt;
use GetOpt\Operand;
use GetOpt\Option;

/**
 * Class MatrixCommand
 *
 * @package AFLCR\Command
 */
class HitSpectrumMatrixCommand extends Command
{

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('hit-spectrum', [$this, 'handle'], [
            Option::create('p', 'project_id', GetOpt::REQUIRED_ARGUMENT)->setDescription('Defects4j project_id name e.g. Lang'),
            Option::create('b', 'bug_id', GetOpt::REQUIRED_ARGUMENT)->setDescription('Defects4j bug_id number e.g. 9'),
            Option::create('t', 'target_frame', GetOpt::REQUIRED_ARGUMENT)->setDescription('Target frame of the stack-trace reproduction e.g. 5'),
        ]);

        $this->addOperands([
            Operand::create('experiment', Operand::REQUIRED),
        ]);

        $this->setDescription('Returns the hit spectrum matrix');
    }

    /**
     * Handle the call to the command.
     *
     * @param GetOpt $getOpt
     */
    public function handle(GetOpt $getOpt)
    {
        HitSpectrumMatrixParser::run(
            $getOpt->getOperand('experiment'),
            $getOpt->getOption('p'),
            $getOpt->getOption('b'),
            $getOpt->getOption('t')
        );
    }
}