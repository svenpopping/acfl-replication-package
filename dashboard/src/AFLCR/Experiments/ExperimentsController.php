<?php

namespace AFLCR\Experiments;

use AFLCR\Database\DB;
use AFLCR\Utils\ArrayUtils;
use PDO;
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;

/**
 * Class ExperimentsController
 *
 * @package AFLCR\Experiments
 */
class ExperimentsController {

    private const QUERY_GET_ALL             = 'SELECT * FROM ths_experiments';
    private const QUERY_GET_ONE             = 'SELECT * FROM ths_experiments WHERE id = ?';
    private const QUERY_GET_ALL_RUNS_OF_ONE = 'SELECT ths_software.project_id, ths_software.bug_id, ths_problems.target_frame, ths_experiments_runs.* FROM ths_experiments_runs
	                                           INNER JOIN ths_problems ON ths_experiments_runs.problems_id = ths_problems.id
                                               INNER JOIN ths_software ON ths_problems.software_id = ths_software.id';
    private const QUERY_UPDATE_RUN          = 'UPDATE ths_experiments_runs SET exp_human_human = ?,  exp_botsing_human = ?, 
                                               exp_mult_botsing_human = ?, exp_botsing_evosuite = ?, exp_mult_botsing_evosuite = ?, 
                                               description = ? WHERE id = ?';

    /**
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function getOne(Response $response, array $args): Response {
        return self::executeQuery($response, self::QUERY_GET_ONE, $args);
    }

    /**
     * @param  Response  $response
     * @param  string  $query
     * @param  array  $args
     *
     * @return Response
     */
    private static function executeQuery(Response $response, string $query, array $args = null): Response {
        $statement = DB::getConnection()->prepare($query);
        if ($args !== null) {
            $statement->execute([$args['experimentId']]);
        } else {
            $statement->execute();
        }

        $payload = json_encode($statement->fetchAll(PDO::FETCH_ASSOC));
        $response->getBody()->write($payload);

        return $response
                ->withHeader('Content-Type', 'application/json')
                ->withStatus(201);
    }

    /**
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getAllRun(Response $response): Response {
        return self::executeQuery($response, self::QUERY_GET_ALL_RUNS_OF_ONE);

    }

    /**
     * @param  Response  $response
     *
     * @return Response
     */
    public static function getAll(Response $response) {
        return self::executeQuery($response, self::QUERY_GET_ALL);
    }

    /**
     * @param  Request  $request
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function postUpdateRun(Request $request, Response $response, array $args): Response {
        $payload   = ArrayUtils::sanitize($request->getParsedBody());
        $statement = DB::getConnection()->prepare(self::QUERY_UPDATE_RUN);
        $statement->execute([
                $payload['exp_human_human'],
                $payload['exp_botsing_human'],
                $payload['exp_mult_botsing_human'],
                $payload['exp_botsing_evosuite'],
                $payload['exp_mult_botsing_evosuite'],
                $payload['description'],
                $payload['id'],
        ]);

        return $response->withStatus(200);
    }
}
