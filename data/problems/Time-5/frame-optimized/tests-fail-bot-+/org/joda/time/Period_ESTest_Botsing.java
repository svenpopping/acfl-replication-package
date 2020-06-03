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
    public void test44frame2() throws Throwable {
        Period period0 = Period.seconds(12);
        Period period1 = period0.withYears(12);
        PeriodType periodType0 = PeriodType.dayTime();
        // Undeclared exception!
        period1.normalizedStandard(periodType0);
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
}
