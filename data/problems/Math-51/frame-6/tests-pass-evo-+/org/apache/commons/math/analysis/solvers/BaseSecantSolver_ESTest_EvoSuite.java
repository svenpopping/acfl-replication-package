/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:40:47 GMT 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.function.Acos;
import org.apache.commons.math.analysis.function.Atanh;
import org.apache.commons.math.analysis.function.Cos;
import org.apache.commons.math.analysis.function.Exp;
import org.apache.commons.math.analysis.function.Floor;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.Inverse;
import org.apache.commons.math.analysis.function.Logistic;
import org.apache.commons.math.analysis.function.Logit;
import org.apache.commons.math.analysis.function.Minus;
import org.apache.commons.math.analysis.function.Rint;
import org.apache.commons.math.analysis.function.Sigmoid;
import org.apache.commons.math.analysis.function.Signum;
import org.apache.commons.math.analysis.function.Tan;
import org.apache.commons.math.analysis.function.Tanh;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_EvoSuite extends BaseSecantSolver_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.404307984052299E-9, 2.404307984052299E-9, 2.404307984052299E-9);
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = illinoisSolver0.solve(1371, (UnivariateRealFunction) rint0, (-3786.88149436), 1.375, 0.25, allowedSolution0);
      assertEquals(0.25, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.37493228765575504, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(193.1648137186167, 193.1648137186167, 0.0);
      Rint rint0 = new Rint();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = illinoisSolver0.solve(1573, (UnivariateRealFunction) rint0, (-1.0), (-0.12502530217170715), 0.0, allowedSolution0);
      assertEquals((-0.12502530217170715), double0, 0.01);
      assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3938.01011424182), (-1.0), 1.0);
      Atanh atanh0 = new Atanh();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(849, (UnivariateRealFunction) atanh0, (double) 849, 0.0, 0.14285714285714285, allowedSolution0);
      assertEquals(0.14285714285714285, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      Sigmoid sigmoid0 = new Sigmoid();
      UnivariateRealFunction univariateRealFunction0 = sigmoid0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      double double0 = illinoisSolver0.solve(2117, univariateRealFunction0, 1437.7710570293013, 1437.7710570293013, 1910.0, allowedSolution0);
      assertEquals(1910.0, illinoisSolver0.getStartValue(), 0.01);
      assertEquals(1437.7710570293013, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      Tan tan0 = new Tan();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      regulaFalsiSolver0.solve(387, (UnivariateRealFunction) tan0, 0.0, 0.0, allowedSolution0);
      double double0 = regulaFalsiSolver0.doSolve();
      assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      assertEquals((-404.12085920999994), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.11360916463584658, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      assertEquals((-404.12085920999994), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-2.37830848168842E-7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals((-404.12085920999994), pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.11360916463584658, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      assertEquals((-404.12085920999994), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.4311812240092152), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Logit logit0 = new Logit();
      UnivariateRealFunction univariateRealFunction0 = logit0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      double double0 = pegasusSolver0.solve(1361, univariateRealFunction0, 0.875, (double) 1361, allowedSolution0);
      assertEquals(680.9375, pegasusSolver0.getStartValue(), 0.01);
      assertEquals(0.8796985741143564, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.7966591566283), (double) 1361, allowedSolution0);
      assertEquals(1361.0, pegasusSolver0.getMax(), 0.01);
      assertEquals(0.4445589638733354, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.46110628211600424, 0.46110628211600424, 0.46110628211600424);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      assertEquals((-404.12085920999994), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-0.2495844277941946), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1899.704114), (-1899.704114));
      Tanh tanh0 = new Tanh();
      double double0 = pegasusSolver0.solve(397, (UnivariateRealFunction) tanh0, (-1899.704114), 5.00892307E-315);
      assertEquals((-949.852057), pegasusSolver0.getStartValue(), 0.01);
      assertEquals((-9.510462839617E-312), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.6299605249474366);
      Tan tan0 = new Tan();
      double double0 = illinoisSolver0.solve(25, (UnivariateRealFunction) tan0, (double) (-1240), (double) 25, 0.6299605249474366);
      assertEquals((-1240.0), illinoisSolver0.getMin(), 0.01);
      assertEquals(14.16071202388964, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2836.2242671322238, 2836.2242671322238, 0.5);
      Tan tan0 = new Tan();
      double double0 = illinoisSolver0.solve(25, (UnivariateRealFunction) tan0, 2.318946E-317, (double) 25, 2836.2242671322238);
      assertEquals(25.0, illinoisSolver0.getMax(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
      Logistic logistic0 = new Logistic(0.0, 0.0, 0.0, 0.0, 13, 13);
      double double0 = regulaFalsiSolver0.solve(13, (UnivariateRealFunction) logistic0, (-353.937953856), 1.0, 0.5);
      assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
      assertEquals((-353.937953856), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.875);
      Signum signum0 = new Signum();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      double double0 = pegasusSolver0.solve(1361, (UnivariateRealFunction) signum0, (-2169.24171842), (double) 1361, allowedSolution0);
      assertEquals(1361.0, pegasusSolver0.getMax(), 0.01);
      assertEquals((-0.4311812240092152), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1899.704114), (-1899.704114));
      Tanh tanh0 = new Tanh();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      pegasusSolver0.solve(397, (UnivariateRealFunction) tanh0, (-368.0), 1.5874010519681994, 5.00892307E-315, allowedSolution0);
      double double0 = pegasusSolver0.doSolve();
      assertEquals(1.5874010519681994, pegasusSolver0.getMax(), 0.01);
      assertEquals((-2.350988701644575E-38), double0, 0.01);
  }

}
