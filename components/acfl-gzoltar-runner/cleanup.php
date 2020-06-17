<?php

/**
 * Class RankingCsvCleanup.
 */
class RankingCsvCleanup {

    private const ERROR_UNABLE_TO_OPEN_FILE = "Unable to open file!";

    private const RANKING_FILE_DELIMITER = ";";
    private const ARRAY_FIRST_ELEMENT    = 0;
    private const SUSPICIOUS_LEVEL       = 'suspiciousness_value';
    private const RANKING                = 'ranking';
    private const NAME                   = 'name';

    /** 
     * Run the clean up.
     */
    public static function __main__() {
        $files = glob(__DIR__ . '/results/sfl/txt/*.ranking.csv');

        foreach ($files as $index => $file) {
            printf('Clean up: %s %s', $file, PHP_EOL);
            $statements = self::extractData($file);
            $header     = [self::NAME, self::SUSPICIOUS_LEVEL, self::RANKING];

            $statements = self::removeTestCases($statements);
            $statements = self::computeRanking($statements);

            self::saveData($file, $header, $statements);
        }
    }

    /**
     * Extract the data from the csv file.
     *
     * @param  string  $file
     *
     * @return array
     */
    private static function extractData(string $file) {
        $handle = fopen($file, "r") or die(self::ERROR_UNABLE_TO_OPEN_FILE);
        $count  = 0;
        $header = [];
        $lines  = [];

        while (($data = fgetcsv($handle, 0, self::RANKING_FILE_DELIMITER)) !== false) {
            if ($count === self::ARRAY_FIRST_ELEMENT) {
                $header = $data;
            } else {
                $lines[] = array_combine($header, $data);
            }
            $count++;
        }
        fclose($handle);

        return $lines;
    }

    /**
     * Remove the test cases from the list.
     *
     * @param  array  $statements
     *
     * @return array
     */
    private static function removeTestCases(array $statements) {
        foreach ($statements as $index => $statement) {
            if (strpos($statement[self::NAME], 'Test') !== false) {
                unset($statements[$index]);
            }

            if (strpos($statement[self::NAME], 'clinit') !== false) {
                unset($statements[$index]);
            }

            if ($statement[self::SUSPICIOUS_LEVEL] == 0.0) {
                unset($statements[$index]);
            }
        }

        return array_values($statements);
    }

    /**
     * Create a ranking for the file.
     * Code blocks have the same ranking.
     *
     * @param  array  $statements
     *
     * @return array
     */
    private static function computeRanking(array $statements) {
        $ranking    = 0;
        $last_score = 0.0;

        foreach ($statements as $index => $statement) {
            $score  = floatval($statement[self::SUSPICIOUS_LEVEL]);

            if ($last_score != $score) {
                $ranking++;
            }

            $statements[$index][self::RANKING] = $ranking;
            $last_score                        = $score;
        }

        return $statements;
    }

    /**
     * Save the new file.
     *
     * @param  string  $file
     * @param  array  $headers
     * @param  array  $statements
     */
    private static function saveData(string $file, array $headers, array $statements) {
        $handle = fopen($file, "w") or die(self::ERROR_UNABLE_TO_OPEN_FILE);
        fputcsv($handle, $headers, self::RANKING_FILE_DELIMITER);

        foreach ($statements as $index => $row) {
            fputcsv($handle, $row, self::RANKING_FILE_DELIMITER);
        }
    }
}

RankingCsvCleanup::__main__();
