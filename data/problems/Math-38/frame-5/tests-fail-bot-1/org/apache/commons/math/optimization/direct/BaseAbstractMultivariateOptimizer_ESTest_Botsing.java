/*

 * Tue Mar 03 10:07:16 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.apache.commons.math.random.ISAACRandom;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractMultivariateOptimizer_ESTest_Botsing extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(34);
      double[] doubleArray0 = new double[0];
      int int0 = 0;
      ISAACRandom iSAACRandom0 = new ISAACRandom(0L);
      double[][] doubleArray1 = new double[4][9];
      doubleArray1[0] = doubleArray0;
      double[] doubleArray2 = new double[7];
      doubleArray2[0] = (double) 2;
      doubleArray2[2] = (double) 0;
      SumSincFunction sumSincFunction0 = new SumSincFunction(0.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(2516, sumSincFunction0, goalType0, doubleArray2);
  }
}
