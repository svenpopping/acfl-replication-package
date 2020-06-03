/*

 * Tue Mar 03 10:09:03 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class LocaleUtils_ESTest_Botsing extends LocaleUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }
}
