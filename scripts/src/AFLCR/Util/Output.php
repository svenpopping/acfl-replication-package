<?php

namespace AFLCR\Util;

/**
 * Class Output
 *
 * @package Util
 */
class Output
{

    /**
     * Output an error.
     *
     * @param string $message
     */
    public static function error(string $message): void
    {
        echo $message . PHP_EOL;
        die();
    }

    /**
     * Print a message.
     *
     * @param string $message
     */
    public static function message(string $message = ''): void
    {
        echo $message . PHP_EOL;
    }

    /**
     * Print a message in log format.
     *
     * @param string $message
     */
    public static function log(string $message): void
    {
        echo '[' . date('Y-m-d H:i:s') . '] ' . $message . PHP_EOL;
    }

    /**
     * Print anything in debug mode.
     *
     * @param $anything
     */
    public static function debug($anything): void
    {
        if (Settings::get('debug') === true) {
            print_r($anything);
        }
    }
}