/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:47:46 GMT 2020
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
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.joda.time.tz.FixedDateTimeZone;

public class Period_ESTest_EvoSuite extends Period_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Period period0 = new Period(1019L);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(1019L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Period period0 = new Period((-2519L));
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals((-2), seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Period period0 = Period.weeks(7);
      Period period1 = period0.minusDays(7);
      Minutes minutes0 = period1.toStandardMinutes();
      assertEquals(60480, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Period period0 = new Period(2523L);
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Period period0 = Period.weeks((-1380));
      Hours hours0 = period0.toStandardHours();
      assertEquals((-231840), hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Period period0 = Period.seconds(204);
      Hours hours0 = period0.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Period period0 = new Period(31449600000L, (PeriodType) null);
      Days days0 = period0.toStandardDays();
      assertEquals(364, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Period period0 = new Period(1019L);
      Days days0 = period0.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Period period0 = Period.weeks(7);
      Period period1 = period0.minusDays(7);
      Weeks weeks0 = period1.toStandardWeeks();
      assertEquals(6, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-3200L));
      Period period0 = duration0.toPeriod();
      int int0 = (-23);
      Period period1 = period0.plusDays(int0);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3405L);
      DateTime dateTime0 = new DateTime();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, 2025);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-3200L));
      Period period0 = duration0.toPeriod();
      int int0 = (-23);
      Period period1 = period0.withSeconds(int0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Duration duration0 = new Duration(15778476000L);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      Period period0 = duration0.toPeriod((Chronology) copticChronology0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(26, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Period period0 = Period.minutes((-1481));
      Seconds seconds0 = period0.ZERO.toStandardSeconds();
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Period period0 = Period.years((-1961));
      Minutes minutes0 = period0.ZERO.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Duration duration0 = Duration.standardHours((-1726L));
      Period period0 = duration0.toPeriod();
      Minutes minutes0 = period0.toStandardMinutes();
      assertEquals((-103560), minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Period period0 = Period.minutes((-1481));
      Period period1 = period0.withDays(3600);
      Hours hours0 = period1.toStandardHours();
      assertEquals(86376, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.withDays(1262);
      Duration duration0 = period1.toStandardDuration();
      assertEquals(109036800000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Duration duration0 = hours0.toStandardDuration();
      PeriodType periodType0 = PeriodType.dayTime();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Period period0 = duration0.toPeriod(periodType0, (Chronology) julianChronology0);
      PeriodType.WEEK_INDEX = 4;
      Period period1 = period0.minusWeeks(4);
      Duration duration1 = period1.toStandardDuration();
      assertEquals((-1216800000L), duration1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Duration duration0 = Duration.standardMinutes(1479L);
      Period period0 = new Period(duration0, (ReadableInstant) null);
      Days days0 = period0.toStandardDays();
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Period period0 = Period.hours((-283));
      Days days0 = period0.toStandardDays();
      assertEquals((-11), days0.getDays());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Period period0 = Period.parse("P-1DT1440M");
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Period period0 = new Period(4, 4, (-4497), 5, 12, (-969), 572, (-32));
      int int0 = period0.getYears();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Period period0 = Period.hours((-283));
      Period period1 = period0.withYears((-283));
      int int0 = period1.getYears();
      assertEquals((-283), int0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Period period0 = Period.seconds(1353);
      Period period1 = period0.plusWeeks(1353);
      int int0 = period1.getWeeks();
      assertEquals(1353, int0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.withWeeks((-3289));
      int int0 = period1.getWeeks();
      assertEquals((-3289), int0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-3200L));
      Period period0 = duration0.toPeriod();
      int int0 = period0.getSeconds();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Period period0 = Period.seconds(1353);
      int int0 = period0.getSeconds();
      assertEquals(1353, int0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Period period0 = Period.years((-1961));
      Period period1 = period0.plusSeconds((-1961));
      Period period2 = period1.minus(period0);
      int int0 = period2.getSeconds();
      assertFalse(period2.equals((Object)period1));
      assertEquals((-1961), int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Period period0 = new Period((-290L));
      Period period1 = period0.plusMonths(616);
      int int0 = period1.getMonths();
      assertEquals(616, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Period period0 = Period.ZERO;
      int int0 = period0.getMinutes();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Period period0 = Period.seconds(1353);
      Period period1 = period0.plusMillis(1353);
      Period period2 = period1.withHours(2709);
      int int0 = period2.getMillis();
      assertEquals(1353, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Duration duration0 = hours0.toStandardDuration();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      Period period0 = new Period(duration0, mutableDateTime0);
      int int0 = period0.getHours();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Period period0 = Period.hours((-4302));
      int int0 = period0.getHours();
      assertEquals((-4302), int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Period period0 = new Period(0, 0, (-950), (-950), 0, (-950), (-950), 519);
      int int0 = period0.getDays();
      assertEquals((-950), int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.multipliedBy(1161);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.ZERO.plusHours((-4494));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      DateTime dateTime0 = new DateTime((Chronology) null);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0, periodType0);
      Period period1 = period0.plusWeeks(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Period period1 = period0.plusMonths(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Period period0 = Period.years((-79));
      Period period1 = period0.plusYears(1);
      assertFalse(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Period period0 = Period.weeks((-1380));
      Period period1 = period0.plusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      Period period0 = new Period(duration0, mutableDateTime0);
      int int0 = period0.getHours();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Period period0 = new Period((Object) null);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(7).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      Period period0 = new Period(duration0, mutableDateTime0);
      int int0 = period0.getYears();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Duration duration0 = new Duration(0L, 0L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      PeriodType periodType0 = seconds0.getPeriodType();
      Period period0 = new Period(duration0, dateTime0, periodType0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0, 1);
      Period period0 = new Period(0L, (Chronology) gregorianChronology0);
      Period period1 = period0.plusSeconds(1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Period period0 = Period.months(2042);
      int int0 = period0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1900));
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = new Period(localDate0, localDate0, periodType0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      DateTime dateTime0 = new DateTime((Chronology) null);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0, periodType0);
      int int0 = period0.getMonths();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Period period0 = Period.minutes((-1481));
      int int0 = period0.getMillis();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      PeriodType periodType0 = PeriodType.yearWeekDayTime();
      Period period0 = new Period(0, 0, 0, 0, 167, 167, 460, 0, periodType0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Period period0 = Period.years(1161);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Period period0 = new Period(1019L);
      Period period1 = period0.withMonths((-3401));
      Period period2 = period1.normalizedStandard();
      assertFalse(period2.equals((Object)period1));
      assertFalse(period2.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Duration duration0 = Duration.standardDays(3405L);
      DateTime dateTime0 = new DateTime();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0);
      Period period1 = period0.normalizedStandard();
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Period period0 = new Period((-874L), (-874L), (PeriodType) null);
      Period period1 = period0.multipliedBy(1);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Period period0 = Period.years((-79));
      Period period1 = period0.minus((ReadablePeriod) null);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Period period0 = new Period(466L);
      Period period1 = period0.ZERO.plusMillis(0);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Duration duration0 = hours0.toStandardDuration();
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("", dateTimeFormatter0);
      Period period0 = new Period(duration0, mutableDateTime0);
      Period period1 = period0.plusSeconds(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      DateTime dateTime0 = new DateTime((Chronology) null);
      PeriodType periodType0 = PeriodType.yearMonthDay();
      Period period0 = duration0.toPeriodTo((ReadableInstant) dateTime0, periodType0);
      Period period1 = period0.minusMinutes(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Period period0 = Period.millis((-3));
      Period period1 = period0.plusHours(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Period period1 = period0.plusDays(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Period period0 = Period.fieldDifference(monthDay0, monthDay0);
      Period period1 = period0.minusYears(0);
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Period period0 = Period.days(0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      Period period1 = period0.plus(mutablePeriod0);
      assertTrue(period1.equals((Object)period0));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      Duration duration0 = Duration.standardDays((-3200L));
      Period period0 = duration0.toPeriod();
      DurationFieldType durationFieldType0 = DurationFieldType.minutes();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, (-23));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      Period period1 = period0.ZERO.withFieldAdded(durationFieldType0, 0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, (-10), 0, 0, (-10));
      Minutes minutes0 = Minutes.THREE;
      DurationFieldType durationFieldType0 = minutes0.getFieldType();
      Period period1 = period0.withField(durationFieldType0, 2760);
      assertNotSame(period0, period1);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Period period1 = period0.ZERO.withPeriodType((PeriodType) null);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      PeriodType periodType0 = weeks0.getPeriodType();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0);
      Period period1 = period0.ZERO.minusSeconds(4);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Seconds seconds0 = period0.toStandardSeconds();
      assertEquals(480, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((-347L));
      Period period0 = Period.weeks(0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTime(localTime0, (DateTimeZone) fixedDateTimeZone0);
      Interval interval0 = new Interval(dateTime0, period0);
      Duration duration0 = interval0.toDuration();
      Period period1 = new Period(dateTime0, duration0, (PeriodType) null);
      assertEquals(0L, duration0.getMillis());
      assertEquals((-13118680L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(480000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      Period period0 = new Period((-874L), (-874L));
      Period period1 = period0.ZERO.plusMinutes(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      Duration duration0 = period0.toStandardDuration();
      assertEquals(0L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      Period period0 = Period.days(0);
      Weeks weeks0 = period0.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      Period period0 = Period.minutes(8);
      Period period1 = period0.minusMinutes(363);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.minusHours(1930);
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      Period period0 = new Period();
      int int0 = period0.getWeeks();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, (-10), 0, 0, (-10));
      Period period1 = period0.toPeriod();
      assertSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      Period period0 = new Period((-2299L), (-2299L), gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.withMillis(0);
      assertTrue(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      Period period0 = new Period(0, 0, 0, 0, (-10), 0, 0, (-10));
      Period period1 = period0.negated();
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      Period period0 = new Period(354L);
      Period period1 = period0.minusMillis((-22));
      assertNotSame(period1, period0);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      Period period0 = Period.days(0);
      Period period1 = period0.withDays(1262);
      int int0 = period1.getDays();
      assertEquals(1262, int0);
  }
}
