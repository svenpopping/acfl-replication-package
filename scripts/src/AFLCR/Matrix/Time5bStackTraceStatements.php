<?php

namespace AFLCR\Matrix;

class Time5bStackTraceStatements
{

    private static $normalizedStandard
        = [
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1617',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1618',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1619',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1620',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1621',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1622',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1623',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1624',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1625',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1626',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1627',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1628',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1629',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1630',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1631',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1633',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1634',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1637',
        ];

    private static $setIndexedField
        = [
            'org.joda.time$PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int):688',
            'org.joda.time$PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int):689',
            'org.joda.time$PeriodType#setIndexedField(org.joda.time.ReadablePeriod,int,int[],int):690',
        ];

    private static $withYears
        = [
            'org.joda.time$Period#withYears(int):895',
            'org.joda.time$Period#withYears(int):896',
            'org.joda.time$Period#withYears(int):897',
        ];

    public static function getStatements()
    {
        return array_merge(
            self::$setIndexedField,
            self::$withYears,
            self::$normalizedStandard
        );
    }

    public static function getDefectiveStatements()
    {
        return [
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1628',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1629',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1630',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1631',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1633',
            'org.joda.time$Period#normalizedStandard(org.joda.time.PeriodType):1634',
        ];
    }
}