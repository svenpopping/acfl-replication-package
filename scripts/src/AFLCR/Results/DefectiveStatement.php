<?php

namespace AFLCR\Results;

use AFLCR\Results\Evaluation\ExamScore;
use AFLCR\Results\Model\FormulaModel;
use AFLCR\Util\StringUtil;
use RuntimeException;
use stdClass;

/**
 * Class DefectiveStatement
 *
 * @package Results
 */
class DefectiveStatement
{

    private const ERROR_DEFECTIVE_STATEMENT_NOT_FOUND = "%project_id\$s-%bug_id\$sb frame %target_frame\$s \t Defective statement not found";

    private const ERROR_MESSAGE_TEMPLATE      = "%s \t formula %s";

    private const ERROR_NO_RANKING                    = "%project_id\$s-%bug_id\$sb frame %target_frame\$s \t Missing ranking column";

    private const LINE_NAME    = 'name';

    private const LINE_RANKING = 'ranking';

    private const LINE_SUSPICIOUSNESS_VALUE   = 'suspiciousness_value';

    private const SPLIT_CLASS_AND_LINE_NUMBER = ':';

    private const SPLIT_DEFECTIVE_STATEMENTS  = ' ';

    /**
     * Get the ranking of the defective statement.
     *
     * @param string   $formula
     * @param stdClass $problem
     * @param array    $lines
     *
     * @return FormulaModel
     * @throws RuntimeException when the defective statement is null.
     */
    public static function getRankingDefectiveStatement(string $formula, stdClass $problem, array $lines): FormulaModel
    {
        $defectiveStatement = null;

        foreach ($lines as $line) {
            $defectiveStatement = self::determineIfLineIsDefectiveStatement($formula, $problem, $line);

            if ($defectiveStatement !== null) {
                break;
            }
        }

        if ($defectiveStatement === null) {
            self::throwException($formula, StringUtil::format(self::ERROR_DEFECTIVE_STATEMENT_NOT_FOUND, $problem), 1000);
        }

        return FormulaModel::create(
            $formula,
            ExamScore::calculate($defectiveStatement[self::LINE_RANKING], $problem->sloc),
            $defectiveStatement[self::LINE_SUSPICIOUSNESS_VALUE]
        );
    }

    /**
     * Get the defective statement.
     *
     * @param string   $formula
     * @param stdClass $problem
     * @param array    $line
     *
     * @return array
     */
    public static function determineIfLineIsDefectiveStatement(string $formula, stdClass $problem, array $line)
    {
        foreach (explode(self::SPLIT_DEFECTIVE_STATEMENTS, $problem->defective_statement) as $defectiveStatement) {
            [$className, $lineNumber] = explode(self::SPLIT_CLASS_AND_LINE_NUMBER, $defectiveStatement);

            if (self::isLineDefectiveStatement($line, $className, $lineNumber)) {
                if (isset($line[self::LINE_RANKING]) === false) {
                    self::throwException($formula, StringUtil::format(self::ERROR_NO_RANKING, $problem), 9001);
                } else {
                    return $line;
                }
            }
        }

        return null;
    }

    /**
     * Check if the line is a defective statement.
     *
     * @param array  $line
     * @param string $className
     * @param string $lineNumber
     *
     * @return bool
     */
    private static function isLineDefectiveStatement(array $line, string $className, string $lineNumber): bool
    {
        return strpos($line[self::LINE_NAME], $className) !== false && strpos($line[self::LINE_NAME], $lineNumber) !== false;
    }

    /**
     * Thrown an exception.
     *
     * @param string $formula
     * @param string $message
     * @param string $code
     *
     * @throws RuntimeException when the method is executed.
     */
    private static function throwException(string $formula, string $message, $code): void
    {
        $message = sprintf(self::ERROR_MESSAGE_TEMPLATE, $message, $formula);

        throw new RuntimeException($message, $code);
    }
}