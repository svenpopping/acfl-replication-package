/*

 * Tue Mar 03 10:00:24 UTC 2020
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
      NumberUtils.toFloat("B]9G@w^f}<S7R>");
      NumberUtils.toFloat("B]9G@w^f}<S7R>", 0.0F);
      // Undeclared exception!
      NumberUtils.createInteger("}GESL>*-XK.t$\"i");
  }
}
