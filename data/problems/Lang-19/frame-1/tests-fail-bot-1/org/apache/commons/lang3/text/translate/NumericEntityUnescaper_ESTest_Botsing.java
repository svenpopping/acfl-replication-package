/*

 * Tue Mar 03 10:15:34 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class NumericEntityUnescaper_ESTest_Botsing extends NumericEntityUnescaper_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      char[] charArray0 = new char[5];
      charArray0[1] = '&';
      charArray0[2] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append((CharSequence) charBuffer0);
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, 1, (Writer) stringWriter1);
  }
}
