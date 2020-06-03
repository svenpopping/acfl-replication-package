/*

 * Tue Mar 03 11:51:35 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Minutes;
import org.joda.time.Months;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestBaseSingleFieldPeriod;
import org.joda.time.TestInterval_Basics;

public class Period_ESTest_Botsing extends Period_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.years(179);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.weeks();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.seconds(917);
      Period period1 = period0.plusYears(917);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.years((-442));
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.years(885);
      PeriodType periodType0 = PeriodType.hours();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.years(871);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PeriodType periodType0 = PeriodType.months();
      TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("Africa/Johannesburg");
      TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
      Period period0 = testInterval_Basics_MockInterval0.toPeriod(periodType0);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.years(904);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = Period.seconds(917);
      PeriodType periodType0 = PeriodType.millis();
      Period period1 = period0.withYears(917);
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.years((-1632));
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Period period0 = Period.months((-2233));
      TestInterval_Basics testInterval_Basics0 = new TestInterval_Basics("^");
      TestInterval_Basics.MockInterval testInterval_Basics_MockInterval0 = testInterval_Basics0.new MockInterval();
      Minutes minutes0 = Minutes.minutesIn(testInterval_Basics_MockInterval0);
      PeriodType periodType0 = minutes0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.years(885);
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = Period.years(919);
      PeriodType periodType0 = PeriodType.time();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.minutes();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = Period.years(921);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.seconds(324);
      Period period1 = period0.plusYears(324);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.years(894);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.years(14);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = Period.years(7);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.years(921);
      PeriodType periodType0 = PeriodType.hours();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Period period0 = Period.years((-1995));
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Period period0 = Period.years(1540);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Period period0 = Period.years(535);
      Days days0 = Days.MIN_VALUE;
      PeriodType periodType0 = days0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Period period0 = new Period();
      PeriodType periodType0 = PeriodType.days();
      Period period1 = period0.minusMonths((-86399999));
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.seconds();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Period period0 = Period.millis(917);
      Period period1 = period0.plusYears(917);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Period period0 = Period.years(885);
      PeriodType periodType0 = PeriodType.time();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Period period0 = new Period((long) 40);
      Period period1 = period0.plusMonths(40);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Period period0 = Period.years(869);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Period period0 = Period.years(957);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = Period.weeks((-47));
      Period period1 = period0.minusMonths((-47));
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withMonths(192);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Period period0 = Period.years(912);
      Months months0 = Months.ZERO;
      PeriodType periodType0 = months0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Period period0 = Period.years((-2155));
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PeriodType periodType0 = PeriodType.hours();
      Period period0 = Period.weeks((-47));
      Period period1 = period0.plusYears((-47));
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Period period0 = Period.years(868);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Period period0 = Period.years(919);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Period period0 = Period.years(929);
      PeriodType periodType0 = PeriodType.minutes();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Period period0 = Period.millis(916);
      Period period1 = period0.plusYears(916);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Period period0 = Period.years(921);
      Days days0 = Days.MIN_VALUE;
      PeriodType periodType0 = days0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Period period0 = Period.years(884);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Period period0 = Period.years(830);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.millis();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Period period0 = Period.years((-3745));
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      PeriodType periodType0 = PeriodType.millis();
      Period period0 = Period.years(6);
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Period period0 = Period.years(12825000);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Period period0 = Period.years(885);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Period period0 = Period.years(885);
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(885);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.ZERO.withMonths(192);
      Period period2 = period1.withMinutes(192);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period2.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Period period0 = Period.years(1725);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Period period0 = Period.years(913);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Period period0 = new Period(922, 922, 922, 922, 922, 922, 922, 922);
      Months months0 = Months.MAX_VALUE;
      PeriodType periodType0 = months0.getPeriodType();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusYears(129);
      TestBaseSingleFieldPeriod.Single testBaseSingleFieldPeriod_Single0 = new TestBaseSingleFieldPeriod.Single(129);
      PeriodType periodType0 = testBaseSingleFieldPeriod_Single0.getPeriodType();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Period period0 = new Period();
      Period period1 = period0.plusMonths(1096);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period1.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Period period0 = new Period(921, 921, 921, 921, 921, 921, 921, 921);
      PeriodType periodType0 = PeriodType.dayTime();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.time();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Period period0 = Period.months(921);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Period period0 = Period.months(4157);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.hours();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Period period0 = Period.years(912);
      PeriodType periodType0 = PeriodType.months();
      // Undeclared exception!
      period0.normalizedStandard(periodType0);
  }
}
