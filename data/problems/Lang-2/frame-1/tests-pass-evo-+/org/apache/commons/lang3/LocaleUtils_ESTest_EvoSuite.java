/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:19:27 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class LocaleUtils_ESTest_EvoSuite extends LocaleUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("fr");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("Vu?<");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.availableLocaleList();
      assertEquals(160, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale locale0 = new Locale("9X!VQ-%", "9X!VQ-%", "z8$3}I1");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("sv");
      Locale locale1 = Locale.GERMANY;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertEquals(3, list0.size());
      assertTrue(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.CHINA;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
  }
}