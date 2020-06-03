/*

 * Tue Mar 03 10:00:19 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class LocaleUtils_ESTest_Botsing extends LocaleUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocaleUtils.availableLocaleSet();
      LocaleUtils localeUtils0 = new LocaleUtils();
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = new Locale("yE44");
      LocaleUtils.localeLookupList(locale0, locale1);
      LocaleUtils.languagesByCountry("yE44");
      // Undeclared exception!
      LocaleUtils.toLocale("yE44");
  }
}
