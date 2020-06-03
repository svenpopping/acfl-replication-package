/*

 * Tue Mar 03 11:59:16 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.BuddhistChronology;

public class BaseSingleFieldPeriod_ESTest_Botsing extends BaseSingleFieldPeriod_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn(2897).when(readablePartial0).getValue(anyInt());
      doReturn(2897, 2897, (-134), (-134), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, (-136), 1, 1, 1, (-136), (-136), (-136));
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Days days0 = Days.FOUR;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, days0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-133)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-133), (-133), 1).when(readablePartial0).size();
      Seconds seconds0 = Seconds.ZERO;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, seconds0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Period period0 = new Period((-136), 1, 1, (-136));
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, period0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      Hours hours0 = Hours.EIGHT;
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, hours0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn(0).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-128)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-128), (-128), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-109)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-109), (-109), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-153)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-153), (-153), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      // Undeclared exception!
      Minutes.minutesBetween(readablePartial0, readablePartial0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Period period0 = new Period((-136), (-136), 1, (-136));
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, period0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Period period0 = new Period(1, (-134), (-134), 1, (-134), 1, (-134), (-134));
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, period0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-116)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-116), (-116), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      MutablePeriod mutablePeriod0 = new MutablePeriod((-136), (-136), 1, (-136), 1, (-136), (-136), 1);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, (ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-137)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-137), (-137), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, (ReadablePeriod) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Days days0 = Days.SIX;
      MutablePeriod mutablePeriod0 = days0.toMutablePeriod();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Days days0 = Days.ONE;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, days0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-107)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-107), (-107), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Period period0 = new Period(1, 1, buddhistChronology0);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, period0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-129)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-129), (-129), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Months months0 = Months.FOUR;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, months0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Months months0 = Months.TWELVE;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, months0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Hours hours0 = Hours.MAX_VALUE;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, hours0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-124)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-124), (-124), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-129)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-129), (-129), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      MutablePeriod mutablePeriod0 = new MutablePeriod(1, 1, 1, 1);
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      Months months0 = Months.THREE;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, months0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Period period0 = new Period();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, period0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-134)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-134), (-134), 1).when(readablePartial0).size();
      Hours hours0 = Hours.ONE;
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, hours0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(buddhistChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn((-136)).when(readablePartial0).getValue(anyInt());
      doReturn(1, 1, (-136), (-136), 1).when(readablePartial0).size();
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, (ReadablePeriod) null);
  }
}
