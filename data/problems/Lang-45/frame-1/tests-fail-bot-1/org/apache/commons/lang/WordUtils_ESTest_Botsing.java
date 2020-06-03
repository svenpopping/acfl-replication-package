/*

 * Tue Mar 03 10:09:00 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class WordUtils_ESTest_Botsing extends WordUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WordUtils wordUtils0 = new WordUtils();
      String string0 = "j9Y-x^[1";
      int int0 = (-975);
      // Undeclared exception!
      WordUtils.abbreviate("j9Y-x^[1", (-975), (-975), "j9Y-x^[1");
  }
}
