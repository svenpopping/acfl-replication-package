/*

 * Tue Mar 03 11:49:23 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Partial;

public class Partial_ESTest_Botsing extends Partial_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType0, 204);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial0.with(dateTimeFieldType1, 204);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial1 = partial0.with(dateTimeFieldType0, 220);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      Partial partial2 = new Partial(partial1);
      // Undeclared exception!
      partial2.with(dateTimeFieldType1, 220);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial0 = new Partial(dateTimeFieldType0, 213);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial0.with(dateTimeFieldType1, 213);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial1 = partial0.with(dateTimeFieldType0, 220);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial1.with(dateTimeFieldType1, 220);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType0, 213);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial0.with(dateTimeFieldType1, 213);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Partial partial0 = new Partial();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      Partial partial1 = partial0.with(dateTimeFieldType0, (-393));
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial1.with(dateTimeFieldType1, (-393));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      Partial partial0 = new Partial(dateTimeFieldType0, 220);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.era();
      // Undeclared exception!
      partial0.with(dateTimeFieldType1, 220);
  }
}
