/*

 * Tue Mar 03 10:02:02 UTC 2020
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
      String string0 = "A blank string is not a valid number";
      NumberUtils.toShort("A blank string is not a valid number");
      NumberUtils.toFloat("A blank string is not a valid number");
      NumberUtils.toLong("A blank string is not a valid number");
      String string1 = "O u27)AaRZVrIn(fC";
        NumberUtils.createNumber("O u27)AaRZVrIn(fC");
      
         //
         // O u27)AaRZVrIn(fC is not a valid number.
         //
  }
}
