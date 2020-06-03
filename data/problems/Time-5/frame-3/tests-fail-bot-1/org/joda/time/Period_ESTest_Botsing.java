/*

 * Tue Mar 03 10:23:02 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.TestBasePartial;

public class Period_ESTest_Botsing extends Period_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Period period0 = Period.years(2615625);
      TestBasePartial.MockPartial testBasePartial_MockPartial0 = new TestBasePartial.MockPartial();
      Chronology chronology0 = testBasePartial_MockPartial0.getChronology();
      Period period1 = new Period(0L, chronology0);
      Period period2 = period0.withMonths(6);
      Period period3 = period2.plusSeconds(2615625);
      period1.plusHours(192);
      period1.normalizedStandard((PeriodType) null);
      PeriodType periodType0 = PeriodType.seconds();
      PeriodType periodType1 = periodType0.withMonthsRemoved();
      // Undeclared exception!
      period3.normalizedStandard(periodType1);
  }
}
