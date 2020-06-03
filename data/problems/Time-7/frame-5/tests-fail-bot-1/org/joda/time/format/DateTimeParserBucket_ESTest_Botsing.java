/*

 * Tue Mar 03 10:24:36 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeParserBucket;

public class DateTimeParserBucket_ESTest_Botsing extends DateTimeParserBucket_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      Chronology chronology0 = iSOChronology0.withUTC();
      Locale locale0 = Locale.PRC;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1786L), chronology0, locale0, (Integer) null, (-1698));
      dateTimeParserBucket0.saveState();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      dateTimeParserBucket0.getChronology();
      dateTimeParserBucket0.getZone();
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[3];
      dateTimeParserBucket0.restoreState(chronology0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "k3");
  }
}
