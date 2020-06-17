<?php


namespace AFLCR\Utils;

/**
 * Class LatexTablePayload
 *
 * @package AFLCR\Utils
 */
class LatexTablePayload {

    private const TAB = '    ';

    private $payload;

    private $indentCount;

    public function __construct() {
        $this->payload     = '';
        $this->indentCount = 0;
    }

    public function indent() {
        $this->indentCount++;
    }

    public function unIndent() {
        $this->indentCount--;
    }

    public function getPayload(): string {
        return $this->payload;
    }

    public function addTableRow(array $tableRow): void {
        $this->addLine(sprintf('%s \\\\', implode(' & ', $tableRow)));
    }

    public function addLine(string $rowValue): void {
        $this->payload .= vsprintf('%s%s%s', [
                str_repeat(self::TAB, $this->indentCount),
                $rowValue,
                PHP_EOL,
        ]);
    }

    public function addLabel(string $label): void {
        $this->addLine(sprintf('\\label{tab:%s}', $label));
    }
}