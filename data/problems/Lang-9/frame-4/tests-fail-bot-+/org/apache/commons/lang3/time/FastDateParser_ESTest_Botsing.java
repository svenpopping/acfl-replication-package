/*

 * Tue Mar 03 11:15:20 GMT+00:00 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class FastDateParser_ESTest_Botsing extends FastDateParser_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2|[+\\-]\\d{2}:?\\{2}|";
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2|[+-]d{2}:?{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2|[+-]d{2}:?{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[-]d{0,1}d{2}|[+-]{2}:?d{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2|[+\\-]\\d{2}:?\\{2}|";
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone.getDefault();
      TimeZone timeZone0 = TimeZone.getDefault();
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2|[+-]d{2}:?{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      TimeZone timeZone0 = TimeZone.getTimeZone("(GMT[+-]d{0,1}d{2|[+-]d{2}:?{2}|");
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2|[+-]d{2}:?{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      locale0.getDisplayLanguage();
      locale0.getScript();
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{2}|", timeZone0, locale0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String string0 = "(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{}|";
      TimeZone timeZone0 = TimeZone.getDefault();
      Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
      FastDateParser fastDateParser0 = new FastDateParser("(GMT[+-]d{0,1}d{2}|[+-]d{2}:?d{}|", timeZone0, locale0);
  }
}
