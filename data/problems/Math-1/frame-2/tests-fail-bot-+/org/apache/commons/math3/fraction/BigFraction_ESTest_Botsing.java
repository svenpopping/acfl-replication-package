/*

 * Tue Mar 03 11:20:27 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BigFraction_ESTest_Botsing extends BigFraction_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.488041639328003, 2698);
      bigFraction0.byteValue();
      BigFraction bigFraction1 = new BigFraction((double) (byte)1, (int) (byte)1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.488041639328003, 2698);
      bigFraction0.intValue();
      BigFraction bigFraction1 = new BigFraction((double) 1, 2698);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(918.0705706313951, (-1289));
      BigFraction bigFraction1 = new BigFraction((double) (-1289), (-1289));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(613.8367, 0);
      bigFraction0.getNumeratorAsInt();
      BigFraction bigFraction1 = new BigFraction((double) 613, 613);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(903.6224467708369, 3);
      BigFraction bigFraction1 = new BigFraction((double) 3, 3);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.7124913404212982, (-1));
      BigFraction bigFraction1 = new BigFraction((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(918.0705706313951, (-1265));
      BigFraction bigFraction1 = new BigFraction(0.0, (-1265));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.60115773542975, 1507);
      BigFraction bigFraction1 = new BigFraction((double) 1507, 1507);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 54);
      BigFraction bigFraction1 = new BigFraction((double) 54, 54);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 15);
      BigFraction bigFraction1 = new BigFraction((double) 15, 15);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.378904104232788, 31);
      BigFraction bigFraction1 = new BigFraction((double) 31, 31);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.1608034274088, 1522);
      BigFraction bigFraction1 = new BigFraction((double) 1522, 1522);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      bigFraction0.TWO_QUARTERS.doubleValue();
      bigFraction0.TWO_THIRDS.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction(0.5, 1);
      BigFraction bigFraction2 = new BigFraction((double) 1, 38);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.378904104232788, (-1));
      BigFraction bigFraction1 = new BigFraction((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, (-5));
      BigFraction bigFraction1 = new BigFraction((double) (-5), (-5));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(0.019357000000013613, (-1));
      BigFraction bigFraction1 = new BigFraction((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(918.0705706313951, (-1265));
      BigFraction bigFraction1 = new BigFraction((double) (-1265), (-1265));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(6.97235691404785E-9, (-2145875045));
      BigFraction bigFraction1 = new BigFraction((double) (-2145875045), (-2145875045));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2.011072593789072E-7), (-3409));
      BigFraction bigFraction1 = new BigFraction((double) (-3409), (-3409));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1557.75478), 0);
      byte[] byteArray0 = new byte[1];
      BigFraction bigFraction1 = new BigFraction((double) (byte) (-1), (int) (byte)0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(3.274076073012111E-5, 930);
      BigFraction bigFraction1 = new BigFraction((double) 930, 930);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      bigFraction0.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction(502.205346347, 1659);
      BigFraction bigFraction2 = new BigFraction((double) 0, 1659);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.378904104232788, (-1));
      bigFraction0.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction((double) (-1), 0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.9669307904207, 1522);
      BigFraction bigFraction1 = new BigFraction((double) 1522, 1522);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, (-24));
      BigFraction bigFraction1 = new BigFraction((double) (-24), (-24));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(410.71342941362707, 1522);
      BigFraction bigFraction1 = new BigFraction((double) 1522, 1522);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-3147.64961704898), (-2528));
      BigFraction bigFraction1 = new BigFraction((double) (-2528), (-2528));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(884.2712523943774, (-1531));
      BigFraction bigFraction1 = new BigFraction((double) (-1531), (-1531));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.488041639328003, 2698);
      bigFraction0.byteValue();
      BigFraction bigFraction1 = new BigFraction((double) (byte)1, 2698);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.651944637298584, 2461);
      bigFraction0.shortValue();
      BigFraction bigFraction1 = new BigFraction((double) (short)1, (int) (short)1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(918.0705706313951, (-1265));
      bigFraction0.getNumeratorAsLong();
      BigFraction bigFraction1 = new BigFraction((double) 918L, (-1265));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-2179));
      bigFraction0.intValue();
      BigFraction bigFraction1 = new BigFraction((-1964.4864), (-2179));
      BigFraction bigFraction2 = new BigFraction((double) (-2179), (-2179));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-348.5), (-515));
      BigFraction bigFraction1 = new BigFraction((double) (-515), (-515));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(6.711409469062346E-6, (-1));
      BigFraction bigFraction1 = new BigFraction((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.651944637298584, 2461);
      BigFraction bigFraction1 = new BigFraction((double) 2461, 2461);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(270.002059, (-1841));
      BigFraction bigFraction1 = new BigFraction((double) (-1841), (-1841));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.60115773542975, 1522);
      BigFraction bigFraction1 = new BigFraction((double) 1522, 1522);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, (-1500));
      BigFraction bigFraction1 = new BigFraction((double) (-1500), (-1500));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(918.0705706313951, (-1289));
      bigFraction0.getNumeratorAsLong();
      BigFraction bigFraction1 = new BigFraction((double) 918L, (-1289));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1557.75478), 0);
      BigFraction bigFraction1 = new BigFraction((double) (byte) (-1), (int) (byte) (-1));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.60115773542975, 1522);
      bigFraction0.THREE_FIFTHS.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction((double) (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.60115773543, 1522);
      BigFraction bigFraction1 = new BigFraction((double) 1522, 1522);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1554.5255988795957, (-3398));
      bigFraction0.intValue();
      BigFraction bigFraction1 = new BigFraction((double) 1554, 1554);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, Integer.MAX_VALUE);
      BigFraction bigFraction1 = new BigFraction((double) Integer.MAX_VALUE, Integer.MAX_VALUE);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1554.5255988795957, (-3398));
      bigFraction0.intValue();
      BigFraction bigFraction1 = new BigFraction((double) 1554, (-3398));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1268.3021, 4107);
      BigFraction bigFraction1 = new BigFraction((double) 4107, 4107);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.TWO;
      bigFraction0.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction(502.205346347, 0);
      BigFraction bigFraction2 = new BigFraction((double) 0, 1659);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 18);
      BigFraction bigFraction1 = new BigFraction((double) 18, 18);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      bigFraction0.TWO_QUARTERS.doubleValue();
      bigFraction0.TWO_THIRDS.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction(0.5, 1);
      BigFraction bigFraction2 = new BigFraction((double) 1, 1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(882.7058175083683, 31);
      BigFraction bigFraction1 = new BigFraction((double) 31, 31);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(411.60115773542975, 1533);
      BigFraction bigFraction1 = new BigFraction((double) 1533, 1533);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 10);
      BigFraction bigFraction1 = new BigFraction((double) 10, 10);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1500.404863139, 2877);
      BigFraction bigFraction1 = new BigFraction((double) 2877, 2877);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(378.41197102186885, 1516);
      BigFraction bigFraction1 = new BigFraction((double) 1516, 1516);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.651944637298584, 2461);
      bigFraction0.shortValue();
      BigFraction bigFraction1 = new BigFraction((double) (short)1, 2461);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 2);
      BigFraction bigFraction1 = new BigFraction(1.2673240235017147E-10, 2);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(883.151, 2);
      BigFraction bigFraction1 = new BigFraction((double) 2, 2);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      BigFraction bigFraction0 = BigFraction.ONE_HALF;
      bigFraction0.TWO_QUARTERS.doubleValue();
      bigFraction0.TWO_THIRDS.compareTo(bigFraction0);
      BigFraction bigFraction1 = new BigFraction(0.5, 1);
      BigFraction bigFraction2 = new BigFraction((double) 38, 1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-348.5), (-515));
      BigFraction bigFraction1 = new BigFraction((-1.0), (-515));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.378904104232788, (-1));
      BigFraction bigFraction1 = new BigFraction(0.0, (-1));
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction((-1557.75478), 0);
      BigFraction bigFraction1 = new BigFraction((double) (byte) (-1), 0);
  }
}
