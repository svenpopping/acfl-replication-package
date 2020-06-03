/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:50:13 GMT 2020
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
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

public class Days_ESTest_EvoSuite extends Days_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = days0.SIX.dividedBy(2);
      boolean boolean0 = days1.isLessThan(days0);
      assertEquals(3, days1.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1847L, (DateTimeZone) null);
      Days days0 = Days.MIN_VALUE;
      PeriodType periodType0 = days0.MAX_VALUE.getPeriodType();
      MutablePeriod mutablePeriod0 = new MutablePeriod(dateTime0, dateTime0, periodType0);
      Interval interval0 = new Interval(dateTime0, mutablePeriod0);
      Days days1 = Days.daysIn(interval0);
      boolean boolean0 = days0.isGreaterThan(days1);
      assertEquals(0, days1.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.ZERO;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(306783378, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals(604800, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.days((-349));
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals((-30153600), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.minus(1440);
      Minutes minutes0 = days1.toStandardMinutes();
      assertEquals((-2063520), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Duration duration0 = new Duration((-1730L), (-1730L));
      Days days0 = duration0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.FIVE;
      Hours hours0 = days0.TWO.toStandardHours();
      assertEquals(48, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Duration duration0 = new Duration((-1730L), (-1730L));
      Days days0 = duration0.toStandardDays();
      Duration duration1 = days0.toStandardDuration();
      assertEquals(0L, duration1.getStandardMinutes());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3115);
      Days days0 = Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Days days0 = Days.standardDaysIn(seconds0);
      assertEquals((-24855), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.EIGHT;
      Days days0 = hours0.toStandardDays();
      Days days1 = days0.plus(0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.parseDays("P-2147483646D");
      assertEquals((-2147483646), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Duration duration0 = new Duration((-1730L), (-1730L));
      Days days0 = duration0.toStandardDays();
      days0.negated();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.days((-4642));
      days0.negated();
      assertEquals((-4642), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3115);
      Days days0 = Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      days0.ZERO.multipliedBy(0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.ONE.multipliedBy((-3316));
      assertEquals((-3316), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.days(990);
      Days days1 = days0.minus(days0);
      assertEquals(990, days0.getDays());
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = days0.minus(6);
      Days days2 = days1.minus(days0);
      assertEquals((-6), days2.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.minus(0);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.FIVE.minus(4350);
      Days days2 = days1.plus(days1);
      assertEquals((-4345), days1.getDays());
      assertEquals((-8690), days2.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withYear(0);
      Days days0 = Days.daysBetween((ReadableInstant) dateTime1, (ReadableInstant) dateTime0);
      int int0 = days0.getDays();
      assertEquals(735599, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.days((-1321));
      int int0 = days0.getDays();
      assertEquals((-1321), int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = days0.dividedBy(6);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.FIVE.dividedBy((-3));
      assertEquals((-1), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Duration duration0 = days0.SEVEN.toStandardDuration();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTime dateTime0 = DateTime.now((Chronology) islamicChronology0);
      Interval interval0 = duration0.toIntervalFrom(dateTime0);
      Days days1 = Days.daysIn(interval0);
      assertEquals(604800000L, duration0.getMillis());
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3037);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.withLocalMillis(3037);
      Days days0 = Days.daysBetween((ReadablePartial) localDate1, (ReadablePartial) localDate0);
      assertEquals(16115, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(3037);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      LocalDate localDate1 = localDate0.withLocalMillis(3037);
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate1);
      Hours hours0 = days0.toStandardHours();
      assertEquals((-386760), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(165).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("nd<", dateTimeFormatter0);
      DateMidnight dateMidnight0 = new DateMidnight((DateTimeZone) null);
      Days days0 = Days.daysBetween((ReadableInstant) dateMidnight0, (ReadableInstant) mutableDateTime0);
      assertEquals((-16115), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.plus(0);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Days days0 = Days.days(3);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Days days0 = Days.days(0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Days days0 = Days.days(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Days days0 = Days.FIVE;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      assertEquals("days", durationFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Days days0 = Days.days(990);
      Days days1 = days0.minus(990);
      boolean boolean0 = days1.isLessThan(days0);
      assertEquals(0, days1.getDays());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Days days0 = Days.THREE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Days days0 = Days.days(990);
      boolean boolean0 = days0.isLessThan(days0);
      assertEquals(990, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.THREE;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Days days0 = Days.FIVE;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.THREE.dividedBy(1);
      assertEquals(3, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.FIVE.minus((Days) null);
      assertNotSame(days0, days1);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Duration duration0 = new Duration(3165L, 3165L);
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.plus((Days) null);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Days days0 = Days.days(6);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Days days0 = Days.days(5);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Weeks weeks0 = hours0.toStandardWeeks();
      Days days0 = weeks0.toStandardDays();
      Days days1 = Days.FOUR;
      Days days2 = days0.plus(days1);
      assertSame(days2, days1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Days days0 = Days.parseDays("P1D");
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Duration duration0 = new Duration(3165L, 3165L);
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.plus(Integer.MIN_VALUE);
      Weeks weeks0 = days1.toStandardWeeks();
      assertEquals((-306783378), weeks0.getWeeks());
      assertEquals(0, days0.getDays());
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3115);
      Days days0 = Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      int int0 = days0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 3115);
      Days days0 = Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.ONE.multipliedBy(292272984);
      assertEquals(292272984, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.SEVEN.negated();
      boolean boolean0 = days1.isGreaterThan((Days) null);
      assertFalse(boolean0);
      assertEquals((-7), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Minutes minutes0 = days0.SEVEN.toStandardMinutes();
      Days days1 = Days.standardDaysIn(minutes0);
      assertEquals(7, days1.getDays());
      assertEquals(10080, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1847L, (DateTimeZone) null);
      Days days0 = Days.daysBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      days0.toStandardSeconds();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Days days0 = Days.ZERO;
      Minutes minutes0 = days0.ZERO.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Days days0 = Days.FIVE;
      String string0 = days0.toString();
      assertEquals("P5D", string0);
  }
}