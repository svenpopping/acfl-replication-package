/*

 * Tue Mar 03 10:18:09 UTC 2020
 */

package org.apache.commons.math.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.UnivariateRealSolverUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class UnivariateRealSolverUtils_ESTest_Botsing extends UnivariateRealSolverUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnivariateRealFunction univariateRealFunction0 = mock(UnivariateRealFunction.class, new ViolatedAssumptionAnswer());
      double double0 = 217.766;
      double double1 = (-711.15807556);
      // Undeclared exception!
      UnivariateRealSolverUtils.bracket(univariateRealFunction0, 217.766, (-711.15807556), (-711.15807556));
  }
}
