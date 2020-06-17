<?php

namespace AFLCR\Ranking;

use AFLCR\Util\ProgressBar;
use AFLCR\Util\Settings;
use RecursiveDirectoryIterator;
use RecursiveIteratorIterator;
use RecursiveRegexIterator;
use RegexIterator;

class RankingComputing
{

    public static function compute()
    {
        $directory    = new RecursiveDirectoryIterator(Settings::get('data.files'));
        $iterator     = new RecursiveIteratorIterator($directory);
        $rankingFiles = new RegexIterator($iterator, '/^.+\.ranking.csv/i', RecursiveRegexIterator::GET_MATCH);

        $progressBar = new ProgressBar(iterator_count($rankingFiles));

        foreach ($rankingFiles as $rankingFile) {
            echo $progressBar->drawCurrentProgress();
            RankingCsvCleanup::run($rankingFile[0]);
        }
    }
}