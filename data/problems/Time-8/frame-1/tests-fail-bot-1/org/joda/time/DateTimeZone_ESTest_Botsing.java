/*

 * Tue Mar 03 10:24:59 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;

public class DateTimeZone_ESTest_Botsing extends DateTimeZone_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = 1;
        DateTimeZone.forOffsetHoursMinutes(1, (-3096));
      
         //
         // Minutes out of range: -3096
         //
  }
}
