/*

 * Tue Mar 03 10:21:56 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.Partial;

public class Partial_ESTest_Botsing extends Partial_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = mock(DateTimeZone.class, new ViolatedAssumptionAnswer());
      doReturn((-1L)).when(dateTimeZone0).getMillisKeepLocal(any(org.joda.time.DateTimeZone.class) , anyLong());
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      Partial partial0 = new Partial(localDateTime0);
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      int int0 = 25;
      // Undeclared exception!
      partial0.with(dateTimeFieldType0, 25);
  }
}
