<?php

namespace AFLCR\Results;


use AFLCR\Database\DB;
use AFLCR\Utils\ArrayUtils;
use AFLCR\Utils\SqlQuery;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;

/**
 * Class ResultsController
 *
 * @package AFLCR\Results
 */
class ResultsController {

    /**
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function getAllForExperiment(Response $response, array $args): Response {
        $query = sprintf(SqlQuery::get('results-get-all-by-experiment'), $args['experimentId']);

        return self::executeQuery($response, $query);
    }

    /**
     * Execute query and the result to the response.
     *
     * @param  Response  $response
     * @param  string  $query
     *
     * @return Response
     */
    private static function executeQuery(Response $response, string $query): Response {
        $statement = DB::getConnection()->prepare($query);
        $statement->execute();

        $payload = json_encode($statement->fetchAll(PDO::FETCH_ASSOC));
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(201);
    }

    /**
     * Post request to update the results.
     *
     * @param  Request  $request
     * @param  Response  $response
     *
     * @return Response
     */
    public static function postUpdateResults(Request $request, Response $response): Response {
        $payload   = ArrayUtils::sanitize($request->getParsedBody());
        $statement = DB::getConnection()->prepare(SqlQuery::get('results-update-category-and-description'));
        $statement->execute([
                $payload['category'],
                $payload['description'],
                $payload['id'],
        ]);

        return $response->withStatus(200);
    }
}
