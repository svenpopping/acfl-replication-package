<?php

namespace AFLCR\Matrix\DDU;

class Uniqueness
{

    public static function calculate(array $hitSpectrum): float
    {
        $statementsSpectrum = self::getStatementHitSpectrum($hitSpectrum);
        $ambiguityGroups    = self::determineAmbiguityGroups($statementsSpectrum);

        return floatval(count($ambiguityGroups) / count($statementsSpectrum));
    }

    /**
     * Determine the ambiguity groups based on the hit spectrum.
     * Ambiguity group contains the different test case execution patterns. So
     * it determines if multiple statements have the same test execution pattern.
     *
     * @param array $statementsSpectrum
     *
     * @return array
     */
    public static function determineAmbiguityGroups(array $statementsSpectrum): array
    {
        $ambiguityGroups = [];

        foreach ($statementsSpectrum as $statement => $coverage) {
            $candidate = implode('', $coverage);

            if (isset($ambiguityGroups[$candidate]) === false) {
                $ambiguityGroups[$candidate] = $candidate;
            }
        }

        return $ambiguityGroups;
    }

    /**
     * @param array $hitSpectrum
     *
     * @return array
     */
    public static function getStatementHitSpectrum(array $hitSpectrum): array
    {
        $statementsSpectrum = [];
        foreach ($hitSpectrum as $testCase => $statementsCoverage) {
            foreach ($statementsCoverage as $statement => $coverage) {
                $statementsSpectrum[$statement][$testCase] = $coverage;
            }
        }

        return $statementsSpectrum;
    }
}