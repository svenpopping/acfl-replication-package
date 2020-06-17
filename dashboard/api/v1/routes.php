<?php

use AFLCR\Comparison\ComparisonController;
use AFLCR\Experiments\ExperimentsController;
use AFLCR\Graphs\ExamScoreBoxPlotController;
use AFLCR\Graphs\FormulaGraphsController;
use AFLCR\Problems\ProblemsController;
use AFLCR\Results\ResultsController;
use AFLCR\Tables\ExamScoreTableController;
use AFLCR\Utils\TableConvertToLatexController;
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;
use Slim\Routing\RouteCollectorProxy;

$app->group('/api/v1', function (RouteCollectorProxy $group) {
    $group->get('/', function (Request $request, Response $response, $args) {
        $response->getBody()->write("Hello world!");

        return $response;
    });

    /**
     * Utils
     */
    $group->post('/table/convert/latex', function(Request $request, Response $response, array $args) {
       return TableConvertToLatexController::convertToLatex($request, $response, $args);
    });

    /**
     * ProblemsController.
     */
    $group->get('/problems', function (Request $request, Response $response, array $args) {
        return ProblemsController::getAll($response);
    });

    /**
     * ExperimentsController.
     */
    $group->get('/experiments', function (Request $request, Response $response, array $args) {
        return ExperimentsController::getAll($response);
    });
    $group->get('/experiments/runs', function (Request $request, Response $response, array $args) {
        return ExperimentsController::getAllRun($response);
    });
    $group->get('/experiments/{experimentId}', function (Request $request, Response $response, array $args) {
        return ExperimentsController::getOne($response, $args);
    });
    $group->post('/experiments/runs/{id}', function (Request $request, Response $response, array $args) {
        return ExperimentsController::postUpdateRun($request, $response, $args);
    });

    /**
     * ResultsController.
     */
    $group->get('/results/{experimentId}', function (Request $request, Response $response, array $args) {
        return ResultsController::getAllForExperiment($response, $args);
    });
    $group->post('/results/{id}', function (Request $request, Response $response, array $args) {
        return ResultsController::postUpdateResults($request, $response);
    });

    /**
     * ComparisonController.
     */
    $group->get('/comparision/{resultsA}/{resultsB}', function (Request $request, Response $response, array $args) {
        return ComparisonController::get($response, $args);
    });

    /**
     * Graphs.
     */
    $group->get('/graphs/best-formula-distribution', function (Request $request, Response $response, array $args) {
        return FormulaGraphsController::getBestFormulaDistribution($response);
    });
    $group->get('/graphs/exam-score-boxplot', function (Request $request, Response $response, array $args) {
        return ExamScoreBoxPlotController::getChart($response, $args);
    });

    /**
     * Tables.
     */
    $group->get('/table/statistics-exam-score', function (Request $request, Response $response, array $args) {
        return ExamScoreTableController::getStatisticsExamScore($response);
    });
    $group->get('/table/statistics-exam-score-filtered', function (Request $request, Response $response, array $args) {
        return ExamScoreTableController::getStatisticsExamScoreFiltered($response);
    });
});