/*

 * Tue Mar 03 10:26:04 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.field.FieldUtils;

public class FieldUtils_ESTest_Botsing extends FieldUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = (-1);
      FieldUtils.verifyValueBounds("", (-1), (-1), (-1));
      FieldUtils.safeMultiply((long) (-1), (-1));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      int int1 = 0;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1077, (-4256), 0);
  }
}
