/*

 * Tue Mar 03 10:26:44 UTC 2020
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;

public class BaseChronology_ESTest_Botsing extends BaseChronology_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn(0).when(readablePartial0).getValue(anyInt());
      doReturn(3601).when(readablePartial0).size();
      int int0 = (-2372);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.getBase();
      // Undeclared exception!
      buddhistChronology0.set(readablePartial0, (-1895L));
  }
}
