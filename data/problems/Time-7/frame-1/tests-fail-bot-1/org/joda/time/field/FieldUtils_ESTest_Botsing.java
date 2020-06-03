/*

 * Tue Mar 03 10:22:59 UTC 2020
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
      int int0 = 144;
      int int1 = (-2614);
      FieldUtils.safeMultiply(144, (-2614));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      int int2 = 0;
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 144, 1);
  }
}
