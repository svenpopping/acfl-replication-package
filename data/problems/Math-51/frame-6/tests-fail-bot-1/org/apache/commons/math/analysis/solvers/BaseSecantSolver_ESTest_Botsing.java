/*

 * Tue Mar 03 10:11:10 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.IllinoisSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_Botsing extends BaseSecantSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 0.99;
      double double1 = (-2566.211025065);
      IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.99, (-2566.211025065));
      int int0 = 938;
      Expm1Function expm1Function0 = new Expm1Function();
      double double2 = 0.0;
      illinoisSolver0.solve(938, (UnivariateRealFunction) expm1Function0, 238.11, 0.0, 1.0);
      // Undeclared exception!
      illinoisSolver0.solve(1797, (UnivariateRealFunction) expm1Function0, (-2566.211025065), (double) 938, 0.0);
  }
}
