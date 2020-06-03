/*

 * Tue Mar 03 10:21:24 UTC 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.Partial;
import org.joda.time.chrono.ISOChronology;

public class Partial_ESTest_Botsing extends Partial_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[8];
      DurationFieldType durationFieldType0 = DurationFieldType.ERAS_TYPE;
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[7] = dateTimeFieldType0;
      int[] intArray0 = new int[8];
      intArray0[0] = 93;
      intArray0[1] = 0;
      intArray0[2] = 0;
      intArray0[3] = 23034375;
      intArray0[4] = (-1623);
      intArray0[5] = 1971;
      intArray0[6] = 1475;
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withUTC();
      Chronology chronology1 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(chronology0).when(chronology1).withUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, chronology1);
  }
}
