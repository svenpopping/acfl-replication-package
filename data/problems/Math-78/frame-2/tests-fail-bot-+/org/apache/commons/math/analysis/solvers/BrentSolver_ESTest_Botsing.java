/*

 * Tue Mar 03 11:38:02 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BrentSolver_ESTest_Botsing extends BrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 4.999999999999583E-7, 8.18926730927156E-6);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2100.33), (-888.80203));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 9.999713733717407E-7, 44.04189);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.25, 0.25).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-4459.023), 0.25);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.674806949462495E-6, 7.674806949462495E-6).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1265.0), 7.674806949462495E-6);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1181.82179742506), (-1181.82179742506)).when(univariateRealFunction0).value(anyDouble());
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-3078.168345493604), (-1181.82179742506));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-1058.07545), (-58.01489152760329));
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-215.93477373905), (-215.93477373905)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2720.603), 1.0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 0.5, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0E-6, 0.0015834796563038462);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-792.466802477), (-8.39948420442421E-9));
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.248504451), (-8.39948420442421E-9));
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.15001021971729125, 629.13);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1812.830655901, 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.5, 18.64631018910201);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 2266.97441011764, 2670.649197);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1434.42), (-19.511997916534614));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.24850445113323558, 106.6982294245589);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0E-15, 513.76216);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 663.639497161);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-2310.8), (-1206.483657212863));
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.5, 0.5).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 0.5);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), 85.36333078294422);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997917), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 229.8600296651, 1618.0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.248504451), (-8.39948420442421E-9));
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 663.639497161);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.3546378407174706), (-0.3546378407174706)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-0.3546378407174706), 2.0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.5119979), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve(153.0797258636, 1033.504170402);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-20.566392417113207), (-0.2334019279699753));
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0E-15, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-64736.6435572387), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3.429489), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(15.778903552684593, 15.778903552684593).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-1265.0), 15.778903552684593);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      double double0 = brentSolver0.defaultFunctionValueAccuracy;
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-0.5336639758089176), 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-1135.0), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 2108.0382, 2215.763);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), 23.213062987467016);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(4.517300255808069E-7, 4.517300255808069E-7).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 4.517300255808069E-7, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.5, 1.0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2108.0382, 2108.0382).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 2108.0382, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2108.0382, 2108.0382).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1265.0), 3.75);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-2173.9381352697606), (-2173.9381352697606)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-2173.9381352697606), 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.017412361051352153, 1.5);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1286.79), 0.49700890226647115);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-2.962960697055453));
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.021664234306399077, 7.475247592066121);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1.0), 1004.2152081971);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-789.0657725066246), 0.6565996373614958);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 149.29016375206834, 2453.95206862067);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 1600.479066);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve(1.0000107147623445, 235.01);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(8.260163277489926E-4, 8.260163277489926E-4).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 8.260163277489926E-4, 0.5);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-178.321767), 3443.0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-3825.93919), 3.3294812195188996E-11);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-20.980436636813625), 1318.5543649815);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.021664234306399077, 7.475247592066121);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-3426.62667422734), (-1135.0));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(8.260163277489926E-4, 3089.79236066576).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 8.260163277489926E-4, 3089.79236066576);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.248504451), (-1.0E-8));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-632.73454), (-544.2037563));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, (-2256.59691722025), (-385.3255));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 9.03954403793919E-7, 2249.476054744);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 4.517301275264174E-7, 2108.0382);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.0E-6, 1.0E-6).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 1.0E-6, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-666.13), (-666.13)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-666.13), 2187.717);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0, 1095.00063);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-809.0), 1.0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-74.52651247243288), 0.5);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 657.60181938);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-214.81989783000344), 2215.9);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1142.22800438), 1.0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.005612632088834909, 1196.721365);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 2.0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.getIterationCount();
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1460.497233474), (-1460.497233474)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (double) 0, (double) 281);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2376.2743), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.611028584586767E-4, 378.7);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.043890989306421234, 1.5);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(603.7808211187861, 603.7808211187861).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 1.0E-15, 603.7808211187861);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), 10.243837837158281);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1181.82179742506), (-1181.82179742506)).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-1181.82179742506), 1.0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 280.03553, 2556.5412);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 5.0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0, 3.2878530778043677E12);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-4343.7), (-6.530938671291731E-9));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 4.069958679500353E-9, 0.5487407254950643);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.51), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3603.7567789196423, 3603.7567789196423).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, Double.NaN, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.75, 3.75).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 3.75, 544.630957608761);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.setResult((-1460.497233474), (-1460.497233474), 281);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver1 = new BrentSolver(univariateRealFunction1);
      brentSolver1.getIterationCount();
      brentSolver0.getIterationCount();
      UnivariateRealFunction univariateRealFunction2 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)281, (double)281).when(univariateRealFunction2).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction2, (double) 0, (double) 281);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.25, 0.25).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 0.25, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-0.017413241047965933), 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2376.2743), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(4.132341524754448E-4, 4.132341524754448E-4).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 4.132341524754448E-4, 2187.717);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.50000001, 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0, 1.0290615978144878E16);
      // Undeclared exception!
      brentSolver0.solve((-2990.796436589119), 7.937432380100683E15);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.238413010502427E-5, 2.238413010502427E-5).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 2.238413010502427E-5, 2600.73488991);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.3546378407174706), (-0.3546378407174706)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), (-0.3546378407174706));
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-456.26817261), (-194.4192258200106));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.3220838328414958, 0.44571254954066053);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.017413));
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.043890989306421234, 1019.227102159255);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), (-3.1254239883301607E-7));
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, Double.NaN, 2001.98023698);
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-481.6594), 2001.98023698);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.25, 655.302764092693);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 998.53739844, 1642.0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.248504451), (-1.0E-8));
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.25, 1.0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve(1.0E-6, 0.0059451076954);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.8764537310833311));
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      brentSolver0.getIterationCount();
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)281, (double)281).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (double) 0, (double) 281);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 0.5, 3167.8569);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1103.4031781), 0.4743954472624509);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, 0.017412361051352153, 1126.0244498241);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 5.968419491882851E-8, 18.64631018910201);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1847.527490524958), (-19.511997916534614));
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2108.0382, 1.0E-14).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 1.0E-14, 2108.0382);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-215.93477373905), (-215.93477373905)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-215.93477373905), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1861.09), (-1861.09)).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 1.0E-15, 1.0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      BrentSolver brentSolver0 = new BrentSolver(monitoredFunction0);
      // Undeclared exception!
      brentSolver0.solve((double) (-2835), (-1738.1446164879865));
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.75, 3.75).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 1.0E-6, 3.75);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.25, 0.25).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 0.25, 544.630957608761);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1.3525782622942064E-6, 1.3525782622942064E-6).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 1.3525782622942064E-6);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1622.59615726372, 2268.09649264564);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(7.674806949462495E-6, 7.674806949462495E-6).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 7.674806949462495E-6, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.06588051583272403), (-1.0E-8));
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3606.8852047241, 3606.8852047241).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 3606.8852047241, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), (-1.5690254419703262E-11));
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 1991.634883);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2.962960697055453), (-0.248504451));
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2050.66427), (-1.0E-8));
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-37.0), 6.232478725387574E-10);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.970452691096901));
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2.16412521967073E-5, 2.16412521967073E-5).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 2.16412521967073E-5);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.013242811018623755, 0.25);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2696.0), (-622.13));
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-2374.9518177351006), 0.008706625863504321);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 235.37693080396036, 406.055805714649);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1732.092014993046, 2232.556142);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), 5.0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-20.566392417113207), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(15.778903552684593, 15.778903552684593).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 15.778903552684593, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 0.1570442325286838, 660.830034);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-4459.023), 0.5487407254950643);
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3450.5797, 3450.5797).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 3450.5797);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.017413241047965933), 1298.0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), 3.75);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(3.75, 3.75).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 3.75, 544.6309576087607);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 2.2394686652115453E-5, 2313.6674992165);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 330.68968337, 1840.6900977344321);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.3363623733282293E-4, 3857.9180256);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-3093.1692056), 3.75);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((-261.327901569573), 1083.0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.01741324));
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1537.8), 2.0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-1108.6587), 280.03553);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction1 = quinticFunction0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-13.206702466152928), 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1618.0, 1396702.7608689994);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-4774.0), 2111.5151);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 1026.8231, 2323.984);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2108.0382, 2108.0382).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1265.0), 2108.0382);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, (-0.248504451), (-8.4E-9));
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-19.50979145965), 2108.0382);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver(quinticFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.15001021971729125, 1594.0);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-6, 559.806681805);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-215.8475174041896), 2215.9);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1.0), 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve(3.3363213040609894E-4, 1.0290615978144878E16);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-215.93477373905), (-215.93477373905)).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1265.0), (-215.93477373905));
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3078.168345493604), (-3078.168345493604)).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-3078.168345493604), 1.0);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1181.82179742506), (-1181.82179742506)).when(univariateRealFunction0).value(anyDouble());
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1181.82179742506), 1.0);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BrentSolver brentSolver0 = new BrentSolver();
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.15001021971729125, 1594.0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-8.645580626125692), (-0.017413241047965933));
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, (-19.511997916534614), (-0.01741));
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.01674107007629607, 0.01674107007629607).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, 0.01674107007629607, Double.NaN);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-6, 0.89058445);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BrentSolver brentSolver0 = new BrentSolver(expm1Function0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) expm1Function0, 1.0E-6, 1608.6756254);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2313.6674992165, 2313.6674992165).when(univariateRealFunction1).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction1, (-1.0), 2313.6674992165);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-3078.168345493604), (-3078.168345493604)).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, (-3078.168345493604), 3400.026688619151);
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.25, 0.25).when(univariateRealFunction0).value(anyDouble());
      // Undeclared exception!
      brentSolver0.solve(univariateRealFunction0, 0.25, 544.6309576087607);
  }
}
