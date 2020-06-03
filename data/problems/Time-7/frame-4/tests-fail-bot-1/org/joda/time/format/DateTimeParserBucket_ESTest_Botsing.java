/*

 * Tue Mar 03 10:24:15 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.MockZone;
import org.joda.time.ReadableDuration;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeParserBucket;

public class DateTimeParserBucket_ESTest_Botsing extends DateTimeParserBucket_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(durationField0).isSupported();
      DateTimeParserBucket.compareReverse(durationField0, (DurationField) null);
      DateTimeParserBucket.SavedField[] dateTimeParserBucket_SavedFieldArray0 = new DateTimeParserBucket.SavedField[6];
      DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      Integer.getInteger("");
      Instant instant0 = new Instant((Object) null);
      Instant instant1 = instant0.withMillis(0);
      Instant instant2 = instant1.toInstant();
      Duration duration0 = Duration.standardHours(1);
      Instant instant3 = instant2.plus((ReadableDuration) duration0);
      int int0 = (-5672);
      instant3.toString();
      Integer.compare((-5672), (-5672));
      duration0.minus((long) 0);
      Chronology chronology0 = instant3.getChronology();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, chronology0, locale0, (Integer) null);
      dateTimeParserBucket0.setOffset((Integer) null);
      dateTimeParserBucket0.computeMillis(true);
      instant3.equals(locale0);
      MockZone mockZone0 = new MockZone(0, 1, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeField0, (-167));
      DurationField durationField1 = buddhistChronology0.centuries();
      DateTimeParserBucket.compareReverse(durationField1, (DurationField) null);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }
}
