<?php

namespace AFLCR\Matrix\DDU;

class Density
{

    /**
     * Calculate the density of the hit-spectrum matrix.
     *
     * @param array $hitSpectrum
     *
     * @return float
     */
    public static function calculate(array $hitSpectrum): float
    {
        $totalElements   = count($hitSpectrum, COUNT_RECURSIVE) - count($hitSpectrum);
        $coveredElements = array_sum(array_map(function ($row) {
            return array_sum($row);
        }, $hitSpectrum));

        $density = $coveredElements / $totalElements;

        return floatval(1 - abs(1 - 2 * $density));
    }
}