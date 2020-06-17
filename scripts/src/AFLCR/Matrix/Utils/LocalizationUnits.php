<?php

namespace AFLCR\Matrix\Utils;

class LocalizationUnits
{

    private $failingTestCases;

    private $passingTestCases;

    private $spectrumMatrix;

    public function __construct(SpectrumMatrix $spectrumMatrix)
    {
        $this->spectrumMatrix = $spectrumMatrix;

        $this->passingTestCases = array_filter($spectrumMatrix->testCaseOutcomes, function ($outcome) {
            return $outcome === 'PASS';
        });

        $this->failingTestCases = array_filter($spectrumMatrix->testCaseOutcomes, function ($outcome) {
            return $outcome === 'FAIL';
        });
    }
}