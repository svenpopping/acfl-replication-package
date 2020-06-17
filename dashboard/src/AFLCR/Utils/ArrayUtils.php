<?php

namespace AFLCR\Utils;

/**
 * Class ArrayUtils
 *
 * @package AFLCR\Utils
 */
class ArrayUtils {

    /**
     * Sanitize all the elements in the array.
     *
     * @param  array  $array
     *
     * @return array
     */
    public static function sanitize(array $array): array {
        return array_map(function ($value) {
            return filter_var($value, FILTER_SANITIZE_STRING);
        }, $array);
    }
}