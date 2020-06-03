/*

 * Tue Mar 03 10:06:51 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractUnivariateRealSolver_ESTest_Botsing extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
        mullerSolver0.computeObjectiveValue((-0.0625));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }
}
