/*

 * Tue Mar 03 10:00:35 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FastDateParser_ESTest_Botsing extends FastDateParser_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getTimeZone("wFwY^-\"x`;{.Dk[P");
      FastDateParser fastDateParser0 = null;
      fastDateParser0 = new FastDateParser("GJ=", timeZone0, locale0);
  }
}
