<?php


namespace AFLCR\Utils;


use DOMDocument;
use DOMElement;
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;

class TableConvertToLatexController {

    /**
     * @param  Request  $request
     * @param  Response  $response
     * @param  array  $args
     *
     * @return Response
     */
    public static function convertToLatex(Request $request, Response $response, array $args): Response {
        $DOM = new DOMDocument();
        $DOM->loadHTML($request->getParsedBody()['table']);

        $dataTableHeader = self::getTableHeaders($DOM);
        $dataTableBody   = self::getTableBody($DOM, $dataTableHeader);

        $payload = self::generateLatexTable($DOM, $dataTableHeader, $dataTableBody);
        $response->getBody()->write($payload->getPayload());

        return $response->withStatus(201);
    }

    /**
     * Get the table headers.
     *
     * @param  DOMDocument  $DOM
     *
     * @return array
     */
    private static function getTableHeaders(DOMDocument $DOM): array {
        $dataTableHeader = [];
        $tableHeader     = $DOM->getElementsByTagName('thead')->item(0);
        foreach ($tableHeader->childNodes as $headerRow) {
            if ($headerRow instanceof DOMElement) {
                foreach ($headerRow->getElementsByTagName('th') as $headerCell) {
                    $dataTableHeader[] = self::getTextContent($headerCell);
                }
            }
        }

        return $dataTableHeader;
    }

    /**
     * @param $headerCell
     *
     * @return string
     */
    private static function getTextContent($headerCell): string {
        $content = str_replace('_', '\_', trim($headerCell->textContent));
        $content = str_replace('#', '\#', $content);

        return $content;
    }

    /**
     * @param  DOMDocument  $DOM
     * @param  array  $dataTableHeader
     *
     * @return array
     */
    private static function getTableBody(DOMDocument $DOM, array $dataTableHeader): array {
        $dataTableBody = [];
        $tableHeader   = $DOM->getElementsByTagName('tbody')->item(0);
        foreach ($tableHeader->childNodes as $bodyRow) {
            if ($bodyRow instanceof DOMElement) {
                $dataTableBodyRow = [];
                foreach ($bodyRow->getElementsByTagName('td') as $bodyCell) {
                    $dataTableBodyRow[] = self::getTextContent($bodyCell);
                }

                $dataTableBody[] = array_combine($dataTableHeader, $dataTableBodyRow);
            }
        }

        return $dataTableBody;
    }

    /**
     * @param  DOMDocument  $DOM
     * @param  array  $dataTableHeader
     * @param  array  $dataTableBody
     *
     * @return LatexTablePayload
     */
    private static function generateLatexTable(DOMDocument $DOM, array $dataTableHeader, array $dataTableBody): LatexTablePayload {
        list($dataTableHeader, $dataTableBody) = self::addPaddingToColumns($dataTableHeader, $dataTableBody);

        $payload = new LatexTablePayload();
        $payload->addLine('\begin{tabular}{|' . (str_repeat('l|', count($dataTableHeader))) . '}');
        $payload->indent();
        $payload->addLine('\hline');

        $payload->addTableRow($dataTableHeader);

        foreach ($dataTableBody as $tableRow) {
            $payload->addTableRow($tableRow);
        }

        $payload->unIndent();
        $payload->addLine('\end{tabular}');

        return $payload;
    }

    /**
     * @param  array  $dataTableHeader
     * @param  array  $dataTableBody
     *
     * @return array
     */
    private static function addPaddingToColumns(array $dataTableHeader, array $dataTableBody): array {
        $columnWidths = [];
        foreach ($dataTableHeader as $header) {
            $max    = strlen($header);
            $length = max(array_map('strlen', array_column($dataTableBody, $header)));

            if ($length > $max) {
                $max = $length;
            }

            $columnWidths[$header] = $max;
        }

        foreach ($dataTableHeader as $index => $header) {
            $dataTableHeader[$index] = str_pad($header, $columnWidths[$header]);
        }

        foreach ($dataTableBody as $index => $row) {
            foreach ($row as $item => $column) {
                $dataTableBody[$index][$item] = str_pad($column, $columnWidths[$item]);
            }
        }

        return [$dataTableHeader, $dataTableBody];
    }

    /**
     * @param  DOMDocument  $DOM
     *
     * @return mixed
     */
    private static function getTableId(DOMDocument $DOM) {
        return $DOM->getElementsByTagName('table')->item(0)->attributes->getNamedItem('id')->value;
    }
}