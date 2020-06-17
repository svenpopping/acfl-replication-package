#!/usr/bin/php
<?php

require_once __DIR__ . '/script/autoload.php';

use AFLCR\Command\ExperimentLabellingCommand;
use AFLCR\Command\ExtractResultsCommand;
use AFLCR\Command\HitSpectrumMatrixCommand;
use AFLCR\Command\ProgramSpectrumCommand;
use AFLCR\Command\MultipleEvaluationCommand;
use AFLCR\Command\RankingComputingCommand;
use AFLCR\Command\SingleEvaluationCommand;
use AFLCR\Command\TestSuiteGeneratorCommand;
use GetOpt\ArgumentException;
use GetOpt\ArgumentException\Missing;
use GetOpt\GetOpt;
use GetOpt\Option;

$getOpt = new GetOpt();

// define common options
$getOpt->addOptions([
    Option::create('?', 'help', GetOpt::NO_ARGUMENT)->setDescription('Show this help and quit'),
]);

// add commands
$getOpt->addCommand(new ExperimentLabellingCommand());
$getOpt->addCommand(new ExtractResultsCommand());

$getOpt->addCommand(new TestSuiteGeneratorCommand());
$getOpt->addCommand(new MultipleEvaluationCommand());
$getOpt->addCommand(new SingleEvaluationCommand());

$getOpt->addCommand(new ProgramSpectrumCommand());
$getOpt->addCommand(new HitSpectrumMatrixCommand());
$getOpt->addCommand(new RankingComputingCommand());

// process arguments and catch user errors
try {
    try {
        $getOpt->process();
    } catch (Missing $exception) {
        // catch missing exceptions if help is requested
        if (!$getOpt->getOption('help')) {
            throw $exception;
        }
    }
} catch (ArgumentException $exception) {
    file_put_contents('php://stderr', $exception->getMessage() . PHP_EOL);
    echo PHP_EOL . $getOpt->getHelpText();
    exit;
}

// show help and quit
$command = $getOpt->getCommand();
if (!$command || $getOpt->getOption('help')) {
    echo $getOpt->getHelpText();
    exit;
}

// call the requested command
call_user_func($command->getHandler(), $getOpt);
