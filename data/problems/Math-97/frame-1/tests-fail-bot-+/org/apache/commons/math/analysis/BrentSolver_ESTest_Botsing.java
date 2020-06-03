/*

 * Tue Mar 03 11:45:11 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BrentSolver_ESTest_Botsing extends BrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2389.3043), Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.013586341092351153, 53.7146548115);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(2.8730416917563934E-18, 1.0179152057709042);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.07204422367413922, 0.07204422367413922).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 0.07204422367413922);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 5.580897177827547E-4);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2389.3043), (-1.0));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 3461.3948079);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-6.8135169054611456E16), 1.8616308956552327E-20);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(6.2358905775716E-7, 6.2358905775716E-7).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(6.2358905775716E-7, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 3212.5);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1925.69437901), (-1925.69437901)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.solve(4.999999987376214E-7, 4.999999987376214E-7, 4.999999987376214E-7);
      // Undeclared exception!
      brentSolver0.solve(4.999999987376214E-7, 2024.542);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1529.0464370626466, 1529.0464370626466).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2828.970888179618), 639.125943);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.getMaximalIterationCount();
      // Undeclared exception!
      brentSolver0.solve((double) 100, 3075.627976359011);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2059.6861932798), (-1106.675949265));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 3250.7814113629506);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(1.0, 196.4250455593);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1201.64262898466), (-1201.64262898466)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(344.40669789596234, 3212.5);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-341.95), (-341.95)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve((-3591.55621254244), (-753.9878605988788));
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2110.297575648), 0.0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2919.246233161587, 2919.246233161587).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve((-3592.0), (-753.9878605988788));
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-573.946206762), (-573.946206762)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 3478.085354644895);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = 4.999999987376214E-7;
      // Undeclared exception!
      brentSolver0.solve(0.0, 4.999999987376214E-7);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1459.33), 0.0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1055.5963062), (-1055.5963062)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1055.5963062), (-749.6997912965961));
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 3.75);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 2081.1).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 2081.1);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 2.0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      double double0 = brentSolver0.defaultFunctionValueAccuracy;
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 0.05923451820136496);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 0.6734357878136831);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.solve(4.999999987376214E-7, 4.999999987376214E-7, 4.999999987376214E-7);
      // Undeclared exception!
      brentSolver0.solve(4.999999987376214E-7, 53.7146548115);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.002104282687000776, 13.503384974777862);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1256.795876912107), (-1256.795876912107)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1114.761), (-749.6997912965961));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      brentSolver0.solve((-2664.5), (-457.931714346), (-2664.5));
      // Undeclared exception!
      brentSolver0.solve((-816.8140897809943), (-457.931714346));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(1.1373136150523129, 1773.0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(26.6068430674206, 831.448219144);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1554.477173176137), (-1554.477173176137)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 0.06256899823991167);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-728.75957779), (-728.75957779)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 1611.85957);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.0, 2.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1682.8, 1682.8).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 0.5);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 2081.1).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(2081.1, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.766076704385227E-6, 7.766076704385227E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(7.766076704385227E-6, 13.503384974777862);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 0.0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 5.0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-8.143321646167236), (-8.143321646167236)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 1.0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 0.3836992415666536).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.3836992415666536, 2081.1);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(451.36240967, 451.36240967).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2044.580647768, 2044.580647768).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(52.140061359768964, 2044.580647768);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2077.02988, 2077.02988).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2170.10246622), 0.0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0017658114706545765, 0.0017658114706545765).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2017.6426947957, 2017.6426947957).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2492.6398209), (-1.0));
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2316.672), (-841.088669)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2316.672), (-841.088669));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2576.72683, 2576.72683).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1292.7350304431), (-401.3248319451));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-8.143321646167236), (-8.143321646167236)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-5913.2), (-8.143321646167236));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2009.90058172, 2009.90058172).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2425.0078), 1.0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-843.5553198793626), (-843.5553198793626)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1256.8), (-1256.8)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-5913.2), 1.0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-471.399647171), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 12.115089163020693);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(4.74381477033603E-6, 4.74381477033603E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-4007.06986789446), 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2828.970888179618), 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-918.119790895515), (-549.1235839848534));
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(847.39168, 847.39168).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(847.39168, 1.2868383462578778E14);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(0.0010497042742231952, 1.0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.638182486337719E-4, 2.638182486337719E-4).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 2.638182486337719E-4);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      brentSolver0.getMaximalIterationCount();
      // Undeclared exception!
      brentSolver0.solve((double) 100, 3075.627976359011);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2215.4), (-2215.4)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3268.3725951), (-3268.3725951)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3268.3725951), 397.232262);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 6.205362151601168E-5);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(3.117472237744695E-7, 26.6068430674206);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(680.4574346493922, 1098.337548796);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(93.0, 3644.25706);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-153.626251701124), (-153.626251701124)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-153.626251701124), 2024.542);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-749.3851455787725), (-749.3851455787725)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0179152057709042, 52.65206631831751);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), (-0.6659957783173599));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.1809748886880698E-6, 2.1809748886880698E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0017658114706545765, 0.0017658114706545765).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0017658114706545765, 2857.3864);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-0.9999968362785389), 3.75);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-121.1), (-121.1)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-121.1), 1.0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.5, 1.5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 1.5);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-121.1), (-121.1)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2126.785512), (-2126.785512)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2126.785512), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 0.1271756236260444);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 1.2351577593405293E-6);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1148.023274665581), (-1148.023274665581)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(3.883038352192614E-6, 798.5164916243627);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2044.580647768, Double.POSITIVE_INFINITY).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(2044.580647768, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-240.017617255923), (-240.017617255923)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-240.017617255923), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2389.3043), (-1955.7));
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1427.49479514), (-471.399647171));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1.5022893949289995);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3133.05836042569), 0.0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.766076704385227E-6, 7.766076704385227E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 7.766076704385227E-6);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 13.503384974777862);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3185.32318890099), 0.0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3213.39354), 0.0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      double double0 = brentSolver0.functionValueAccuracy;
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2044.580647768, 2044.580647768).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 2044.580647768);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(52.65206631831751, 639.125943);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.766076704385227E-6, 7.766076704385227E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(275.2690487415667, 275.2690487415667).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 275.2690487415667);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(26.6068430674206, 1632.3175879997439);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(847.39168, 847.39168).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(847.39168, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1916.8943801), (-1916.8943801)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.getMaximalIterationCount();
      // Undeclared exception!
      brentSolver0.solve((double) 100, 3075.627976359011);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1432.7419898, 1432.7419898).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(674.52286288586, 674.52286288586).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(847.39168, 847.39168).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-380.0), (-380.0)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-380.0), 13.503384974777862);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-15, 1.0E-15).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-573.946206762), (-573.946206762)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-573.946206762), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2326.345890380648, 2326.345890380648).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-5913.2), 1.0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 2167.784652925626);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.5, 1.5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.5, 549.7707);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(14.0625, 14.0625).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.008023610163971887, 5.0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = brentSolver0.absoluteAccuracy;
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 1703.997339185);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-342.4344717998123), (-342.4344717998123)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(13.503384974777862, 269.77721532);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2828.970888179618), (-69.5));
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(741.60798, 0.5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.5, 741.60798);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-249.0), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(288.009826, 288.009826).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 549.7707);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-4007.06986789446), 0.5);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2110.297575648), (-249.0));
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 1978.15130832837);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.getRelativeAccuracy();
      // Undeclared exception!
      brentSolver0.solve((double) (-1227), 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0, 1.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(quinticFunction0);
      BrentSolver brentSolver0 = new BrentSolver(monitoredFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 2741.0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2.811569464560887), 0.0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2126.785512), (-2126.785512)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 1.0E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-216.540994933), 0.0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 3.75);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-17.97383760611229), 0.0);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.1506233345629594, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-456.0), (-456.0)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(4.999999987376214E-7, 53.7146548115);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2501.409166269), (-2501.409166269)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-240.518177899), (-240.518177899)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-240.518177899), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-14, 0.008023610163971887);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-153.626251701124), (-153.626251701124)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.013586341092351153, 53.7146548115);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.883038352192614E-6, 3.883038352192614E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(3.883038352192614E-6, 639.231);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1948526.568989568, 1948526.568989568).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.004604006653747127, 0.004604006653747127).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 1.0E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1037.0623730061686), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2425.0078), (-1.0));
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0, 2167.784652925626);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2316.672), (-841.088669));
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1098.5077843418221, 1611.85957);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1889.10512832955, 1889.10512832955).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(834.7794744, 3547.8398501734127);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-281.9385744733144), (-281.9385744733144)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-7.989774639625443), 0.0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.2655616063993222, 397.232262);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3195.760155892381), 21.13512496040496);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(1.0, 1975.981202068664);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 831.448219144);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 2747.0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1682.8, 1682.8).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1918.4158922758), 1682.8);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1682.8, 1682.8).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 1682.8);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(153.82417976886, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(940.7784035354, 1184.0546604908);
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2126.785512), (-2126.785512)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, (-2126.785512));
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 2.0);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((-240.017617255923), 2424.0);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 1.0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(5.680834966665533E-7, 5.680834966665533E-7).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.5668670227232764E-4, 2.5668670227232764E-4).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.766076704385227E-6, 7.766076704385227E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 7.766076704385227E-6);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(275.2690487415667, 275.2690487415667).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1.0);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(847.39168, 847.39168).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 847.39168);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 2081.1).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 2081.1);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3268.3725951), (-2069.5524912109854)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3268.3725951), (-2069.5524912109854));
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), (-0.10950682045167079));
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1055.5963062), (-1055.5963062)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1114.761), (-1055.5963062));
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 3.9667466966845435);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.766076704385227E-6, 0.5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(7.766076704385227E-6, 0.5);
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 0.3836992415666536).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.3836992415666536, (double) 493);
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 834.7794744);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 1.0179152057709042);
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(544.92, 544.92).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-240.518177899), (-240.518177899)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-240.518177899), 397.232262);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-185.0), (-185.0)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-185.0), 13.503384974777862);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-6.0883131274708576E16), (-113.3));
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 1.0E-6).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(3.16379058251659E-6, 3116.53139854);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1037.0623730061686), 0.0);
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 5.0);
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(1501.3125023650184, 1975.981202068664);
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2609.4), (-2609.4)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2609.4), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1316.4542786178313);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1759.721916), (-1759.721916)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(153.82417976886, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 0.19710024515933977);
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2081.1, 2081.1).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(2081.1, 1.2868383462578778E14);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2644.697480648), (-2644.697480648)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(741.60798, 741.60798).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-8.143321646167236), 741.60798);
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(279.865391978009, 3481.0);
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.5785239255328576), 0.0);
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3268.3725951), (-3268.3725951)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3268.3725951), (-2746.345));
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 2507.20194);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(2.1309261717361694, 6.0883132077714976E16);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 0.15005443902171958);
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2316.672), (-842.1268586154554)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2316.672), (-842.1268586154554));
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.2655616063993222, 1268.02419121281);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 1392.0418972147713);
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.5, 0.7150129602253287);
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.2655616063993222, 397.232262);
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-4244.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-14, 1.0E-14).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(9.055265916636551E-7, 0.7663298016078913);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2044.580647768, 2044.580647768).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.0, 2044.580647768);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(249.0, 3211.0873673943593);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.75, 3.75).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(2.024465549032385E-7, 475.25755);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-15, 1720.5709167);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.17076351557337227, 0.17076351557337227).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(0.17076351557337227, 1.2868383462578778E14);
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(523.2388, 523.2388).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 523.2388);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((-705.9135684802619), 588.56261);
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2398.0), (-2398.0)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.578524), 0.0);
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1459.33), (-2.3396673980941594));
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1280.03269176), 337.792205670119);
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(4.999999987376214E-7, 2024.542);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-1.0), 1.0);
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1045.0, 1813.0);
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-237.23361618386), (-237.23361618386)).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-5641.21827931116), (-0.0780659503429359));
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((-2776.835259626739), (-742.670036131));
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-153.626251701124), (-153.626251701124), (-153.626251701124), 0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.solve((-153.626251701124), (-153.626251701124), (-153.626251701124));
      // Undeclared exception!
      brentSolver0.solve((-153.626251701124), 2024.542);
  }
}
