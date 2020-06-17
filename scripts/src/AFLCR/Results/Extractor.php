<?php

namespace AFLCR\Results;

use AFLCR\Database\DB;
use AFLCR\Results\Util\ConsoleOutput;
use AFLCR\Util\ProgressBar;
use Exception;
use GetOpt\GetOpt;
use PDO;
use stdClass;

/**
 * Class Extractor
 *
 * @package Results
 */
class Extractor
{

    private const QUERY_SELECT_ALL_EXPERIMENT = 'SELECT * FROM ths_experiments';
    private const QUERY_SELECT_ALL_PROBLEM    = 'SELECT ths_software.project_id, ths_software.bug_id, ths_problems.*, ths_experiments_runs.* FROM ths_experiments_runs INNER JOIN ths_problems ON ths_experiments_runs.problems_id = ths_problems.id INNER JOIN ths_software ON ths_problems.software_id = ths_software.id';

    private static $errors   = [];

    private static $warnings = [];

    /**
     * Cleanup the Botsing test cases.
     *
     * @param GetOpt $opt
     */
    public static function run(GetOpt $opt): void
    {
        $problems = self::getAllProblem();

        foreach (self::getAllExperiment() as $experiment) {
            ConsoleOutput::startMessage($experiment);
            $progressBar    = new ProgressBar(count($problems));
            self::$errors   = [];
            self::$warnings = [];

            foreach ($problems as $problem) {
                try {
                    echo $progressBar->drawCurrentProgress();
                    if ($problem->id == 103) {
                        continue;
                    }

                    $extract = new ExtractOneProblem($experiment, $problem);
                    $extract->run();

                    self::$errors   = array_merge(self::$errors, $extract->getErrors());
                    self::$warnings = array_merge(self::$warnings, $extract->getWarnings());
                } catch (Exception $exception) {
                    self::$errors[] = $exception->getMessage();
                }
            }

            ConsoleOutput::endMessage(self::$errors, self::$warnings, $opt);
        }
    }

    /**
     * Get all the problems in the database.
     *
     * @return stdClass[]
     */
    protected static function getAllProblem(): array
    {
        $statement = DB::getConnection()->prepare(self::QUERY_SELECT_ALL_PROBLEM);
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * Get all the experiments in the database.
     *
     * @return stdClass[]
     */
    protected static function getAllExperiment(): array
    {
        $statement = DB::getConnection()->prepare(self::QUERY_SELECT_ALL_EXPERIMENT);
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }
}
