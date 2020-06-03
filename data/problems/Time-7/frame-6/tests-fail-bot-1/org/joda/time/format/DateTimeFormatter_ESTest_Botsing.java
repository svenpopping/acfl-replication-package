/*

 * Tue Mar 03 10:25:22 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class DateTimeFormatter_ESTest_Botsing extends DateTimeFormatter_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      MutableDateTime mutableDateTime0 = new MutableDateTime(0L, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeFormatterBuilder.TwoDigitYear dateTimeFormatterBuilder_TwoDigitYear0 = new DateTimeFormatterBuilder.TwoDigitYear(dateTimeFieldType0, 3, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TwoDigitYear0, dateTimeFormatterBuilder_TwoDigitYear0);
      dateTimeFormatter0.getPivotYear();
      // Undeclared exception!
      dateTimeFormatter0.parseInto(mutableDateTime0, "S-4`y%UpNM5Yq<", 1);
  }
}
