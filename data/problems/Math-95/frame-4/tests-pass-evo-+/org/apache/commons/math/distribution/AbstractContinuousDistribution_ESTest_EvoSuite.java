/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:45:38 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.BetaDistributionImpl;
import org.apache.commons.math.distribution.CauchyDistributionImpl;
import org.apache.commons.math.distribution.ChiSquaredDistributionImpl;
import org.apache.commons.math.distribution.GammaDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractContinuousDistribution_ESTest_EvoSuite extends AbstractContinuousDistribution_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GammaDistributionImpl gammaDistributionImpl0 = new GammaDistributionImpl(2308.2532895221, 0.10673623788162827);
      ChiSquaredDistributionImpl chiSquaredDistributionImpl0 = new ChiSquaredDistributionImpl(0.10673623788162827, gammaDistributionImpl0);
      double double0 = chiSquaredDistributionImpl0.inverseCumulativeProbability(0.10673623788162827);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CauchyDistributionImpl cauchyDistributionImpl0 = new CauchyDistributionImpl();
      double double0 = cauchyDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      BetaDistributionImpl betaDistributionImpl0 = new BetaDistributionImpl(0.6456148559975688, 0.6456148559975688);
      double double0 = betaDistributionImpl0.inverseCumulativeProbability(0.6456148559975688);
      assertEquals(0.6889968373466773, double0, 0.01);
  }
}