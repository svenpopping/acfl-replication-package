<?php


namespace AFLCR\Utils;

/**
 * Class Color
 *
 * @package AFLCR\Utils
 */
class Color {

    /**
     * @param  int  $index
     * @param  int  $count
     *
     * @return array
     */
    public static function getBorderColorArray(int $index, int $count): array {
        $arraySize = array_keys(array_fill(0, $count, 0));

        return array_map(function () use ($index) {
            return self::getBorderColor($index);
        }, $arraySize);
    }

    /**
     * @param  int  $index
     *
     * @return string
     */
    public static function getBorderColor(int $index): string {
        return self::getColor($index);
    }

    /**
     * Get a possible colour.
     *
     * @param  int  $index
     *
     * @return string
     */
    private static function getColor(int $index): string {
        $colours = [
                '#a6cee3',
                '#1f78b4', '#b2df8a', '#33a02c', '#fb9a99', '#e31a1c', '#fdbf6f', '#ff7f00', '#cab2d6', '#6a3d9a', '#ffff99', '#b15928'];

        return $colours[$index];
    }

    /**
     * @param  int  $index
     * @param  int  $count
     *
     * @return array
     */
    public static function getBackgroundColorArray(int $index, int $count): array {
        $arraySize = array_keys(array_fill(0, $count, 0));

        return array_map(function () use ($index) {
            return self::getBackgroundColor($index);
        }, $arraySize);
    }

    /**
     * @param  int  $index
     *
     * @return string
     */
    public static function getBackgroundColor(int $index): string {
        return self::adjustBrightness(self::getColor($index), .5);
    }

    /**
     * Increases or decreases the brightness of a color by a percentage of the current brightness.
     *
     * @param  string  $hexCode  Supported formats: `#FFF`, `#FFFFFF`, `FFF`, `FFFFFF`
     * @param  float  $adjustPercent  A number between -1 and 1. E.g. 0.3 = 30% lighter; -0.4 = 40% darker.
     *
     * @return  string
     */
    private static function adjustBrightness($hexCode, $adjustPercent) {
        $hexCode = ltrim($hexCode, '#');

        if (strlen($hexCode) == 3) {
            $hexCode = $hexCode[0] . $hexCode[0] . $hexCode[1] . $hexCode[1] . $hexCode[2] . $hexCode[2];
        }

        $hexCode = array_map('hexdec', str_split($hexCode, 2));

        foreach ($hexCode as & $color) {
            $adjustableLimit = $adjustPercent < 0 ? $color : 255 - $color;
            $adjustAmount    = ceil($adjustableLimit * $adjustPercent);

            $color = str_pad(dechex($color + $adjustAmount), 2, '0', STR_PAD_LEFT);
        }

        return '#' . implode($hexCode);
    }
}