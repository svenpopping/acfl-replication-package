<?php

namespace AFLCR\Command;

use AFLCR\Ranking\RankingComputing;
use GetOpt\Command;

class RankingComputingCommand extends Command
{

    /**
     * RankingComputingCommand constructor.
     */
    public function __construct()
    {
        parent::__construct('compute-ranking', [$this, 'handle'], []);

        $this->setDescription('Re-compute ranking files.');
    }

    /**
     * Handle the call to the command.
     */
    public function handle()
    {
        RankingComputing::compute();
    }
}