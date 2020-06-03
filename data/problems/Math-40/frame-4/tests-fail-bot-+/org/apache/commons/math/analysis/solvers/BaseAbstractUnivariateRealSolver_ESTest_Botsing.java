/*

 * Tue Mar 03 11:29:10 UTC 2020
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
      SincFunction sincFunction0 = new SincFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1036.2048430655652), (-1036.2048430655652), (-1036.2048430655652), 306);
      AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(306, (UnivariateFunction) sincFunction0, (-1036.2048430655652), (double) 306, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1036.2048430655652), (-1036.2048430655652), (-1036.2048430655652), 306);
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(306, (UnivariateFunction) sincFunction0, (-1036.2048430655652), (double) 306, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1036.2048430655652), (-1036.2048430655652), (-1036.2048430655652), 306);
      bracketingNthOrderBrentSolver0.getMaxEvaluations();
      AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(306, (UnivariateFunction) sincFunction0, (-1036.2048430655652), (double) 306, (double) 0, allowedSolution0);
  }
}
