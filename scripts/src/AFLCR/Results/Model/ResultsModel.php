<?php

namespace AFLCR\Results\Model;

/**
 * Class ResultsModel
 *
 * @package Results\Model
 */
class ResultsModel
{

    private const FORMULA_BARINEL   = 'barinel';
    private const FORMULA_DSTAR     = 'dstar';
    private const FORMULA_OCHIAI    = 'ochiai';
    private const FORMULA_TARANTULA = 'tarantula';

    /** @var FormulaModel[] */
    private $formulas;

    /** @var int */
    private $numberFailingTest;

    /** @var int */
    private $numberPassingTest;

    /**
     * ResultsModel constructor.
     */
    public function __construct()
    {
        $this->numberPassingTest = -1;
        $this->numberFailingTest = -1;
        $this->formulas          = [
            self::FORMULA_DSTAR     => new FormulaModel(self::FORMULA_DSTAR),
            self::FORMULA_OCHIAI    => new FormulaModel(self::FORMULA_OCHIAI),
            self::FORMULA_BARINEL   => new FormulaModel(self::FORMULA_BARINEL),
            self::FORMULA_TARANTULA => new FormulaModel(self::FORMULA_TARANTULA),
        ];
    }

    /**
     * @param int $numberPassingTest
     *
     * @return ResultsModel
     */
    public function setNumberPassingTest(int $numberPassingTest): ResultsModel
    {
        $this->numberPassingTest = $numberPassingTest;

        return $this;
    }

    /**
     * @param int $numberFailingTest
     *
     * @return ResultsModel
     */
    public function setNumberFailingTest(int $numberFailingTest): ResultsModel
    {
        $this->numberFailingTest = $numberFailingTest;

        return $this;
    }

    /**
     * @param FormulaModel $formula
     *
     * @return ResultsModel
     */
    public function addFormula(FormulaModel $formula): ResultsModel
    {
        $this->formulas[$formula->getName()] = $formula;

        return $this;
    }

    /**
     * Convert the results to an array.
     *
     * @return array
     */
    public function __toArray()
    {
        return [
            $this->numberPassingTest,
            $this->numberFailingTest,
            $this->formulas[self::FORMULA_DSTAR]->getExamScore(),
            $this->formulas[self::FORMULA_DSTAR]->getSuspiciousLevel(),
            $this->formulas[self::FORMULA_BARINEL]->getExamScore(),
            $this->formulas[self::FORMULA_BARINEL]->getSuspiciousLevel(),
            $this->formulas[self::FORMULA_OCHIAI]->getExamScore(),
            $this->formulas[self::FORMULA_OCHIAI]->getSuspiciousLevel(),
            $this->formulas[self::FORMULA_TARANTULA]->getExamScore(),
            $this->formulas[self::FORMULA_TARANTULA]->getSuspiciousLevel(),
        ];
    }
}