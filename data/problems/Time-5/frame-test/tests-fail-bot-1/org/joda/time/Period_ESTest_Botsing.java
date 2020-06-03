/*

 * Tue Mar 03 10:22:22 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;

public class Period_ESTest_Botsing extends Period_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType periodType0 = PeriodType.time();
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null, periodType0);
      // Undeclared exception!
      period0.withYears((-893));
  }
}
