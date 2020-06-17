<?php

namespace AFLCR\Matrix;

use AFLCR\Util\CsvFileReader;
use AFLCR\Util\Output;
use AFLCR\Util\Settings;
use AFLCR\Util\StringUtil;
use Exception;

class MatrixParser
{

    /**
     * Parse the fault localization matrix.
     *
     * @param string $experiment
     * @param string $projectId
     * @param string $bugId
     * @param string $targetFrame
     *
     * @throws Exception
     */
    public static function run(string $experiment, string $projectId, string $bugId, string $targetFrame)
    {
        $data = [
            'project_id'   => $projectId,
            'bug_id'       => $bugId,
            'target_frame' => $targetFrame,
        ];

        $resultDir  = self::getResultsDirectory($data);
        $matrix     = self::getFaultLocalisationMatrix($resultDir, $experiment);
        $testCases  = self::getTestCases($resultDir, $experiment);
        $flipMatrix = self::getStatementTestCoverageMatrix(
            $matrix,
            self::getStatementNames($resultDir, $experiment),
            $testCases
        );

        $N_S = self::countNumberOfTestCaseOutcome($testCases, 'PASS');
        $N_F = self::countNumberOfTestCaseOutcome($testCases, 'FAIL');

        $rows = [];

        foreach (self::getStatementNames($resultDir, $experiment) as $defectiveStatement) {
            if (isset($flipMatrix[$defectiveStatement])) {
                $something = $flipMatrix[$defectiveStatement];
                $N_CS      = self::countNumberOfTestCaseOutcome($something, 'PASS');
                $N_CF      = self::countNumberOfTestCaseOutcome($something, 'FAIL');
                $N_US      = floatval($N_S - $N_CS);
                $N_UF      = floatval($N_F - $N_CF);

                if ($N_CF > 0) {
                    $rows[] = [
                        str_pad($defectiveStatement, 75),
                        $N_CF,
                        $N_UF,
                        $N_CS,
                        $N_US,
                    ];
                }
            }
        }

        uasort($rows, function ($a, $b) {
            for ($i = 1; $i < 5; $i++) {
                if (floatval($a[$i]) > floatval($b[$i])) {
                    return true;
                } else {
                    if (floatval($a[$i]) < floatval($b[$i])) {
                        return false;
                    }
                }
            }

            return false;
        });

        Output::message(implode(PHP_EOL, array_map(function ($item) {
            return implode("\t", $item);
        }, $rows)));
    }

    /**
     * Get the results dir of this project.
     *
     * @param array $data
     *
     * @return string
     */
    private static function getResultsDirectory(array $data): string
    {
        return StringUtil::format(Settings::get('data.results'), $data);
    }

    /**
     * Get the fault localisation matrix.
     *
     * @param string $resultDir
     * @param string $experiment
     *
     * @return array
     */
    private static function getFaultLocalisationMatrix(string $resultDir, string $experiment): array
    {
        $matrix = file_get_contents($resultDir . '/' . $experiment . '/matrix.txt');
        $matrix = explode(PHP_EOL, $matrix);

        $matrix = array_map(function ($row) {
            return explode(' ', $row);
        }, $matrix);

        $matrix = array_map(function ($row) {
            return array_keys(array_filter($row, function ($item) {
                return $item === "1";
            }));
        }, $matrix);

        return $matrix;
    }

    /**
     * Get the name of the test cases and the outcome.
     *
     * @param string $resultDir
     * @param string $experiment
     *
     * @return array
     * @throws Exception
     */
    private static function getTestCases(string $resultDir, string $experiment): array
    {
        $testCases = CsvFileReader::read($resultDir . '/' . $experiment . '/tests.csv', ',');
        $testCases = array_map(function ($testCase) {
            return [
                'name'    => $testCase['name'],
                'outcome' => $testCase['outcome'],
            ];
        }, $testCases);

        return $testCases;
    }

    /**
     * Get the statement test coverage matrix.
     *
     * @param array $matrix
     * @param array $statementNames
     * @param array $testCases
     *
     * @return array
     */
    private static function getStatementTestCoverageMatrix(array $matrix, array $statementNames, array $testCases): array
    {
        $flipMatrix = [];

        foreach ($matrix as $testCaseIndex => $coveredStatements) {
            foreach ($coveredStatements as $statementIndex) {
                if (isset($statementNames[$statementIndex])) {
                    $statementName                = $statementNames[$statementIndex];
                    $flipMatrix[$statementName][] = $testCases[$testCaseIndex];
                }
            }
        }

        return $flipMatrix;
    }

    /**
     * Get the name of the statements in the fault localization matrix.
     *
     * @param string $resultDir
     * @param string $experiment
     *
     * @return array
     * @throws Exception
     */
    private static function getStatementNames(string $resultDir, string $experiment): array
    {
        $statements     = CsvFileReader::read($resultDir . '/' . $experiment . '/spectra.csv', ';');
        $statementNames = array_map(function ($statement) {
            return preg_replace('/#.*:/', ':', $statement['name']);
        }, $statements);

        $statementNames = array_filter($statementNames, function ($item) {
            return strpos($item, 'Test') === false;
        });

        return $statementNames;
    }

    /**
     * Count the number a test case has a given outcome.
     *
     * @param array  $testCases
     * @param string $outcome
     *
     * @return float
     */
    private static function countNumberOfTestCaseOutcome(array $testCases, string $outcome): float
    {
        $hasOutcome = array_filter($testCases, function ($item) use ($outcome) {
            return $item['outcome'] === $outcome;
        });

        return floatval(count($hasOutcome));
    }
}