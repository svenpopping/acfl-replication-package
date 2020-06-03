/*

 * Tue Mar 03 10:10:19 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_Botsing extends BaseSecantSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
      SinFunction sinFunction0 = new SinFunction();
      sinFunction0.derivative();
      // Undeclared exception!
      pegasusSolver0.solve(5, (UnivariateRealFunction) sinFunction0, 0.5, (double) 5);
  }
}
