/*

 * Tue Mar 03 10:19:11 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.BrentSolver;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BrentSolver_ESTest_Botsing extends BrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0, 0.0).when(univariateRealFunction0).value(anyDouble());
      BrentSolver brentSolver0 = new BrentSolver(univariateRealFunction0);
      double double0 = 1067.18462;
      brentSolver0.isSequence(173.08732466, 1067.18462, 1067.18462);
      double double1 = Double.NaN;
      // Undeclared exception!
      brentSolver0.solve(Double.NaN, 173.08732466);
  }
}
