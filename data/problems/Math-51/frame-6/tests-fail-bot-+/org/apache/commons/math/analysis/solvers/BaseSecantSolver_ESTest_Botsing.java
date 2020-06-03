/*

 * Tue Mar 03 11:33:23 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_Botsing extends BaseSecantSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06666666666666667, (double) 4, 0.06666666666666667);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.11764700710773468, (double) 4, 0.11764700710773468);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2242.7892), 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 9.90703783240474, 9.90703783240474);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-3426.802346156), 2046.957306721, (-3426.802346156));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-433));
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (double) (-433), (double) 5, (-1666.8281743279717));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (double) (-1), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-3426.802346156), 2046.957306721, 2046.957306721);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.9221112940416807, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2725.02711995835));
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) sincFunction0, (-2725.02711995835), 1.0, (-2725.02711995835));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5, 5);
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (-1664.514762938), 732.7693598053, (-1664.514762938));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-0.6768565262564803), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-725.5562033), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      illinoisSolver0.solve(1023, (UnivariateRealFunction) expm1Function0, (-0.003820495402352907), (double) 1023, (double) 1023);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2242.7892), (-2242.7892), 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, (-2242.7892));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.1063317460189, 671.1063317460189);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 1.0E-6, 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06666667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2012.2342221943816, 2012.2342221943816);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      illinoisSolver0.solve(2077, (UnivariateRealFunction) expm1Function0, (-0.2499999701976776), 2012.2342221943816, 2012.2342221943816);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(671.27, 671.27, 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (double) 2, 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sincFunction0, (double) (-1569), (double) 2, 1359.5695982429124);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(5);
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) monitoredFunction0, (double) 5, 1159.0927, 1159.0927);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 1.0E-6, 671.27, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-3426.802346156), (double) 4, (-3426.802346156));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.11764700710773468, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-13.334438660971044), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.0667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-433));
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (double) (-433), (double) 5, (double) 5);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-0.5528964029194903), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(6, (UnivariateRealFunction) sincFunction0, 0.06666666666666667, (double) 6, (double) 6);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(2012.2342221943816, (-1649.84143));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      illinoisSolver0.solve(2077, (UnivariateRealFunction) expm1Function0, (-1649.84143), 2012.2342221943816, 2012.2342221943816);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) sincFunction0, (double) 5, 162753.79141900392, (double) 5);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-5305.06972178673));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(2198, (UnivariateRealFunction) expm1Function0, (-5305.06972178673), (double) 2198, (double) 2198);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-1.182879616798944E-13), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-5304.764454753567));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(2198, (UnivariateRealFunction) expm1Function0, (-5304.764454753567), 1024.0, (double) 2198);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.3972890331221586, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06666666667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.11764700710773468, 2046.957306721, 2046.957306721);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, (-2242.7892));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-433));
      // Undeclared exception!
      illinoisSolver0.solve(5, (UnivariateRealFunction) expm1Function0, (double) (-433), (double) 5, (-1664.514762938));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (double) 2, 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (double) 2, 9.90703783240474, 9.90703783240474);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-3426.802346156), 2046.957306721, (double) 4);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-5305.06972178673));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(2198, (UnivariateRealFunction) expm1Function0, (-5305.06972178673), 1024.0, (double) 2198);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sincFunction0, (double) (-1569), (double) 2, (double) 2);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.0666667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.067, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-2.1396097944122032), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06666666666667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-0.31144575473968533), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2242.7892), (-2242.7892), 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 9.90703783240474, 9.90703783240474);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-3426.802346156), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 1.4966987014351318, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      illinoisSolver0.getMaxEvaluations();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (double) 0, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.06666666666666667, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-20.6560521904024), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.0, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(671.1063317460189);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 9.90703783240474, 9.90703783240474);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (double) 2, 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.11764700710773468, 2046.957306721, 0.11764700710773468);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-19.659590963180527), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 1024.9830062764738, 2046.957306721, 1024.9830062764738);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (-1.06167928950712), (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(671.27, 671.27, 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 1.0E-6, 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 1.0E-6, 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver((-2242.7892), 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, (-2242.7892), 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 0.058127127626267525, 671.27, 671.27);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.1, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(6, (UnivariateRealFunction) sincFunction0, 0.0666666666667, (double) 6, (double) 6);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-5304.764454753567));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      pegasusSolver0.solve(2198, (UnivariateRealFunction) expm1Function0, (-5304.764454753567), (double) 2198, (double) 2198);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(671.27, 671.27, 671.27);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      illinoisSolver0.solve(2, (UnivariateRealFunction) sinFunction0, 1.0E-6, 671.27, (double) 2);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.030247581253783448, (double) 4, (double) 4);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, (double) (-2133014017), (double) 4, (double) (-2133014017));
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.11764700710773468, 2046.957306721, (double) 4);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      IllinoisSolver illinoisSolver0 = new IllinoisSolver();
      // Undeclared exception!
      illinoisSolver0.solve(4, (UnivariateRealFunction) sincFunction0, 0.5236028575025845, (double) 4, (double) 4);
  }
}
