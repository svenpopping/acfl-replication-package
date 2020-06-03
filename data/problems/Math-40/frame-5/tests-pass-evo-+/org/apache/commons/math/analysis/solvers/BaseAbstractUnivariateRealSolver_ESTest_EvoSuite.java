/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:35:42 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cosh;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractUnivariateRealSolver_ESTest_EvoSuite extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-1170.464162));
      laguerreSolver0.verifySequence((-1170.464162), (-374.0338353325107), (-167.7073092205318));
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.verifyInterval(0.0, 1.0E-14);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Inverse inverse0 = new Inverse();
      MullerSolver mullerSolver0 = new MullerSolver();
      mullerSolver0.solve(4519, (UnivariateFunction) inverse0, 0.0, 3.1968677404735245E92);
      mullerSolver0.incrementEvaluationCount();
      assertEquals(1.5984338702367622E92, mullerSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1085.637754);
      Signum signum0 = new Signum();
      secantSolver0.setup(5026, signum0, (-1.0), 1.129833459854126, 1.129833459854126);
      assertEquals(1085.637754, secantSolver0.getAbsoluteAccuracy(), 0.01);
      
      secantSolver0.doSolve();
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-78.5735883255103));
      boolean boolean0 = laguerreSolver0.isSequence((-78.5735883255103), 0.0, 3510.69713);
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-78.5735883255103), laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Atanh atanh0 = new Atanh();
      UnivariateFunction univariateFunction0 = atanh0.derivative();
      bracketingNthOrderBrentSolver0.setup(0, univariateFunction0, 0, 1501.9703418995, 1601.6665502174792);
      boolean boolean0 = bracketingNthOrderBrentSolver0.isBracketing(0, 1501.9703418995);
      assertEquals(1.0E-15, bracketingNthOrderBrentSolver0.getFunctionValueAccuracy(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0E-6, bracketingNthOrderBrentSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, bracketingNthOrderBrentSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(1.0E-14, 3059.153029625116);
      laguerreSolver0.getMaxEvaluations();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(3059.153029625116, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(4.738967136638846);
      laguerreSolver0.getEvaluations();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(4.738967136638846, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(5673.91134537);
      Exp exp0 = new Exp();
      newtonSolver0.setup(3519, exp0, 316.3, 316.3, 5673.91134537);
      double double0 = newtonSolver0.computeObjectiveValue((-1743.238106904869));
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0E-15, newtonSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, newtonSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(5673.91134537, newtonSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(7.221902646057552E211, 7.221902646057552E211, 4519);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(4519, (UnivariateFunction) inverse0, (-1.0672213971363184E-7), 19.371407224550524, allowedSolution0);
      double double0 = bracketingNthOrderBrentSolver0.computeObjectiveValue(0.0);
      assertEquals(9.685703558914192, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(1.0E-14);
      laguerreSolver0.getMin();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.9145394802202504);
      laguerreSolver0.getMax();
      assertEquals(1.0E-15, laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(0.9145394802202504, laguerreSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.0E-14);
      Cosh cosh0 = new Cosh();
      DifferentiableUnivariateFunction differentiableUnivariateFunction0 = cosh0.derivative();
      secantSolver0.solve(467, (UnivariateFunction) differentiableUnivariateFunction0, 0.0, 1325.825351150035, 1325.825351150035);
      double double0 = secantSolver0.computeObjectiveValue((-2229.6));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.0E-14, secantSolver0.getAbsoluteAccuracy(), 0.01);
      assertEquals(1.0E-14, secantSolver0.getRelativeAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(5951.63239990959, (-1.3108606792380822E-9), (-1.3108606792380822E-9));
      double double0 = laguerreSolver0.getAbsoluteAccuracy();
      assertEquals((-1.3108606792380822E-9), laguerreSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(5951.63239990959, laguerreSolver0.getRelativeAccuracy(), 0.01);
      assertEquals((-1.3108606792380822E-9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.3549294842158386, 1.3549294842158386);
      secantSolver0.isSequence(1.3549294842158386, 1.3549294842158386, 1.3549294842158386);
      assertEquals(1.0E-15, secantSolver0.getFunctionValueAccuracy(), 0.01);
      assertEquals(1.3549294842158386, secantSolver0.getRelativeAccuracy(), 0.01);
      assertEquals(1.3549294842158386, secantSolver0.getAbsoluteAccuracy(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(7.221902646057552E211, 7.221902646057552E211, 4519);
      Inverse inverse0 = new Inverse();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(4519, (UnivariateFunction) inverse0, (-1.0672213971363184E-7), 0.0, allowedSolution0);
      boolean boolean0 = bracketingNthOrderBrentSolver0.isBracketing(0, 0.5);
      assertEquals((-5.336106985681592E-8), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
      assertFalse(boolean0);
  }
}
