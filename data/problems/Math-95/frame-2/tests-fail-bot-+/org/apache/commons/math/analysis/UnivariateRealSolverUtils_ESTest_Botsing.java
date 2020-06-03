/*

 * Tue Mar 03 11:43:55 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.PolynomialFunction;
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
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-2064.3531), (-2064.3531), (-2064.3531));
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-61.695947371943), (-61.695947371943), (-61.695947371943));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 2709.87798307, 2709.87798307, 2709.87798307);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint(0.0, 0.0);
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1117.0681992267816, 1117.0681992267816, 1117.0681992267816);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-380.65284345359896), (-380.65284345359896), (-380.65284345359896));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-15.089999999999975), (-15.089999999999975), (-15.089999999999975));
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-61.696), (-61.696), (-61.696));
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 0.0, 2.0965435608510563, 2.0965435608510563);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 27.215860023261726, 27.215860023261726, 27.215860023261726);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, 137.58786244949354, 137.58786244949354, 0.0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-643.9551983), (-643.9551983), (-643.9551983));
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1920.0237747887825), (-1920.0237747887825), (-1920.0237747887825));
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1978.0, 1978.0, 1978.0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1304.4371836643927, 1304.4371836643927, 1304.4371836643927);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1218.3060504999999), (-1218.3060504999999), (-1218.3060504999999));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-3784.1261481337847), (-3784.1261481337847), (-3784.1261481337847));
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1871.8530754812998), (-1871.8530754812998), (-1871.8530754812998));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1346.2709), (-1346.2709), (-1346.2709));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-301.21000000000004), (-301.21000000000004), (-301.21000000000004));
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 184.6, 184.6, 184.6);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-3583.846905357368), (-3583.846905357368), (-3583.846905357368));
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-661.493593291749), (-661.493593291749), (-661.493593291749));
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1075.2953625473), (-1075.2953625473), (-1075.2953625473));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.18325146996646), (-0.18325146996646), (-0.18325146996646));
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-643.9551983), (-643.9551983), (-643.9551983));
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 19.0, 19.0, 19.0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1117.1096783689964, 1117.1096783689964, 1117.1096783689964);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-24.54566849687863), (-24.54566849687863), (-24.54566849687863));
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-72.03186786564547), (-72.03186786564547), (-72.03186786564547));
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-499.6632815691123), (-499.6632815691123), (-499.6632815691123));
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-307.21000000000004), (-307.21000000000004), (-307.21000000000004));
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint((-2231.0324476), (-2231.0324476));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-2231.0324476), (-2231.0324476), (-2231.0324476));
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 19.0, 19.0, 19.0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2970.11313405366, 2970.11313405366, 2970.11313405366);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1075.2953625473), (-1075.2953625473), (-1075.2953625473));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      UnivariateRealSolverUtils.solve(univariateRealFunction0, 0.0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      UnivariateRealFunction univariateRealFunction1 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction1, 0.0, Double.POSITIVE_INFINITY, 0.0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-909.59), (-909.59), (-909.59));
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-0.5205787518371766), (-0.5205787518371766), (-0.5205787518371766));
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-61.695947371943), (-61.695947371943), (-61.695947371943));
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 509.88391384191186, 509.88391384191186, 509.88391384191186);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.7857939455044096E24, 1.7857939455044096E24, 1.7857939455044096E24);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-290.9077521769644), (-290.9077521769644), (-290.9077521769644));
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.5, 0.5, 0.5);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.9201568300222284, 0.9201568300222284, 0.9201568300222284);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      UnivariateRealSolverUtils.midpoint(1.0, 1.0);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 0.25, 0.25, 0.25);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1157.11842), (-1157.11842), (-1157.11842));
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1831.7621604924586), (-1831.7621604924586), (-1831.7621604924586));
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-1365.72842452), (-1365.72842452), (-1365.72842452));
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 0.2, 0.2, 0.2);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 9.553042562522949, 9.553042562522949, 9.553042562522949);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-59.54243365874139), (-59.54243365874139), (-59.54243365874139));
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0E-14, 1.0E-14, 1.0E-14);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, 19.0, 19.0, 19.0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2313.4277499136633, 2313.4277499136633, 2313.4277499136633);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1117.714358720567, 1117.714358720567, 1117.714358720567);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1654.493656047464, 4690.8555790559, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-0.6658779753893667), (-0.6658779753893667), (-0.6658779753893667));
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 432.7301871691, 432.7301871691, 432.7301871691);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1676.1885373365071, 1676.1885373365071, 1676.1885373365071);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 2927.0, 2927.0, 2927.0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (double) (-1853120806), 142.68714738633685, 0.0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.8801507466044353E32, 1.8801507466044353E32, 1.8801507466044353E32);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.8519129345313756E16), (-1.8519129345313756E16), (-1.8519129345313756E16));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) sinFunction0, (-240.801), (-240.801), (-240.801));
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-699.9), (-699.9), (-699.9));
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 16.41416039125278, 16.41416039125278, 16.41416039125278);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-14.360198275518178), (-14.360198275518178), (-14.360198275518178));
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealSolverUtils.midpoint(1081.736, 1081.736);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 1081.736, 1081.736, 1081.736);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      UnivariateRealSolverUtils.midpoint((-290.9077521769644), (-290.9077521769644));
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-290.9077521769644), (-290.9077521769644), (-290.9077521769644));
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(quinticFunction0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) monitoredFunction0, 1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 5.0, 5.0, 5.0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 21.188733946467615, 21.188733946467615, 21.188733946467615);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-61.695947371943), (-61.695947371943), (-61.695947371943));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, 1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 488.462747, 488.462747, 488.462747);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, 3913.61277782, 3913.61277782, 3913.61277782);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-941.649), (-941.649), (-941.649));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-36.33364009280206), (-36.33364009280206), (-36.33364009280206));
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1731.86489), (-1731.86489), (-1731.86489));
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 3069.244105, 3069.244105, 3069.244105);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealSolverUtils.solve((UnivariateRealFunction) quinticFunction0, (-1533.9453768310227), 0.0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1533.9453768310227), 0.0, (-1533.9453768310227));
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-818.1), (-818.1), (-818.1));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-240.801), (-240.801), (-240.801));
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-60.05525150263712), (-60.05525150263712), (-60.05525150263712));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 895.248971136, 895.248971136, 895.248971136);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-330.76097), (-330.76097), (-330.76097));
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1225.0, 1225.0, 1225.0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (double) (-1853120806), 137.58786244949354, (double) (-1853120806));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, (-1585.09714906337), (-1585.09714906337), (-1585.09714906337));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      UnivariateRealSolverUtils.midpoint((-1075.2953625473), (-1075.2953625473));
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1075.2953625473), (-1075.2953625473), (-1075.2953625473));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) quinticFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1.0, 1.0, 1.0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 1113.99907140144, 1113.99907140144, 1113.99907140144);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-1.0), (-1.0), (-1.0));
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) polynomialFunction0, (double) (-1853120806), (double) (-1853120806), (double) (-1853120806));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-3788.266589731), (-3788.266589731), (-3788.266589731));
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 8.74918589809681, 8.74918589809681, 8.74918589809681);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket((UnivariateRealFunction) expm1Function0, (-62.89077430140083), (-62.89077430140083), (-62.89077430140083));
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, (-61.695947371943), (-61.695947371943), (-61.695947371943));
  }
}
