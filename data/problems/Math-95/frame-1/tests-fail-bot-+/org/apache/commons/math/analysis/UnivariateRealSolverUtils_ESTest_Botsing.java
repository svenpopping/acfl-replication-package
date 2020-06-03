/*

 * Tue Mar 03 11:43:08 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class UnivariateRealSolverUtils_ESTest_Botsing extends UnivariateRealSolverUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, (double) 1171, 0.0, 1171);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 399, (double) 399, (double) 399, 399);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1047, (double) 1047, (double) 1047, 1047);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1410.431753), (-1410.431753), (-1410.431753));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-2103.15445), Double.NaN, (-2107.39), 2628);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 37.4, (double) 379, (double) 379, 379);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, 1.0, (double) 2892, 2892);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3055.4766358206), (-3055.4766358206), (-3055.4766358206), 1641);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1929, 1883.46054616849, 1883.46054616849, 1929);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, (double) 1822, (double) 1822, 1822);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 390, (double) 390, (double) 390, 390);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 693.0, 693.0, 693.0, 2145671652);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.6984112070141238, 0.6984112070141238, 0.6984112070141238, 407);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 414);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.0, 37.0, 37.0, 379);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 3518);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1929, (double) 1929, (double) 1929, 1929);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 3105, (double) 3105, (double) 3105, 3105);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.NaN, 0.0, 0.0, 1822);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 384, (double) 384, (double) 384, 384);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1954, (double) 1954, (double) 1954, 1954);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, (double) 1171, (double) 1171, 1171);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.POSITIVE_INFINITY, (double) 3653, (double) 3653, 3653);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-1195.1763), 0.0, (-1195.1763));
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 3);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) 1058, (double) 1058, (double) 1058, 1058);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 568.84, 568.84, 568.84, 1);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1564.5), (-1564.5), (-1564.5), 1954);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 32.36574615806931, 32.36574615806931, 32.36574615806931, 379);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0), (-1.0), (-1.0), 675);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 2892);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.NaN, 0.0, (double) 0, 2146667227);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 1046, (double) 1046, (double) 1046, 1046);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, (double) 396, (double) 396, 396);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.9838977740901003, 0.9838977740901003, 0.9838977740901003, 1061);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1073, (double) 1073, (double) 1073, 1073);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 1);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2925.943, 2925.943, 2925.943, 2144621332);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-473.316197530455), (-473.316197530455), (-473.316197530455), 3624);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2936.2509291), (-2936.2509291), (-2936.2509291), 513);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) (-2462), (double) (-2462), (double) (-2462), 100);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 568.84, 568.84, 568.84, 1);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0), (-1.0), (-1.0), 1879048192);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 379, (double) 379, 37.4, 379);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 33.0394012178856, 33.0394012178856, 33.0394012178856, 379);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, 37.4, 37.4, 346);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1171);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 195, (double) 195, (double) 195, 195);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 2887, (double) 2887, 13.68814370368849, 2887);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.9838977740901003, 0.9838977740901003, 0.9838977740901003);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 298);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100, (double) 100, (double) 100, 100);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) Integer.MAX_VALUE, 37.4, (double) 396, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1058, (double) 1058, (double) 1058, 1058);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, 1787.559778100186);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction1, 1787.559778100186, 0.0, 0.0, 3);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealSolverUtils.midpoint((-1671.45), (-1671.45));
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1671.45), (-1671.45), (-1671.45));
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, 0.5, 0.5, 515);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 10, 0.0, 0.0, 10);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1677.9213971502), 1.0, (-1677.9213971502), 414);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) 102, (double) 102, (double) 102, 102);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.NaN, (-2107.39), (-2107.39), 1);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, (-447.42214), 3653);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 2, (double) 2, (double) 2, 2);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1044, (double) 1044, (double) 1044, 1044);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.25, 0.25, 0.25, 4408);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 639.35, 639.35, 639.35, 1822);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 0.0, 0.0, 1822);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 219, (double) 219, (double) 219, 219);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1883.46054616849, 1883.46054616849, 1883.46054616849, 1929);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2710.50507841, 2710.50507841, 2710.50507841, 8);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint(389, 389);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) 389, (double) 389, 389.0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-298.7673), 37.4, (double) 379, 379);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 1.0, 0.0, 3653);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, (double) 379, (double) 379, 379);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 37.4, (double) 379, 37.4, 379);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) (-861), (double) (-861), (double) (-861));
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 212.709021, 212.709021, 212.709021, 1954);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 2043.66446, 2043.66446, 2043.66446, 3653);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, 37.4, 37.4, 379);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-98.9112964617), (-98.9112964617), (-98.9112964617));
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 396, 37.4, 37.4, 396);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 414, 1.0, 1.0, 414);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 418, (double) 418, (double) 418, 418);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-474.1926576383373), (-474.1926576383373), (-474.1926576383373), 3624);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 1.0, 1.0, 1.0, 3653);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2484.26606526), (-2484.26606526), (-2484.26606526));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-474.1926576383373), (-474.1926576383373), (-474.1926576383373), 3624);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, (double) 1822, (double) 1822, 1822);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 3653);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-2103.15445), (-2103.15445), (-2103.15445), 2628);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, (double) 363, (double) 363, 363);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 10.0, 10.0, 10.0, 2759);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 219, (double) 219, (double) 219);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 431);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 520.9458999, 520.9458999, 520.9458999, 2);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 396, (double) 396, (double) 396, 396);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1564.5), (-1564.5), (-1564.5), 396);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 2146802256);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-9.278216013906098), (-9.278216013906098), (-9.278216013906098));
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1954, (double) 1954, (double) 1954, 1954);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 37.4, 37.4, 37.4, 379);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 403, (double) 403, (double) 403, 403);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 3653, Double.POSITIVE_INFINITY, (double) 3653, 3653);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1395.0), (-1395.0), (-1395.0), 514);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-0.38235721230730685), (-0.38235721230730685), (-0.38235721230730685), 1784);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 367, (double) 367, (double) 367, 367);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.9999956265024206, 0.9999956265024206, (double) (-345));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 197.155008232, 197.155008232, 197.155008232);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 384, (double) 384, (double) 384, 384);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1564.5), (-1564.5), (-1564.5), 1171);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, 0.5, 0.5, 841);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 2934, (double) 2934, 1.0, 2934);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 396, (-1564.5), (-1564.5), 396);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-570.1300705239), (double) 2136618840, (-570.1300705239), 2136618840);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 367, (double) 367, (double) 367, 367);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 2.90488496652223E13, 2.90488496652223E13, 2.90488496652223E13, 4);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0, 2934);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1822, 1.0, 1.0, 1822);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1171, (double) 1171, (double) 1171, 1171);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) 2348, (double) 2348, (double) 2348, 2348);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 1.0, 1.0, 0.0, 3653);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 2136618840);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, (double) 3624, (double) 3624, 3624);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 1.0, 1.0, 1.0, 100);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 2491, (double) 2491, (double) 2491, 2491);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, (double) 4, (double) 4, 4);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.68814370368849, 13.68814370368849, 13.68814370368849, 2887);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 2966.9122156498, 2966.9122156498, 2966.9122156498);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) (-14), (double) (-14), (double) (-14), 100);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 2876);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 10);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) 11, (double) 11, (double) 11);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 389, (double) 389, (double) 389, 389);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 28.037093389622026, (double) 389, (double) 389, 389);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 4, (double) 4, (double) 4, 4);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 514);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1070, (double) 1070, (double) 1070, 1070);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1175.16), (-1175.16), (-1175.16), 1954);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint((-1353.4), (-1353.4));
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-1353.4), (-1353.4), (-1353.4));
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 389, (double) 389, (double) 389, 389);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1171, (-1564.5), (-1564.5), 1171);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2.15494579201096, 2.15494579201096, 2.15494579201096, 3656);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1865.63), 1.0, (double) 1058, 1058);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-776.7653123311571), (-776.7653123311571), (-776.7653123311571));
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 3653, (double) 3653, (double) 3653, 3653);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, 0.5, 0.5, 484);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 189.48859424989593, 189.48859424989593, 189.48859424989593, 2);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1968, (double) 1968, (double) 1968, 1968);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 2, (double) 2, (double) 2, 2);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-97.0), (-97.0), (-97.0), 6);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 1051, (double) 1051, (double) 1051, 1051);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 379, (double) 379, (double) 379, 379);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 37.4, 37.4, 37.4, 2);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2981.0), (-2981.0), (-2981.0), 1954);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 4058.0, 4058.0, (double) 0, 3653);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 3653, 1.0, 1.0, 3653);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1073, (double) 1073, (double) 1073, 1073);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3593.2259), (-3593.2259), (-3593.2259));
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-1564.5), (-1564.5), (-1564.5), 1954);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (double) 396, (double) 396, (double) 396, 396);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.9999956265024206, 0.9999956265024206, 0.9999956265024206, 1243);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 2231.6755740864905, 2231.6755740864905, 2231.6755740864905);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1582.9397053463076), (-1582.9397053463076), (-1582.9397053463076), 1954);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2931.0, 2931.0, 2931.0, 1812);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 100, 0.0, 0.0, 100);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.47286147281289415, 0.47286147281289415, 0.47286147281289415, 3653);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1564.5), (double) 1171, (double) 1171, 1171);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1061);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.245725752188084, 13.245725752188084, (-1395.0), 2743);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      UnivariateRealSolverUtils.midpoint((-1245.0), (-1245.0));
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1245.0), (-1245.0), (-1245.0), 3161);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, (double) 1954, 1.0, 1954);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1822);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1564.5), (-1564.5), (-1564.5), 1954);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 0.0, (double) 514, 0.0, 514);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1706.414807), (-1706.414807), (-1706.414807), 5);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 13.245725752188084, 13.245725752188084, 13.245725752188084, 2743);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 37.4, (double) 389, (double) 389, 389);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1883.46054616849, (double) 1929, 1883.46054616849, 1929);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 666.831035;
      PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunctionLagrangeForm0, 0.0, 666.831035, 666.831035);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (-585.07245971503), 0.0, (-585.07245971503));
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 37.4, (double) 379, (double) 379, 379);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.0, 0.0, 0.0, 1822);
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1058);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1142.9591), (-1142.9591), (-1142.9591));
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-570.1300705239), (double) 0, (-570.1300705239), 4);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 396, (double) 396, (double) 396, 396);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 1784);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 1058, (double) 1058, (double) 1058, 1058);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0, 2814);
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (double) (-861), (double) (-861), (double) (-861), 7);
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (double) 408, (double) 408, (double) 408, 408);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-1564.5), (-1564.5), (-1564.5), 1954);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1.0, 1.0, 1.0, 100);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3715.80515), (-3715.80515), (-3715.80515), 7);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (double) 1070, (double) 1070, (double) 1070, 1070);
  }
}
