<?php

namespace AFLCR\Labelling;

use AFLCR\Database\DB;
use AFLCR\Labelling\Model\ComparisonModel;
use PDO;
use RuntimeException;

/**
 * Class AutoLabeling
 *
 * @package AFLCR\Labelling
 */
class AutoLabeling
{

    /**
     * Run the auto labeling.
     *
     * @throws RuntimeException
     */
    public static function run(): void
    {
        $allComparisons = self::getAllComparison();

        foreach ($allComparisons as $comparison) {
            $comparisonModel = new ComparisonModel($comparison);
            $label           = self::determineLabelComparison($comparisonModel);

            $statement =
                DB::getConnection()->prepare('UPDATE `ths_comparison_items` SET `category` = ? WHERE `id` = ?');
            $statement->execute([
                $label,
                $comparisonModel->getId(),
            ]);
        }
    }

    /**
     * Get all comparison.
     *
     * @return array
     */
    protected static function getAllComparison(): array
    {
        $statement = DB::getConnection()->prepare('
            SELECT
                tci.id                      as comparison_id,
                tr1.ochiai_exam_score       as tr1_ochiai_exam_score, 
                tr1.ochiai_suspicious_level as tr1_ochiai_suspicious_level,
                tr2.ochiai_exam_score       as tr2_ochiai_exam_score, 
                tr2.ochiai_suspicious_level as tr2_ochiai_suspicious_level 
            FROM ths_comparison_items AS tci
            INNER JOIN ths_results AS tr1 ON tci.results_a_id = tr1.id
            INNER JOIN ths_results AS tr2 ON tci.results_b_id = tr2.id
        ');
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * Determine the label of a comparison between two results.
     *
     * @param ComparisonModel $comparisonModel
     *
     * @return string
     * @throws RuntimeException
     */
    protected static function determineLabelComparison(ComparisonModel $comparisonModel): string
    {
        if ($comparisonModel->getResultA()->getExamScore() <= 0
            || $comparisonModel->getResultB()->getExamScore() <= 0) {
            return '';
        }

        if ($comparisonModel->getResultA()->getExamScore() < $comparisonModel->getResultB()->getExamScore()) {
            return 'INFERIOR';
        } else {
            if ($comparisonModel->getResultA()->getExamScore() == $comparisonModel->getResultB()->getExamScore()) {
                return 'EQUIVALENT';
            } else {
                if ($comparisonModel->getResultA()->getExamScore() > $comparisonModel->getResultB()->getExamScore()) {
                    return 'SUPERIOR';
                } else {
                    throw new RuntimeException('Unexpected behaviour');
                }
            }
        }
    }
}
