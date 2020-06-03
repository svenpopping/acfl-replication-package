/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:23:40 GMT 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.lang3.time.FormatCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FormatCache_ESTest_EvoSuite extends FormatCache_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Locale locale0 = Locale.ROOT;
      String string0 = FormatCache.getPatternForStyle(integer0, integer0, locale0);
      assertEquals("MMMM d, yyyy h:mm:ss a z", string0);
  }

}
