<?php

use AFLCR\Evaluation\Scheduler\Job;
use AFLCR\Evaluation\Scheduler\Worker;

require_once __DIR__ . '/../script/autoload.php';

$job    = Job::createFromStdClass(json_decode($argv[1]));
$worker = new Worker($job);
$worker->run();
