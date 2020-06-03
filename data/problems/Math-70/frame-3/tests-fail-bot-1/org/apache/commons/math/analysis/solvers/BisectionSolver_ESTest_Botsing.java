/*

 * Tue Mar 03 10:13:45 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BisectionSolver_ESTest_Botsing extends BisectionSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double0 = 0.0;
      // Undeclared exception!
      bisectionSolver0.solve(univariateRealFunction0, (-1506.19), (-400.438030169607), 0.0);
  }
}
