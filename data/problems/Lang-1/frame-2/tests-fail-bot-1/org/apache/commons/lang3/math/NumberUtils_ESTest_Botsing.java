/*

 * Tue Mar 03 10:00:18 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class NumberUtils_ESTest_Botsing extends NumberUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "-#";
        NumberUtils.createNumber("-#");
      
         //
         // For input string: \"-\"
         //
  }
}
