<?php

namespace AFLCR\Results;

use AFLCR\Database\DB;
use AFLCR\Results\Lib\ExtractorLib;
use AFLCR\Results\Model\ResultsModel;
use AFLCR\Results\Util\Counter;
use AFLCR\Util\CsvFileReader;
use Exception;
use PDO;
use RuntimeException;
use stdClass;

/**
 * Class ExtractOneProblem
 *
 * @package AFLCR\Results
 */
class ExtractOneProblem
{

    private const EXTENSION_RANKING_CSV  = '.ranking.csv';

    private const QUERY_INSERT_RESULTS   = 'INSERT INTO ths_results (experiment_id, problem_id, green_test_count, red_test_count, dstar_exam_score, dstar_suspicious_level, barinel_exam_score, barinel_suspicious_level, ochiai_exam_score, ochiai_suspicious_level, tarantula_exam_score, tarantula_suspicious_level) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)';

    private const QUERY_UPDATE_RESULTS   = 'UPDATE ths_results SET green_test_count = ?, red_test_count = ?, dstar_exam_score = ?, dstar_suspicious_level = ?, barinel_exam_score = ?, barinel_suspicious_level = ?, ochiai_exam_score = ?, ochiai_suspicious_level = ?, tarantula_exam_score = ?, tarantula_suspicious_level = ? WHERE experiment_id = ? AND problem_id = ?';

    private const RANKING_FILE_DELIMITER = ';';

    /** @var array */
    private $errors = [];

    /** @var stdClass */
    private $experiment;

    /** @var stdClass */
    private $problem;

    /** @var ResultsModel */
    private $results;

    /** @var array */
    private $warnings = [];

    /**
     * ExtractOneProblem constructor.
     *
     * @param stdClass $experiment
     * @param stdClass $problem
     */
    public function __construct(stdClass $experiment, stdClass $problem)
    {
        $this->experiment = $experiment;
        $this->problem    = $problem;
        $this->results    = new ResultsModel();
    }

    /**
     * @return array
     */
    public function getErrors(): array
    {
        return $this->errors;
    }

    /**
     * @return array
     */
    public function getWarnings(): array
    {
        return $this->warnings;
    }

    /**
     * Run the extraction for one problem.
     *
     * @throws Exception when the ranking file does not exists.
     */
    public function run()
    {
        try {
            if (ExtractorLib::isEvaluationSuccessful($this->experiment, $this->problem)) {
                $rankingPath  = ExtractorLib::getRankingPath($this->experiment, $this->problem);
                $rankingFiles = ExtractorLib::getRankingFiles($this->experiment, $this->problem);

                $this->results->setNumberPassingTest(Counter::determineNumberPassingTestCases($rankingPath));
                $this->results->setNumberFailingTest(Counter::determineNumberFailingTestCases($rankingPath));

                $this->determineAllExamScoreAndLevel($rankingFiles, $rankingPath);
            }
        } catch (RuntimeException $exception) {
            if ($exception->getCode() > 9000) {
                $this->errors[] = $exception->getMessage();
            } else {
                $this->warnings[] = $exception->getMessage();
            }
        } finally {
            $this->saveResults();
        }
    }

    /**
     * Determine all the exam score of a project.
     *
     * @param array  $rankingFiles
     * @param string $rankingPath
     *
     * @throws Exception when the file does not exists
     */
    protected function determineAllExamScoreAndLevel(array $rankingFiles, string $rankingPath): void
    {
        foreach ($rankingFiles as $rankingFile) {
            try {
                if (strpos($rankingFile, self::EXTENSION_RANKING_CSV) === false) {
                    continue;
                }

                $formula       = str_replace(self::EXTENSION_RANKING_CSV, '', $rankingFile);
                $filename      = ExtractorLib::getRankingFileFullPath($rankingPath, $rankingFile);
                $lines         = CsvFileReader::read($filename, self::RANKING_FILE_DELIMITER);
                $formulaResult = DefectiveStatement::getRankingDefectiveStatement($formula, $this->problem, $lines);

                $this->results->addFormula($formulaResult);
            } catch (RuntimeException $exception) {
                if ($exception->getCode() > 9000) {
                    $this->errors[] = $exception->getMessage();
                } else {
                    $this->warnings[] = $exception->getMessage();
                }
            }
        }
    }

    /**
     * Save the resulting data.
     */
    protected function saveResults(): void
    {
        $db = DB::getConnection();

        if ($this->ifResultsAlreadyExists($db)) {
            $statement  = DB::getConnection()->prepare(self::QUERY_UPDATE_RESULTS);
            $parameters = array_merge($this->results->__toArray(), [$this->experiment->id, $this->problem->id]);
        } else {
            $statement  = DB::getConnection()->prepare(self::QUERY_INSERT_RESULTS);
            $parameters = array_merge([$this->experiment->id, $this->problem->id], $this->results->__toArray());
        }

        $statement->execute($parameters);

        if ($statement->errorCode() !== '00000') {
            throw new RuntimeException('Results could not be saved!');
        }
    }

    /**
     * @param PDO $db
     *
     * @return bool
     */
    protected function ifResultsAlreadyExists(PDO $db): bool
    {
        $exist = $db->prepare('SELECT id FROM ths_results tr WHERE experiment_id = ? AND problem_id = ?');
        $exist->execute([$this->experiment->id, $this->problem->id]);

        return $exist->rowCount() > 0;
    }
}