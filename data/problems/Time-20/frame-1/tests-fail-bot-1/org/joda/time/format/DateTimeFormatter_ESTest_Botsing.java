/*

 * Tue Mar 03 10:27:27 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

public class DateTimeFormatter_ESTest_Botsing extends DateTimeFormatter_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      dateTimeFormatter0.getPivotYear();
      dateTimeFormatter0.isParser();
      DateTimeParser dateTimeParser1 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser1).toString();
      doReturn(0).when(dateTimeParser1).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter1 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser1);
      dateTimeFormatter1.getDefaultYear();
      dateTimeFormatter1.getPivotYear();
      String string0 = "k";
      // Undeclared exception!
      dateTimeFormatter1.parseDateTime("k");
  }
}
