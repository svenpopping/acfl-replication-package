<?php

namespace AFLCR\Labelling\Model;

/**
 * Class ResultsModel.
 *
 * @package Labelling\Model
 */
class ResultsModel
{

    /** @var float */
    private $examScore;

    /** @var float */
    private $suspiciousLevel;

    public function __construct(float $examScore, float $suspiciousLevel)
    {
        $this->examScore       = $examScore;
        $this->suspiciousLevel = $suspiciousLevel;
    }

    /**
     * @return mixed
     */
    public function getSuspiciousLevel(): float
    {
        return $this->suspiciousLevel;
    }

    /**
     * @return mixed
     */
    public function getExamScore(): float
    {
        return $this->examScore;
    }

}