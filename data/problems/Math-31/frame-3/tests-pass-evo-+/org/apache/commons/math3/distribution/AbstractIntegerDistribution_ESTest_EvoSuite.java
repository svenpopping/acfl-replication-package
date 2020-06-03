/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:29:08 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.distribution.PascalDistribution;
import org.apache.commons.math3.distribution.PoissonDistribution;
import org.apache.commons.math3.distribution.UniformIntegerDistribution;
import org.apache.commons.math3.distribution.ZipfDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractIntegerDistribution_ESTest_EvoSuite extends AbstractIntegerDistribution_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      binomialDistribution0.solveInverseCumulativeProbability(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(156, 92, 92);
      hypergeometricDistribution0.solveInverseCumulativeProbability(92, 216, 216);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(156, 92, 92);
      hypergeometricDistribution0.reseedRandomGenerator(10000000);
      hypergeometricDistribution0.sample();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution((double) 256, 2058);
      poissonDistribution0.cumulativeProbability((-3941), 2058);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(0.125);
      poissonDistribution0.inverseCumulativeProbability(0.125);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      binomialDistribution0.inverseCumulativeProbability(Double.NaN);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1889, 1.0E-12);
      int[] intArray0 = pascalDistribution0.sample(1889);
      assertEquals(1889, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PoissonDistribution poissonDistribution0 = new PoissonDistribution(129.0);
      int int0 = poissonDistribution0.solveInverseCumulativeProbability(0.0, Integer.MIN_VALUE, 0);
      assertEquals((-2147483647), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(1889, 1.0E-12);
      int int0 = pascalDistribution0.inverseCumulativeProbability(1.0E-12);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1651, Double.NaN);
      int int0 = binomialDistribution0.sample();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PascalDistribution pascalDistribution0 = new PascalDistribution(220, 0.0);
      int int0 = pascalDistribution0.inverseCumulativeProbability(0.9040311169542883);
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.inverseCumulativeProbability(1.0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UniformIntegerDistribution uniformIntegerDistribution0 = new UniformIntegerDistribution((-34), 0);
      int int0 = uniformIntegerDistribution0.inverseCumulativeProbability(0.0);
      assertEquals((-34), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution0 = new HypergeometricDistribution(168, 92, 92);
      double double0 = hypergeometricDistribution0.cumulativeProbability(92, 92);
      assertEquals(0.0, double0, 0.01);
  }
}
