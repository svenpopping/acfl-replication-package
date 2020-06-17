<?php

namespace AFLCR\Matrix\DDU;

use AFLCR\Util\Output;

class DDU
{

    public static function calculateAndPrint(array $hitSpectrum): void
    {
        $density    = Density::calculate($hitSpectrum);
        $diversity  = Diversity::calculate($hitSpectrum);
        $uniqueness = Uniqueness::calculate($hitSpectrum);

        Output::message(str_pad('Density:', 15) . $density);
        Output::message(str_pad('Diversity:', 15) . $diversity);
        Output::message(str_pad('Uniqueness:', 15) . $uniqueness);
        Output::message(str_repeat('-', 31) . ' x');
        Output::message(str_pad('DDU:', 15) . ($density * $diversity * $uniqueness));
    }
}