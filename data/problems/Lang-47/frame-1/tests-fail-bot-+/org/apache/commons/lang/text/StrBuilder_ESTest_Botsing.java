/*

 * Tue Mar 03 11:25:53 UTC 2020
 */

package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.text.StrBuilder;
import org.apache.commons.lang.text.StrMatcher;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class StrBuilder_ESTest_Botsing extends StrBuilder_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      int int0 = 1477;
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1477, 'S');
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      Object object0 = null;
      int int0 = 1477;
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1477, '^');
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.asReader();
      strBuilder0.asTokenizer();
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 3376, 'N');
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1975);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 34, '(');
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      char char0 = '=';
      strBuilder0.lastIndexOf('=', (int) '=');
      strBuilder0.endsWith("r_");
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder0.asReader();
      strBuilder0.toStringBuffer();
      strBuilder1.deleteAll('=');
      strBuilder1.getNewLineText();
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 739, '=');
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf('=', (int) '=');
      strBuilder0.endsWith("r_");
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder0.asReader();
      strBuilder0.toStringBuffer();
      strBuilder1.deleteAll('=');
      strBuilder1.getNewLineText();
      int int0 = 739;
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 739, '=');
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int int0 = 1812;
      StrBuilder strBuilder0 = new StrBuilder(1812);
      strBuilder0.lastIndexOf((StrMatcher) null, 1812);
      strBuilder0.isEmpty();
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1812, '+');
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 1273;
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1273, ',');
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf('=', (int) '=');
      String string0 = "r_";
      strBuilder0.endsWith("r_");
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder0.asReader();
      strBuilder1.deleteAll('=');
      strBuilder1.getNewLineText();
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, (int) '=', '=');
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1477, 'S');
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf('=', 315);
      strBuilder0.toString();
      strBuilder0.endsWith("r_");
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder0.asReader();
      strBuilder1.deleteAll('=');
      strBuilder1.getNewLineText();
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 739, '=');
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1273);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1273, ',');
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.getNewLineText();
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, (int) '=', '=');
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 1273;
      StrBuilder strBuilder0 = new StrBuilder(1273);
      Object object0 = null;
      char char0 = ',';
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1273, ',');
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1975);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1975, '(');
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder();
      strBuilder0.lastIndexOf('=', (int) '=');
      strBuilder0.endsWith("r_");
      StrBuilder strBuilder1 = strBuilder0.append(false);
      strBuilder0.asReader();
      strBuilder1.deleteAll('=');
      strBuilder1.getNewLineText();
      // Undeclared exception!
      strBuilder1.appendFixedWidthPadLeft((Object) null, 739, '=');
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrBuilder strBuilder0 = new StrBuilder(1812);
      // Undeclared exception!
      strBuilder0.appendFixedWidthPadLeft((Object) null, 1812, '+');
  }
}
