<?php


namespace AFLCR\Problems;

use AFLCR\Database\DB;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;

/**
 * Class ProblemsController
 *
 * @package AFLCR\Problems
 */
class ProblemsController {

    private const QUERY_GET_ALL = 'SELECT ths_problems.*, ths_software.project_id, ths_software.bug_id FROM ths_problems 
                                   INNER JOIN ths_software ON ths_problems.software_id = ths_software.id';

    /**
     * Get all the problems in the dataset.
     *
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getAll(Response $response): Response {
        $statement = DB::getConnection()->prepare(self::QUERY_GET_ALL);
        $statement->execute();

        $payload = json_encode($statement->fetchAll(PDO::FETCH_ASSOC));
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(201);
    }
}