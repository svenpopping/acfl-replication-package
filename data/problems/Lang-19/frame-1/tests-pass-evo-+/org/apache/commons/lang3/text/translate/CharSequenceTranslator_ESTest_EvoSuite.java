/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:21:17 GMT 2020
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.apache.commons.lang3.text.translate.UnicodeUnescaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class CharSequenceTranslator_ESTest_EvoSuite extends CharSequenceTranslator_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(0);
      assertNotNull(string0);
      assertEquals("0", string0);
      
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      assertNotNull(numericEntityUnescaper0);
      
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.above(0);
      assertNotNull(unicodeEscaper0);
      
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[2];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityUnescaper0;
      CharSequenceTranslator charSequenceTranslator0 = unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertEquals(2, charSequenceTranslatorArray0.length);
      assertNotNull(charSequenceTranslator0);
      
      CharSequenceTranslator charSequenceTranslator1 = charSequenceTranslator0.with(charSequenceTranslatorArray0);
      assertEquals(2, charSequenceTranslatorArray0.length);
      assertNotNull(charSequenceTranslator1);
      assertFalse(charSequenceTranslator1.equals((Object)charSequenceTranslator0));
      assertNotSame(charSequenceTranslator0, charSequenceTranslator1);
      assertNotSame(charSequenceTranslator1, charSequenceTranslator0);
      
      String string1 = numericEntityUnescaper0.translate((CharSequence) "0");
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertEquals("0", string1);
      
      String string2 = CharSequenceTranslator.hex(29);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertEquals("1D", string2);
      
      UnicodeUnescaper.OPTION[] unicodeUnescaper_OPTIONArray0 = new UnicodeUnescaper.OPTION[0];
      UnicodeUnescaper unicodeUnescaper0 = new UnicodeUnescaper(unicodeUnescaper_OPTIONArray0);
      assertEquals(0, unicodeUnescaper_OPTIONArray0.length);
      assertNotNull(unicodeUnescaper0);
      
      CharSequenceTranslator charSequenceTranslator2 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      assertEquals(2, charSequenceTranslatorArray0.length);
      assertNotNull(charSequenceTranslator2);
      assertFalse(charSequenceTranslator2.equals((Object)charSequenceTranslator0));
      assertFalse(charSequenceTranslator2.equals((Object)charSequenceTranslator1));
      assertNotSame(charSequenceTranslator2, charSequenceTranslator0);
      assertNotSame(charSequenceTranslator2, charSequenceTranslator1);
      
      String string3 = charSequenceTranslatorArray0[0].translate((CharSequence) "0");
      assertEquals(2, charSequenceTranslatorArray0.length);
      assertNotNull(string3);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string1));
      assertFalse(string3.equals((Object)string0));
      assertEquals("\\u0030", string3);
      
      UnicodeUnescaper.OPTION unicodeUnescaper_OPTION0 = UnicodeUnescaper.OPTION.escapePlus;
      boolean boolean0 = unicodeUnescaper0.isSet(unicodeUnescaper_OPTION0);
      assertEquals(0, unicodeUnescaper_OPTIONArray0.length);
      assertFalse(boolean0);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      StringWriter stringWriter1 = stringWriter0.append('/');
      assertEquals("/", stringWriter0.toString());
      assertEquals("/", stringWriter1.toString());
      assertNotNull(stringWriter1);
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      
      StringBuffer stringBuffer0 = stringWriter1.getBuffer();
      assertEquals("/", stringWriter0.toString());
      assertEquals("/", stringWriter1.toString());
      assertEquals("/", stringBuffer0.toString());
      assertEquals(1, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      
      int int0 = charSequenceTranslator0.translate((CharSequence) stringBuffer0, 0, (Writer) stringWriter1);
      assertEquals("/\\u002F", stringWriter0.toString());
      assertEquals("/\\u002F", stringWriter1.toString());
      assertEquals(7, stringBuffer0.length());
      assertEquals("/\\u002F", stringBuffer0.toString());
      assertEquals(2, charSequenceTranslatorArray0.length);
      assertFalse(charSequenceTranslator0.equals((Object)charSequenceTranslator2));
      assertFalse(charSequenceTranslator0.equals((Object)charSequenceTranslator1));
      assertSame(stringWriter0, stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertNotSame(charSequenceTranslator0, charSequenceTranslator2);
      assertNotSame(charSequenceTranslator0, charSequenceTranslator1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      assertNotNull(unicodeEscaper0);
      
      StringWriter stringWriter0 = new StringWriter(546);
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      boolean boolean0 = unicodeEscaper0.translate(546, (Writer) stringWriter0);
      assertEquals("\\u0222", stringWriter0.toString());
      assertTrue(boolean0);
      
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("\\u0222", stringWriter0.toString());
      
      UnicodeEscaper unicodeEscaper1 = UnicodeEscaper.above(1);
      assertNotNull(unicodeEscaper1);
      assertFalse(unicodeEscaper1.equals((Object)unicodeEscaper0));
      assertNotSame(unicodeEscaper1, unicodeEscaper0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      assertNotNull(numericEntityUnescaper0);
      
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above((-2405));
      assertNotNull(numericEntityEscaper0);
      
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.outsideOf((-2405), 92);
      assertNotNull(unicodeEscaper0);
      
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
      assertNotNull(lookupTranslator0);
      
      String string0 = CharSequenceTranslator.hex((-2405));
      assertNotNull(string0);
      assertEquals("FFFFF69B", string0);
      
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[6];
      UnicodeEscaper unicodeEscaper1 = UnicodeEscaper.between(730, (-850));
      assertNotNull(unicodeEscaper1);
      assertFalse(unicodeEscaper1.equals((Object)unicodeEscaper0));
      assertNotSame(unicodeEscaper1, unicodeEscaper0);
      
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) unicodeEscaper1;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) lookupTranslator0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityUnescaper0;
      LookupTranslator lookupTranslator1 = new LookupTranslator((CharSequence[][]) null);
      assertNotNull(lookupTranslator1);
      assertFalse(lookupTranslator1.equals((Object)lookupTranslator0));
      
      charSequenceTranslatorArray0[4] = (CharSequenceTranslator) lookupTranslator1;
      charSequenceTranslatorArray0[5] = (CharSequenceTranslator) numericEntityEscaper0;
      CharSequenceTranslator charSequenceTranslator0 = lookupTranslator0.with(charSequenceTranslatorArray0);
      assertEquals(6, charSequenceTranslatorArray0.length);
      assertNotNull(charSequenceTranslator0);
      assertFalse(lookupTranslator0.equals((Object)lookupTranslator1));
      assertNotSame(lookupTranslator0, lookupTranslator1);
      
      StringWriter stringWriter0 = new StringWriter();
      assertEquals("", stringWriter0.toString());
      assertNotNull(stringWriter0);
      
      StringWriter stringWriter1 = stringWriter0.append('k');
      assertEquals("k", stringWriter1.toString());
      assertEquals("k", stringWriter0.toString());
      assertNotNull(stringWriter1);
      assertSame(stringWriter1, stringWriter0);
      assertSame(stringWriter0, stringWriter1);
      
      int int0 = lookupTranslator0.translate((CharSequence) "FFFFF69B", 92, (Writer) stringWriter1);
      assertEquals("k", stringWriter1.toString());
      assertEquals("k", stringWriter0.toString());
      assertFalse(lookupTranslator0.equals((Object)lookupTranslator1));
      assertSame(stringWriter1, stringWriter0);
      assertNotSame(lookupTranslator0, lookupTranslator1);
      assertSame(stringWriter0, stringWriter1);
      assertEquals(0, int0);
      
      NumericEntityEscaper numericEntityEscaper1 = NumericEntityEscaper.outsideOf(2284, (-879));
      assertNotNull(numericEntityEscaper1);
      assertFalse(numericEntityEscaper1.equals((Object)numericEntityEscaper0));
      assertNotSame(numericEntityEscaper1, numericEntityEscaper0);
      
      numericEntityUnescaper0.translate((CharSequence) "FFFFF69B", (Writer) stringWriter0);
      assertEquals("kFFFFF69B", stringWriter0.toString());
      assertSame(stringWriter0, stringWriter1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = CharSequenceTranslator.hex(2815);
      assertNotNull(string0);
      assertEquals("AFF", string0);
      
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(2815);
      assertNotNull(numericEntityEscaper0);
      
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[4];
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[2] = (CharSequenceTranslator) numericEntityEscaper0;
      charSequenceTranslatorArray0[3] = (CharSequenceTranslator) numericEntityEscaper0;
      CharSequenceTranslator charSequenceTranslator0 = numericEntityEscaper0.with(charSequenceTranslatorArray0);
      assertEquals(4, charSequenceTranslatorArray0.length);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][6];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter(2);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      lookupTranslator0.translate((CharSequence) stringBuffer0, (Writer) stringWriter0);
      lookupTranslator0.translate((CharSequence) stringBuffer0);
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between(2, (-758));
      assertNotNull(unicodeEscaper0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharSequenceTranslator.hex((-499));
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.between((-938), (-938));
      String string0 = unicodeEscaper0.translate((CharSequence) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharSequenceTranslator.hex(0);
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper();
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[12];
      numericEntityUnescaper0.translate((CharSequence) "0");
      UnicodeUnescaper.OPTION[] unicodeUnescaper_OPTIONArray0 = new UnicodeUnescaper.OPTION[1];
      CharSequenceTranslator charSequenceTranslator0 = numericEntityUnescaper0.with(charSequenceTranslatorArray0);
      assertNotNull(charSequenceTranslator0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[5][5];
      CharSequenceTranslator.hex(1564);
      CharSequence[] charSequenceArray1 = new CharSequence[1];
      charSequenceArray1[0] = (CharSequence) "61C";
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      String string0 = unicodeEscaper0.translate(charSequenceArray1[0]);
      assertEquals("\\u0036\\u0031\\u0043", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      StringWriter stringWriter0 = new StringWriter();
      unicodeEscaper0.translate((CharSequence) null, (Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }
}
