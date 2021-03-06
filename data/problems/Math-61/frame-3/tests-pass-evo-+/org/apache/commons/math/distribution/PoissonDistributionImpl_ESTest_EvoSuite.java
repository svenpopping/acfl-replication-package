/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:40:53 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.PoissonDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class PoissonDistributionImpl_ESTest_EvoSuite extends PoissonDistributionImpl_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(569.695);
      double double0 = poissonDistributionImpl0.probability(236);
      assertEquals(6.558116401953869E-57, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.7249995199969751, (-1641));
      double double0 = poissonDistributionImpl0.normalApproximateProbability((-1641));
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.7249995199969751, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.7249995199969751, (-1641));
      double double0 = poissonDistributionImpl0.cumulativeProbability((-1641));
      assertEquals(0.7249995199969751, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(0.7249995199969751, (-1641));
      double double0 = poissonDistributionImpl0.probability(0);
      assertEquals(0.4843248014326764, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.5874010519681994);
      double double0 = poissonDistributionImpl0.cumulativeProbability(Integer.MAX_VALUE);
      assertEquals(1.5874010519681994, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(179.98058154098032, 179.98058154098032);
      double double0 = poissonDistributionImpl0.probability(Integer.MAX_VALUE);
      assertEquals(0.0, double0, 0.01);
      assertEquals(179.98058154098032, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.5874010519681994);
      double double0 = poissonDistributionImpl0.probability((-885));
      assertEquals(1.5874010519681994, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 2017);
      double double0 = poissonDistributionImpl0.normalApproximateProbability(10000000);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.5874010519681994);
      int int0 = poissonDistributionImpl0.getDomainUpperBound(0.0);
      assertEquals(1.5874010519681994, poissonDistributionImpl0.getMean(), 0.01);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 2017);
      int int0 = poissonDistributionImpl0.sample();
      assertEquals(0, int0);
      assertEquals(1.0, poissonDistributionImpl0.getMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.5874010519681994);
      double double0 = poissonDistributionImpl0.getMean();
      assertEquals(1.5874010519681994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PoissonDistributionImpl poissonDistributionImpl0 = new PoissonDistributionImpl(1.0, 2017);
      poissonDistributionImpl0.getDomainLowerBound(10000000);
  }
}
