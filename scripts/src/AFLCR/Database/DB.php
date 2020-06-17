<?php

namespace AFLCR\Database;

use AFLCR\Util\Settings;
use PDO;

/**
 * Class DB.
 *
 * @package Database
 */
class DB
{

    private const DNS_TEMPLATE = "mysql:dbname=%s;host=%s";

    private const SETTING_DATABASE_HOST     = 'database.host';
    private const SETTING_DATABASE_NAME     = 'database.name';
    private const SETTING_DATABASE_PASSWORD = 'database.password';
    private const SETTING_DATABASE_USER     = 'database.user';

    /** @var DB */
    private static $instance;

    /** @var PDO */
    private $pdo;

    /**
     * DB constructor.
     */
    private function __construct()
    {
        $dsn      = sprintf(
            self::DNS_TEMPLATE,
            Settings::get(self::SETTING_DATABASE_NAME),
            Settings::get(self::SETTING_DATABASE_HOST)
        );
        $user     = Settings::get(self::SETTING_DATABASE_USER);
        $password = Settings::get(self::SETTING_DATABASE_PASSWORD);

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