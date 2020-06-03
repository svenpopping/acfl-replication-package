/*

 * Tue Mar 03 11:25:49 UTC 2020
 */

package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class LocaleUtils_ESTest_Botsing extends LocaleUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("th");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
      LinkedList<Locale> linkedList1 = new LinkedList<Locale>();
      Locale.lookup(linkedList0, linkedList1);
      // Undeclared exception!
      LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocaleUtils.toLocale((String) null);
      // Undeclared exception!
      LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = null;
      LocaleUtils localeUtils0 = new LocaleUtils();
      // Undeclared exception!
      LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("Ivaid locale format: ");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Locale locale0 = new Locale("!f]Hnp..5t5,?5:");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = new Locale("Invalid locale format: ", "Invalid locale format: ", "Invalid locale format: ");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = new Locale("~Y");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.US;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      LocaleUtils.isAvailableLocale((Locale) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("?d|^Qji5.*u-a", "?d|^Qji5.*u-a", "?d|^Qji5.*u-a");
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.getDefault();
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      // Undeclared exception!
      LocaleUtils.isAvailableLocale(locale0);
  }
}
