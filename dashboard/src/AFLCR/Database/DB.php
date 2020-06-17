<?php


namespace AFLCR\Database;


use PDO;

/**
 * Class DB
 *
 * @package Database
 */
class DB
{

    /** @var DB */
    private static $instance;

    /** @var PDO */
    private $pdo;

    /**
     * DB constructor.
     */
    private function __construct()
    {
        $dsn      = 'mysql:dbname=thesis;host=10.33.0.236';
        $user     = 'root';
        $password = 'secret';

        $this->pdo = new PDO($dsn, $user, $password);
    }

    /**
     * Get the database connection.
     *
     * @return PDO
     */
    public static function getConnection(): PDO
    {
        return DB::getInstance()->pdo;
    }

    /**
     * Get an instance of the JobRunner.
     *
     * @return static
     */
    private static function getInstance(): self
    {
        if (!isset(static::$instance)) {
            static::$instance = new static();
        }

        return static::$instance;
    }
}