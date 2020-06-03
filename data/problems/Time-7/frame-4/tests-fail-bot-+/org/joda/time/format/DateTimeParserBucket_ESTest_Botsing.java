/*

 * Tue Mar 03 11:54:17 UTC 2020
 */

package org.joda.time.format;

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
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.UTCProvider;

public class DateTimeParserBucket_ESTest_Botsing extends DateTimeParserBucket_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(15L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1388));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-4L), ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3120), copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-602));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-682));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.getDefault();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 65535);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 65535);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.UK;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0, (Integer) 1, 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-602));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-670));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-657), copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3120), copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3120), copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(15L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, julianChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, (Locale) null);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.getDefault();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, (Integer) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 165);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, julianChronology0, (Locale) null, (Integer) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 72000000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(30L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-6L), ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("'04");
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "'04");
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-25L), ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeFieldType0.isSupported((Chronology) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, julianChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Locale locale0 = Locale.ENGLISH;
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(8, copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(19L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(28L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-682));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-19L), ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(5);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0);
      dateTimeParserBucket0.saveField((DateTimeField) delegatedDateTimeField0, 23034375);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      Integer integer0 = Integer.valueOf(5);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1L), julianChronology0, (Locale) null, integer0, 5);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-682));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-3120), copticChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "'04");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, ethiopicChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (String) null, locale0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }
}
