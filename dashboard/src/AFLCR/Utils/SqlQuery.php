<?php


namespace AFLCR\Utils;

use RuntimeException;

/**
 * Class SqlQuery
 *
 * @package AFLCR\Utils
 */
class SqlQuery {

    /**
     * @param  string  $name
     *
     * @return string
     */
    public static function get(string $name): string {
        $queryFile = sprintf('%s/../../resources/sql/%s.sql', __DIR__, $name);

        if (realpath($queryFile) !== false) {
            return file_get_contents($queryFile);
        } else {
            throw new RuntimeException('Query file does not exists!');
        }
    }
}