/*

 * Tue Mar 03 11:33:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
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
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3, (UnivariateRealFunction) expm1Function0, (-1248.142), 451.915, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3, (UnivariateRealFunction) sinFunction0, (-1248.142), 451.915, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3, (UnivariateRealFunction) expm1Function0, (-1067.248970972), 451.915, (-1067.248970972), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, (double) 4, 2792.0, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (double) 218, 1284.434, (double) 218, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3, (UnivariateRealFunction) expm1Function0, (-1067.248970972), 451.915, (double) 3, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1825, univariateRealFunction0, (-2223.381486339576), (double) 1825, (-2223.381486339576), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(189, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, (-51.8682626), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1825, univariateRealFunction0, (-2223.381486339576), (double) 1825, (double) 1825, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(189, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, (double) 189, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1825, univariateRealFunction0, (-2223.381486339576), (double) 1825, (double) 1825, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 0.5, (double) 4, 0.5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, (-51.8682626), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (double) 218, 1284.434, 1284.434, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (double) 218, 1284.434, (double) 218, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, (double) 218, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(4, (UnivariateRealFunction) sinFunction0, 0.5, (double) 4, (double) 4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(189, (UnivariateRealFunction) sinFunction0, (-51.8682626), (double) 189, (double) 189, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(1137, (UnivariateRealFunction) expm1Function0, (-0.1768056585769641), (double) 1137, 914.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(1137, (UnivariateRealFunction) expm1Function0, (-0.1768056585769641), (double) 1137, (double) 1137, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(3, (UnivariateRealFunction) expm1Function0, (-1067.248970972), 451.915, 451.915, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1806, univariateRealFunction0, (-2223.381486339576), (double) 1806, (-2223.381486339576), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (double) 218, 1284.434, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      regulaFalsiSolver0.solve(1806, univariateRealFunction0, (-2223.381486339576), (double) 1806, (double) 1806, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(1137, (UnivariateRealFunction) expm1Function0, (-0.1768056585769641), (double) 1137, (-0.1768056585769641), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      illinoisSolver0.solve(218, (UnivariateRealFunction) sinFunction0, (-51.8682626), 1284.434, 1284.434, allowedSolution0);
  }
}
