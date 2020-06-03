/*

 * Tue Mar 03 10:15:48 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class DirectSearchOptimizer_ESTest_Botsing extends DirectSearchOptimizer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      int int0 = Integer.MAX_VALUE;
      int int1 = (-1378);
      multiDirectional0.setMaxIterations((-1378));
        multiDirectional0.incrementIterationsCounter();
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,378) exceeded
         //
  }
}
