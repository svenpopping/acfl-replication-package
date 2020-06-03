/*

 * Tue Mar 03 10:05:20 UTC 2020
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
      StringUtils.isAlphanumericSpace((String) null);
      String[] stringArray0 = new String[4];
      stringArray0[0] = null;
      stringArray0[1] = "c";
      stringArray0[2] = "c";
      stringArray0[3] = "c";
      // Undeclared exception!
      StringUtils.replaceEach("c", stringArray0, stringArray0);
  }
}
