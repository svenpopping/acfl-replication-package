<?php

namespace AFLCR\Matrix\Utils;

use AFLCR\Util\CsvFileReader;
use Exception;

class SpectrumMatrix
{

    public $matrix;

    public $statementNames;

    public $testCaseNames;

    public $testCaseOutcomes;

    public function __construct(array $hitSpectrumMatrix, string $resultsDir = null, string $experiment = null)
    {
        try {
            $this->matrix = $hitSpectrumMatrix;

            if (is_null($resultsDir) === false && is_null($experiment) === false) {
                $this->setTestCaseVariables($resultsDir, $experiment);
                $this->setStatementNames($resultsDir, $experiment);
            }
        } catch (Exception $exception) {
        }
    }

    public function getSubsetMatrix(array $passingTestCases, array $failingTestCases): SpectrumMatrix
    {
        $subsetMatrix = [];

        foreach ($this->matrix as $testCaseNumber => $coverage) {
            if (in_array($testCaseNumber, $passingTestCases) || in_array($testCaseNumber, $failingTestCases)) {
                $subsetMatrix[$testCaseNumber] = $coverage;
            }
        }

        $spectrumMatrix                   = new SpectrumMatrix($subsetMatrix);
        $spectrumMatrix->testCaseNames    = $this->testCaseNames;
        $spectrumMatrix->testCaseOutcomes = $this->testCaseOutcomes;
        $spectrumMatrix->statementNames   = $this->statementNames;

        return $spectrumMatrix;
    }

    /**
     * @param string $resultDir
     * @param string $experiment
     *
     * @throws Exception
     */
    private function setTestCaseVariables(string $resultDir, string $experiment): void
    {
        $testCases = CsvFileReader::read(sprintf("%s/%s/tests.csv", $resultDir, $experiment), ',');

        foreach (array_keys($this->matrix) as $testCaseNumber) {
            $this->testCaseNames[$testCaseNumber]    = $testCases[$testCaseNumber]['name'];
            $this->testCaseOutcomes[$testCaseNumber] = $testCases[$testCaseNumber]['outcome'];
        }
    }

    /**
     * @param string $resultDir
     * @param string $experiment
     *
     * @throws Exception
     */
    private function setStatementNames(string $resultDir, string $experiment): void
    {
        $statements = CsvFileReader::read(sprintf("%s/%s/spectra.csv", $resultDir, $experiment), ';');

        foreach (array_keys($this->matrix[0]) as $statementNumber) {
            $this->statementNames[$statementNumber] = $statements[$statementNumber]['name'];
        }
    }
}