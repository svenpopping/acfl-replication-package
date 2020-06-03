/*

 * Tue Mar 03 10:01:32 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ParseException;
import org.apache.commons.lang3.time.DateUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class DateUtils_ESTest_Botsing extends DateUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
        DateUtils.parseDate("gv", stringArray0);
      
         //
         // Unable to parse the date: gv
         //
  }
}
