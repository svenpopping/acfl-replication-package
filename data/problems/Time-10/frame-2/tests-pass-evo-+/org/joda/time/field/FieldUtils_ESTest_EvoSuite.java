/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:55:23 GMT 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;

public class FieldUtils_ESTest_EvoSuite extends FieldUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, Integer.MIN_VALUE, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldUtils.verifyValueBounds("Value cannot fit in an int: ", 0, (-292275054), 31);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FieldUtils.verifyValueBounds((DateTimeFieldType) null, 2583, 2583, 2583);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(2147483647L);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = FieldUtils.safeToInt((-2147483648L));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(1, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(1000000L, 0);
      assertEquals(1000000L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-2635L), (-2635L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = FieldUtils.safeNegate((-292269337));
      assertEquals(292269337, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(72);
      assertEquals((-72), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt((-1000L), 1L);
      assertEquals((-1000), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-125L), (-1L));
      assertEquals(125L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 715, (-1));
      assertEquals((-715L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply((-2375), (-1164));
      assertEquals(2764500, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, 0, 1722);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-2143180072), (-1), 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FieldUtils.verifyValueBounds((DateTimeField) null, 1340, 1340, 1340);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1585L, (-16L));
      assertEquals((-25360L), long0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-1731), (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, (-2292L));
      assertEquals((-2292L), long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, object1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer(2000);
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) "`m*]P]C';Ne>(3%rE,^", (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, Integer.MIN_VALUE, (-1));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 45, 759);
      assertEquals(715, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      FieldUtils.verifyValueBounds("Ng_ZS8H lWr\"3-ckv", 0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      FieldUtils.verifyValueBounds((DateTimeFieldType) null, 0, 0, 3064);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt((-6L), 0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-2136746228), (long) 1);
      assertEquals((-2136746228L), long0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, 3966);
      assertEquals(3966L, long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1536L, 1);
      assertEquals(1536L, long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(0, 930);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(182L, 2306L);
      assertEquals((-2124L), long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(0, (-2190L));
      assertEquals(2190L, long0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, (-206L));
      assertEquals((-206L), long0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(100L, 100L);
      assertEquals(200L, long0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, (-422));
      assertEquals((-422), int0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(1, 153692453);
      assertEquals(153692454, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 1023, 1, 10);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(45, 759L);
      assertEquals(34155, int0);
  }
}