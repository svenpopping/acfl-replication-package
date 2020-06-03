/*

 * Tue Mar 03 10:27:07 UTC 2020
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.JulianChronology;

public class BaseSingleFieldPeriod_ESTest_Botsing extends BaseSingleFieldPeriod_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      ReadablePartial readablePartial0 = mock(ReadablePartial.class, new ViolatedAssumptionAnswer());
      doReturn(julianChronology0).when(readablePartial0).getChronology();
      doReturn(dateTimeFieldType0).when(readablePartial0).getFieldType(anyInt());
      doReturn(0).when(readablePartial0).getValue(anyInt());
      doReturn((-963), (-963), (-963), (-963), 8).when(readablePartial0).size();
      ReadablePeriod readablePeriod0 = mock(ReadablePeriod.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      BaseSingleFieldPeriod.between(readablePartial0, readablePartial0, readablePeriod0);
  }
}
