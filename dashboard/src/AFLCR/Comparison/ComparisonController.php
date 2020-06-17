<?php


namespace AFLCR\Comparison;


use AFLCR\Database\DB;
use AFLCR\Utils\SqlQuery;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;

/**
 * Class ComparisonController
 *
 * @package AFLCR\Comparison
 */
class ComparisonController {

    /**
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function get(Response $response, array $args): Response {
        $statement = DB::getConnection()->prepare(SqlQuery::get('comparision-two-experiments'));
        $statement->execute([$args['resultsA'], $args['resultsB']]);

        $payload = json_encode($statement->fetchAll(PDO::FETCH_ASSOC));
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(201);
    }
}