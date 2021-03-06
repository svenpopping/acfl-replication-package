/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:36:05 GMT 2020
 */

package org.apache.commons.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.exception.util.Localizable;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;

public class MathRuntimeException_ESTest_EvoSuite extends MathRuntimeException_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.SHAPE;
      Object[] objectArray0 = new Object[3];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(localizedFormats0, objectArray0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.math.MathRuntimeException$8");
      mathRuntimeException0.printStackTrace((PrintStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE;
      ConcurrentModificationException concurrentModificationException0 = MathRuntimeException.createConcurrentModificationException(localizedFormats0, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(concurrentModificationException0);
      Locale locale0 = Locale.UK;
      String string0 = mathRuntimeException0.getMessage(locale0);
      assertEquals("sample size ({0}) must be less than or equal to population size ({1})", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Localizable) null, objectArray0);
      String string0 = mathRuntimeException0.getLocalizedMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Localizable) null, objectArray0);
      Locale locale0 = Locale.FRENCH;
      String string0 = mathRuntimeException0.getMessage(locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Throwable) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException((Localizable) null, (Object[]) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CANNOT_COMPUTE_0TH_ROOT_OF_UNITY;
      Object[] objectArray0 = new Object[2];
      ParseException parseException0 = MathRuntimeException.createParseException(3372, localizedFormats0, objectArray0);
      RuntimeException runtimeException0 = MathRuntimeException.createInternalError(parseException0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(runtimeException0);
      String string0 = mathRuntimeException0.getMessage();
      assertEquals("internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NOT_SUPPORTED_IN_DIMENSION_N;
      Object[] objectArray0 = new Object[2];
      ParseException parseException0 = MathRuntimeException.createParseException((-4195), localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(parseException0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.OBJECT_TRANSFORMATION;
      Object[] objectArray0 = new Object[5];
      IllegalStateException illegalStateException0 = MathRuntimeException.createIllegalStateException(localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(illegalStateException0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NEGATIVE_BRIGHTNESS_EXPONENT;
      IllegalStateException illegalStateException0 = MathRuntimeException.createIllegalStateException(localizedFormats0, (Object[]) null);
      IOException iOException0 = MathRuntimeException.createIOException(illegalStateException0);
      assertNotNull(iOException0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.DIMENSIONS_MISMATCH_SIMPLE;
      Object[] objectArray0 = new Object[8];
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Localizable) localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(illegalArgumentException0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      LocalizedFormats localizedFormats0 = LocalizedFormats.EVALUATION_FAILED;
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Localizable) localizedFormats0, objectArray0);
      IllegalArgumentException illegalArgumentException1 = MathRuntimeException.createIllegalArgumentException((Throwable) illegalArgumentException0);
      assertNotNull(illegalArgumentException1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.EMPTY_POLYNOMIALS_COEFFICIENTS_ARRAY;
      Object[] objectArray0 = new Object[5];
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0 = MathRuntimeException.createArrayIndexOutOfBoundsException(localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(arrayIndexOutOfBoundsException0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.NUMERATOR_OVERFLOW_AFTER_MULTIPLY;
      ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0 = MathRuntimeException.createArrayIndexOutOfBoundsException(localizedFormats0, (Object[]) null);
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Throwable) arrayIndexOutOfBoundsException0);
      assertNotNull(illegalArgumentException0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE;
      ConcurrentModificationException concurrentModificationException0 = MathRuntimeException.createConcurrentModificationException(localizedFormats0, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(concurrentModificationException0);
      mathRuntimeException0.printStackTrace();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArithmeticException arithmeticException0 = MathRuntimeException.createArithmeticException((Localizable) null, (Object[]) null);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(arithmeticException0, (Localizable) null, (Object[]) null);
      String string0 = mathRuntimeException0.getMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.MAX_EVALUATIONS_EXCEEDED;
      Object[] objectArray0 = new Object[18];
      ParseException parseException0 = MathRuntimeException.createParseException(545, localizedFormats0, objectArray0);
      RuntimeException runtimeException0 = MathRuntimeException.createInternalError(parseException0);
      IllegalArgumentException illegalArgumentException0 = MathRuntimeException.createIllegalArgumentException((Throwable) runtimeException0);
      assertNotNull(illegalArgumentException0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalizedFormats localizedFormats0 = LocalizedFormats.CROSSING_BOUNDARY_LOOPS;
      Object[] objectArray0 = new Object[0];
      NoSuchElementException noSuchElementException0 = MathRuntimeException.createNoSuchElementException(localizedFormats0, objectArray0);
      MathRuntimeException mathRuntimeException0 = new MathRuntimeException(noSuchElementException0);
      String string0 = mathRuntimeException0.getLocalizedMessage();
      assertEquals("some outline boundary loops cross each other", string0);
  }

}
