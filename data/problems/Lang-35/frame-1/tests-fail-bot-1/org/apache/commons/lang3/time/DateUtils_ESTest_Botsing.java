/*

 * Tue Mar 03 10:00:24 UTC 2020
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
      String[] stringArray0 = new String[9];
      stringArray0[0] = "wz=";
      stringArray0[1] = "wz=";
      stringArray0[2] = "wz=";
      stringArray0[3] = "wz=";
      stringArray0[4] = "wz=";
      stringArray0[5] = "wz=";
      stringArray0[6] = "wz=";
      stringArray0[7] = "wz=";
      stringArray0[8] = "";
        DateUtils.parseDate("wz=", stringArray0);
      
         //
         // Unable to parse the date: wz=
         //
  }
}
