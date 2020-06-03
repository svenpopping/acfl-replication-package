/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:32:53 GMT 2020
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
      Beta.logBeta((double) (-1020), (double) (-1020));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Beta.regularizedBeta(0.0, (-3.0399439534134115E97), (-1.1109834472051523E-8), Double.NaN);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Beta.regularizedBeta(0.0, 2618.608161456973, 2043.231071659, 770);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Beta.regularizedBeta(1.0E-14, 3.444406231880653E-285, 3.444406231880653E-285, 208);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Beta.regularizedBeta(0.4556184411048889, 4282.5592, 0.4556184411048889, 4282.5592, 2142642594);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Beta.regularizedBeta(0.0, 3.1184473002226595E-10, 2.417189020581056E-8, 18.23122262122278);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Beta.regularizedBeta(0.4950772523880005, 0.4950772523880005, 0.5421652793884277, 0.5421652793884277);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Beta.regularizedBeta(4.1905679587096103E-8, 4.1905679587096103E-8, 4.1905679587096103E-8);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Beta.logBeta(4.1545899609113734E68, 208.1408153, 1.722049095222509E-275, 0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Beta.logBeta(1771.13842575317, 1.0E-14, (-1492.40467171512), 1088);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Beta.logBeta(1.2942728582966776E171, 674.488455431263);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Beta.logBeta(2.417189020581056E-8, 2.417189020581056E-8);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Beta.logBeta(1055.6, 1055.6);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = Beta.logBeta(1.0, (-111.8258), (-2506.6075608412), 1144);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double double0 = Beta.logBeta(0.0, (-1.1214757379328965E-8), 1116.543803688, 1144);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = Beta.logBeta(2.0, 2.0, (-1.1214757379328965E-8), 1144);
      assertEquals((-1.7917594692280543), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = Beta.regularizedBeta(1.0, 2.0, 1784.1, 2.0, 1144);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, Double.NaN, (-1961.384687341418), 473.0, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = Beta.regularizedBeta(Double.NaN, 566.86849524768, (-2928.70855), Double.NaN, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = Beta.regularizedBeta(3.965171513035854E23, (-1.0), 900.0707418596, (-2690.327500340636), (-893));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 1.0E-14, 0.0, 0.0, Integer.MAX_VALUE);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = Beta.regularizedBeta((-1492.40467171512), (-1492.40467171512), (-2288.7326607), 1771.13842575317, 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 0.0, 0.0, (-2552.0439715965404), (-1020));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = Beta.logBeta(653.3387950232195, 0.0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = Beta.logBeta(1771.13842575317, Double.NaN, (-1081.830062669503), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double double0 = Beta.logBeta(Double.NaN, 2551.23705, (-1931.91284), 3655);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      double double0 = Beta.regularizedBeta(1.0E-14, (double) 0, (-1837.66413995));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      double double0 = Beta.regularizedBeta(4.908843759498681E-306, 2418.7713168, Double.NaN, (-1018.56344610177), (-546));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 1.2493696959436675E-93, 1.0E-14);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double double0 = Beta.regularizedBeta(0.0, 8.468222063292654E102, (-4150.9674), 0);
      assertEquals(Double.NaN, double0, 0.01);
  }
}
