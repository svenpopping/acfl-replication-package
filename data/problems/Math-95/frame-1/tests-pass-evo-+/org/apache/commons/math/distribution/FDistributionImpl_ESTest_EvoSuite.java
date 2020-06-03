/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:46:03 GMT 2020
 */

package org.apache.commons.math.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.distribution.FDistributionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FDistributionImpl_ESTest_EvoSuite extends FDistributionImpl_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(6.283185307179586, 6.283185307179586);
      double double0 = fDistributionImpl0.getInitialDomain(6.283185307179586);
      assertEquals(6.283185307179586, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.46694220692426, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.getInitialDomain((-0.4919138160976202));
      assertEquals((-1.0), double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      fDistributionImpl0.getDomainUpperBound((-800.23));
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.getDomainLowerBound((-1.643181065367639E-4));
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2030.6, 1.0E-15);
      double double0 = fDistributionImpl0.cumulativeProbability(1.0E-15);
      assertEquals((-3.057554209817681E-13), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      fDistributionImpl0.setDenominatorDegreesOfFreedom(1.0);
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1176.66844205, 1176.66844205);
      fDistributionImpl0.setNumeratorDegreesOfFreedom(1176.66844205);
      assertEquals(1176.66844205, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1176.66844205, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.cumulativeProbability((-0.4919138160976202));
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(1.0, 1.0);
      double double0 = fDistributionImpl0.getDenominatorDegreesOfFreedom();
      assertEquals(1.0, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2030.6, 1.0E-15);
      double double0 = fDistributionImpl0.getNumeratorDegreesOfFreedom();
      assertEquals(1.0E-15, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(2030.6, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2490.4, 2490.4);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(1.0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertEquals(2490.4, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
      assertEquals(2490.4, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(0.5, 0.5);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.0);
      assertEquals(0.5, fDistributionImpl0.getNumeratorDegreesOfFreedom(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.5, fDistributionImpl0.getDenominatorDegreesOfFreedom(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(8.189091901, 8.189091901);
      double double0 = fDistributionImpl0.inverseCumulativeProbability(0.9966148442029658);
      assertEquals(8.189092086898317, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FDistributionImpl fDistributionImpl0 = new FDistributionImpl(2.0124632641783275, 2.0124632641783275);
      double double0 = fDistributionImpl0.cumulativeProbability(2.0124632641783275);
      assertEquals(0.6686463421613824, double0, 0.01);
  }
}
