/*

 * Tue Mar 03 10:00:32 UTC 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FastDateParser_ESTest_Botsing extends FastDateParser_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(0, "tA8");
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("GMTCTT", simpleTimeZone0, locale0);
  }
}
