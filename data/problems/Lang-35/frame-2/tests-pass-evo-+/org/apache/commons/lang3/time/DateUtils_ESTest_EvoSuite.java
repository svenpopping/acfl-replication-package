/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:29:35 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockCalendar;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;

public class DateUtils_ESTest_EvoSuite extends DateUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0, locale0);
      Calendar calendar0 = DateUtils.ceiling((Calendar) mockGregorianCalendar0, 10);
      DateUtils.isSameLocalTime(calendar0, mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.round((Calendar) mockGregorianCalendar0, 0);
      DateUtils.isSameInstant(calendar0, (Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-936), (-936), 30);
      Date date0 = DateUtils.addSeconds(mockDate0, (-5157));
      DateUtils.isSameInstant((Date) mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0, 0, 0, 0, 0);
      Date date0 = DateUtils.addHours(mockDate0, (-1538));
      DateUtils.isSameDay(date0, (Date) mockDate0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2682), 0, 1);
      Instant instant0 = MockInstant.ofEpochSecond((long) 0);
      Date date0 = Date.from(instant0);
      DateUtils.isSameDay((Date) mockDate0, date0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1), "Could not truncate ");
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar0);
      dateUtils_DateIterator0.hasNext();
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MockDate mockDate0 = new MockDate(3510, 3510, (-936));
      DateUtils.setMonths(mockDate0, (-1));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      DateUtils.round((Calendar) mockGregorianCalendar0, 12);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "";
      DateUtils.parseDate("", stringArray0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 14);
      DateUtils.getFragmentInMinutes(date0, 14);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = mockGregorianCalendar0.getGregorianChange();
      DateUtils.getFragmentInMinutes(date0, 1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      DateUtils.getFragmentInMilliseconds((Date) mockDate0, 11);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(1, 2, 3);
      DateUtils.getFragmentInMilliseconds((Calendar) mockGregorianCalendar0, 6);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("enp=B?$mtZZ");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      DateUtils.getFragmentInHours((Calendar) mockGregorianCalendar0, 1);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-539), 0, (-56), (-1628), 587, 3566);
      DateUtils.getFragmentInDays((Date) mockDate0, 11);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-659), (-1164), (-1164));
      DateUtils.getFragmentInDays((Date) mockDate0, 1);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.getFragmentInDays((Calendar) mockGregorianCalendar0, 14);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      DateUtils.getFragmentInDays((Calendar) mockGregorianCalendar0, 1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      DateUtils.addWeeks(date0, (-1));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("?i\",A");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      DateUtils.iterator((Calendar) mockGregorianCalendar0, 1);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2682), 0, 1);
      DateUtils.truncate((Date) mockDate0, 1);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      DateUtils.isSameDay((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone((-1), "Could not truncate ");
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0);
      Calendar calendar1 = DateUtils.ceiling(calendar0, 0);
      DateUtils.DateIterator dateUtils_DateIterator0 = new DateUtils.DateIterator(calendar0, calendar1);
      dateUtils_DateIterator0.next();
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Could not truncate ,offset=-1,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=319,ZONE_OFFSET=-1,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 12);
      long long0 = DateUtils.getFragmentInHours(date0, 14);
      assertEquals(0L, long0);
      assertEquals("Fri Feb 14 20:21:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(13, "f$0Y4tD`?:ENd(kp&");
      Locale locale0 = Locale.FRENCH;
      Calendar calendar0 = MockCalendar.getInstance((TimeZone) simpleTimeZone0, locale0);
      long long0 = DateUtils.getFragmentInSeconds(calendar0, 13);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      long long0 = DateUtils.getFragmentInMilliseconds((Calendar) mockGregorianCalendar0, 12);
      assertEquals(21320L, long0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      long long0 = DateUtils.getFragmentInHours((Date) mockDate0, 2);
      assertEquals(48L, long0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Iterator<Calendar> iterator0 = DateUtils.iterator((Date) mockDate0, 1);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 1053, 4, 1053, 0, 0);
      Date date0 = DateUtils.ceiling((Object) mockGregorianCalendar0, 9);
      assertEquals("Thu Nov 17 00:00:00 GMT 91", date0.toString());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(4, 4, 4, 4, 0, 0);
      Date date0 = DateUtils.ceiling((Object) mockGregorianCalendar0, 9);
      assertEquals("Sun May 04 12:00:00 GMT 4", date0.toString());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 5);
      assertEquals("Sat Feb 15 00:00:00 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Date date0 = DateUtils.truncate((Object) mockGregorianCalendar0, 14);
      Date date1 = DateUtils.ceiling(date0, 14);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 0);
      Date date0 = DateUtils.ceiling((Object) mockGregorianCalendar0, 5);
      Date date1 = DateUtils.truncate((Object) date0, 2);
      assertEquals("Mon Mar 01 00:00:00 GMT 1", date1.toString());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(0, 2, 0);
      Date date0 = DateUtils.ceiling((Object) mockGregorianCalendar0, 5);
      Date date1 = DateUtils.round((Object) date0, 0);
      assertEquals("Mon Mar 01 00:00:00 GMT 1", date0.toString());
      assertEquals("Thu Jan 01 00:00:00 GMT 1", date1.toString());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.round(date0, 0);
      assertEquals("Wed Jan 01 00:00:00 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "AWO'~vdG L[", 0, 0, 0, 0, 11, 0, 5, 11);
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(simpleTimeZone0);
      MockGregorianCalendar mockGregorianCalendar1 = new MockGregorianCalendar(270, 5, 11);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameLocalTime(mockGregorianCalendar0, mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      Calendar calendar0 = DateUtils.truncate((Calendar) mockGregorianCalendar0, 0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, calendar0);
      assertFalse(boolean0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", calendar0.toString());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(timeZone0);
      boolean boolean0 = DateUtils.isSameInstant((Calendar) mockGregorianCalendar0, (Calendar) mockGregorianCalendar0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Locale locale0 = new Locale("");
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(locale0);
      Date date0 = DateUtils.round((Object) mockGregorianCalendar0, 12);
      boolean boolean0 = DateUtils.isSameInstant(date0, date0);
      assertEquals("Fri Feb 14 20:21:00 GMT 2014", date0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2193436800000L));
      Date date0 = DateUtils.addSeconds(mockDate0, (-1980));
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Fri Jun 29 23:27:00 GMT 1900", date0.toString());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond((-2012L), (-2012L));
      Date date0 = Date.from(instant0);
      MockDate mockDate0 = new MockDate(1, 1, 23, 1, 1, 13);
      boolean boolean0 = DateUtils.isSameDay(date0, (Date) mockDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2682), 0, 1);
      Instant instant0 = mockDate0.toInstant();
      mockDate0.setTime((-4194L));
      Date date0 = Date.from(instant0);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, date0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2682), 0, 1);
      boolean boolean0 = DateUtils.isSameDay((Date) mockDate0, (Date) mockDate0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "";
      Date date0 = DateUtils.parseDateStrictly("", stringArray0);
      Date date1 = DateUtils.setYears(date0, (-356));
      assertNotSame(date0, date1);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-659), (-1164), (-1164));
      Date date0 = DateUtils.setMilliseconds(mockDate0, (-2064));
      assertEquals("Wed Oct 23 00:00:00 GMT 1140", date0.toString());
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      Locale locale0 = new Locale("");
      Calendar calendar0 = MockCalendar.getInstance(timeZone0, locale0);
      long long0 = DateUtils.getFragmentInMinutes(calendar0, 1);
      assertEquals(66081L, long0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      long long0 = DateUtils.getFragmentInHours((Calendar) mockGregorianCalendar0, 11);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Date date0 = DateUtils.setSeconds(mockDate0, 368);
      assertEquals("Mon Apr 02 00:00:00 GMT 2306", date0.toString());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateUtils dateUtils0 = new DateUtils();
      assertEquals(1001, DateUtils.SEMI_MONTH);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Date date0 = DateUtils.addDays(mockDate0, 2770);
      assertEquals("Sat Nov 01 00:00:00 GMT 2313", date0.toString());
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Date date0 = DateUtils.setDays(mockDate0, 2770);
      assertEquals("Mon Apr 02 00:00:00 GMT 2306", date0.toString());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.addYears(date0, 500);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date1.toString());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMonths(mockDate0, 500);
      assertEquals("Fri Feb 14 20:21:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.setMinutes(date0, 0);
      assertNotSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-517), (-517), 1, 1, 1, (-517));
      long long0 = DateUtils.getFragmentInSeconds((Date) mockDate0, 1);
      assertEquals(28947143L, long0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      Date date0 = DateUtils.addMinutes(mockDate0, 500);
      assertEquals("Sat Feb 15 04:41:21 GMT 2014", date0.toString());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
      long long0 = DateUtils.getFragmentInSeconds((Calendar) mockGregorianCalendar0, 11);
      assertEquals(1281L, long0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Date date0 = DateUtils.addHours(mockDate0, 368);
      boolean boolean0 = DateUtils.isSameInstant((Date) mockDate0, date0);
      assertFalse(boolean0);
      assertEquals("Tue Apr 17 08:00:00 GMT 2306", date0.toString());
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      Date date1 = DateUtils.setHours(date0, (-295));
      assertNotSame(date1, date0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-2682), 6, 1);
      long long0 = DateUtils.getFragmentInHours((Date) mockDate0, 5);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      MockDate mockDate0 = new MockDate(368, 368, 2770);
      Date date0 = DateUtils.addMilliseconds(mockDate0, 1);
      assertEquals("Mon Apr 02 00:00:00 GMT 2306", date0.toString());
  }

}
