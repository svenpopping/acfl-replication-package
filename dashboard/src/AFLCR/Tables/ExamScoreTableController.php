<?php


namespace AFLCR\Tables;


use AFLCR\Database\DB;
use AFLCR\Utils\SqlQuery;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;

class ExamScoreTableController {

    /**
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getStatisticsExamScoreFiltered(Response $response): Response {
        return self::getStatistics($response, SqlQuery::get('tables-exam-score-statistics-filtered'));
    }

    /**
     * @param  Response  $response
     * @param  string  $query
     *
     * @return Response
     */
    protected static function getStatistics(Response $response, string $query): Response {
        $data = [];

        foreach (self::getAllExperiment() as $experiment) {
            $statement = DB::getConnection()->prepare($query);
            $statement->execute([$experiment->id]);

            $data[$experiment->name] = array_merge(['column_name' => $experiment->name], $statement->fetch(PDO::FETCH_ASSOC));
        }

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
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getStatisticsExamScore(Response $response): Response {
        return self::getStatistics($response, SqlQuery::get('tables-exam-score-statistics'));
    }
}