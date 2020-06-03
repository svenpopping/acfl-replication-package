/*

 * Tue Mar 03 10:06:22 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_Botsing extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GoalType goalType0 = GoalType.MAXIMIZE;
      double[] doubleArray0 = new double[7];
      int int0 = 30;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30);
      SumSincFunction sumSincFunction0 = new SumSincFunction(10.0);
      MultivariateFunction multivariateFunction0 = sumSincFunction0.partialDerivative(2);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, multivariateFunction0, goalType0, doubleArray0);
  }
}
