<?php

namespace AFLCR\Matrix;

use AFLCR\Matrix\Utils\SpectrumMatrix;
use AFLCR\Util\CsvFileReader;
use AFLCR\Util\Settings;
use AFLCR\Util\StringUtil;
use Exception;

class HitSpectrumMatrixParser
{

    /**
     * Run the hit spectrum matrix parser.
     *
     * @param string $experiment
     * @param string $projectId
     * @param string $bugId
     * @param string $targetFrame
     *
     * @throws Exception
     */
    public static function run(string $experiment, string $projectId, string $bugId, string $targetFrame): void
    {
        $data = [
            'project_id'   => $projectId,
            'bug_id'       => $bugId,
            'target_frame' => $targetFrame,
        ];

        $resultDir  = self::getResultsDirectory($data);
        $statements = Time5bStackTraceStatements::getStatements();
        $spectra    = self::getSpectra($resultDir, $experiment);

        $components = [];
        foreach ($statements as $statement) {
            $components[] = $spectra[$statement];
        }

        $hitSpectrum    = self::getHitSpectrumMatrix($resultDir, $experiment, $components);
        $spectrumMatrix = new SpectrumMatrix($hitSpectrum, $resultDir, $experiment);

        DDUOptimization::run($spectrumMatrix);
    }

    /**
     * Get the spectra components.
     *
     * @param string $resultDir
     * @param string $experiment
     *
     * @return array
     * @throws Exception when file does not exists.
     */
    public static function getSpectra(string $resultDir, string $experiment): array
    {
        $spectra = CsvFileReader::read(sprintf('%s/%s/spectra.csv', $resultDir, $experiment), ';');
        $spectra = array_flip(array_map(function ($element) {
            return $element['name'];
        }, $spectra));

        return $spectra;
    }

    /**
     * Get the results dir of this project.
     *
     * @param array $data
     *
     * @return string
     */
    private static function getResultsDirectory(array $data): string
    {
        return StringUtil::format(Settings::get('data.results'), $data);
    }

    /**
     * Get the fault localisation matrix.
     *
     * @param string $resultDir
     * @param string $experiment
     * @param array  $components
     *
     * @return array
     */
    private static function getHitSpectrumMatrix(string $resultDir, string $experiment, array $components): array
    {
        $hitSpectrum = file_get_contents(sprintf("%s/%s/matrix.txt", $resultDir, $experiment));
        $hitSpectrum = explode(PHP_EOL, $hitSpectrum);
        array_pop($hitSpectrum);

        $hitSpectrum = array_map(function ($row) {
            return explode(' ', $row);
        }, $hitSpectrum);

        $hitSpectrum = array_map(function ($testCoverage) use ($components) {
            return array_filter($testCoverage, function ($covered, $component) use ($components) {
                return in_array($component, $components);
            }, ARRAY_FILTER_USE_BOTH);
        }, $hitSpectrum);

        return $hitSpectrum;
    }
}