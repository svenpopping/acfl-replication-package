/*

 * Tue Mar 03 10:16:00 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.EigenDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class EigenDecompositionImpl_ESTest_Botsing extends EigenDecompositionImpl_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 1012.3317954;
      doubleArray1[1] = 8.0;
      doubleArray1[2] = 0.00915264306088684;
      doubleArray1[3] = 4079.726;
      doubleArray1[4] = (-564.53315661);
      doubleArray1[5] = (-1457.798490687237);
      EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1300.13);
  }
}
