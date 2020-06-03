/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:51:29 GMT 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;

public class BaseSingleFieldPeriod_ESTest_EvoSuite extends BaseSingleFieldPeriod_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.FOUR;
      Seconds seconds0 = days0.toStandardSeconds();
      seconds0.hashCode();
      assertEquals(4, days0.getDays());
      assertEquals(345600, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus(years0);
      boolean boolean0 = years1.equals(years0);
      assertFalse(years0.equals((Object)years1));
      assertFalse(boolean0);
      assertEquals(1, years0.getYears());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      Partial partial0 = new Partial(monthDay0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) monthDay0, (ReadablePartial) partial0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.THREE;
      Weeks weeks0 = days0.toStandardWeeks();
      int int0 = BaseSingleFieldPeriod.standardPeriodIn(weeks0, (-2249L));
      assertEquals(3, days0.getDays());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.FOUR;
      Seconds seconds0 = days0.toStandardSeconds();
      int int0 = BaseSingleFieldPeriod.standardPeriodIn(seconds0, 57L);
      assertEquals(4, days0.getDays());
      assertEquals(6063157, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.SIX;
      int int0 = BaseSingleFieldPeriod.standardPeriodIn(days0, (-3903L));
      assertEquals((-132820), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.hours(0);
      int int0 = hours0.getValue(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Hours hours0 = weeks0.toStandardHours();
      hours0.getPeriodType();
      assertEquals(168, hours0.getHours());
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Months months0 = Months.TEN;
      DurationFieldType durationFieldType0 = months0.getFieldType();
      int int0 = months0.get(durationFieldType0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Months months0 = Months.months((-2188));
      DurationFieldType durationFieldType0 = months0.getFieldType();
      int int0 = months0.get(durationFieldType0);
      assertEquals((-2188), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Months months0 = Months.ELEVEN;
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-518L), (Chronology) gregorianChronology0);
      int int0 = BaseSingleFieldPeriod.between(localDate0, localDate0, months0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Minutes minutes0 = weeks0.toStandardMinutes();
      DateMidnight dateMidnight0 = new DateMidnight((long) (-1156));
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      int int0 = BaseSingleFieldPeriod.between(dateMidnight0, dateMidnight0, durationFieldType0);
      assertEquals(20160, minutes0.getMinutes());
      assertEquals(0, int0);
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1563L);
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(53);
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      int int0 = BaseSingleFieldPeriod.between(dateMidnight0, dateMidnight1, durationFieldType0);
      assertEquals((-16804032), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Months months0 = Months.TWELVE;
      int int0 = months0.getValue(0);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Instant instant0 = Instant.now();
      Hours hours0 = Hours.hoursBetween((ReadableInstant) instant0, (ReadableInstant) instant0);
      hours0.getFieldType(0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      int int0 = hours0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Months months0 = Months.months(1968);
      Months months1 = Months.ELEVEN;
      int int0 = months1.compareTo((BaseSingleFieldPeriod) months0);
      assertEquals(1968, months0.getMonths());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = years0.plus(years0);
      int int0 = years1.compareTo((BaseSingleFieldPeriod) years0);
      assertEquals(1, years0.getYears());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Months months0 = Months.months(1968);
      int int0 = months0.compareTo((BaseSingleFieldPeriod) months0);
      assertEquals(1968, months0.getMonths());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Years years0 = Years.MAX_VALUE;
      boolean boolean0 = weeks0.equals(years0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Years years0 = Years.ONE;
      Years years1 = Years.TWO;
      boolean boolean0 = years0.equals(years1);
      assertFalse(years1.equals((Object)years0));
      assertEquals(2, years1.getYears());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Years years0 = Years.ONE;
      boolean boolean0 = years0.equals(years0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      boolean boolean0 = weeks0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Months months0 = Months.months(1968);
      DurationFieldType durationFieldType0 = months0.getFieldType();
      boolean boolean0 = months0.isSupported(durationFieldType0);
      assertTrue(boolean0);
      assertEquals(1968, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Months months0 = Months.months(1968);
      boolean boolean0 = months0.isSupported((DurationFieldType) null);
      assertEquals(1968, months0.getMonths());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Months months0 = Months.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.months();
      int int0 = months0.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Months months0 = Months.months(1968);
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = months0.get(durationFieldType0);
      assertEquals(0, int0);
      assertEquals(1968, months0.getMonths());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      weeks0.toPeriod();
      assertEquals(1, weeks0.size());
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Years years0 = Years.ONE;
      years0.toMutablePeriod();
      assertEquals(1, years0.getYears());
      assertEquals(1, years0.size());
  }
}