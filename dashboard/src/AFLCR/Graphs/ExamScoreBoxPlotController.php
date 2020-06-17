<?php


namespace AFLCR\Graphs;


use AFLCR\Database\DB;
use AFLCR\Utils\Color;
use AFLCR\Utils\SqlQuery;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;

/**
 * Class ExamScoreHistogramController
 *
 * @package AFLCR\Graphs
 */
class ExamScoreBoxPlotController {

    /**
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function getChart(Response $response, array $args): Response {
        $payload               = [];
        $payload['labels']     = ['human-human', 'mult_botsing-human', 'mult_botsing-evosuite'];
        $payload['datasets'][] = self::createDataset(self::getDataByDatasetName('main'), '51 problems', 1);
        $payload['datasets'][] = self::createDataset(self::getDataByDatasetName('additional'), '65 problems', 3);

        $payload = json_encode($payload);
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(200);
    }

    /**
     * Create a Chart.js Dataset.
     *
     * @param  array  $data
     * @param  string  $label
     * @param  int  $index
     *
     * @return array
     */
    private static function createDataset(array $data, string $label, int $index): array {
        return [
                'label'           => $label,
                'backgroundColor' => Color::getBackgroundColor($index),
                'borderColor'     => Color::getBorderColor($index),
                'borderWidth'     => 1,
                'outlierColor'    => '#999999',
                'padding'         => 10,
                'itemRadius'      => 0,
                'data'            => $data,
        ];
    }

    /**
     * Get the data by a dataset name.
     *
     * @param  string  $datasetName
     *
     * @return array
     */
    private static function getDataByDatasetName(string $datasetName): array {
        return [
                self::getExamScore(1, $datasetName),
                self::getExamScore(3, $datasetName),
                self::getExamScore(5, $datasetName),
        ];
    }

    /**
     * Get the EXAM scores by a experiment and dataset name.
     *
     * @param  int  $experimentId
     * @param  string  $datasetName
     *
     * @return array
     */
    private static function getExamScore(int $experimentId, string $datasetName): array {
        $statement = DB::getConnection()->prepare(SqlQuery::get(sprintf("graphs-exam-score-boxplot-%s", $datasetName)));
        $statement->execute([$experimentId]);

        $allExamScoreStrings = $statement->fetchAll(PDO::FETCH_COLUMN);

        return array_map('floatval', $allExamScoreStrings);
    }
}