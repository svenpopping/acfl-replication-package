/*

 * Tue Mar 03 10:17:40 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class UnivariateRealSolverUtils_ESTest_Botsing extends UnivariateRealSolverUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      UnivariateRealFunction univariateRealFunction0 = quinticFunction0.derivative();
      int int0 = 3075;
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 3075);
  }
}
