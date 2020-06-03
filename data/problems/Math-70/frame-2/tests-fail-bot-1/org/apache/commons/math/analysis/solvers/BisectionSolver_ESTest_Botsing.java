/*

 * Tue Mar 03 10:13:38 UTC 2020
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
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      BisectionSolver bisectionSolver0 = new BisectionSolver(univariateRealFunction0);
      double double0 = 0.5;
      bisectionSolver0.setAbsoluteAccuracy(0.5);
      int int0 = 0;
      bisectionSolver0.setResult(0.5, 0);
      bisectionSolver0.getMaximalIterationCount();
      BisectionSolver bisectionSolver1 = new BisectionSolver();
      bisectionSolver0.getMaximalIterationCount();
      bisectionSolver0.getIterationCount();
      // Undeclared exception!
      bisectionSolver1.solve((-1373.010620956), (double) 100);
  }
}
