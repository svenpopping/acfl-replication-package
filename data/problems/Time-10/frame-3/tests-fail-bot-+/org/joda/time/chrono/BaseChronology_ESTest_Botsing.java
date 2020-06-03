/*

 * Tue Mar 03 11:59:14 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadableDuration;
import org.joda.time.YearMonth;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.tz.FixedDateTimeZone;

public class BaseChronology_ESTest_Botsing extends BaseChronology_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.now();
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      // Undeclared exception!
      copticChronology0.set(localDateTime0, (-2061L));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      YearMonth.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      copticChronology0.set(localDate0, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      LocalDateTime localDateTime2 = localDateTime1.withMillisOfSecond(1);
      // Undeclared exception!
      copticChronology0.set(localDateTime2, 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      copticChronology0.set(localDate0, (-2061L));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      YearMonth.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.now();
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      // Undeclared exception!
      copticChronology0.set(localDateTime0, (-2061L));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.now();
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      // Undeclared exception!
      copticChronology0.set(localDateTime0, 1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      Object object0 = new Object();
      IslamicChronology islamicChronology0 = new IslamicChronology(copticChronology0, object0, islamicChronology_LeapYearPatternType0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((-2061L));
      // Undeclared exception!
      copticChronology0.set(localDate0, (-2061L));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      copticChronology0.set(localDate0, 1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth yearMonth0 = new YearMonth(1, 1);
      LocalDateTime localDateTime0 = new LocalDateTime((long) 1, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      // Undeclared exception!
      copticChronology0.set(localDateTime1, 0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2061L), (DateTimeZone) fixedDateTimeZone0);
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      LocalDateTime localDateTime0 = localDate0.toLocalDateTime(localTime0);
      // Undeclared exception!
      copticChronology0.set(localDateTime0, (-2061L));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate((-2059L), (DateTimeZone) fixedDateTimeZone0);
      // Undeclared exception!
      copticChronology0.set(localDate0, 1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      YearMonth.now();
      LocalDateTime localDateTime0 = new LocalDateTime((long) 0, dateTimeZone0);
      Duration duration0 = Duration.standardDays(1);
      LocalDateTime localDateTime1 = localDateTime0.minus((ReadableDuration) duration0);
      LocalDateTime localDateTime2 = localDateTime1.withMillisOfSecond(1);
      // Undeclared exception!
      copticChronology0.set(localDateTime2, 0);
  }
}
