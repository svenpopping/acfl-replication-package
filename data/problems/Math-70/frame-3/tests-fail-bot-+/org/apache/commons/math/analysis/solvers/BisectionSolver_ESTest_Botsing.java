/*

 * Tue Mar 03 11:37:56 UTC 2020
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
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1968.596), 3094.528421335627, (-1968.596));
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 1824.657393487456, 1824.657393487456);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-743.4848), (-462.8728954063), (-462.8728954063));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 3.75, 3094.528421335627, 3.75);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.2702178310059935, (double) 2394, (double) 2394);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1970.574114), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 1612.3, 0.0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-102.096), (double) 2141, (double) 2141);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-3501.3303152619333), 1.0E-6, (-3501.3303152619333));
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.2702178310059935, 253.947099353141, 253.947099353141);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 0.5, 738.3721590448063, 0.5);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-4.7923859462135215E-14), 0.7502534357733426, 0.7502534357733426);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-732.7), 595.70751264136, (-732.7));
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (double) (-3072), 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1260.86), 3.75, (-1260.86));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1603.416499012), 3094.528421335627, (-1603.416499012));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1968.596), (-99.6), (-1968.596));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 4.882812500000069E-4, 3.75, 4.882812500000069E-4);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, (double) 2136, (-102.096));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 3094.528421335627, 0.0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.getRelativeAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0E-14, 3.75, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1968.596), 1824.657393487456, 1824.657393487456);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 2.28353239440791E29, 2.2851006436525364E29, 2.28353239440791E29);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      bisectionSolver0.getAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 1.0E-6, 1.0, (-1430.7571625638));
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-1386.02), 1.0E-15, 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-462.8728954063), 1112.69348, 1112.69348);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      MonitoredFunction monitoredFunction0 = new MonitoredFunction((UnivariateRealFunction) null);
      BisectionSolver bisectionSolver0 = new BisectionSolver(monitoredFunction0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-2773.89215488777), 8.621679512543778E-7, 8.621679512543778E-7);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, (double) 2136, 0.0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 1612.3, 1612.3);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 5.328017994761236E-4, 2953.488636179225, 5.328017994761236E-4);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1209.592516487559), 3092.5337492163935, (-1209.592516487559));
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1430.7571625638), (-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 35.04837499999999, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 0.001953125, 0.0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-457.5), (double) 2394, (-457.5));
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-102.096), 0.25, (-102.096));
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1430.7571625638), (-1.0), (-1430.7571625638));
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-6410.0564326), 5076.497, (-6410.0564326));
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-526.8501902447476), 1442.225649, (-526.8501902447476));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.2702178310059935, 253.947099353141, (double) 2394);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-1970.574114), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2848.494384473751), (-2124.91754195), (-2124.91754195));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-6, 2.28353239440791E29, 2.28353239440791E29);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 3.75, 3094.528421335627, 3.75);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 0.0, 4.955599517834961, 4.955599517834961);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0E-6, 6.103515625000087E-5, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1030.991), (-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 4.50822658422112E-5, 3759.46069546, 4.50822658422112E-5);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-6410.0564326), 5076.496566561802, (-6410.0564326));
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 1.0418859574201633E-5, 1112.69348, 1112.69348);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-5.788816280565215E-7), 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 9.452055965108797E-6, 917.8804147778056, 917.8804147778056);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-102.096), (double) 2141, (-102.096));
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-4479.49013), (-1430.7571625638), (-1430.7571625638));
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-789.02), (-505.4492214876), (-505.4492214876));
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 0.0, (double) 2141, 0.0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 0.0, (double) 2141, (double) 2141);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 0.001953125, 0.001953125);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1.0), (double) 3602, (-1.0));
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-1.0), 1471.0, 1471.0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.2702178310059935, 253.947099353141, 0.2702178310059935);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 1.0E-15, 0.5, 0.5);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-2117.8000116), (-102.096), (-102.096));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0E-14, 3094.528421335627, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1.0), (double) 2141, (-1.0));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.1270566119492287E-5, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 4.2574475301925384E-5, 0.0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-102.096), (double) 2141, (-102.096));
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.2702178310059935, (double) 2394, 0.2702178310059935);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 3.75, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1970.574114), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      bisectionSolver0.getAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 1.0E-6, 1.0, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1030.991), 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-102.096), (double) 2136, (-102.096));
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-4488.996970440496), 4082.0, (-4488.996970440496));
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 703.3462, (double) 2141, 703.3462);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-102.096), (double) 2136, (double) 2136);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 273.645741016, 495.2000525923577, 273.645741016);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-227.3038168647547), 2.28353239440791E29, 2.28353239440791E29);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 0.0, 929.17421939376, 0.0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-4.7923859462135215E-14), 0.00646465889461989, 0.00646465889461989);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      bisectionSolver0.getAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 1.0E-6, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1624.7216138), (double) 2141, (double) 2141);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 3094.528421335627, 2.2851510501007814E29, 2.2851510501007814E29);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-2451.7615), 3094.528421335627, (-2451.7615));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1970.574114), 4.426093439385623E28, 4.426093439385623E28);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-224.76958946477), 0.0, (-224.76958946477));
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, (-4645.28), (-1970.574114), (-4645.28));
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-102.096), (double) 2141, (double) 2141);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-21.085569208499432), 484.21179571672, 484.21179571672);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, 35.04837499999999, 3094.528421335627, 35.04837499999999);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-789.02), 3094.528421335627, (-789.02));
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 225.31397727848486, 1773.135733785, 225.31397727848486);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-927.6641), 3094.528421335627, (-927.6641));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 275.493607, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 1612.3, 2.28353239440791E29, 2.28353239440791E29);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 5.0, 3094.528421335627, 5.0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, 0.0, 3.75, 3.75);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 629.3315681445, (double) 2141, (double) 2141);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, (-1522.87362255), 3.75, 3.75);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-732.7), 0.0, (-732.7));
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-224.76958946477), 595.70751264136, (-224.76958946477));
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 5.909022706648557, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1.0E-14, 3094.528421335627, 3094.528421335627);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, 0.0, (double) 2136, (double) 2136);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-3501.3303152619333), 305.0, 305.0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 1000.0, 3094.528421335627, 1000.0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(expm1Function0);
      BisectionSolver bisectionSolver1 = new BisectionSolver(monitoredFunction0);
      bisectionSolver1.solve((-1386.02), 1.0E-15);
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) monitoredFunction0, (-3.2270792771713643E-7), 1.0E-15, 1.0E-15);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      bisectionSolver0.getAbsoluteAccuracy();
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, 1.0E-6, 1588.926352026939, (-1430.7571625638));
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1968.596), 1824.657393487456, (-1968.596));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) null, 0.0, 0.5, 0.5);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) quinticFunction0, (-1970.0821427081655), 1824.657393487456, (-1970.0821427081655));
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1430.7571625638), 0.0, (-1430.7571625638));
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) expm1Function0, (-986.17698906), (-102.096), (-986.17698906));
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1.0), 1187.2985980902283, (-1.0));
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      bisectionSolver0.solve((UnivariateRealFunction) sinFunction0, 4.882812500000069E-4, 3.75, 3.75);
  }
}
