/*

 * Tue Mar 03 10:26:05 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.field.TestPreciseDurationDateTimeField;

public class PreciseDurationDateTimeField_ESTest_Botsing extends PreciseDurationDateTimeField_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0.set(0L, (-1));
  }
}
