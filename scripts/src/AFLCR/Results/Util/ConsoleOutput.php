<?php

namespace AFLCR\Results\Util;

use AFLCR\Util\Output;
use AFLCR\Util\StringUtil;
use GetOpt\GetOpt;
use stdClass;

/**
 * Class ConsoleOutput
 *
 * @package AFLCR\Results\Util
 */
class ConsoleOutput
{

    /**
     * Start message.
     *
     * @param stdClass $experiment
     */
    public static function startMessage(stdClass $experiment): void
    {
        Output::message();
        Output::message(StringUtil::format('Fetching results of evaluation %name$s', $experiment));
    }

    /**
     * End message.
     *
     * @param array $errors
     * @param array $warnings
     */
    public static function endMessage(array $errors, array $warnings, GetOpt $getOpt): void
    {
        if (count($errors) > 0) {
            Output::message();
            Output::message(count($errors) . ' error found');
            array_map(function ($value) {
                Output::message(' - ' . ($value));
            }, $errors);
        }

        if (count($warnings) > 0 && $getOpt->getOption('verbose')) {
            Output::message();
            Output::message(count($warnings) . ' warnings found');
            array_map(function ($value) {
                Output::message(' - ' . ($value));
            }, $warnings);
        }

        Output::message((count($errors) > 0) ? 'ERROR' : 'OK');
    }
}