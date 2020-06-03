/*

 * Tue Mar 03 11:24:44 UTC 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class CharSequenceTranslator_ESTest_Botsing extends CharSequenceTranslator_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[8];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[6];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[12];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[16];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[9];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[8];
      charArray0[4] = '&';
      charArray0[5] = '#';
      stringWriter0.write(charArray0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
  }
}
