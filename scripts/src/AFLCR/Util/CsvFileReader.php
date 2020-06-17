<?php

namespace AFLCR\Util;

use Exception;

/**
 * Class CsvFileReader
 *
 * @package Results
 */
class CsvFileReader
{

    /**
     * Read a csv file.
     *
     * @param string $filename
     * @param string $delimiter
     *
     * @return array
     * @throws Exception
     */
    public static function read(string $filename, string $delimiter = ','): array
    {
        $handle = fopen($filename, 'r');
        $lines  = [];
        $count  = 0;
        $header = [];

        if ($handle === false) {
            throw new Exception($filename . ' does not exists');
        }

        while (($data = fgetcsv($handle, 0, $delimiter)) !== false) {
            if ($count === 0) {
                $header = $data;
            } else {
                $lines[] = array_combine($header, $data);
            }
            $count++;
        }

        fclose($handle);

        return $lines;
    }
}