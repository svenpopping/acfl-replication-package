/*

 * Tue Mar 03 10:18:43 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FDistributionImpl_ESTest_Botsing extends FDistributionImpl_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 1.580887032249125E-4;
      double double1 = 924.28;
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(924.28, 1.580887032249125E-4);
      // Undeclared exception!
      fDistributionImpl0.inverseCumulativeProbability(1.580887032249125E-4);
  }
}
