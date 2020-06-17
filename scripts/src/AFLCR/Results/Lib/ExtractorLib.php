<?php

namespace AFLCR\Results\Lib;

use AFLCR\Util\Settings;
use AFLCR\Util\StringUtil;
use RuntimeException;
use stdClass;

/**
 * Class ExtractorLib
 *
 * @package Results
 */
class ExtractorLib
{

    private const ERROR_RESULTS_DIR_EMPTY = "%project_id\$s-%bug_id\$sb frame %target_frame\$s \t Results directory is empty";
    private const PATH_AND_FILE_CONCAT    = '%s/%s';

    /**
     * Get the ranking files.
     *
     * @param stdClass $experiment
     * @param stdClass $problem
     *
     * @return array
     */
    public static function getRankingFiles(stdClass $experiment, stdClass $problem): array
    {
        $path        = self::getRankingPath($experiment, $problem);
        $rankingPath = realpath($path);
        if ($rankingPath !== false) {
            $rankingFiles = array_diff(scandir($rankingPath), ['.', '..']);

            return $rankingFiles;
        } else {
            throw new RuntimeException(StringUtil::format(self::ERROR_RESULTS_DIR_EMPTY, $problem), 9001);
        }
    }

    /**
     * Get the ranking file paths.
     *
     * @param stdClass $experiment
     * @param stdClass $problem
     *
     * @return string
     */
    public static function getRankingPath(stdClass $experiment, stdClass $problem): string
    {
        $problemResultsDirectory = StringUtil::format(Settings::get('data.results'), $problem);
        $experimentFolderName    = self::getExperimentFolderName($experiment);

        return sprintf(self::PATH_AND_FILE_CONCAT, $problemResultsDirectory, $experimentFolderName);
    }

    /**
     * Get the full file path of a ranking file.
     *
     * @param string $rankingPath
     * @param string $rankingFile
     *
     * @return string
     */
    public static function getRankingFileFullPath(string $rankingPath, string $rankingFile): string
    {
        return sprintf(self::PATH_AND_FILE_CONCAT, $rankingPath, $rankingFile);
    }

    /**
     * Determine if the evaluation has been successful.
     *
     * @param $experiment
     * @param $problem
     *
     * @return bool
     */
    public static function isEvaluationSuccessful(stdClass $experiment, stdClass $problem): bool
    {
        $problemVars      = get_object_vars($problem);
        $experimentDbName = self::getExperimentDbName($experiment);
        $experimentResult = $problemVars[$experimentDbName];

        if ($experimentResult === "1") {
            return true;
        } else {
            if ($experimentResult === "0") {
                return false;
            } else {
                throw new RuntimeException('Unexpected value');
            }
        }
    }

    /**
     * Get the experiment database column name.
     *
     * @param stdClass $experiment
     *
     * @return string
     */
    private static function getExperimentFolderName(stdClass $experiment): string
    {
        return str_replace('_', '-', $experiment->name);
    }

    /**
     * Get the experiment database column name.
     *
     * @param stdClass $experiment
     *
     * @return string
     */
    private static function getExperimentDbName(stdClass $experiment): string
    {
        return 'exp_' . str_replace('-', '_', $experiment->name);
    }
}