/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:37:28 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Constant;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractUnivariateRealSolver_ESTest_EvoSuite extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1396.7285, 0.0, 36);
      bracketingNthOrderBrentSolver0.verifySequence(0.0, 620.610642, 1396.7285);
      assertEquals(0.0, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1396.7285, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-24.3811), (-24.3811));
      mullerSolver0.verifyInterval((-1101.031856362988), (-24.3811));
      assertEquals((-24.3811), mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals((-24.3811), mullerSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-1549.059), (-1549.059));
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      laguerreSolver0.setup(260, polynomialFunction0, (-4587.419), 0.09090909090909091, (-648.6584377348));
      laguerreSolver0.incrementEvaluationCount();
      assertEquals(0.09090909090909091, laguerreSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6, 1.0E-6);
      boolean boolean0 = secantSolver0.isSequence(0.0, 1.0E-6, 832.8717199392);
      assertEquals(1.0E-6, secantSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0E-6, secantSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(4213.92137064);
      mullerSolver0.isSequence(4213.92137064, 0.0, 0.0);
      assertEquals(1.0E-14, mullerSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(4213.92137064, mullerSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, mullerSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6, 1.0E-6);
      Rint rint0 = new Rint();
      secantSolver0.setup(53, rint0, 0.0, 53, 1.0E-6);
      secantSolver0.isBracketing(1.0E-6, 1.0E-6);
      assertEquals(53.0, secantSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-1549.059), (-1549.059));
      double[] doubleArray0 = new double[5];
      doubleArray0[0] = (double) 260;
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      laguerreSolver0.setup(260, polynomialFunction0, (-4587.419), 0.09090909090909091, (-648.6584377348));
      laguerreSolver0.isBracketing((-1549.059), (-1549.059));
      assertEquals(0.09090909090909091, laguerreSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-1868.6));
      double[] doubleArray0 = new double[2];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      laguerreSolver0.solve(5, polynomialFunction0, (-1406.74), 5.0);
      laguerreSolver0.getEvaluations();
      assertEquals(5.0, laguerreSolver0.getMax(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6, 1.0E-6);
      Rint rint0 = new Rint();
      secantSolver0.setup(53, rint0, 0.0, 53, 1.0E-6);
      double double0 = secantSolver0.computeObjectiveValue(609.273674229706);
      assertEquals(53.0, secantSolver0.getMax(), 0.01);
      assertEquals(609.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double0 = laguerreSolver0.getMin();
      assertEquals(1.0E-6, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2092.703857136742);
      double double0 = laguerreSolver0.getRelativeAccuracy();
      assertEquals(1.0E-14, double0, 0.01);
      assertEquals(2092.703857136742, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(Double.NaN, 0.0);
      double double0 = laguerreSolver0.getMax();
      assertEquals(Double.NaN, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0, 2581.89022796);
      double double0 = laguerreSolver0.getStartValue();
      assertEquals(0.0, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(2581.89022796, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-619.84029811), (-619.84029811));
      brentSolver0.getMaxEvaluations();
      assertEquals((-619.84029811), brentSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-619.84029811), brentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-15, brentSolver0.getFunctionValueAccuracy(), 0.01);
  }
}
