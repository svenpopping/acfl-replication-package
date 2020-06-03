/*

 * Tue Mar 03 11:50:06 GMT 2020
 */

package org.joda.time;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MockZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Seconds;
import org.joda.time.TestDateMidnight_Basics;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.TestYearMonth_Basics;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.Months;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.joda.time.TestInterval_Basics;

public class Period_ESTest_Botsing extends Period_ESTest_scaffolding_Botsing {

    @Test(timeout = 4000)
    public void test00frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
        localTime0.indexOf(dateTimeFieldType0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-1));
    }

    @Test(timeout = 4000)
    public void test01frame2() throws Throwable {
        TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics((String) null);
        TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
        Chronology chronology0 = testYearMonthDay_Basics_MockInstant0.getChronology();
        PeriodType periodType0 = PeriodType.weeks();
        Period period0 = new Period(1, 1, periodType0, chronology0);
        // Undeclared exception!
        period0.withYears(1);
    }

    @Test(timeout = 4000)
    public void test02frame2() throws Throwable {
        LocalTime localTime0 = LocalTime.now();
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(10805);
    }

    @Test(timeout = 4000)
    public void test03frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-4354));
    }

    @Test(timeout = 4000)
    public void test04frame2() throws Throwable {
        Period period0 = Period.millis(0);
        period0.getValue(0);
        Hours hours0 = Hours.FOUR;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        Period period1 = new Period((long) 0, periodType0);
        // Undeclared exception!
        period1.withYears(0);
    }

    @Test(timeout = 4000)
    public void test05frame2() throws Throwable {
        LocalTime localTime0 = new LocalTime((DateTimeZone) null);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test06frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-3368));
    }

    @Test(timeout = 4000)
    public void test07frame2() throws Throwable {
        Period period0 = new Period(0L, 0L);
        period0.ZERO.getMillis();
        MockZone mockZone0 = new MockZone(0L, 0, 0);
        LocalTime localTime0 = new LocalTime((DateTimeZone) mockZone0);
        Period period1 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period1.withYears(0);
    }

    @Test(timeout = 4000)
    public void test08frame2() throws Throwable {
        Period period0 = new Period(0L, 0L);
        Period period1 = period0.withYears((-4354));
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test09frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(3);
    }

    @Test(timeout = 4000)
    public void test10frame2() throws Throwable {
        Period period0 = Period.millis(0);
        period0.getValue(0);
        Hours hours0 = Hours.FOUR;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        Duration duration0 = seconds0.toStandardDuration();
        Period period1 = duration0.toPeriod(periodType0);
        // Undeclared exception!
        period1.withYears(0);
    }

    @Test(timeout = 4000)
    public void test11frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(1971L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test12frame2() throws Throwable {
        LocalDate localDate0 = LocalDate.now();
        Minutes minutes0 = Minutes.TWO;
        PeriodType periodType0 = minutes0.getPeriodType();
        Period period0 = new Period(localDate0, localDate0, periodType0);
        localDate0.getEra();
        // Undeclared exception!
        period0.withYears(1);
    }

    @Test(timeout = 4000)
    public void test13frame2() throws Throwable {
        LocalTime localTime0 = LocalTime.MIDNIGHT;
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-1981));
    }

    @Test(timeout = 4000)
    public void test14frame2() throws Throwable {
        LocalTime localTime0 = LocalTime.now();
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test15frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(1977L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test16frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-861));
    }

    @Test(timeout = 4000)
    public void test17frame2() throws Throwable {
        Period period0 = new Period(0L, 0L);
        Period period1 = period0.withYears((-4354));
        Hours hours0 = Hours.FOUR;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test18frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(6312);
    }

    @Test(timeout = 4000)
    public void test19frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = LocalTime.now(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test20frame2() throws Throwable {
        Period period0 = new Period((-46L), (-46L));
        period0.getHours();
        TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("$Y");
        TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        DateTimeZone dateTimeZone0 = testDateMidnight_Basics_MockInstant0.getZone();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period1 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period1.withYears(0);
    }

    @Test(timeout = 4000)
    public void test21frame2() throws Throwable {
        Integer integer0 = new Integer(0);
        Hours hours0 = Hours.FOUR;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        Period period0 = new Period((long) integer0, periodType0);
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test22frame2() throws Throwable {
        PeriodType periodType0 = PeriodType.dayTime();
        Period period0 = new Period(1432, 1432, 1432, 1432, 1432, 1432, 1432, 1432);
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test23frame2() throws Throwable {
        PeriodType periodType0 = PeriodType.dayTime();
        Period period0 = Period.months(1432);
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test24frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-97));
    }

    @Test(timeout = 4000)
    public void test25frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-4359));
    }

    @Test(timeout = 4000)
    public void test26frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-4354));
    }

    @Test(timeout = 4000)
    public void test27frame2() throws Throwable {
        LocalTime localTime0 = new LocalTime();
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test28frame2() throws Throwable {
        LocalTime localTime0 = new LocalTime((DateTimeZone) null);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(1);
    }

    @Test(timeout = 4000)
    public void test29frame2() throws Throwable {
        Period period0 = Period.months((-456));
        Period period1 = Period.weeks((-456));
        Hours hours0 = period1.toStandardHours();
        Days days0 = hours0.toStandardDays();
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test30frame2() throws Throwable {
        LocalTime localTime0 = LocalTime.now();
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(9);
    }

    @Test(timeout = 4000)
    public void test31frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(648);
    }

    @Test(timeout = 4000)
    public void test32frame2() throws Throwable {
        Period period0 = Period.years((-4354));
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test33frame2() throws Throwable {
        Period period0 = Period.months((-456));
        period0.getMinutes();
        Period period1 = Period.hours(0);
        Hours hours0 = period1.toStandardHours();
        Days days0 = hours0.toStandardDays();
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test34frame2() throws Throwable {
        LocalTime localTime0 = LocalTime.fromMillisOfDay(1971L);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test35frame2() throws Throwable {
        Period period0 = new Period(0L, 0L);
        PeriodType periodType0 = PeriodType.seconds();
        TestYearMonth_Basics testYearMonth_Basics0 = new TestYearMonth_Basics("");
        TestYearMonth_Basics.MockYM testYearMonth_Basics_MockYM0 = testYearMonth_Basics0.new MockYM();
        Chronology chronology0 = testYearMonth_Basics_MockYM0.getChronology();
        Period period1 = new Period(period0, periodType0, chronology0);
        // Undeclared exception!
        period1.withYears((-4354));
    }

    @Test(timeout = 4000)
    public void test36frame2() throws Throwable {
        FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone) DateTimeZone.UTC;
        LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test37frame2() throws Throwable {
        Period period0 = Period.minutes(0);
        period0.getValue(0);
        Hours hours0 = Hours.FOUR;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        Period period1 = new Period((long) 0, periodType0);
        // Undeclared exception!
        period1.withYears(0);
    }

    @Test(timeout = 4000)
    public void test38frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-61));
    }

    @Test(timeout = 4000)
    public void test39frame2() throws Throwable {
        PeriodType periodType0 = PeriodType.dayTime();
        Period period0 = Period.months(1438);
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test40frame2() throws Throwable {
        Hours hours0 = Hours.SEVEN;
        Seconds seconds0 = hours0.toStandardSeconds();
        PeriodType periodType0 = seconds0.getPeriodType();
        Period period0 = new Period(0L, periodType0);
        // Undeclared exception!
        period0.withYears((-415));
    }

    @Test(timeout = 4000)
    public void test41frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-1975));
    }

    @Test(timeout = 4000)
    public void test42frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test43frame2() throws Throwable {
        PeriodType periodType0 = PeriodType.seconds();
        Period period0 = new Period((long) (-4354), periodType0);
        // Undeclared exception!
        period0.withYears((-4354));
    }

    @Test(timeout = 4000)
    public void test44frame2() throws Throwable {
        Period period0 = Period.seconds(12);
        Period period1 = period0.withYears(12);
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test45frame2() throws Throwable {
        LocalTime localTime0 = new LocalTime((DateTimeZone) null);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(2327);
    }

    @Test(timeout = 4000)
    public void test46frame2() throws Throwable {
        TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("$Y");
        TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
        DateTimeZone dateTimeZone0 = testDateMidnight_Basics_MockInstant0.getZone();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-4359));
    }

    @Test(timeout = 4000)
    public void test47frame2() throws Throwable {
        Period period0 = Period.months((-456));
        Period period1 = Period.hours((-456));
        Hours hours0 = period1.toStandardHours();
        Days days0 = hours0.toStandardDays();
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test48frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-1768));
    }

    @Test(timeout = 4000)
    public void test49frame2() throws Throwable {
        Period period0 = Period.months((-456));
        Period period1 = period0.minus(period0);
        Hours hours0 = period1.toStandardHours();
        Days days0 = hours0.toStandardDays();
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test50frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears((-2145));
    }

    @Test(timeout = 4000)
    public void test51frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class), anyLong());
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        // Undeclared exception!
        period0.withYears(3);
    }

    @Test(timeout = 4000)
    public void test52frame2() throws Throwable {
        DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
        LocalTime localTime0 = new LocalTime(dateTimeZone0);
        Period period0 = Period.fieldDifference(localTime0, localTime0);
        period0.getHours();
        // Undeclared exception!
        period0.withYears(0);
    }

    @Test(timeout = 4000)
    public void test00frame3() throws Throwable {
        Period period0 = Period.years(179);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test01frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.weeks();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test02frame3() throws Throwable {
        Period period0 = Period.seconds(917);
        Period period1 = period0.plusYears(917);
        PeriodType periodType0 = PeriodType.millis();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test03frame3() throws Throwable {
        Period period0 = Period.years((-442));
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test04frame3() throws Throwable {
        Period period0 = Period.years(885);
        PeriodType periodType0 = PeriodType.hours();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test05frame3() throws Throwable {
        Period period0 = Period.years(871);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test06frame3() throws Throwable {
        PeriodType periodType0 = PeriodType.months();
        TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("Africa/Johannesburg");
        TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        Period period0 = testInterval_Basics_MockInterval0.toPeriod(periodType0);
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test07frame3() throws Throwable {
        Period period0 = Period.years(904);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test08frame3() throws Throwable {
        Period period0 = Period.seconds(917);
        PeriodType periodType0 = PeriodType.millis();
        Period period1 = period0.withYears(917);
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test09frame3() throws Throwable {
        Period period0 = Period.years((-1632));
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test10frame3() throws Throwable {
        Period period0 = Period.months((-2233));
        TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("^");
        TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
        Minutes minutes0 = Minutes.minutesIn(testInterval_Basics_MockInterval0);
        PeriodType periodType0 = minutes0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test11frame3() throws Throwable {
        Period period0 = Period.years(885);
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test12frame3() throws Throwable {
        Period period0 = Period.years(919);
        PeriodType periodType0 = PeriodType.time();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test13frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.minutes();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test14frame3() throws Throwable {
        Period period0 = Period.years(921);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test15frame3() throws Throwable {
        Period period0 = Period.seconds(324);
        Period period1 = period0.plusYears(324);
        PeriodType periodType0 = PeriodType.millis();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test16frame3() throws Throwable {
        Period period0 = Period.years(894);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test17frame3() throws Throwable {
        Period period0 = Period.years(14);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test18frame3() throws Throwable {
        Period period0 = Period.years(7);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test19frame3() throws Throwable {
        Period period0 = Period.years(921);
        PeriodType periodType0 = PeriodType.hours();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test20frame3() throws Throwable {
        Period period0 = Period.years((-1995));
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test21frame3() throws Throwable {
        Period period0 = Period.years(1540);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test22frame3() throws Throwable {
        Period period0 = Period.years(535);
        Days days0 = Days.MIN_VALUE;
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test23frame3() throws Throwable {
        Period period0 = new Period();
        PeriodType periodType0 = PeriodType.days();
        Period period1 = period0.minusMonths((-86399999));
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test24frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.seconds();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test25frame3() throws Throwable {
        Period period0 = Period.millis(917);
        Period period1 = period0.plusYears(917);
        PeriodType periodType0 = PeriodType.millis();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test26frame3() throws Throwable {
        Period period0 = Period.years(885);
        PeriodType periodType0 = PeriodType.time();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test27frame3() throws Throwable {
        Period period0 = new Period((long) 40);
        Period period1 = period0.plusMonths(40);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test28frame3() throws Throwable {
        Period period0 = Period.years(869);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test29frame3() throws Throwable {
        Period period0 = Period.years(957);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test30frame3() throws Throwable {
        PeriodType periodType0 = PeriodType.hours();
        Period period0 = Period.weeks((-47));
        Period period1 = period0.minusMonths((-47));
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test31frame3() throws Throwable {
        Period period0 = new Period();
        Period period1 = period0.ZERO.withMonths(192);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test32frame3() throws Throwable {
        Period period0 = Period.years(912);
        Months months0 = Months.ZERO;
        PeriodType periodType0 = months0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test33frame3() throws Throwable {
        Period period0 = Period.years((-2155));
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test34frame3() throws Throwable {
        PeriodType periodType0 = PeriodType.hours();
        Period period0 = Period.weeks((-47));
        Period period1 = period0.plusYears((-47));
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test35frame3() throws Throwable {
        Period period0 = Period.years(868);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test36frame3() throws Throwable {
        Period period0 = Period.years(919);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test37frame3() throws Throwable {
        Period period0 = Period.years(929);
        PeriodType periodType0 = PeriodType.minutes();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test38frame3() throws Throwable {
        Period period0 = Period.millis(916);
        Period period1 = period0.plusYears(916);
        PeriodType periodType0 = PeriodType.millis();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test39frame3() throws Throwable {
        Period period0 = Period.years(921);
        Days days0 = Days.MIN_VALUE;
        PeriodType periodType0 = days0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test40frame3() throws Throwable {
        Period period0 = Period.years(884);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test41frame3() throws Throwable {
        Period period0 = Period.years(830);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test42frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.millis();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test43frame3() throws Throwable {
        Period period0 = Period.years((-3745));
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test44frame3() throws Throwable {
        PeriodType periodType0 = PeriodType.millis();
        Period period0 = Period.years(6);
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test45frame3() throws Throwable {
        Period period0 = Period.years(12825000);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test46frame3() throws Throwable {
        Period period0 = Period.years(885);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test47frame3() throws Throwable {
        Period period0 = Period.years(885);
        TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(885);
        PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test48frame3() throws Throwable {
        Period period0 = new Period();
        Period period1 = period0.ZERO.withMonths(192);
        Period period2 = period1.withMinutes(192);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period2.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test49frame3() throws Throwable {
        Period period0 = Period.years(1725);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test50frame3() throws Throwable {
        Period period0 = Period.years(913);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test51frame3() throws Throwable {
        Period period0 = new Period(922, 922, 922, 922, 922, 922, 922, 922);
        Months months0 = Months.MAX_VALUE;
        PeriodType periodType0 = months0.getPeriodType();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test52frame3() throws Throwable {
        Period period0 = new Period();
        Period period1 = period0.plusYears(129);
        TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(129);
        PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test53frame3() throws Throwable {
        Period period0 = new Period();
        Period period1 = period0.plusMonths(1096);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test54frame3() throws Throwable {
        Period period0 = new Period(921, 921, 921, 921, 921, 921, 921, 921);
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test55frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.time();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test56frame3() throws Throwable {
        Period period0 = Period.months(921);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test57frame3() throws Throwable {
        Period period0 = Period.months(4157);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test58frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.hours();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }

    @Test(timeout = 4000)
    public void test59frame3() throws Throwable {
        Period period0 = Period.years(912);
        PeriodType periodType0 = PeriodType.months();
        // Undeclared exception!
        period0.normalizedStandard(periodType0);
    }
}
