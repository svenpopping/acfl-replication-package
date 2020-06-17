<?php

namespace AFLCR\Labelling;

use AFLCR\Command\ExperimentLabellingCommand;
use AFLCR\Database\DB;
use AFLCR\Util\ProgressBar;
use GetOpt\GetOpt;
use PDO;

/**
 * Class ExperimentLabelling
 *
 * @package AFLCR\Labelling
 */
class ExperimentLabelling
{

    const KET_PART_EXAM_SCORE = '_exam_score';

    /**
     * @param GetOpt $getOpt
     */
    public static function run(GetOpt $getOpt): void
    {
        $experiment = $getOpt->getOperand(ExperimentLabellingCommand::OPERAND_EXPERIMENT);

        $allResultByExperimentName = self::getAllResultByExperimentName($experiment);
        $progressBar               = new ProgressBar(count($allResultByExperimentName));

        foreach ($allResultByExperimentName as $result) {
            echo $progressBar->drawCurrentProgress();

            if (is_null($result->category) || empty($result->category)) {
                if (intval($result->green_test_count) < 0) {
                    $result->category = 'EXPERIMENT_FAILED';
                } else {
                    if (intval($result->exam_score) > 10000) {
                        $result->category = 'NO_DEFECTIVE_FRAME';
                    } else {
                        $examScores       = self::extractExamScores($result);
                        $result->category = implode(";", self::determineResultLabels($examScores, $result->exam_score));
                    }
                }
            }

            $statement = DB::getConnection()->prepare('UPDATE ths_results SET category = ? WHERE id = ?');
            $statement->execute([$result->category, $result->id]);
        }
    }

    /**
     * @param $experimentName
     *
     * @return array
     */
    protected static function getAllResultByExperimentName(string $experimentName): array
    {
        $statement = DB::getConnection()->prepare('SELECT 
                *, 
                LEAST(
                    IFNULL(dstar_exam_score, ~0 >> 1),
                    IFNULL(barinel_exam_score, ~0 >> 1),
                    IFNULL(tarantula_exam_score, ~0 >> 1),
                    IFNULL(ochiai_exam_score, ~0 >> 1)
                ) as exam_score
            FROM ths_results
            WHERE experiment_id = (SELECT id FROM ths_experiments WHERE name = ? LIMIT 1)'
        );
        $statement->execute([$experimentName]);

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * @param $result
     *
     * @return array
     */
    protected static function extractExamScores($result): array
    {
        $objectVars     = get_object_vars($result);
        $keys           = array_keys($objectVars);
        $examScoresKeys = preg_grep(sprintf('/%s/i', self::KET_PART_EXAM_SCORE), $keys);

        return array_intersect_key($objectVars, array_flip($examScoresKeys));
    }

    /**
     * @param array $examScores
     * @param float $minValue
     *
     * @return array
     */
    protected static function determineResultLabels(array $examScores, float $minValue): array
    {
        $labels = [];

        foreach ($examScores as $key => $examScore) {
            if (floatval($examScore) === $minValue) {
                $labels[] = strtoupper(str_replace(self::KET_PART_EXAM_SCORE, '', $key));
            }
        }

        return $labels;
    }
}
