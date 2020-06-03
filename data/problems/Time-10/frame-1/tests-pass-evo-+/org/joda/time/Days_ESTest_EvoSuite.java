/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:49:41 GMT 2020
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
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

public class Days_ESTest_EvoSuite extends Days_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.days((-289));
      boolean boolean0 = days0.isLessThan(days1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.SIX;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(3246L);
      Days days0 = Days.ONE;
      LocalDate localDate1 = localDate0.minus(days0);
      Days days1 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate1);
      assertEquals((-1), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.ONE;
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.SIX;
      Weeks weeks0 = days0.MIN_VALUE.toStandardWeeks();
      assertEquals((-306783378), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = days0.minus(4);
      Seconds seconds0 = days1.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.days((-1552));
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals((-134092800), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.THREE;
      Minutes minutes0 = days0.ZERO.toStandardMinutes();
      assertEquals(1, minutes0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = days0.plus((-289));
      Minutes minutes0 = days1.toStandardMinutes();
      assertEquals((-411840), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.THREE;
      Hours hours0 = days0.toStandardHours();
      assertEquals(72, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.days((-1552));
      Hours hours0 = days0.toStandardHours();
      assertEquals((-37248), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.TWO;
      Duration duration0 = days0.ZERO.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Duration duration0 = days0.toStandardDuration();
      assertEquals((-185542587187200000L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.ZERO;
      Days days2 = days0.plus(days1);
      assertEquals(Integer.MIN_VALUE, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      Days days0 = duration0.toStandardDays();
      Days days1 = days0.plus(0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.negated();
      assertEquals(0, days1.getDays());
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Days days0 = Days.days((-1552));
      Days days1 = days0.negated();
      assertEquals(1, days1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = days0.multipliedBy((-1779));
      assertEquals((-8895), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.SIX.minus(0);
      assertNotSame(days0, days1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2367));
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      Days days0 = Days.daysBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      int int0 = days0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      int int0 = days0.getDays();
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.minus(25734375);
      Days days2 = days1.dividedBy(499);
      assertEquals((-51571), days2.getDays());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(13421772);
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = localDateTime0.withYear(0);
      Days days0 = Days.daysBetween((ReadablePartial) localDateTime1, (ReadablePartial) localDateTime0);
      assertEquals(735599, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateMidnight dateMidnight0 = DateMidnight.now((Chronology) islamicChronology0);
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      DateMidnight dateMidnight1 = dateMidnight0.withFieldAdded(durationFieldType0, (-3860));
      Days days0 = Days.daysBetween((ReadableInstant) dateMidnight1, (ReadableInstant) dateMidnight0);
      assertEquals(113988, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      Instant instant1 = instant0.plus(30585600000L);
      Days days0 = Days.daysBetween((ReadableInstant) instant1, (ReadableInstant) instant0);
      assertEquals((-354), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.plus(0);
      assertEquals(Integer.MAX_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.days(3);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.days(6);
      assertEquals(6, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Days days0 = Days.days(0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Days days0 = Days.days(4);
      assertEquals(4, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Days days0 = Days.THREE;
      DurationFieldType durationFieldType0 = days0.getFieldType();
      assertEquals("days", durationFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Days days0 = Days.TWO;
      Days days1 = Days.days(396);
      boolean boolean0 = days0.isLessThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Days days0 = weeks0.toStandardDays();
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Days days0 = weeks0.toStandardDays();
      Days days1 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertTrue(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Seconds seconds0 = minutes0.toStandardSeconds();
      Days days0 = Days.standardDaysIn(seconds0);
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Days days0 = Days.TWO;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Days days0 = Days.FOUR;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.dividedBy(1);
      assertEquals(7, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Days days0 = hours0.toStandardDays();
      Days days1 = days0.TWO.dividedBy(1279);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Days days0 = weeks0.toStandardDays();
      days0.FIVE.minus((Days) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Days days0 = hours0.toStandardDays();
      Days days1 = days0.SEVEN.plus(days0);
      assertEquals(7, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      Days days1 = days0.multipliedBy(0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Instant instant0 = Instant.now();
      MutableInterval mutableInterval0 = new MutableInterval(instant0, instant0);
      Days days0 = Days.daysIn(mutableInterval0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.ONE.plus((Days) null);
      Days days2 = days0.minus(days1);
      assertEquals(6, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Days days0 = Days.days(5);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = days0.FOUR.minus(days0);
      Days days2 = days1.minus(0);
      assertEquals(0, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Days days0 = Days.FOUR;
      int int0 = days0.getDays();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Days days0 = Days.FOUR;
      Duration duration0 = days0.toStandardDuration();
      assertEquals(345600L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Weeks weeks0 = days0.SEVEN.toStandardWeeks();
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.multipliedBy(25734375);
      assertEquals(180140625, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Days days0 = Days.FOUR;
      Seconds seconds0 = days0.toStandardSeconds();
      assertEquals(345600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Days days0 = Days.SEVEN;
      PeriodType periodType0 = days0.getPeriodType();
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Instant instant0 = Instant.now();
      Days days0 = Days.daysBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Duration duration0 = new Duration((Object) null);
      Seconds seconds0 = duration0.toStandardSeconds();
      Days days0 = seconds0.toStandardDays();
      Hours hours0 = days0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Minutes minutes0 = days0.toStandardMinutes();
      Days days1 = minutes0.toStandardDays();
      assertEquals(7, days1.getDays());
      assertEquals(10080, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Days days0 = Days.FOUR;
      days0.toString();
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      Days days1 = minutes0.toStandardDays();
      Days days2 = days0.FOUR.minus(days1);
      days2.THREE.compareTo((BaseSingleFieldPeriod) days0);
      days2.TWO.minus(days0);
      DurationFieldType durationFieldType0 = DurationFieldType.DAYS_TYPE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(3);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      durationFieldType0.isSupported(gJChronology0);
      days1.MIN_VALUE.get(durationFieldType0);
      days0.MAX_VALUE.toString();
      days0.isGreaterThan(days1);
      days1.toStandardDuration();
      Days days3 = Days.standardDaysIn(minutes0);
      days3.getDays();
      Days days4 = days1.negated();
      days2.minus(0);
      Days days5 = Days.parseDays("P2147483647D");
      assertFalse(days5.equals((Object)days4));
  }
}