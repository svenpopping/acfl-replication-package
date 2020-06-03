/*

 * Tue Mar 03 10:00:18 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class LocaleUtils_ESTest_Botsing extends LocaleUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocaleUtils.availableLocaleList();
      String string0 = "";
      LocaleUtils.languagesByCountry("");
      // Undeclared exception!
      LocaleUtils.toLocale("");
  }
}
