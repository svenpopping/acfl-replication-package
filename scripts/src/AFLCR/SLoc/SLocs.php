<?php

namespace AFLCR\Evaluation\SLoc;

use AFLCR\Database\DB;
use AFLCR\Util\CsvFileReader;
use Exception;
use PDO;
use stdClass;

/**
 * Class SLocs
 *
 * @package Results
 */
class SLocs
{

    const SLOC_DATASET_FILE = __SCRIPT_DIR__ . '/../../Other/fault-localization-data/stats/sloc.csv';

    /**
     * Run the SLocs extractor.
     */
    public static function run()
    {
        foreach (self::getAllProblem() as $problem) {
            $sLoc = self::getSLoc($problem);

            $statement = DB::getConnection()->prepare('UPDATE `ths_problems` SET `sloc` = ? WHERE `id` = ?');
            $statement->execute([
                $sLoc,
                $problem->id,
            ]);
        }
    }

    /**
     * Get all the problems in the database.
     *
     * @return stdClass[]
     */
    protected static function getAllProblem(): array
    {
        $statement =
            DB::getConnection()->prepare('SELECT ths_software.project_id, ths_software.bug_id, ths_problems.* FROM ths_problems INNER JOIN ths_software ON ths_problems.software_id = ths_software.id');
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * @param stdClass $problem
     *
     * @return int
     * @throws Exception
     */
    protected static function getSLoc(stdClass $problem): int
    {
        foreach (CsvFileReader::read(realpath(self::SLOC_DATASET_FILE)) as $line) {
            if ($problem->project_id === $line['Project']
                && $problem->bug_id === $line['RealBugId']
            ) {
                return intval($line['slocLoadedClasses']);
            }
        }

        return PHP_INT_MAX;
    }
}