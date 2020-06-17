<?php

namespace AFLCR\Results\Evaluation;

/**
 * Class ExamScore
 *
 * @package AFLCR\Results
 */
class ExamScore
{

    /**
     * Calculate the ExamScore.
     *
     * @param int $rankingDefectiveStatement
     * @param int $sLOC
     *
     * @return float
     */
    public static function calculate(int $rankingDefectiveStatement, int $sLOC): float
    {
        return floatval($rankingDefectiveStatement / $sLOC);
    }
}