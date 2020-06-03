/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:55:47 GMT 2020
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
import org.joda.time.Period;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.OffsetDateTimeField;

public class FieldUtils_ESTest_EvoSuite extends FieldUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FieldUtils.verifyValueBounds((String) null, 3985, 85, 3985);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldUtils.verifyValueBounds("KS3' &n&7r'8(|p^7z@", Integer.MIN_VALUE, Integer.MIN_VALUE, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      FieldUtils.verifyValueBounds(dateTimeFieldType0, 0, 0, 0);
      assertEquals("clockhourOfHalfday", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      FieldUtils.verifyValueBounds(dateTimeFieldType0, 1963, 1963, 2082);
      assertEquals("secondOfMinute", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfHalfday();
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-3982), 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(2147483647L);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = FieldUtils.safeToInt((-2147483648L));
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(1, Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-513), (-513));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract((-1L), (-404L));
      assertEquals(403L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = FieldUtils.safeToInt(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = FieldUtils.safeNegate((-1488));
      assertEquals(1488, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt((-2914L), (-2914L));
      assertEquals(8491396, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt((-1607L), 151L);
      assertEquals((-242657), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(3299, 3299);
      assertEquals(10883401, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      long long0 = FieldUtils.safeAdd(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((-1000L), 0L);
      assertEquals((-1000L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = FieldUtils.safeAdd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = FieldUtils.safeAdd((-389), (-389));
      assertEquals((-778), int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(8491396, 20, 0, 8491396);
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(31, (-137), (-137), (-1));
      assertEquals((-106), int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, Integer.MIN_VALUE, 0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-1359), (-4379), (-633));
      assertEquals((-1359), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, 1963);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1812L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(0L, (-3260L));
      assertEquals(3260L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = FieldUtils.safeAdd((-281L), 2304L);
      assertEquals(2023L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      Object object1 = new Object();
      boolean boolean0 = FieldUtils.equals(object0, object1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) "Value cannot fit in an int: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = FieldUtils.equals((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = FieldUtils.equals((Object) integer0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue((-1584), (-23), 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = FieldUtils.getWrappedValue(0, 0, 0, 604800);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FieldUtils.verifyValueBounds((DateTimeField) null, 0, 0, 2730);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-3276L), (-790L));
      assertEquals(2588040L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      int int0 = FieldUtils.safeMultiplyToInt(3618L, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply(1L, (-1529L));
      assertEquals((-1529L), long0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) (-1879), (long) 1);
      assertEquals((-1879L), long0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 1486, (-51));
      assertEquals((-75786L), long0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-3600000L), 1);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      long long0 = FieldUtils.safeMultiply((-1040L), (-1));
      assertEquals(1040L, long0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      int int0 = FieldUtils.safeMultiply(604800, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      long long0 = FieldUtils.safeSubtract(0L, 3600000L);
      assertEquals((-3600000L), long0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Period period0 = new Period((-1), 1171L, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      int int0 = FieldUtils.safeAdd((-2248), 4408);
      assertEquals(2160, int0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      int int0 = FieldUtils.safeNegate(1687);
      assertEquals((-1687), int0);
  }

}
