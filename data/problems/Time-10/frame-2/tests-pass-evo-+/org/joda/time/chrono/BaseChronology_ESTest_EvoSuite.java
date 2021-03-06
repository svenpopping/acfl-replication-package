/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:53:30 GMT 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.ZonedChronology;

public class BaseChronology_ESTest_EvoSuite extends BaseChronology_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      long long0 = gJChronology0.add(1369L, 0L, 1306);
      assertEquals(1369L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Seconds seconds0 = Seconds.THREE;
      Weeks weeks0 = seconds0.toStandardWeeks();
      int[] intArray0 = buddhistChronology0.get((ReadablePeriod) weeks0, (-1272L));
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate localDate1 = localDate0.plusWeeks((-2));
      Date date0 = localDate1.toDate();
      MonthDay monthDay0 = MonthDay.fromDateFields(date0);
      assertEquals(1, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      long long0 = lenientChronology0.getDateTimeMillis(1, 1, (-1), 1, (-759), (-759), (-551));
      assertEquals((-79240247499551L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      DateTimeZone dateTimeZone0 = iSOChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = gJChronology0.years();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.yearOfCentury();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = islamicChronology0.year();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Chronology chronology0 = ethiopicChronology0.withZone(dateTimeZone0);
      assertFalse(chronology0.equals((Object)ethiopicChronology0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withUTC();
      assertFalse(chronology0.equals((Object)iSOChronology0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.weekyears();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = ethiopicChronology0.weekyearOfCentury();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekyear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DurationField durationField0 = iSOChronology0.weeks();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.weekOfWeekyear();
      assertEquals("weekOfWeekyear", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      String string0 = ethiopicChronology0.toString();
      assertEquals("EthiopicChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      long long0 = gJChronology0.set(localTime0, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalTime localTime0 = new LocalTime((Chronology) gJChronology0);
      long long0 = gJChronology0.set(localTime0, 1);
      assertEquals(73281320L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DurationField durationField0 = islamicChronology0.seconds();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = iSOChronology0.secondOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.months();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DurationField durationField0 = gJChronology0.minutes();
      assertEquals("minutes", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeField dateTimeField0 = julianChronology0.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeField dateTimeField0 = islamicChronology0.minuteOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = ethiopicChronology0.millisOfSecond();
      assertEquals("millisOfSecond", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DurationField durationField0 = gJChronology0.millis();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationField durationField0 = ethiopicChronology0.hours();
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = copticChronology0.hourOfHalfday();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeField dateTimeField0 = gregorianChronology0.hourOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DurationField durationField0 = julianChronology0.halfdays();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeZone dateTimeZone0 = islamicChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = ethiopicChronology0.halfdayOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Instant instant0 = GJChronology.DEFAULT_CUTOVER;
      Chronology chronology0 = instant0.getChronology();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(chronology0);
      long long0 = lenientChronology0.getDateTimeMillis(373L, (-1240), (-1240), (-1240), (-1240));
      assertEquals((-4539641240L), long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2146482022));
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0);
      LenientChronology lenientChronology0 = LenientChronology.getInstance(julianChronology0);
      long long0 = lenientChronology0.getDateTimeMillis((-2955), 292272708, (-2931), 283);
      assertEquals(768463093541682305L, long0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      PeriodType periodType0 = PeriodType.days();
      PeriodType periodType1 = periodType0.withDaysRemoved();
      Period period0 = new Period(1L, periodType1);
      int[] intArray0 = ethiopicChronology0.get((ReadablePeriod) period0, 1L, 1L);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      DurationField durationField0 = islamicChronology0.eras();
      assertEquals(0L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeField dateTimeField0 = gregorianChronology0.era();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null);
      DurationField durationField0 = islamicChronology0.days();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.dayOfYear();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gJChronology0.dayOfWeek();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeField dateTimeField0 = lenientChronology0.dayOfMonth();
      assertEquals("dayOfMonth", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(gregorianChronology0, (Object) null, islamicChronology_LeapYearPatternType0);
      DateTimeZone dateTimeZone0 = islamicChronology0.getZone();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = iSOChronology0.clockhourOfHalfday();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeField dateTimeField0 = ethiopicChronology0.centuryOfEra();
      assertEquals("centuryOfEra", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DurationField durationField0 = lenientChronology0.centuries();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.add(1298L, 1298L, 24);
      assertEquals(32450L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      Minutes minutes0 = Minutes.ZERO;
      Weeks weeks0 = Weeks.standardWeeksIn(minutes0);
      int[] intArray0 = gJChronology0.get((ReadablePeriod) weeks0, 0L);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      int[] intArray0 = ethiopicChronology0.get((ReadablePartial) localTime0, (long) 0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      long long0 = zonedChronology0.add((-307L), (-307L), 0);
      assertEquals((-307L), long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.minus((long) 77);
      assertEquals(1392249600000L, dateMidnight1.getMillis());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      long long0 = lenientChronology0.add(0L, 0L, 1);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Period period0 = new Period((long) 1);
      long long0 = islamicChronology0.add((ReadablePeriod) period0, (long) (-1554), (-1554));
      assertEquals((-3108L), long0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      long long0 = ethiopicChronology0.add((ReadablePeriod) null, (long) 1, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Weeks weeks0 = Weeks.ONE;
      long long0 = iSOChronology0.add((ReadablePeriod) weeks0, 0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      int[] intArray0 = lenientChronology0.get((ReadablePeriod) mutablePeriod0, (long) 40);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 40}, intArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Period period0 = Period.ZERO;
      int[] intArray0 = gJChronology0.get((ReadablePeriod) period0, 0L, (long) 1970);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 1, 970}, intArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      MonthDay monthDay0 = new MonthDay(dateTimeZone0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0, 1);
      long long0 = copticChronology0.set(monthDay0, 0L);
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(2, monthDay0.getMonthOfYear());
      assertEquals((-5961600000L), long0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      YearMonth yearMonth0 = YearMonth.now(dateTimeZone0);
      int[] intArray0 = new int[3];
      intArray0[1] = 1;
      buddhistChronology0.validate(yearMonth0, intArray0);
      assertEquals(2014, yearMonth0.getYear());
  }
}
