/*

 * Tue Mar 03 11:25:41 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractMultivariateOptimizer_ESTest_Botsing extends BaseAbstractMultivariateOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, 0.0, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(30);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      GoalType goalType0 = GoalType.MAXIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, 0.0, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(30);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      GoalType goalType0 = GoalType.MINIMIZE;
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, 0.0, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(30);
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(30, 0.0, 0.0);
      SumSincFunction sumSincFunction0 = new SumSincFunction(2);
      GoalType goalType0 = GoalType.MINIMIZE;
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(30, sumSincFunction0, goalType0, doubleArray0);
  }
}
