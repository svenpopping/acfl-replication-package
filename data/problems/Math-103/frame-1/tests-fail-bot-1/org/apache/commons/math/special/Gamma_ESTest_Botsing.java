/*

 * Tue Mar 03 10:20:40 UTC 2020
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class Gamma_ESTest_Botsing extends Gamma_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = 4.652362892704858E-5;
      int int0 = 6;
        Gamma.regularizedGammaP(4.652362892704858E-5, 1336.41644996, 4.652362892704858E-5, 6);
      
         //
         // Maximal number of iterations (6) exceeded
         //
  }
}
