/*

 * Tue Mar 03 10:02:07 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class StringUtils_ESTest_Botsing extends StringUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringUtils.isAllLowerCase("coMG*x2O~f");
      StringUtils.replace("coMG*x2O~f", "coMG*x2O~f", (String) null);
      StringUtils.isNumericSpace("coMG*x2O~f");
      String[] stringArray0 = new String[9];
      stringArray0[0] = "ffqAU_g";
      stringArray0[1] = "coMG*x2O~f";
      stringArray0[2] = null;
      stringArray0[3] = null;
      stringArray0[4] = "coMG*x2O~f";
      stringArray0[5] = null;
      stringArray0[6] = "coMG*x2O~f";
      stringArray0[7] = "coMG*x2O~f";
      stringArray0[8] = null;
      // Undeclared exception!
      StringUtils.replaceEach("coMG*x2O~f", stringArray0, stringArray0);
  }
}
