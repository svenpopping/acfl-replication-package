/*

 * Tue Mar 03 10:07:43 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BracketingNthOrderBrentSolver_ESTest_Botsing extends BracketingNthOrderBrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      int int0 = 4;
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      double double0 = 1244.7;
      bracketingNthOrderBrentSolver0.solve(4, (UnivariateFunction) xMinus5Function0, (-0.7773067102897375), 1244.7);
      bracketingNthOrderBrentSolver0.getFunctionValueAccuracy();
      UnivariateFunction univariateFunction0 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2340390.956397218, (-1808.62143312), 0.0, 0.0).when(univariateFunction0).value(anyDouble());
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      bracketingNthOrderBrentSolver0.solve(4, univariateFunction0, 1.0E-15, 1244.7, 5.0, allowedSolution0);
      bracketingNthOrderBrentSolver0.getAbsoluteAccuracy();
      bracketingNthOrderBrentSolver0.doSolve();
      UnivariateFunction univariateFunction1 = mock(UnivariateFunction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(343, univariateFunction1, 0.0, 5.0, 5.0);
  }
}
