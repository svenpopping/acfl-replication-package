/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:19:13 GMT 2020
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
  public void test01()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("fr");
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = new Locale("`", "`", "`");
      LocaleUtils.countriesByLanguage("R:]enU`?TZ9");
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      locale1.getDisplayLanguage(locale0);
      locale0.getDisplayName();
      locale0.getDisplayName(locale1);
      locale1.getDisplayCountry(locale0);
      locale1.getDisplayScript(locale0);
      LocaleUtils.availableLocaleSet();
      Locale.getISOLanguages();
      locale1.getDisplayLanguage(locale0);
      LocaleUtils.availableLocaleSet();
      locale0.getDisplayLanguage(locale1);
      locale0.getDisplayVariant(locale1);
      LocaleUtils.availableLocaleList();
      LocaleUtils.localeLookupList(locale0);
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.languagesByCountry("");
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.availableLocaleList();
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(160, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      Locale locale1 = Locale.ITALY;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertEquals(3, list0.size());
      assertTrue(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("sq");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }
}
