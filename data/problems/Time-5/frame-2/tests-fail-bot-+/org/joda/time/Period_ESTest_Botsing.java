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

public class Period_ESTest_Botsing extends Period_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      localTime0.indexOf(dateTimeFieldType0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics((String) null);
      TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
      Chronology chronology0 = testYearMonthDay_Basics_MockInstant0.getChronology();
      PeriodType periodType0 = PeriodType.weeks();
      Period period0 = new Period(1, 1, periodType0, chronology0);
      // Undeclared exception!
      period0.withYears(1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(10805);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-4354));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-3368));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period(0L, 0L);
      period0.ZERO.getMillis();
      MockZone mockZone0 = new MockZone(0L, 0, 0);
      LocalTime localTime0 = new LocalTime((DateTimeZone) mockZone0);
      Period period1 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period1.withYears(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period(0L, 0L);
      Period period1 = period0.withYears((-4354));
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(3);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
  public void test11()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1971L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Minutes minutes0 = Minutes.TWO;
      PeriodType periodType0 = minutes0.getPeriodType();
      Period period0 = new Period(localDate0, localDate0, periodType0);
      localDate0.getEra();
      // Undeclared exception!
      period0.withYears(1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-1981));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(1977L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-861));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = new Period(0L, 0L);
      Period period1 = period0.withYears((-4354));
      Hours hours0 = Hours.FOUR;
      Seconds seconds0 = hours0.toStandardSeconds();
      PeriodType periodType0 = seconds0.getPeriodType();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(6312);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Hours hours0 = Hours.FOUR;
      Seconds seconds0 = hours0.toStandardSeconds();
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = new Period((long) integer0, periodType0);
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = new Period(1432, 1432, 1432, 1432, 1432, 1432, 1432, 1432);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = Period.months(1432);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-97));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-4359));
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-4354));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalTime localTime0 = new LocalTime();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.months((-456));
      Period period1 = Period.weeks((-456));
      Hours hours0 = period1.toStandardHours();
      Days days0 = hours0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(9);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(648);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.years((-4354));
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
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
  public void test34()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay(1971L);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
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
  public void test36()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
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
  public void test38()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-61));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      Period period0 = Period.months(1438);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Seconds seconds0 = hours0.toStandardSeconds();
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = new Period(0L, periodType0);
      // Undeclared exception!
      period0.withYears((-415));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-1975));
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PeriodType periodType0 = PeriodType.seconds();
      Period period0 = new Period((long) (-4354), periodType0);
      // Undeclared exception!
      period0.withYears((-4354));
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Period period0 = Period.seconds(12);
      Period period1 = period0.withYears(12);
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(2327);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("$Y");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      DateTimeZone dateTimeZone0 = testDateMidnight_Basics_MockInstant0.getZone();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-4359));
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = Period.months((-456));
      Period period1 = Period.hours((-456));
      Hours hours0 = period1.toStandardHours();
      Days days0 = hours0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-1768));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.months((-456));
      Period period1 = period0.minus(period0);
      Hours hours0 = period1.toStandardHours();
      Days days0 = hours0.toStandardDays();
      PeriodType periodType0 = days0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears((-2145));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn(750L).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      // Undeclared exception!
      period0.withYears(3);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      period0.getHours();
      // Undeclared exception!
      period0.withYears(0);
  }
}
