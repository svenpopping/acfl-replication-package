<?php

namespace AFLCR\Command;

use AFLCR\Results\Extractor;
use GetOpt\Command;
use GetOpt\GetOpt;
use GetOpt\Option;

/**
 * Class ExtractResultsCommand
 *
 * @package AFLCR\Command
 */
class ExtractResultsCommand extends Command
{

    /**
     * CopyCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('extract-results', [$this, 'handle'], [
            Option::create('v', 'verbose', GetOpt::NO_ARGUMENT),
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
        Extractor::run($getOpt);
    }
}