/*

 * Tue Mar 03 11:57:52 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatter_ESTest_Botsing extends DateTimeFormatter_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 5, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:t45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4532, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4439, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 5, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 3, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 5, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:45:17.045", 4);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 3, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4496, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:t45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4479, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4532, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4496, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 1, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 1, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4532, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4701, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, (-466), false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 3, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:45:17.045", 4);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4489, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4701, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:t45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 1, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:t45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4483, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4514, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4496, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 2, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:t45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 5, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      mutableDateTime0.isAfter(mutableDateTime0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4491, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4496, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:A45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4504, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 4490, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TwoDigitYear0);
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "+04:*45:1R.045", 5);
  }
}
