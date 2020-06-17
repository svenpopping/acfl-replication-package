<?php

namespace AFLCR\Results\Model;

/**
 * Class FormulaModel
 *
 * @package AFLCR\Results\Model
 */
class FormulaModel
{

    /** @var float */
    private $examScore;

    /** @var string */
    private $name;

    /** @var float */
    private $suspiciousLevel;

    /**
     * FormulaModel constructor.
     *
     * @param string $name
     */
    public function __construct(string $name)
    {
        $this->name            = $name;
        $this->examScore       = null;
        $this->suspiciousLevel = null;
    }

    /**
     * Create an instance.
     *
     * @param string $name
     * @param float  $examScore
     * @param float  $suspiciousLevel
     *
     * @return mixed
     */
    public static function create(string $name, float $examScore, float $suspiciousLevel): FormulaModel
    {
        $formula                  = new FormulaModel($name);
        $formula->examScore       = $examScore;
        $formula->suspiciousLevel = $suspiciousLevel;

        return $formula;
    }

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @return float
     */
    public function getExamScore(): ?float
    {
        return $this->examScore;
    }

    /**
     * @return float
     */
    public function getSuspiciousLevel(): ?float
    {
        return $this->suspiciousLevel;
    }
}