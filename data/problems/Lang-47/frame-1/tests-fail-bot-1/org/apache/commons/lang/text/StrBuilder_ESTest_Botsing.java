/*

 * Tue Mar 03 10:09:03 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class StrBuilder_ESTest_Botsing extends StrBuilder_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1134);
      Object object0 = new Object();
      char char0 = '';
      StrBuilder strBuilder1 = strBuilder0.appendFixedWidthPadRight(object0, 1134, '');
      StrBuilder strBuilder2 = strBuilder1.setNewLineText((String) null);
      strBuilder1.startsWith("");
      strBuilder2.lastIndexOf('x', 662);
      strBuilder2.append(780.37);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 662, '');
  }
}
