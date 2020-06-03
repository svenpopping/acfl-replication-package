/*

 * Tue Mar 03 11:35:23 UTC 2020
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
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BisectionSolver_ESTest_Botsing extends BisectionSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 3521.64503);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1634.77, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1202.85), (-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-506.7059161670917), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0027127685546020075, 1240.94183671862, 0.0027127685546020075);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 285.955483, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.43540023600508E-5, 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1286.3609094), 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3620.39856, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-4543.8337035715), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-2.252769063008128E-11), 4.23870086478928E-5);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-2.5241305513522017), 3306.467226324);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.40606649038, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 0.025501741457901517, (-1.0));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3059.5380273464275, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1775.754), 1.0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 922.949129128408, 2417.9405322949);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 285.955483, 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 2.8756608116964344E-5, 1028.042);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-333.57534361), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3060.0440958063227, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1775.754), 1.0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1775.754), 1.0, (-1.0000002704891373));
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1286.3609094), 0.2919291794389027);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 7.526730047905446E-7, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1.0), 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 0.6944687499999418, 530.0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.defaultFunctionValueAccuracy;
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0E-15, 824.16735235, 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3084.9352403076578, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(0.0, (double) 351, 0.0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1.0), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1137.0), 0.00677, (-1137.0));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0, 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-6, 2.7362549969316403E29);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1144.37478), (-1.0));
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3080.886106736292, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 3334.639491991691);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 2.3801389341078787, 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1450.097514454), 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-4566.6073405), 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1220.70182941), 1874.396, (-1220.70182941));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-391.34893), 1423.272);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.defaultFunctionValueAccuracy;
      // Undeclared exception!
      bisectionSolver0.solve(1.0E-15, 854.347525303);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-6, 3112.5068509630764);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-0.40571326922258183), 1628.196801, (-0.40571326922258183));
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 10.707818024060169, 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      bisectionSolver0.getAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0E-6, 2941.78651);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1283.21329413), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-14, 0.11929754437366691);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.4, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1381.00975905849), 1.0E-14);
      // Undeclared exception!
      bisectionSolver0.solve((-3.215413810938637E-7), 1299.99316501365);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0, 1423.272);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = (-1775.754);
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2747.538224), (-2066.14475061181), (-1775.754));
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 1.43540023600508E-5, 0.5);
      // Undeclared exception!
      bisectionSolver0.solve(0.49999952317653085, 0.5);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1.0), 0.0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(0.11153724689495448, 1.0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 1423.272);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3095.7496518991566, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0, 149.3379221819422);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 1.0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(quinticFunction0);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-711.1527217), 3.1982481232262217E-6);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 3306.467226324);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 59.71, 2426.0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2265.2), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.4060665, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.40607, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 5.0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2.258396922626988E-8), 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(1.0E-14, 1.0, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 2.3234889522427693E-4, 0.5);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 7.969294205167898E-4, 0.25);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 7.969294205167898E-4, 0.24999952468286404, 0.24999952468286404);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1775.754), 3.466316405721701);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-6, 1461.3030338634294);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1079.769, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.functionValue;
      // Undeclared exception!
      bisectionSolver0.solve((-1202.85), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1775.754), 1.0, (-1775.754));
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-7738.212), 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 398.385, 3521.64503);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-763.4), 1423.272);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 0.6176374391168821, 0.6176374391168821);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3086.4905193925497, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-7738.212), 1.43540023600508E-5);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-1.0), (-1.0), (-1.0), (-1.0), (-1.0)).when(univariateRealFunction0).value(anyDouble());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      bisectionSolver0.solve((-1.0), 912.71312656362, 912.71312656362);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 912.7131261381392, 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3086.868894232497, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(824.16735235, 3336.06288306583);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.result;
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2923.689930461), 0.0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.222322346251, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.40606649038, 4867.046785565033);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 0.25, 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      double double0 = bisectionSolver0.functionValueAccuracy;
      // Undeclared exception!
      bisectionSolver0.solve((-506.7059161670917), 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 0.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-15, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.getRelativeAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve(1.0E-14, (double) 351, 0.0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(1.0, 26.57099074261389);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3087.40606649038, 4.011997951045801E20);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2429.8511297712025), 1.0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-391.34893), 912.71312656362);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-33.02315308300085), 854.347525303);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 5.0, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-6, 3087.40606649038);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver(sinFunction0);
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-927.72606), 94.33);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-0.49540244048868537), 1.0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2429.8511298), 1423.272);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 7.969294205167898E-4, 0.25);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 7.969294205167898E-4, 0.24999952468286404, 0.25);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3090.18907310807, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1775.754), 1.0);
      // Undeclared exception!
      bisectionSolver0.solve((-4.271285970214997E-5), 1.0, (-1.0000002704891373));
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(1.43540023600508E-5, 922.949129128408, 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 922.949129128408, 3072.32637287);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (double) 87, 922.949129128408);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      // Undeclared exception!
      bisectionSolver0.solve(4867.046785565033, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((double) 35, (double) 1478, (double) 35);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 3089.7812213782713, 1.3785102458883284E31);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(sinFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1220.70182941), 1397.045, 1397.045);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((-1.0), 3334.639492);
  }
}
