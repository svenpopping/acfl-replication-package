/*

 * Tue Mar 03 10:08:47 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BracketingNthOrderBrentSolver_ESTest_Botsing extends BracketingNthOrderBrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = (-1.0);
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1.0), 2);
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn((double)2, (-1.0)).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(2, univariateFunction0, (-1.0), 0.5, 0.0, allowedSolution0);
  }
}
