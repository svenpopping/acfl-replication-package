<?php

namespace AFLCR\Graphs;

use AFLCR\Database\DB;
use AFLCR\Utils\Color;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;
use stdClass;

/**
 * Class FormulaGraphsController
 *
 * @package AFLCR\Graphs
 */
class FormulaGraphsController {

    /**
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getBestFormulaDistribution(Response $response): Response {
        $data = [
                'labels'   => ['human-human', 'botsing-human', 'mult_bosting-human', 'botsing-evosuite', 'mult_botsing-evosuite'],
                'datasets' => [],
        ];

        $formulas = ['OCHIAI', 'DSTAR', 'BARINEL', 'TARANTULA'];
        foreach ($formulas as $index => $formula) {
            $numberOfLabels = count($data['labels']);

            $dataset = [
                    'label'           => $formula,
                    'data'            => array_fill(0, $numberOfLabels, 0),
                    'backgroundColor' => Color::getBackgroundColorArray($index, $numberOfLabels),
                    'borderColor'     => Color::getBorderColorArray($index, $numberOfLabels),
                    'borderWidth'     => 1,
            ];

            $data['datasets'][$formula] = $dataset;
        }

        foreach (self::getAllExperiment() as $index => $experiment) {
            $count = self::countBestOccurrencesFormula($experiment);

            foreach($count as $formula => $formulaCount) {
                $data['datasets'][$formula]['data'][$index] = $formulaCount;
            }
        }

        $data['datasets'] = array_values($data['datasets']);

        $payload = json_encode($data);
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(200);
    }

    /**
     * Get all the experiments in the database.
     *
     * @return array
     */
    protected static function getAllExperiment(): array {
        $statement = DB::getConnection()->prepare('SELECT * FROM ths_experiments');
        $statement->execute();

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }

    /**
     * Count the times each formula is the best.
     *
     * @param  stdClass  $experiment
     *
     * @return array
     */
    protected static function countBestOccurrencesFormula(stdClass $experiment): array {
        $formula = [
                'OCHIAI'    => 0,
                'DSTAR'     => 0,
                'BARINEL'   => 0,
                'TARANTULA' => 0,
        ];

        foreach (self::getAllResultByExperimentId($experiment->id) as $result) {
            foreach (explode(";", $result->category) as $category) {
                if (isset($formula[$category])) {
                    $formula[$category]++;
                }
            };
        }

        return $formula;
    }

    /**
     * Get all the result by a experiment ID.
     *
     * @param  int  $experimentId
     *
     * @return array
     */
    protected static function getAllResultByExperimentId(int $experimentId): array {
        $statement = DB::getConnection()->prepare('SELECT * FROM ths_results WHERE experiment_id = ?');
        $statement->execute([$experimentId]);

        return $statement->fetchAll(PDO::FETCH_CLASS);
    }
}