/*

 * Tue Mar 03 10:10:43 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseSecantSolver_ESTest_Botsing extends BaseSecantSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PegasusSolver pegasusSolver0 = new PegasusSolver((-2646.623), 2352.220741, 795.2052472089547);
      QuinticFunction quinticFunction0 = new QuinticFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.30116867893975674);
      Expm1Function expm1Function0 = new Expm1Function();
      expm1Function0.derivative();
      int int0 = 143;
      AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
      // Undeclared exception!
      pegasusSolver0.solve(143, (UnivariateRealFunction) quinticFunction0, (-8.0E298), 360.72238, (-28.0), allowedSolution0);
  }
}
