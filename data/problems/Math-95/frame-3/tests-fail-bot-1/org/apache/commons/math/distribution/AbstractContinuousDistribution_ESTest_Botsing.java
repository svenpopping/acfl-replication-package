/*

 * Tue Mar 03 10:18:59 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.NormalDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractContinuousDistribution_ESTest_Botsing extends AbstractContinuousDistribution_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NormalDistributionImpl normalDistributionImpl0 = new NormalDistributionImpl(1930.84136995526, Double.POSITIVE_INFINITY);
      // Undeclared exception!
      normalDistributionImpl0.inverseCumulativeProbability(1.0E-6);
  }
}
