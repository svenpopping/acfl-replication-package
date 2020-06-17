<?php

namespace AFLCR\Evaluation\Collector;

use AFLCR\Evaluation\Model\Problem;
use AFLCR\Util\Settings;
use AFLCR\Util\StringUtil;

/**
 * Class EvaluationTaskCollectorLib
 *
 * @package AFLCR\Evaluation\Collector
 */
class EvaluationTaskCollectorLib
{

    /**
     * Helper constants
     */
    private const DIRECTORY_CONCATENATION     = '%s/%s';
    private const DOCKER_VOLUME_CONCATENATION = '-v %s:%s';
    private const SETTING_DATA_RESULTS        = 'data.results';

    /**
     * Settings constants
     */
    private const SETTING_DOCKER_VOL_RESULTS       = 'docker.gzoltar.volumes.results';
    private const SETTING_DOCKER_VOL_TESTS_FAILING = 'docker.gzoltar.volumes.test-cases.failing';
    private const SETTING_DOCKER_VOL_TESTS_PASSING = 'docker.gzoltar.volumes.test-cases.passing';

    /**
     * Get the bind mount for the passing test cases.
     *
     * @param string  $settingTestPassing
     * @param Problem $problem
     *
     * @return string
     */
    public static function getBindMountPassingTest(string $settingTestPassing, Problem $problem): string
    {
        $hostTestsPassingRegex = Settings::get($settingTestPassing);
        $hostTestsPassingPath  = StringUtil::format($hostTestsPassingRegex, $problem);

        $containerTestsPassingPath = Settings::get(self::SETTING_DOCKER_VOL_TESTS_PASSING);

        return sprintf(self::DOCKER_VOLUME_CONCATENATION, $hostTestsPassingPath, $containerTestsPassingPath);
    }

    /**
     * Get the bind mount for the failing test cases.
     *
     * @param string  $settingTestFailing
     * @param Problem $problem
     *
     * @return string
     */
    public static function getBindMountFailingTest(string $settingTestFailing, Problem $problem): string
    {
        $hostTestsFailingRegex = Settings::get($settingTestFailing);
        $hostTestsFailingPath  = StringUtil::format($hostTestsFailingRegex, $problem);

        $containerTestsFailingPath = Settings::get(self::SETTING_DOCKER_VOL_TESTS_FAILING);

        return sprintf(self::DOCKER_VOLUME_CONCATENATION, $hostTestsFailingPath, $containerTestsFailingPath);
    }

    /**
     * Get the bind mount for the results.
     *
     * @param string  $experimentName
     * @param Problem $problem
     *
     * @return string
     */
    public static function getBindMountResults(string $experimentName, Problem $problem): string
    {
        $hostResultsRegex = Settings::get(self::SETTING_DATA_RESULTS);
        $hostResultsPath  = StringUtil::format($hostResultsRegex, $problem);
        $hostResultsPath  = sprintf(self::DIRECTORY_CONCATENATION, $hostResultsPath, $experimentName);
        $hostResultsPath  = str_replace('_', '-', $hostResultsPath);

        $containerResultsPath = Settings::get(self::SETTING_DOCKER_VOL_RESULTS);

        return sprintf(self::DOCKER_VOLUME_CONCATENATION, $hostResultsPath, $containerResultsPath);
    }
}