/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:30:44 GMT 2020
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.BinomialDistribution;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BinomialDistribution_ESTest_EvoSuite extends BinomialDistribution_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability(467);
      assertEquals(0.0, binomialDistribution0.getNumericalVariance(), 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.0);
      double double0 = binomialDistribution0.probability(0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(1, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      double double0 = binomialDistribution0.probability(0);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(327, 1.0);
      int int0 = binomialDistribution0.getSupportLowerBound();
      assertEquals(327, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      double double0 = binomialDistribution0.getProbabilityOfSuccess();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.getNumericalVariance();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0.0);
      double double0 = binomialDistribution0.getNumericalMean();
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      int int0 = binomialDistribution0.getNumberOfTrials();
      assertEquals(1, int0);
      assertEquals(1.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.11041880036308725);
      int int0 = binomialDistribution0.getSupportUpperBound();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 1.0);
      int int0 = binomialDistribution0.getSupportLowerBound();
      assertEquals(1.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability((-1));
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 1);
      double double0 = binomialDistribution0.getNumericalMean();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.11041880036308725);
      double double0 = binomialDistribution0.getNumericalVariance();
      assertEquals(0.09822648888946393, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.0);
      int int0 = binomialDistribution0.getSupportUpperBound();
      assertEquals(1, binomialDistribution0.getNumberOfTrials());
      assertEquals(0, int0);
      assertEquals(0.0, binomialDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(1, 0.11041880036308725);
      int int0 = binomialDistribution0.getSupportLowerBound();
      assertEquals(0, int0);
      assertEquals(0.09822648888946393, binomialDistribution0.getNumericalVariance(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(11, 1.0);
      double double0 = binomialDistribution0.cumulativeProbability(0);
      assertEquals(11, binomialDistribution0.getSupportLowerBound());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.cumulativeProbability((-824), 0);
      assertEquals(1.0, double0, 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      double double0 = binomialDistribution0.probability(2721);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(314, 1.0);
      double double0 = binomialDistribution0.probability(314);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(314, 1.0);
      double double0 = binomialDistribution0.probability((-1338));
      assertEquals(0.0, double0, 0.01);
      assertEquals(314, binomialDistribution0.getSupportLowerBound());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 1.0);
      double double0 = binomialDistribution0.getProbabilityOfSuccess();
      assertEquals(1.0, double0, 0.01);
      assertEquals(0.0, binomialDistribution0.getNumericalMean(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      int int0 = binomialDistribution0.getNumberOfTrials();
      assertEquals(0, int0);
      assertEquals(0.0, binomialDistribution0.getProbabilityOfSuccess(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BinomialDistribution binomialDistribution0 = new BinomialDistribution(0, 0);
      boolean boolean0 = binomialDistribution0.isSupportConnected();
      assertTrue(boolean0);
      assertEquals(0, binomialDistribution0.getNumberOfTrials());
      assertEquals(0.0, binomialDistribution0.getNumericalMean(), 0.01);
  }
}
