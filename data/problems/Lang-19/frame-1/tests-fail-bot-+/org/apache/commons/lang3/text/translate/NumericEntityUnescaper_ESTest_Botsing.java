/*

 * Tue Mar 03 11:30:56 UTC 2020
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

public class NumericEntityUnescaper_ESTest_Botsing extends NumericEntityUnescaper_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4990);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&p'y:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<di&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#Uk,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|,", 10, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4990);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssd&mpy:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssd||py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(10);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", 10, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4990);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdI&py:`&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "3+<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(1137);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ss|i&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D?&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&epy:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi'py:D&#|k,", 10, (Writer) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:&#|k", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter(4990);
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:5D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4959);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(4975);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<sbsdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<sdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdipy:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", 10, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&pyD&#|k", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", 10, (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<-ssdi&py:D&#|k,", (Writer) stringWriter0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", 10, (Writer) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(45);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      // Undeclared exception!
      numericEntityUnescaper0.translate((CharSequence) "<ssdi&py:D&#|k,", (Writer) stringWriter0);
  }
}
