<?php

namespace AFLCR\Matrix\DDU;

class Diversity
{

    /**
     * Calculate the Diversity of the his-spectrum matrix.
     *
     * @param array $hitSpectrum
     *
     * @return float
     */
    public static function calculate(array $hitSpectrum): float
    {
        $activities = self::determineActivities($hitSpectrum);

        $denominator = array_sum(array_map(function ($n) {
            return $n * ($n - 1);
        }, $activities));

        $numberOfTestCases = count($hitSpectrum);
        $nominator         = $numberOfTestCases * ($numberOfTestCases - 1);

        return floatval(1 - ($denominator / $nominator));
    }

    /**
     * Determine the test case activities.
     *
     * @param array $hitSpectrum
     *
     * @return array
     */
    public static function determineActivities(array $hitSpectrum): array
    {
        $activities = [];

        foreach ($hitSpectrum as $testCaseNumber => $coverage) {
            $activity = implode('', $coverage);

            if (isset($activities[$activity])) {
                $activities[$activity]++;
            } else {
                $activities[$activity] = 1;
            }
        }

        return $activities;
    }
}