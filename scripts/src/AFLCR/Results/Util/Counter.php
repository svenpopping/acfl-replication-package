<?php

namespace AFLCR\Results\Util;

/**
 * Class Counter
 *
 * @package AFLCR\Results
 */
class Counter
{

    const COMMAND_COUNT_WORDS = 'wc -l %s/%s';

    const FILE_FAILING_TEST   = 'red.tests';

    const FILE_PASSING_TEST   = 'green.tests';

    /**
     * Determine the number of passing test cases.
     *
     * @param string $resultPath
     *
     * @return int
     */
    public static function determineNumberPassingTestCases(string $resultPath): int
    {
        return intval(exec(sprintf(self::COMMAND_COUNT_WORDS, $resultPath, self::FILE_PASSING_TEST)));
    }

    /**
     * Determine the number of failing test cases.
     *
     * @param string $resultPath
     *
     * @return int
     */
    public static function determineNumberFailingTestCases(string $resultPath): int
    {
        return intval(exec(sprintf(self::COMMAND_COUNT_WORDS, $resultPath, self::FILE_FAILING_TEST)));
    }
}