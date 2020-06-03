/*

 * Tue Mar 03 10:16:45 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class DirectSearchOptimizer_ESTest_Botsing extends DirectSearchOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1));
      MultivariateRealFunction multivariateRealFunction0 = mock(MultivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(multivariateRealFunction0).value(any(double[].class));
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[0];
        multiDirectional0.optimize(multivariateRealFunction0, goalType0, doubleArray0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
  }
}
