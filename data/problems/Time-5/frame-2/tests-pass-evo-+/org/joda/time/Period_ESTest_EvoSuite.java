/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:47:45 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
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
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.joda.time.tz.FixedDateTimeZone;

public class Period_ESTest_EvoSuite extends Period_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Period period0 = new Period((-3527), (-3527), (-3527), (-187), (-3527), (-187), (-3527), (-1674));
      Period period1 = period0.normalizedStandard();
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Period period0 = Period.weeks(5);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(3024000000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusSeconds(1444);
      Duration duration0 = period1.toStandardDuration();
      assertEquals(1444000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Period period0 = Period.hours((-832));
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals((-2995200), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      Period period1 = period0.minusMinutes((-3182));
      Seconds seconds0 = period1.toStandardSeconds();
      assertEquals(187850, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Period period0 = Period.weeks((-206));
      Period period1 = period0.withMillis((-206));
      Seconds seconds0 = period1.toStandardSeconds();
      assertEquals((-124588800), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Period period0 = Period.weeks(3767);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(37971360, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Period period0 = Period.hours((-2796));
      Period period1 = period0.minusSeconds((-2796));
      Minutes minutes0 = period1.toStandardMinutes();
      assertEquals((-167714), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Period period0 = Period.minutes((-1));
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      Period period1 = period0.minusMinutes((-3182));
      Days days0 = period1.toStandardDays();
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Period period0 = Period.seconds((-1006));
      Period period1 = period0.ZERO.plusHours((-2685));
      Weeks weeks0 = period1.toStandardWeeks();
      assertEquals((-15), weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      Period period1 = period0.minusMinutes((-3182));
      Weeks weeks0 = period1.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.HOURS_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 115);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Period period0 = Period.days(3310);
      Period period1 = period0.ZERO.multipliedBy((-615));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Period period0 = new Period(dateTime0, dateTime0);
      Period period1 = period0.ZERO.withDays(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Period period0 = Period.days(8);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Period period0 = Period.days(46);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(3974400, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Duration duration0 = Duration.ZERO;
      Period period0 = new Period(duration0, mutableDateTime0, (PeriodType) null);
      Period period1 = period0.plusDays((-1429));
      Seconds seconds0 = period1.toStandardSeconds();
      assertEquals((-123465600), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Period period0 = new Period(0L);
      Period period1 = period0.minusWeeks((-972));
      Hours hours0 = period1.toStandardHours();
      assertEquals(163296, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Period period0 = Period.days(3310);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(285984000000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.minusMillis(1440);
      Duration duration0 = period1.toStandardDuration();
      assertEquals((-1440L), duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Period period0 = new Period((Object) null);
      Days days0 = period0.ZERO.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Period period0 = Period.seconds((-1006));
      Weeks weeks0 = Weeks.weeks(8);
      Period period1 = period0.plus(weeks0);
      Days days0 = period1.toStandardDays();
      assertEquals(56, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Period period0 = Period.years(60);
      int int0 = period0.getYears();
      assertEquals(60, int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Period period0 = Period.years((-3173));
      int int0 = period0.getYears();
      assertEquals((-3173), int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Period period0 = new Period();
      Weeks weeks0 = Weeks.ONE;
      Period period1 = period0.plus(weeks0);
      int int0 = period1.getWeeks();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Period period0 = Period.weeks((-24));
      int int0 = period0.getWeeks();
      assertEquals((-24), int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusMillis(1540);
      Period period2 = period1.normalizedStandard();
      int int0 = period2.getSeconds();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Period period0 = Period.weeks((-1587));
      Period period1 = period0.withMonths((-1526));
      int int0 = period1.getMonths();
      assertEquals((-1526), int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.plusSeconds(1444);
      Period period2 = period1.normalizedStandard();
      int int0 = period2.getMinutes();
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Period period0 = new Period((-1291L), 0L);
      int int0 = period0.getMillis();
      assertEquals(291, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      int int0 = period0.getMillis();
      assertEquals((-1242), int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Period period0 = Period.hours(80);
      int int0 = period0.getHours();
      assertEquals(80, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Period period0 = new Period(598, 100000000000000L);
      int int0 = period0.getDays();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      Period period1 = period0.ZERO.withField(durationFieldType0, 0);
      Days days0 = Days.MAX_VALUE;
      period1.withFields(days0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Period period0 = Period.days(0);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period1 = period0.normalizedStandard(periodType0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Period period0 = Period.weeks(3767);
      Period period1 = period0.plusYears(3767);
      PeriodType periodType0 = PeriodType.yearDayTime();
      Period period2 = period1.normalizedStandard(periodType0);
      assertFalse(period2.equals((Object)period1));
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.plusMillis(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Period period0 = Period.years(60);
      Period period1 = period0.ZERO.plusMinutes(0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Period period0 = Period.hours(317351877);
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Period period0 = Period.minutes(3381);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      Period period0 = new Period(duration0, (ReadableInstant) null);
      Period period1 = period0.ZERO.plusWeeks(1932);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Period period0 = Period.weeks(0);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Period period0 = Period.months((-2606));
      int int0 = period0.ZERO.getHours();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      PeriodType periodType0 = PeriodType.minutes();
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Period period0 = new Period((Object) null, periodType0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Period period0 = Period.weeks(0);
      int int0 = period0.ZERO.getWeeks();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Period period0 = Period.ZERO;
      int int0 = period0.getYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Period period0 = Period.minutes(0);
      int int0 = period0.getMinutes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Period period0 = Period.hours(317351877);
      Period period1 = period0.withYears(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MutableDateTime mutableDateTime0 = MutableDateTime.now(dateTimeZone0);
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, (ReadableInstant) mutableDateTime0, 4);
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      Period period0 = new Period(localDateTime0, localDateTime0);
      int int0 = period0.getMonths();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      PeriodType periodType0 = PeriodType.dayTime();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Period period0 = new Period((-1955L), periodType0, (Chronology) gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Period period0 = new Period(1000, 8, 8, 1000, 220, 1000, (-152), (-1303), (PeriodType) null);
      int int0 = period0.getMonths();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Calendar calendar0 = MockCalendar.getInstance();
      LocalDate localDate0 = LocalDate.fromCalendarFields(calendar0);
      Period period0 = new Period(localDate0, localDate0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Period period0 = Period.months((-1));
      PeriodType periodType0 = PeriodType.standard();
      Period period1 = period0.normalizedStandard(periodType0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Period period0 = new Period();
      DurationFieldType durationFieldType0 = DurationFieldType.MONTHS_TYPE;
      Period period1 = period0.withField(durationFieldType0, 524);
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Period period0 = Period.years(0);
      Period period1 = period0.multipliedBy(5);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Period period0 = Period.days(1732);
      Period period1 = period0.ZERO.minus((ReadablePeriod) null);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((-527L));
      Period period0 = Period.fieldDifference(localTime0, localTime0);
      Period period1 = period0.minus(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.plusSeconds((-832));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      Period period1 = period0.minusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Period period0 = Period.weeks(0);
      DurationFieldType durationFieldType0 = DurationFieldType.CENTURIES_TYPE;
      Period period1 = period0.withFieldAdded(durationFieldType0, 0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Period period0 = Period.ZERO;
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      Period period1 = period0.withFieldAdded(durationFieldType0, (-832));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withFields((ReadablePeriod) null);
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Period period0 = Period.seconds(0);
      Period period1 = period0.withFields(period0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Duration duration0 = new Duration(0L);
      PeriodType periodType0 = PeriodType.months();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Period period0 = duration0.toPeriod(periodType0, (Chronology) julianChronology0);
      Period period1 = period0.withPeriodType(periodType0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Seconds seconds0 = period0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.minusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(1879).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      Instant instant0 = Instant.parse("", dateTimeFormatter0);
      Duration duration0 = new Duration(0L, 60L);
      PeriodType periodType0 = PeriodType.yearDay();
      Period period0 = new Period(instant0, duration0, periodType0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Period period0 = Period.seconds((-1006));
      Duration duration0 = period0.ZERO.toStandardDuration();
      assertEquals(0L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(gJChronology0);
      Period period0 = new Period((-3378L), (Chronology) lenientChronology0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Period period0 = new Period();
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Duration duration0 = Duration.standardMinutes(0L);
      Period period0 = new Period(dateTime0, duration0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Period period0 = new Period(dateTime0, dateTime0);
      int int0 = period0.getMillis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      Duration duration0 = new Duration((ReadableInstant) null, (ReadableInstant) null);
      Period period0 = new Period(duration0, (ReadableInstant) null);
      int int0 = period0.ZERO.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      Period period0 = new Period(0, 0, (-3069), (-1242));
      Period period1 = period0.minusHours((-3069));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      Period period0 = new Period(0, 0, 4580, 3600, 0, (-2816), 0, 3600);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      Period period0 = Period.millis((-949));
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.toPeriod();
      assertSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Period period0 = new Period(30962844000000L, (-1L), julianChronology0);
      Period period1 = period0.plusMonths((-3597));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withMillis(5258);
      Period period2 = period1.normalizedStandard();
      int int0 = period2.getSeconds();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      PeriodType periodType0 = PeriodType.minutes();
      Period period0 = duration0.toPeriod(periodType0);
      int int0 = period0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      Period period0 = Period.parse("", periodFormatter0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      Period period0 = Period.weeks((-1587));
      Period period1 = period0.negated();
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.ZERO.withSeconds(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      Period period0 = Period.minutes(0);
      Period period1 = period0.withWeeks(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      Period period0 = Period.ZERO;
      Period period1 = period0.withHours(5258);
      Minutes minutes0 = period1.toStandardMinutes();
      assertEquals(315480, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      Period period0 = Period.weeks((-1587));
      Period period1 = period0.withMinutes((-1587));
      assertNotSame(period0, period1);
  }

}