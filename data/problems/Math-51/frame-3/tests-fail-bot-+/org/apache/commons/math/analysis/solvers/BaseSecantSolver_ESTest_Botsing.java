/*

 * Tue Mar 03 11:30:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_Botsing extends BaseSecantSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), (-1.0), (-3264.592008312156));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.0535554606063), (-2576.0535554606063));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), 738.4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), 14.17152821810263, (double) 2343);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), 1.0, (double) 2343);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      SincFunction sincFunction0 = new SincFunction();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-2576.0535554606063), 1194.96, (-2576.0535554606063), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), (-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), (-1.0), (double) 2343);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.0535554606063), (-2576.0535554606063));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
      // Undeclared exception!
      regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sincFunction0, (double) 3, (double) 236, (double) 236);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.0535554606063), (-2576.0535554606063));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), 1724.1589854593997, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) sincFunction0, (-1385.038907), (double) 5);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), 1.0, (-1.0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-175.31090383593335), 76);
      // Undeclared exception!
      pegasusSolver0.solve(76, (UnivariateRealFunction) expm1Function0, (-175.31090383593335), 2075.4975118522757, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      pegasusSolver0.solve(266, (UnivariateRealFunction) expm1Function0, (-6.87180534837331), (double) 266, (-6.87180534837331));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      pegasusSolver0.solve(19, (UnivariateRealFunction) quinticFunction0, (-1354.71703099), 2072.3903106, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.0535554606063), (-2576.0535554606063));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
      // Undeclared exception!
      regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sincFunction0, (double) 3, (double) 236, 0.5);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.053555), (-2576.053555));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.053555), (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      // Undeclared exception!
      pegasusSolver0.solve(65, (UnivariateRealFunction) expm1Function0, (-6.87180534837331), (double) 65, (-6.87180534837331));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.053555), (-2576.053555));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.053555), 738.4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5);
      // Undeclared exception!
      regulaFalsiSolver0.solve(3, (UnivariateRealFunction) sincFunction0, (double) 3, (double) 236, (double) 3);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(75, (UnivariateRealFunction) expm1Function0, (-6.87180534837331), (double) 75, (-6.87180534837331));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2576.0535554606063), (-2576.0535554606063));
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) quinticFunction0, (-2576.0535554606063), (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      pegasusSolver0.setup(703, monitoredFunction0, 0.5, 703, 703);
      pegasusSolver0.doSolve();
      pegasusSolver0.getEvaluations();
      pegasusSolver0.solve(20, (UnivariateRealFunction) sinFunction0, 114.0, (double) 703, (double) 703);
      // Undeclared exception!
      pegasusSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      PegasusSolver pegasusSolver0 = new PegasusSolver((-1354.71703099), 0.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      pegasusSolver0.solve(19, (UnivariateRealFunction) quinticFunction0, (-1354.71703099), 2072.3903106, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0), (-3264.592008312156));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      regulaFalsiSolver0.solve(2343, (UnivariateRealFunction) sincFunction0, (-3264.592008312156), 1.0, (-3264.592008312156));
  }
}
