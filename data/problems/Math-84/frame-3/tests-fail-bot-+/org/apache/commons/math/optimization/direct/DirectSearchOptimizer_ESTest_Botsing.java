/*

 * Tue Mar 03 11:40:18 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.analysis.MultivariateVectorialFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.LeastSquaresConverter;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class DirectSearchOptimizer_ESTest_Botsing extends DirectSearchOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1395.43114692).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
      MultiDirectional multiDirectional0 = new MultiDirectional(1395.43114692, 1395.43114692);
      multiDirectional0.setMaxIterations(2486);
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (2,486) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1395.43114692).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
      MultiDirectional multiDirectional0 = new MultiDirectional(1395.43114692, 1395.43114692);
      multiDirectional0.setMaxIterations(2491);
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (2,491) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[0];
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray1);
      multiDirectional0.setMaxIterations(17);
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray1);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (17) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
      MultivariateVectorialFunction multivariateVectorialFunction0 = mock(MultivariateVectorialFunction.class, new ViolatedAssumptionAnswer());
      doReturn(doubleArray0).when(multivariateVectorialFunction0).value(any(double[].class));
      double[] doubleArray1 = new double[0];
      LeastSquaresConverter leastSquaresConverter0 = new LeastSquaresConverter(multivariateVectorialFunction0, doubleArray1);
      multiDirectional0.setMaxIterations(33);
        multiDirectional0.optimize(leastSquaresConverter0, goalType0, doubleArray1);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (33) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1395.43114692).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
      MultiDirectional multiDirectional0 = new MultiDirectional(1395.43114692, 1395.43114692);
      multiDirectional0.setMaxIterations(1);
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (1) exceeded
         //
  }
}
