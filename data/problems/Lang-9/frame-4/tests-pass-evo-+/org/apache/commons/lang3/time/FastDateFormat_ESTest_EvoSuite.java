/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:19:39 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;

public class FastDateFormat_ESTest_EvoSuite extends FastDateFormat_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      Object object0 = fastDateFormat0.clone();
      boolean boolean0 = object0.equals(fastDateFormat0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) null, (Locale) null);
      ParsePosition parsePosition0 = new ParsePosition(0);
      Object object0 = fastDateFormat0.parseObject("", parsePosition0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
      ParsePosition parsePosition0 = new ParsePosition(3);
      fastDateFormat0.parse("0034\u5E7412\u670831\u65E5 \u661F\u671F\u4E94", parsePosition0);
      assertEquals("java.text.ParsePosition[index=15,errorIndex=-1]", parsePosition0.toString());
      assertEquals(15, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null, locale0);
      Date date0 = fastDateFormat0.parse("0002\u5E7412\u670831\u65E5 \u661F\u671F\u4E09");
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "AhHD`sfAPWVH");
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) simpleTimeZone0, locale0);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      assertSame(timeZone0, simpleTimeZone0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("42", (TimeZone) null, locale0);
      assertEquals(1, FastDateFormat.LONG);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("s+", timeZone0);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
      assertEquals(3, FastDateFormat.SHORT);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 0, (TimeZone) null, locale0);
      assertEquals(3, FastDateFormat.SHORT);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(2, 2, timeZone0);
      assertEquals(2, FastDateFormat.MEDIUM);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (TimeZone) null);
      assertEquals(1, FastDateFormat.LONG);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      StringBuffer stringBuffer0 = new StringBuffer(367);
      MockDate mockDate0 = new MockDate(0, 90, 319);
      fastDateFormat0.format((Date) mockDate0, stringBuffer0);
      assertEquals(22, stringBuffer0.length());
      assertEquals("Thursday, May 14, 1908", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      MockDate mockDate0 = new MockDate((-1160L));
      String string0 = fastDateFormat0.format((Date) mockDate0);
      assertEquals("12/31/69 11:59 PM", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(90, 3, 319, 367, 319, 0);
      StringBuffer stringBuffer0 = new StringBuffer(367);
      fastDateFormat0.format((Calendar) mockGregorianCalendar0, stringBuffer0);
      assertEquals(25, stringBuffer0.length());
      assertEquals("Monday, February 28, 0091", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(2, 1, 11, 0, 2, 11);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      fastDateFormat0.applyRules(mockGregorianCalendar0, stringBuffer0);
      assertEquals("February 11, 0002", stringBuffer0.toString());
      assertEquals("February 11, 0002", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = Locale.UK;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, timeZone0, locale0);
      boolean boolean0 = fastDateFormat0.equals(zoneOffset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      StringBuffer stringBuffer0 = new StringBuffer("M&B[ ,vL,.G3dw");
      StringBuffer stringBuffer1 = fastDateFormat0.format(71L, stringBuffer0);
      assertEquals(29, stringBuffer1.length());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, locale0);
      String string0 = fastDateFormat0.format((long) 2);
      assertEquals("70-1-1 \u4E0A\u534812:00", string0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.KOREAN;
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(3, timeZone0, locale0);
      assertEquals(1, FastDateFormat.LONG);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(0, 1);
      assertEquals(1, FastDateFormat.LONG);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateTimeInstance(3, 3, locale0);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "b9J%uP}<(Lp0r3K", 0, 0, 3, 94, (-1304), 0, (-793), 94, 1);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      String string0 = fastDateFormat0.format((Calendar) mockGregorianCalendar0);
      assertEquals("14-2-14 \u4E0B\u53488:21", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance("7", locale0);
      assertEquals(0, FastDateFormat.FULL);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      fastDateFormat0.hashCode();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (Locale) null);
      TimeZone timeZone0 = fastDateFormat0.getTimeZone();
      assertEquals("GMT", timeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(3, (Locale) null);
      int int0 = fastDateFormat0.getMaxLengthEstimate();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (Locale) null);
      String string0 = fastDateFormat0.toString();
      assertEquals("FastDateFormat[EEEE, MMMM d, yyyy,en,GMT]", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (Locale) null);
      Locale locale0 = fastDateFormat0.getLocale();
      assertEquals("eng", locale0.getISO3Language());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getTimeInstance(0, (TimeZone) null);
      assertEquals(0, FastDateFormat.FULL);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getInstance();
      ParsePosition parsePosition0 = new ParsePosition(0);
      Date date0 = fastDateFormat0.parse("M&B[ ,vL,.G3dw", parsePosition0);
      assertNull(date0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      FastDateFormat fastDateFormat0 = FastDateFormat.getDateInstance(0, (Locale) null);
      String string0 = fastDateFormat0.getPattern();
      assertEquals("EEEE, MMMM d, yyyy", string0);
  }

}
