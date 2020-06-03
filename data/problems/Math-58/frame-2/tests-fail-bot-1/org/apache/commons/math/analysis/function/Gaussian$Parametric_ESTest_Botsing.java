/*

 * Tue Mar 03 10:12:00 UTC 2020
 */

package org.apache.commons.math.analysis.function;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.function.Gaussian;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class Gaussian$Parametric_ESTest_Botsing extends Gaussian$Parametric_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = 0.0;
      doubleArray0[2] = 0.0;
      // Undeclared exception!
      gaussian_Parametric0.value(0.0, doubleArray0);
  }
}
