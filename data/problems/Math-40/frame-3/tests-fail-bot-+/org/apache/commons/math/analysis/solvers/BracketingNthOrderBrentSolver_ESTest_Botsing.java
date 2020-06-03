/*

 * Tue Mar 03 11:29:27 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BracketingNthOrderBrentSolver_ESTest_Botsing extends BracketingNthOrderBrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (-1.0), (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-416.337746249355), (double) 5);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-402.401975296097), (double) 5);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-0.9555119624458702), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.value((-782.578052771));
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-1.0), (double) 5);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, Double.NaN, (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.63183272129), (double) 5);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2927.8053613600755), (-2927.8053613600755), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 2558.65047036306, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.6), (double) 5);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (-1.0), (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (-1.0), (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, 1.0, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), 1.0, 1.0, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(38, (UnivariateFunction) expm1Function0, (-407.2962087974955), (double) 38);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-0.9555119624458702), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-402.2494971758766), (double) 5);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-377.9521534213271), (double) 5);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.47758748440873), (double) 5);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2953.0), (-2953.0), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-196.9459844921347), (double) 5);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(6, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 6);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(18, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 18);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2953.0), (-2953.0), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.4673144817352295, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (-1.0), (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), (-2932.2959158473464), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.4673144817352295, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (double) 5, 1451.05, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2927.8053613600755), (-2927.8053613600755), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 2558.65047036306, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2953.0), 0.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-394.80158610012217), (double) 5);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (-1.0), 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), 1.0, 1.0, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), 0.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), (-2932.2959158473464), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.4673144817352295, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-400.84054643177285), (double) 5);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), 0.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2927.8053613600755), 0.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 2558.65047036306, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.6318), (double) 5);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(29, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 29);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, 1.0, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 5);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-410.1023885563009), (double) 5);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-38.070571), (double) 5);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-394.7179754205102), (double) 5);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-402.3117271257472), (double) 5);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, Double.NaN, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-421.40989617893007), (double) 5);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-0.9555119624458702), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(9, (UnivariateFunction) expm1Function0, (-402.12507883733673), (double) 9);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), (-2932.2959158473464), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), (-2932.2959158473464), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), (-2932.2959158473464), 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, (double) 2, 2561.494, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(9, (UnivariateFunction) expm1Function0, (-401.51453985037733), (double) 9);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, 1.0, (double)5, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), 1.0, 1.0, 1.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (-0.9555119624458702), (-0.9555119624458702), (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, Double.NaN, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, Double.NaN, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), Double.NaN, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-0.9555119624458702), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-424.86244501219295), (double) 5);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) sinFunction0, (double) 5, 1143.6142118305484);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-423.87438957532504), (double) 5);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, Double.NaN, Double.NaN, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-1.0), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (-1.0), Double.NaN, Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-396.4040806961482), (double) 5);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-405.33877366127217), (double) 5);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, Double.NaN, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(17, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 17);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, (double)5, (-0.9555119624458702)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(10, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 10);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2932.2959158473464), 0.0, 2);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, (UnivariateFunction) xMinus5Function0, 0.0, 740.2567062);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, (double)5, (-1.0), Double.NaN).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, Double.NaN, (-1.0), allowedSolution0);
  }
  
  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) expm1Function0, (-401.6318327212864), (double) 4);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)5, (-0.9555119624458702), (double)5, 1.0, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, (UnivariateFunction) expm1Function0, (-401.63), (double) 5);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (double)5, 1.0, (double)5, (double)5).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(5, univariateFunction0, 1.0, (double) 5, allowedSolution0);
  }
}
