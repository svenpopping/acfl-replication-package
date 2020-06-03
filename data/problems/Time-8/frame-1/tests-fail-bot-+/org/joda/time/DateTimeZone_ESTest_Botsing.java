/*

 * Tue Mar 03 11:56:18 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableInstant;
import org.joda.time.TestDateMidnight_Basics;

public class DateTimeZone_ESTest_Botsing extends DateTimeZone_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 999968);
      
         //
         // Minutes out of range: 999968
         //
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1));
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-1));
      dateTimeZone0.getStandardOffset((-1L));
        DateTimeZone.forOffsetHoursMinutes((-1), (-1));
      
         //
         // Minutes out of range: -1
         //
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-1), (-1));
      
         //
         // Minutes out of range: -1
         //
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(1, (-2335));
      
         //
         // Minutes out of range: -2335
         //
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-10), (-10));
      
         //
         // Minutes out of range: -10
         //
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, (-2485));
      
         //
         // Minutes out of range: -2485
         //
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-5), (-5));
      
         //
         // Minutes out of range: -5
         //
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2485));
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-2485));
      dateTimeZone0.getStandardOffset((-2485L));
        DateTimeZone.forOffsetHoursMinutes(0, (-2485));
      
         //
         // Minutes out of range: -2485
         //
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-3), (-3));
      
         //
         // Minutes out of range: -3
         //
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-22), (-22));
      
         //
         // Minutes out of range: -22
         //
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-21), (-21));
      
         //
         // Minutes out of range: -21
         //
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-15), (-15));
      
         //
         // Minutes out of range: -15
         //
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-13), (-13));
      
         //
         // Minutes out of range: -13
         //
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-17), (-17));
      
         //
         // Minutes out of range: -17
         //
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-23), (-23));
      
         //
         // Minutes out of range: -23
         //
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, (-1798));
      
         //
         // Minutes out of range: -1798
         //
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 1000012);
      
         //
         // Minutes out of range: 1000012
         //
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 1000009);
      
         //
         // Minutes out of range: 1000009
         //
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 119);
      
         //
         // Minutes out of range: 119
         //
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-12), (-12));
      
         //
         // Minutes out of range: -12
         //
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 999999);
      
         //
         // Minutes out of range: 999999
         //
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-16), (-16));
      
         //
         // Minutes out of range: -16
         //
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(3, (-202));
      
         //
         // Minutes out of range: -202
         //
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(22, 999999);
      
         //
         // Minutes out of range: 999999
         //
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-2), (-2));
      
         //
         // Minutes out of range: -2
         //
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-11), (-11));
      
         //
         // Minutes out of range: -11
         //
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(4, 64);
      
         //
         // Minutes out of range: 64
         //
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-8), (-8));
      
         //
         // Minutes out of range: -8
         //
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-18), (-18));
      
         //
         // Minutes out of range: -18
         //
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-19), (-19));
      
         //
         // Minutes out of range: -19
         //
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(18, 1000021);
      
         //
         // Minutes out of range: 1000021
         //
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-14), (-14));
      
         //
         // Minutes out of range: -14
         //
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 1000015);
      
         //
         // Minutes out of range: 1000015
         //
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-1), (-1122));
      
         //
         // Minutes out of range: -1122
         //
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(1, (-2963));
      
         //
         // Minutes out of range: -2963
         //
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("Fixing duplicat recurrent name key - ");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      DateTimeZone dateTimeZone0 = testDateMidnight_Basics_MockInstant0.getZone();
      dateTimeZone0.getOffset((ReadableInstant) testDateMidnight_Basics_MockInstant0);
      testDateMidnight_Basics_MockInstant0.toMutableDateTimeISO();
        DateTimeZone.forOffsetHoursMinutes(0, 3600000);
      
         //
         // Minutes out of range: 3600000
         //
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-9), (-9));
      
         //
         // Minutes out of range: -9
         //
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2485));
      dateTimeZone0.getStandardOffset((-2485));
        DateTimeZone.forOffsetHoursMinutes(0, (-2485));
      
         //
         // Minutes out of range: -2485
         //
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(23, (-1969));
      
         //
         // Minutes out of range: -1969
         //
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(1, 1188);
      
         //
         // Minutes out of range: 1188
         //
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(12, 999981);
      
         //
         // Minutes out of range: 999981
         //
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-7), (-7));
      
         //
         // Minutes out of range: -7
         //
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(4, (-86399999));
      
         //
         // Minutes out of range: -86399999
         //
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 65535);
      
         //
         // Minutes out of range: 65535
         //
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(10, 999999);
      
         //
         // Minutes out of range: 999999
         //
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(1, 65535);
      
         //
         // Minutes out of range: 65535
         //
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(19, (-2330));
      
         //
         // Minutes out of range: -2330
         //
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-20), (-20));
      
         //
         // Minutes out of range: -20
         //
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 562);
      
         //
         // Minutes out of range: 562
         //
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(3, (-845));
      
         //
         // Minutes out of range: -845
         //
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(22, 65535);
      
         //
         // Minutes out of range: 65535
         //
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      dateTimeZone0.getOffsetFromLocal(220L);
        DateTimeZone.forOffsetHoursMinutes(0, (-555));
      
         //
         // Minutes out of range: -555
         //
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 1000001);
      
         //
         // Minutes out of range: 1000001
         //
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 999997);
      
         //
         // Minutes out of range: 999997
         //
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-6), (-6));
      
         //
         // Minutes out of range: -6
         //
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes((-4), (-4));
      
         //
         // Minutes out of range: -4
         //
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(3, (-2190));
      
         //
         // Minutes out of range: -2190
         //
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
        DateTimeZone.forOffsetHoursMinutes(0, 1000011);
      
         //
         // Minutes out of range: 1000011
         //
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TestDateMidnight_Basics testDateMidnight_Basics0 = new TestDateMidnight_Basics("Fixing duplicat recurrent name key - ");
      TestDateMidnight_Basics.MockInstant testDateMidnight_Basics_MockInstant0 = testDateMidnight_Basics0.new MockInstant();
      testDateMidnight_Basics_MockInstant0.toMutableDateTimeISO();
        DateTimeZone.forOffsetHoursMinutes(0, (-1790033775));
      
         //
         // Minutes out of range: -1790033775
         //
  }
}
