<?php

namespace AFLCR\Util;

use RuntimeException;

/**
 * Class Settings.
 *
 * @package Settings
 */
class Settings
{

    private const ERROR_SETTINGS_FILE_NOT_FOUND     = 'Settings file \'config/settings.json\' does not exists';

    private const ERROR_SETTING_NOT_FOUND           = 'Setting %s does not exists.';

    private const ERROR_SETTING_PATH_INVALID_FORMAT = 'Setting path does not meet the required format.';

    private const REGEX_VALID_SETTING_PATH          = '/^[a-zA-Z.\-_]*$/';

    private const SETTINGS_FILE_PATH                = '%s/config/settings.json';

    private const SETTING_PATH_DELIMITER            = '.';

    /** @var Settings */
    private static $instance = null;

    /** @var array */
    private $jsonArray;

    /**
     * Settings constructor.
     */
    private function __construct()
    {
        $settingsFile     = sprintf(self::SETTINGS_FILE_PATH, __SCRIPT_DIR__);
        $settingsFilePath = realpath($settingsFile);

        if ($settingsFilePath !== false && file_exists($settingsFilePath)) {
            $content         = file_get_contents($settingsFilePath);
            $this->jsonArray = json_decode($content, true);
        } else {
            throw new RuntimeException(self::ERROR_SETTINGS_FILE_NOT_FOUND);
        }
    }

    /**
     * Get the value of a settings.
     *
     * @param string $settingPath
     *
     * @return mixed
     */
    public static function get(string $settingPath)
    {
        $instance = self::getInstance();
        $instance->assertIsValidSettingsPath($settingPath);

        return self::getSettingsPath($instance->jsonArray, $settingPath);
    }

    /**
     * Get instance of this singleton.
     *
     * @return self
     */
    private static function getInstance(): self
    {
        if (is_null(self::$instance)) {
            self::$instance = new static();
        }

        return self::$instance;
    }

    /**
     * Assert if a given settings path is valid. Path should only contain lower
     * case characters and decimal points.
     *
     * @param string $settingPath
     */
    private function assertIsValidSettingsPath(string $settingPath): void
    {
        if (preg_match(self::REGEX_VALID_SETTING_PATH, $settingPath)) {
            // Path is correct
        } else {
            throw new RuntimeException(self::ERROR_SETTING_PATH_INVALID_FORMAT);
        }
    }

    /**
     * Recursively get the settings data.
     *
     * @param array  $settingsArray
     * @param string $settingPath
     *
     * @return mixed
     */
    private static function getSettingsPath(array $settingsArray, string $settingPath)
    {
        if (isset($settingsArray[$settingPath])) {
            return $settingsArray[$settingPath];
        } else {
            list($directory, $subSettingsPath) = explode(self::SETTING_PATH_DELIMITER, $settingPath, 2);

            if (isset($settingsArray[$directory])) {
                return self::getSettingsPath($settingsArray[$directory], $subSettingsPath);
            } else {
                throw new RuntimeException(sprintf(self::ERROR_SETTING_NOT_FOUND, $settingPath));
            }
        }
    }
}