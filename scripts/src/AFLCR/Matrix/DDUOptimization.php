<?php

namespace AFLCR\Matrix;

use AFLCR\Matrix\DDU\DDU;
use AFLCR\Matrix\Utils\SpectrumMatrix;

class DDUOptimization
{

    public static function run(SpectrumMatrix $hitSpectrum)
    {
        $passingTestCases = array_filter($hitSpectrum->testCaseOutcomes, function ($outcome) {
            return $outcome === 'PASS';
        });
        $failingTestCases = array_filter($hitSpectrum->testCaseOutcomes, function ($outcome) {
            return $outcome === 'FAIL';
        });

        $passingTestActivities = self::determineActivities($hitSpectrum, $passingTestCases);
        $optimizedPassingTests = self::optimizeDiversity($passingTestActivities);

        $failingTestActivities = self::determineActivities($hitSpectrum, $failingTestCases);
        print_r($failingTestActivities);
        print_r($failingTestActivities);
        $optimizedFailingTests = self::optimizeDiversity($failingTestActivities);

        $optimizeHitSpectrum = $hitSpectrum->getSubsetMatrix($optimizedPassingTests, $optimizedFailingTests);

        DDU::calculateAndPrint($hitSpectrum->matrix);

        echo PHP_EOL . PHP_EOL . PHP_EOL;

        DDU::calculateAndPrint($optimizeHitSpectrum->matrix);

        echo PHP_EOL . PHP_EOL . PHP_EOL;

        $optimizeTestCases = array_keys($optimizeHitSpectrum->matrix);

        foreach ($optimizeTestCases as $optimizeTestCase) {
            echo $optimizeHitSpectrum->testCaseNames[$optimizeTestCase] . PHP_EOL;
        }
    }

    /**
     * Determine the test case activities.
     *
     * @param SpectrumMatrix $hitSpectrum
     * @param array          $included
     *
     * @return array
     */
    public static function determineActivities(SpectrumMatrix $hitSpectrum, array $included): array
    {
        $activities = [];

        foreach ($hitSpectrum->matrix as $testCaseNumber => $coverage) {
            if (isset($included[$testCaseNumber])) {
                $activity                = implode('', $coverage);
                $activities[$activity][] = $testCaseNumber;
            }
        }

        return $activities;
    }

    public static function optimizeDiversity(array $activities): array
    {
        $includedTestCases = [];

        foreach ($activities as $testCases) {
            if (count($testCases) > 1) {
                $includedTestCases[] = $testCases[rand(0, count($testCases) - 1)];
            } else {
                $includedTestCases[] = $testCases[0];
            }
        }

        return $includedTestCases;
    }
}