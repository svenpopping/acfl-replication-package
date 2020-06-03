/*

 * Tue Mar 03 10:10:25 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractUnivariateRealSolver_ESTest_Botsing extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.5;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      sincFunction0.derivative();
      double double1 = 1184.738034171;
      sincFunction0.derivative();
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(7, (UnivariateFunction) sincFunction0, (-1185.0), 2656.4, allowedSolution0);
  }
}
