/*

 * Tue Mar 03 10:31:21 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;

public class Days_ESTest_Botsing extends Days_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Partial partial0 = new Partial();
      Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      Date date0 = new Date();
      MonthDay monthDay0 = MonthDay.now();
      int[] intArray0 = new int[7];
      intArray0[0] = 1;
      intArray0[1] = (-314);
      intArray0[2] = 0;
      intArray0[3] = (-3946);
      intArray0[4] = 1;
      intArray0[5] = (-3946);
      intArray0[6] = 0;
      MonthDay monthDay1 = new MonthDay(monthDay0, intArray0);
      // Undeclared exception!
      Days.daysBetween((ReadablePartial) monthDay1, (ReadablePartial) monthDay0);
  }
}
