/*

 * Tue Mar 03 16:45:35 GMT+05:30 2020
 */

package org.apache.commons.lang3.time;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;

import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.apache.commons.lang3.time.FastDateParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class FastDateParser_ESTest_Botsing extends FastDateParser_ESTest_scaffolding_Botsing {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        TimeZone timeZone0 = TimeZone.getDefault();
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMT", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(61, "GMTAET");
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", simpleTimeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GaTAEc", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTART", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        String string0 = "GMTAET";
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTa>AET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(2, "GMTPST");
        FastDateParser fastDateParser0 = new FastDateParser("GMTPST", simpleTimeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getTimeZone("GMTAET");
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(61, " MY<#j4d2v.OGq");
        FastDateParser fastDateParser0 = new FastDateParser("GMTAET", simpleTimeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getDefault();
        FastDateParser fastDateParser0 = new FastDateParser("GMTPNT", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        TimeZone timeZone0 = mock(TimeZone.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(timeZone0).getOffset(anyLong());
        doReturn(0).when(timeZone0).getRawOffset();
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        FastDateParser fastDateParser0 = new FastDateParser("GMTART", timeZone0, locale0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        Locale locale0 = FastDateParser.JAPANESE_IMPERIAL;
        TimeZone timeZone0 = TimeZone.getTimeZone("MY<#j4d2v.OGP");
        FastDateParser fastDateParser0 = null;
        fastDateParser0 = new FastDateParser("GJ=", timeZone0, locale0);
    }
}
