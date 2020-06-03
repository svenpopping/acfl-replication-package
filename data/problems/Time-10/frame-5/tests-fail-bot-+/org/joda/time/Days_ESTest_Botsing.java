/*

 * Tue Mar 03 12:01:09 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;

public class Days_ESTest_Botsing extends Days_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-1057));
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) (-1057));
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      MonthDay monthDay0 = MonthDay.now(dateTimeZone0);
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[9];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[2];
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      int[] intArray1 = new int[7];
      intArray1[0] = 1;
      MonthDay monthDay2 = new MonthDay(monthDay1, intArray1);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay2, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      int[] intArray0 = new int[10];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }
}
