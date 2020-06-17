<?php

use Slim\Factory\AppFactory;

require __DIR__ . '/../../vendor/autoload.php';

$app = AppFactory::create();

require_once 'middleware.php';
require_once 'routes.php';

$app->run();
