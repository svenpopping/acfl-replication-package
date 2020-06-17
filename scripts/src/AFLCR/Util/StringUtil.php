<?php

namespace AFLCR\Util;

/**
 * Class StringUtil
 *
 * @package AFLCR\Util
 */
class StringUtil
{

    /**
     * Format a string.
     *
     * @param string $str
     * @param        $args
     *
     * @return string
     */
    public static function format(string $str, $args): string
    {
        if (is_object($args)) {
            $args = get_object_vars($args);
        }

        $map     = array_flip(array_keys($args));
        $new_str = preg_replace_callback('/(^|[^%])%([a-zA-Z0-9_-]+)\$/',
            function ($m) use ($map) {
                return $m[1] . '%' . ($map[$m[2]] + 1) . '$';
            },
            $str
        );

        return vsprintf($new_str, $args);
    }
}