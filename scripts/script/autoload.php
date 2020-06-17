<?php

$autoloader = realpath(__DIR__ . '/../vendor/autoload.php');

if ($autoloader !== false) {
    require_once $autoloader;
} else {
    die('Invalid vendor autoloader');
}

spl_autoload_register(function ($className) {
    $fileName = str_replace('\\', DIRECTORY_SEPARATOR, $className);
    $realpath = realpath(__DIR__ . '/../src/' . $fileName . '.php');

    if ($realpath !== false && file_exists($realpath)) {
        require_once $realpath;
    }
});

define('__HOME__', exec('echo $HOME'));
define('__SCRIPT_DIR__', __HOME__ . '/Development/Experiments/experiment-runner');
