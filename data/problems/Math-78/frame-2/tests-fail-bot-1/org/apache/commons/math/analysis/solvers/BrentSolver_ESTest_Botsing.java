/*

 * Tue Mar 03 10:14:13 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BrentSolver_ESTest_Botsing extends BrentSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      BrentSolver brentSolver0 = new BrentSolver(sinFunction0);
      // Undeclared exception!
      brentSolver0.solve((UnivariateRealFunction) sinFunction0, 1.0E-6, 0.5);
  }
}
