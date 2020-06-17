<?php

namespace AFLCR\Labelling\Model;

use stdClass;

/**
 * Class ComparisonModel.
 *
 * @package Labelling
 */
class ComparisonModel
{

    /** @var int */
    private $id;

    /** @var ResultsModel */
    private $resultA;

    /** @var ResultsModel */
    private $resultB;

    /**
     * ComparisonModel constructor.
     *
     * @param stdClass $databaseRecord
     */
    public function __construct(stdClass $databaseRecord)
    {
        $this->id      = $databaseRecord->comparison_id;
        $this->resultA =
            new ResultsModel($databaseRecord->tr1_ochiai_exam_score, $databaseRecord->tr1_ochiai_suspicious_level);
        $this->resultB =
            new ResultsModel($databaseRecord->tr2_ochiai_exam_score, $databaseRecord->tr2_ochiai_suspicious_level);
    }

    /**
     * @return int
     */
    public function getId(): int
    {
        return $this->id;
    }

    /**
     * @return ResultsModel
     */
    public function getResultA(): ResultsModel
    {
        return $this->resultA;
    }

    /**
     * @return ResultsModel
     */
    public function getResultB(): ResultsModel
    {
        return $this->resultB;
    }
}