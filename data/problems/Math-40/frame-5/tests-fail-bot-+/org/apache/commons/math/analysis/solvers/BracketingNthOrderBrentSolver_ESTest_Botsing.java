/*

 * Tue Mar 03 11:29:46 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BracketingNthOrderBrentSolver_ESTest_Botsing extends BracketingNthOrderBrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) expm1Function0, (double) (-27), (double) 3, 0.0625, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-3998.6), (-3998.6), 1018);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(1018, (UnivariateFunction) expm1Function0, (-3998.6), (double) 1018, (-774.03245), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.23), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 8, (-119.23), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.09898401940673), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-87.09166813016827), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.22964920829226), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.112), (double) 8, (-119.22964920829226), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sincFunction0, Double.NaN, (double) (-27), (-229.874548), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.229649), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-118.7622616252246), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sincFunction0, (-63777.94468181319), 1.0E-6, (-3207.94006382181), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-1244.0875765088), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-154.01223721191218), 39.839435789024705, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 8.857913764134821, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.2296492083), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 8, (-119.2296492083), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (double) (-2902), (double) 5, (-57.29), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-117.87778918818309), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.2296492), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-673.9322670460537), 4);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) quinticFunction0, (-673.9322670460537), (double) 2000, 8.000730132954145E-4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1), 4);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) quinticFunction0, (-673.9322670460537), (double) 2000, 8.000730132954145E-4, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-120.60461947331557), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.2296492083), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 25.21921418530828, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 38.360893796436756, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sincFunction0, Double.NaN, 40.19140625, (-229.874548), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 62.44122472884989, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (double) (-2902), (double) 5, (-1127.0155867), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(229, (UnivariateFunction) expm1Function0, (-5367.42364599592), 527.2970943054721, 482.5776069276417, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.0), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 8, (-119.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) sincFunction0, (-4.17819), 8.000730132954145E-4, (double) (-1), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(229, (UnivariateFunction) expm1Function0, (-5367.42364599592), 527.2970943054721, 480.62084440825, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.0), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.2296492083), 26.430260967716443, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.22964920829226), 33);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(33, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 33, (-119.22964920829226), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.22964920829), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 8, (-119.22964920829), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-5069.573830386852), 4);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) quinticFunction0, (-5069.573830386852), (double) 2000, (-673.9322670460537), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-673.9322670460537), 4);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) quinticFunction0, (-5069.573830386852), (double) 2000, (-673.9322670460537), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.23), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-116.71006948417049), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-1.0218841987301478E9), 40.191, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 40.191, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (double) (-2902), 489.708, (-57.29), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-117.33995524858497), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 29.273923948298496, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), (double) 5, (double) (-27), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-141.45904122526107), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.22964920829226), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.1123094297063), (double) 8, (-119.22964920829226), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.22964920829226), 1964.8450470985044, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-119.65657130829824), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-119.22964920829226), 8);
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(8, (UnivariateFunction) expm1Function0, (-2550.0), (double) 8, (-119.22964920829226), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-118.855152368684), 40.19140625, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-67.63332559554688), (-67.63332559554688), (-67.63332559554688), 3);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(3, (UnivariateFunction) expm1Function0, (-67.63332559554688), 91.37569418622888, (double) 3, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      Expm1Function expm1Function0 = new Expm1Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-126.58432527755394), 40.19140625, (double) 5, allowedSolution0);
  }
}
