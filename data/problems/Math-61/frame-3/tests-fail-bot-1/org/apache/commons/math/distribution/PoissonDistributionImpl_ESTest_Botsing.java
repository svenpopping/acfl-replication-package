/*

 * Tue Mar 03 10:12:38 UTC 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class PoissonDistributionImpl_ESTest_Botsing extends PoissonDistributionImpl_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(116.4749729659);
      PoissonDistributionImpl poissonDistributionImpl1 = new PoissonDistributionImpl(116.4749729659);
      PoissonDistributionImpl poissonDistributionImpl2 = new PoissonDistributionImpl((-2768.0));
  }
}
