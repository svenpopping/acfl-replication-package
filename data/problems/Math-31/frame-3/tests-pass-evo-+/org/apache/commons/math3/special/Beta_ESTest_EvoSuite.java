/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:34:11 GMT 2020
 */

package org.apache.commons.math3.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.special.Beta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class Beta_ESTest_EvoSuite extends Beta_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Beta.logBeta(1.6160884846515524E-147, (-2031.9437), 2573.0, 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Beta.regularizedBeta(1.0, 0.0, 1.0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Beta.regularizedBeta(1.1918249660105651E-8, 348.6931472143922, 348.6931472143922, 102);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Beta.regularizedBeta(1.0, 2548.429033, 2548.429033, 785);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Beta.regularizedBeta(0.0, 286.81305099521046, 1104.91593, 574.43540979);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Beta.regularizedBeta(3.735333866258403E-239, 3.735333866258403E-239, 2345.0, (double) 4039);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Beta.regularizedBeta(0.0, 0.6112717390060425, 9.854154449263851E-34);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Beta.logBeta(481.82, 4.9759187284770303E269, 1323.822577289094, (-619));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Beta.logBeta(5.491672256552995E-125, 5.491672256552995E-125, 0.0, (-1838));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Beta.logBeta(4.0447634595724164E195, 1196.679107586);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Beta.logBeta(7.3370297995122135E-152, 7.3370297995122135E-152);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = Beta.logBeta(1.0, 1992.7156, (-565.068339109783), 785);
      assertEquals((-7.597253610581902), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double double0 = Beta.logBeta(Double.NaN, 0.0, (double) 4039, 4039);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Beta.logBeta((-2896.66680488576), 0.0, 0.0, 785);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = Beta.regularizedBeta(1.0, 1.0, 1.0, 1.0, 2581);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = Beta.regularizedBeta(Double.NaN, Double.NaN, 2.5035535029701945E-199, Double.NaN, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = Beta.regularizedBeta(646.5431832983475, 771.42563, Double.NaN, 3.0680417869552433E146, 1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = Beta.regularizedBeta((double) 3520, 1491.758659, 2269.0, 1.198363039426718E-70, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, (-2.1596593091833788E-8), (-2.1596593091833788E-8), (-1425.4913), 26);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = Beta.regularizedBeta((double) (-1470), 387.0, 0.0, 0.0, 1839);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 2178.6366393, (-411.2116), (-2304.89445771773), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = Beta.logBeta(1471.5549774, 0.0, 1.9636495113372803, 2684);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = Beta.logBeta(0.0, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = Beta.logBeta((-2885.6), Double.NaN, 0.0, (-1470));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.6011518239974976, 0.6011518239974976, 0.6011518239974976);
      assertEquals(0.5734133002105946, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 2.2056355476379395, 0.0, 1655);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, Double.NaN, 1471.5549774, 2651.93, 2684);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double double0 = Beta.logBeta(1888.41229, 1888.41229);
      assertEquals((-2620.4014766282453), double0, 0.01);
  }
}
