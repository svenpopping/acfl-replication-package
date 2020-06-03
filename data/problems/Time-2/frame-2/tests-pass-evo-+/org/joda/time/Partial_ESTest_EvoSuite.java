/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:47:16 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
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
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.PreciseDateTimeField;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.tz.FixedDateTimeZone;

public class Partial_ESTest_EvoSuite extends Partial_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, (-42));
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 93, (Chronology) null);
      Partial partial1 = partial0.withField(dateTimeFieldType0, 1);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldType0, 1, gJChronology0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      ReadablePartial readablePartial0 = partial_Property0.getReadablePartial();
      assertEquals(1, readablePartial0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 0);
      PreciseDateTimeField preciseDateTimeField0 = (PreciseDateTimeField)partial_Property0.getField();
      assertEquals(1L, preciseDateTimeField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      Partial partial0 = new Partial(dateTimeFieldType0, 11);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      int int0 = partial_Property0.get();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      Months months0 = Months.FIVE;
      Partial partial0 = new Partial(localDate0);
      Partial partial1 = partial0.plus(months0);
      assertFalse(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      Partial partial0 = new Partial(localDate0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      Partial partial1 = partial0.with(dateTimeFieldType0, 156);
      assertEquals(4, partial1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      Partial partial0 = new Partial(strictChronology0);
      PeriodType periodType0 = PeriodType.hours();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-3676L), periodType0, (Chronology) strictChronology0);
      Partial partial1 = partial0.withPeriodAdded(mutablePeriod0, 1);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Partial partial0 = new Partial();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Partial partial1 = partial0.withChronologyRetainFields(ethiopicChronology0);
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Partial partial0 = new Partial(ethiopicChronology0);
      int int0 = partial0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      Partial partial0 = new Partial(islamicChronology0);
      Years years0 = Years.TWO;
      Partial partial1 = partial0.plus(years0);
      assertTrue(partial1.equals((Object)partial0));
      assertNotSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Partial partial0 = new Partial(ethiopicChronology0);
      int[] intArray0 = partial0.getValues();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[14];
      intArray0[8] = 1;
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
      int int0 = partial0.getValue(8);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Partial partial0 = new Partial(dateTimeFieldType0, (-1775), lenientChronology0);
      int int0 = partial0.getValue(0);
      assertEquals((-1775), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[4];
      int[] intArray0 = new int[4];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType[] dateTimeFieldTypeArray1 = partial0.getFieldTypes();
      assertFalse(dateTimeFieldTypeArray1.equals((Object)dateTimeFieldTypeArray0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldTypeArray0[0];
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFieldType dateTimeFieldType1 = partial0.getFieldType(1);
      assertEquals("monthOfYear", dateTimeFieldType1.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = new MonthDay(86400000L, (Chronology) buddhistChronology0);
      Partial partial0 = new Partial(monthDay0);
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = partial0.getField(1, (Chronology) ethiopicChronology0);
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(ethiopicChronology0);
      Partial partial0 = new Partial(strictChronology0);
      Chronology chronology0 = partial0.getChronology();
      assertFalse(chronology0.equals((Object)strictChronology0));
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 543);
      String string0 = partial0.toString();
      assertEquals("[minuteOfDay=543]", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(islamicChronology0, dateTimeFieldTypeArray0, intArray0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = new MonthDay(86400000L, (Chronology) buddhistChronology0);
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Partial partial0 = new Partial(dateTimeFieldType0, (-1775), lenientChronology0);
      Period period0 = new Period((Object) null);
      Partial partial1 = partial0.withPeriodAdded(period0, 61);
      assertNotSame(partial1, partial0);
      assertTrue(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 93, (Chronology) null);
      Partial partial1 = partial0.withPeriodAdded((ReadablePeriod) null, 1);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      int[] intArray0 = new int[5];
      Partial partial0 = new Partial((Chronology) null, dateTimeFieldTypeArray0, intArray0);
      Chronology chronology0 = partial0.getChronology();
      assertNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Partial partial0 = new Partial(dateTimeFieldType0, (-1775), lenientChronology0);
      int int0 = partial0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 8);
      int[] intArray0 = partial0.getValues();
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Partial partial0 = new Partial(dateTimeFieldType0, (-1775), lenientChronology0);
      Locale locale0 = Locale.TAIWAN;
      String string0 = partial0.toString((String) null, locale0);
      assertEquals("[yearOfEra=-1775]", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      String string0 = partial0.toString("---.000");
      assertEquals("---.000", string0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      String string0 = partial1.toString();
      assertSame(partial1, partial0);
      assertEquals("---.000", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Partial partial0 = new Partial();
      assertEquals(0, partial0.size());
      
      String string0 = partial0.toString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      partial1.getFormatter();
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 8);
      int[] intArray0 = new int[4];
      Partial partial1 = new Partial(partial0, intArray0);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 8);
      boolean boolean0 = partial0.isMatch((ReadablePartial) partial0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      Partial partial0 = new Partial(localDate0);
      MutableDateTime mutableDateTime0 = new MutableDateTime((-1378L));
      boolean boolean0 = partial0.isMatch((ReadableInstant) mutableDateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      Months months0 = Months.EIGHT;
      LocalDate localDate1 = localDate0.withPeriodAdded(months0, 1);
      Partial partial0 = new Partial(localDate1);
      MutableDateTime mutableDateTime0 = MutableDateTime.parse("1731-01-07");
      boolean boolean0 = partial0.isMatch((ReadableInstant) mutableDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Years years0 = Years.ONE;
      Partial partial1 = partial0.withPeriodAdded(years0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      Partial partial0 = new Partial(localDate0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalDate localDate0 = LocalDate.now((DateTimeZone) fixedDateTimeZone0);
      Partial partial0 = new Partial(localDate0);
      DurationFieldType durationFieldType0 = DurationFieldType.YEARS_TYPE;
      Partial partial1 = partial0.withFieldAdded(durationFieldType0, 4154);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      Partial partial0 = new Partial(dateTimeFieldType0, 8);
      Partial partial1 = partial0.withField(dateTimeFieldType0, 8);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.without(dateTimeFieldType0);
      Partial partial2 = partial1.minus((ReadablePeriod) null);
      assertEquals(0, partial2.size());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 93, (Chronology) null);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.year();
      Partial partial1 = partial0.without(dateTimeFieldType1);
      assertEquals(1, partial1.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 0);
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      Partial partial0 = new Partial(dateTimeFieldType0, (-1775), lenientChronology0);
      Partial partial1 = partial0.with(dateTimeFieldType0, 61);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      int[] intArray0 = new int[9];
      Partial partial0 = new Partial(julianChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial partial1 = partial0.withChronologyRetainFields(julianChronology0);
      assertSame(partial1, partial0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[1];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[1];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
      assertEquals(1, partial0.size());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
      int[] intArray0 = new int[0];
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, gregorianChronology0);
      assertEquals(0, partial0.size());
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.withMaximumValue();
      assertNotSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      MonthDay monthDay0 = new MonthDay(86400000L, (Chronology) buddhistChronology0);
      Partial partial0 = new Partial(monthDay0);
      Partial.Property partial_Property0 = new Partial.Property(partial0, 1);
      Partial partial1 = partial_Property0.addToCopy(84);
      assertEquals(2, partial1.size());
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      int[] intArray0 = new int[14];
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
      Partial.Property partial_Property0 = partial0.property(dateTimeFieldType0);
      Partial partial1 = partial_Property0.getPartial();
      assertSame(partial0, partial1);
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getDurationType();
      Partial partial0 = new Partial(dateTimeFieldType0, 0);
      Partial partial1 = partial0.withFieldAddWrapped(durationFieldType0, 20);
      assertNotSame(partial1, partial0);
      assertFalse(partial1.equals((Object)partial0));
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      int[] intArray0 = new int[14];
      Partial partial0 = new Partial(copticChronology0, dateTimeFieldTypeArray0, intArray0);
      int int0 = partial0.getValue(8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType[] dateTimeFieldTypeArray0 = partial0.getFieldTypes();
      assertEquals(0, dateTimeFieldTypeArray0.length);
  }

}
