/*

 * Tue Mar 03 11:53:10 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.joda.time.MockZone;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;

public class FieldUtils_ESTest_Botsing extends FieldUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, 1849, 1849);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-5697));
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-15), 1843, 1843);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      FieldUtils.getWrappedValue(292278993, 0, 292278993);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 292278993, 292278993, 0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2552, 2552, 0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 32, (-223), (-223));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2919), (-2919), (-5697));
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 3607, (-2024), (-2024));
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 41, 41, (-4206));
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-2297));
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2493, 2493, (-1));
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 542, 1849, 542);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-3305), 0, (-3305));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 534, 534, (-741));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      FieldUtils.safeToInt((-1L));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1), 1295, (-1));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, 588, 588);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 1843, 1843);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 723, 1121, 723);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 19, 1843, 1843);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-7), 32, 32);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 32, 1);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, 1);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 32, 32, 0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-1872), 0, 0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 547, (-1436), (-1436));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), 1192);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1192, 1192, (-1413));
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 8, 0, 0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 32, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(534L, 534L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 285156, 285156, 0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-3), 1839, 1839);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1910, 52, 52);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 1, (-1413));
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 0, 2990, 2990);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 1066, 1066, 708);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-1), (-1), (-728));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-710), 32, (-710));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 20587500, 1, 1);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 1045, 24, 24);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 547, 547, 19);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, (-2147483646), (-2147483646));
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 1, (-3436), (-3436));
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 0, 0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.clockhourOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 32, 32, 1);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      FieldUtils.safeNegate(4224);
      FieldUtils.getWrappedValue(4224, (-5667), 4224);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-4224), 4224, 4224);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 2266, 2266, 0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 570, 534, 534);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-59), (-59), (-3095));
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-778), (-628), (-628));
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 547, 84985587, 547);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 559, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2023));
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      FieldUtils.safeMultiply(708, 708);
      FieldUtils.safeAdd(708, 501264);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 501264, 501972, 501264);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2241, 2241, 0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-150));
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 2552, 2552, 0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 4, 4, (-2630));
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, 1, (-2041));
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2016));
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      GregorianCalendar gregorianCalendar0 = dateTime0.toGregorianCalendar();
      LocalTime localTime0 = LocalTime.fromCalendarFields(gregorianCalendar0);
      // Undeclared exception!
      localTime0.withMinuteOfHour((-1));
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 1, 1, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-2041), 67, (-2041));
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 32, 0, 0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4359, 0, 0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-360), (-360), (-1157));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1, 32, 32);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 28, 32, 32);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 63, 63, (-2041));
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 292279536, 32, 32);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.getWrappedValue((-33), (-33), (-33), 1668);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-33), 1668, 1636);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 597, 1);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-331), (-331), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 2792, 2792);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, 0, (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 67, 32, 32);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 690, 24, 24);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-33), 3126, 3126);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 6, 6, (-2041));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 29, (-2041), (-2041));
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 41, 41, 5);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2011, 2011, 1467);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-55), (-827), (-827));
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 17, 17, (-292269054));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 14, 14);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 3820, 1855);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2022));
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 534, 534, (-728));
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2601), 32, 32);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 7, 1828, 7);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2531), 86399999, (-2531));
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 78, 78, (-2065));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 292279536, 32, 32);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 0, (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1));
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-1), 65, 65);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-485), (-485), (-2041));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-360), (-3772), (-3772));
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 983, 983, 1);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2297));
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1634), 708, 708);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 34, 34, (-2041));
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 574, 574, 41);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, 0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2008));
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 659, 32);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 1855, 0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1, 547, 547);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 7, 1843, 1843);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 313, 313, 3);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1794, 1794, (-1536));
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      FieldUtils.safeAdd((-2913), (-2913));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-2913), (-2913), (-5826));
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 699, (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        buddhistChronology0.getDateTimeMillis(1, (-2072), (-2072), 1, 1, 1, 1);
      
         //
         // Value -2072 for monthOfYear must be in the range [1,12]
         //
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1192, (-1413), 1192);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1192, 1192, (-1413));
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 52, 52, (-5697));
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1469, 1469);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-292269054));
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 1855, 0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, (-360), (-360));
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.getWrappedValue(32, 3126, 32, 3126);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 32, 3126, 63);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      BuddhistChronology.getInstanceUTC();
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-1634), 1, (-1634));
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, 588, 1);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2695), 0, 0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 2147483630, 2147483630, (-1));
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 1192, 1192);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1192, 1192, (-1413));
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2041));
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 2792, 2792);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      FieldUtils.safeNegate(3678);
      FieldUtils.safeMultiplyToInt(3678, (-3678));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-3678), (-13527684), (-13527684));
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, 1374, (-40), (-40));
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 4514, 0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      FieldUtils.safeToInt(692L);
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 692, 296, 296);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, (-2041), (-2041));
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      FieldUtils.safeMultiply(708, 708);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 501264, 501264);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 547, 1171, 1171);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 1855, 0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1634), 1, 708);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2041), 24, 24);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockOffsetDateTimeField0, 22, 22, 1);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-451), 1843, 1843);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-33), 1843, (-33));
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 32, 32, (-690));
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1849, 1849, 0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2037));
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      FieldUtils.safeMultiplyToInt(1855, 1855);
      BuddhistChronology.getInstance();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 3441025, 1);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-2147132291));
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      FieldUtils.safeToInt(2147483647L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MAX_VALUE, 1295, 1295);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 41, 41, (-5697));
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-360), (-360), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 770, 2007, 770);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 1192, 43, 43);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-5697), 41, 41);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-77), (-607), (-607));
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 12, 12, 1);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, (-36), (-3890), (-3890));
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 63, 1963, 1963);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 20587531, 1, 1);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 32, (-12));
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-5024));
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 550, 550, 354);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-3385), 866, 866);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 1843, 0);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeMultiplyToInt(2001L, 2001L);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-2196), 4004001, 4004001);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4361, 4361, 1584);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 2147016702, 2147016702, 0);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, (-21), (-21));
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4361, 4361, 1584);
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 534);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 534, 534, 1);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-3165), 52, 52);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      FieldUtils.safeToInt(243L);
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 243, 1843, 243);
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      FieldUtils.safeMultiply((-4389), (-4389));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-4389), 19263321, 19263321);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, 0);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-5722));
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-3771));
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, 1374, (-36), (-36));
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-33), 1, 32);
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      FieldUtils.safeMultiply(708, (-1634));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 708, (-1634), (-1156872));
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, 23, 23);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2065));
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 14, 14, 0);
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2041));
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 313, (-2041), (-2041));
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, Integer.MIN_VALUE, (-1639), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockOffsetDateTimeField0, 32, 32, (-360));
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 12, 12, (-4));
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 57, 57, (-5697));
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, (-2729), (-2729));
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 659, 659, 54);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1807, (-2041), (-2041));
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 4361, 4361, 1564);
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1996, 1996, (-2041));
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2927), (-360), (-360));
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 15356250, 15356250, (-1060));
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(1995, 1995);
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 57, 57, 0);
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 534, 534, 50);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      FieldUtils.safeNegate(3678);
      FieldUtils.safeMultiplyToInt((-3678), (-3678));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-3678), 13527684, (-3678));
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 710, 1, 1);
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 0, 0);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      FieldUtils.safeAdd((-1), (-1));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2), (-1), 1);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2147483646), 1, (-2147483646));
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1843, 1843, 0);
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 26, 0, 0);
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-2601), 45, 45);
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-827));
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 19, 0, 0);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2549), 192, 192);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 1192, 1192);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1192, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(dateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, (-36), 1374, 1374);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2767, 2767, (-360));
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 1, (-1413));
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      testPreciseDateTimeField_MockPreciseDateTimeField0.getMaximumValue((long) (-3165));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-3165), 59, 59);
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 45, (-1227), (-1227));
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(299L, 299L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 89401, 89401, 2002);
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-5), 1830, 1830);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      FieldUtils.safeToInt(1535L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1535, 1535, 1);
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-30), (-30), (-2041));
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-2203), 24, 24);
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, (-31), (-31));
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-1), 34, 34);
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      FieldUtils.safeMultiply(708, (-1634));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1156872), 708, (-1156872));
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-843), (-1), (-1));
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      BuddhistChronology.getInstanceUTC();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1, 32, 1);
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 4361, 4361, 1584);
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-3165), 67, 67);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-1431655764), (-482), (-482));
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 1, 195, 195);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      FieldUtils.safeMultiply(708, 708);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 708, 501264, 501264);
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 32, 1, 1);
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testOffsetDateTimeField_MockOffsetDateTimeField0, gregorianChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, (-2695), 0, 0);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-53), (-1224), (-1224));
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.safeMultiplyToInt(3600, 3600);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 12960000, 3600, 3600);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      FieldUtils.safeMultiply(708, (-1634));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1634), 708, (-1156872));
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-346), (-346), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 543, (-2145199089), (-2145199089));
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-2057), 24, (-2057));
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2039));
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      BuddhistChronology.getInstance();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 1843, 1);
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-1));
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      FieldUtils.safeAdd((-2913), (-2913));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-5826), (-2913), (-5826));
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 2241, 2241);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4361, 0, 0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 547, 547);
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 32, 31);
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2297));
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 32, 24);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 2792, 0);
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 15, 15, (-2059));
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-1847), 0, (-1847));
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-987), 0, (-987));
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 4514, 4514);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 14, 1862, 14);
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-3890), 1, (-3890));
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 659, 54, 54);
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-1732), (-418), (-1732));
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 891, 891, 405);
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, (-1413), 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-5697), 23, 41);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, (-2611));
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 32, 1000, 32);
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 2241, 2241);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 32, 504, 32);
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 32, (-177815));
  }

  @Test(timeout = 4000)
  public void test278()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2552, 0, 0);
  }

  @Test(timeout = 4000)
  public void test279()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2176), 0, 0);
  }

  @Test(timeout = 4000)
  public void test280()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 1, 1809, 1809);
  }

  @Test(timeout = 4000)
  public void test281()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 16, 1, 1);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 1, 16, 1);
  }

  @Test(timeout = 4000)
  public void test282()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, (-1413), (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test283()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 54, 1843, 54);
  }

  @Test(timeout = 4000)
  public void test284()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 2241, 2241);
  }

  @Test(timeout = 4000)
  public void test285()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1917, 1917, 24);
  }

  @Test(timeout = 4000)
  public void test286()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 14, 1862, 1862);
  }

  @Test(timeout = 4000)
  public void test287()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2241, 2276, 2241);
  }

  @Test(timeout = 4000)
  public void test288()  throws Throwable  {
      BuddhistChronology.getInstanceUTC();
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 708, 708, 1);
  }

  @Test(timeout = 4000)
  public void test289()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, 547, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test290()  throws Throwable  {
      MockZone mockZone0 = new MockZone(1192, 1192, 1192);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1192, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test291()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2, 41, 41);
  }

  @Test(timeout = 4000)
  public void test292()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 4361, 0, 0);
  }

  @Test(timeout = 4000)
  public void test293()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 41, 41);
  }

  @Test(timeout = 4000)
  public void test294()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1634), 708, (-1634));
  }

  @Test(timeout = 4000)
  public void test295()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 590, 590, 1);
  }

  @Test(timeout = 4000)
  public void test296()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 32, 4413, 32);
  }

  @Test(timeout = 4000)
  public void test297()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-1), 33, 33);
  }

  @Test(timeout = 4000)
  public void test298()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(testBaseDateTimeField_MockBaseDateTimeField0, dateTimeFieldType0, (-1), (-1), (-2147483646));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, (-2147483646), (-1), (-2147483646));
  }

  @Test(timeout = 4000)
  public void test299()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2041), 0, 0);
  }

  @Test(timeout = 4000)
  public void test300()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 1855, 0);
  }

  @Test(timeout = 4000)
  public void test301()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.safeMultiply((-2421), 0);
      BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2421), 0, 1);
  }

  @Test(timeout = 4000)
  public void test302()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 28181250, (-1514), (-1514));
  }

  @Test(timeout = 4000)
  public void test303()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-1413), (-1413));
  }

  @Test(timeout = 4000)
  public void test304()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 2792, 1);
  }

  @Test(timeout = 4000)
  public void test305()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 949, 949);
  }

  @Test(timeout = 4000)
  public void test306()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeMultiplyToInt(2001L, 2001L);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, 4004001, (-2196), (-2196));
  }

  @Test(timeout = 4000)
  public void test307()  throws Throwable  {
      FieldUtils.safeMultiply(708, 708);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 708, 501264);
  }

  @Test(timeout = 4000)
  public void test308()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.safeMultiply((-2421), (-2421));
      FieldUtils.safeAdd(0, (-2421));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 5861241, 5861241, (-2421));
  }

  @Test(timeout = 4000)
  public void test309()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(11);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 32, 1, 11);
  }

  @Test(timeout = 4000)
  public void test310()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1371, 0, 0);
  }

  @Test(timeout = 4000)
  public void test311()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 503, 503, (-992));
  }

  @Test(timeout = 4000)
  public void test312()  throws Throwable  {
      FieldUtils.safeMultiply(1066, 1066);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 708, 1066, 1136356);
  }

  @Test(timeout = 4000)
  public void test313()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockOffsetDateTimeField0, Integer.MIN_VALUE, 1290, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test314()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 659, 659, 54);
  }

  @Test(timeout = 4000)
  public void test315()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 32, 32, (-360));
  }

  @Test(timeout = 4000)
  public void test316()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      BuddhistChronology.getInstance();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 1224, 1, 1);
  }

  @Test(timeout = 4000)
  public void test317()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.safeNegate((-2675));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 2675, 2675, (-2675));
  }

  @Test(timeout = 4000)
  public void test318()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1855, 1855, 1);
  }

  @Test(timeout = 4000)
  public void test319()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-5683));
  }

  @Test(timeout = 4000)
  public void test320()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 534, 534, (-1));
  }

  @Test(timeout = 4000)
  public void test321()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 2856, 2856, (-303));
  }

  @Test(timeout = 4000)
  public void test322()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      Locale locale0 = Locale.ITALIAN;
      testPreciseDateTimeField_MockPreciseDateTimeField0.getMaximumShortTextLength(locale0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2, 32, 32);
  }

  @Test(timeout = 4000)
  public void test323()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1849, 1849, (-948));
  }

  @Test(timeout = 4000)
  public void test324()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, Integer.MIN_VALUE, (-3633), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test325()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 1551, 1551, 32);
  }

  @Test(timeout = 4000)
  public void test326()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 32, 367, 367);
  }

  @Test(timeout = 4000)
  public void test327()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 32, 32, (-2041));
  }

  @Test(timeout = 4000)
  public void test328()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-1), 32, 32);
  }

  @Test(timeout = 4000)
  public void test329()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2043));
  }

  @Test(timeout = 4000)
  public void test330()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), (-1413), 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test331()  throws Throwable  {
      FieldUtils.safeMultiply((-4389), (-4389));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2147482608), (-4389), 19263321);
  }

  @Test(timeout = 4000)
  public void test332()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 7, 1843, 7);
  }

  @Test(timeout = 4000)
  public void test333()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-2041), 1828, (-2041));
  }

  @Test(timeout = 4000)
  public void test334()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-1), 257, (-1));
  }

  @Test(timeout = 4000)
  public void test335()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 89, 89, (-2065));
  }

  @Test(timeout = 4000)
  public void test336()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 68, 1853, 68);
  }

  @Test(timeout = 4000)
  public void test337()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-371), 32, (-371));
  }

  @Test(timeout = 4000)
  public void test338()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 24, 24, 0);
  }

  @Test(timeout = 4000)
  public void test339()  throws Throwable  {
      TestPreciseDateTimeField.MockStandardDateTimeField testPreciseDateTimeField_MockStandardDateTimeField0 = new TestPreciseDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockStandardDateTimeField0, (-377), 32, (-377));
  }

  @Test(timeout = 4000)
  public void test340()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 1843, 0, 0);
  }

  @Test(timeout = 4000)
  public void test341()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-2015), (-2015), (-3474));
  }

  @Test(timeout = 4000)
  public void test342()  throws Throwable  {
      FieldUtils.safeToInt(243L);
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 243, 0);
  }

  @Test(timeout = 4000)
  public void test343()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test344()  throws Throwable  {
      FieldUtils.safeAdd((-3973), (-3973));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
        buddhistChronology0.getDateTimeMillis((-3973), (-7946), (-7946), (-7946), 1, (-3973), (-7946));
      
         //
         // Value -7946 for monthOfYear must be in the range [1,12]
         //
  }

  @Test(timeout = 4000)
  public void test345()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 0, (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test346()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1413), 0, 0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1413), 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test347()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 67, (-2144924071), (-2144924071));
  }

  @Test(timeout = 4000)
  public void test348()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, 0, (-2929));
  }

  @Test(timeout = 4000)
  public void test349()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology.getInstance(dateTimeZone0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1, 693, 693);
  }

  @Test(timeout = 4000)
  public void test350()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, (-40), (-3890), (-3890));
  }

  @Test(timeout = 4000)
  public void test351()  throws Throwable  {
      FieldUtils.safeMultiplyToInt(0L, 0L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test352()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0, 0, (-1413));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1413));
  }

  @Test(timeout = 4000)
  public void test353()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-5717));
  }

  @Test(timeout = 4000)
  public void test354()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 41, 41, (-5685));
  }

  @Test(timeout = 4000)
  public void test355()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 0, (-2041), (-2041));
  }
}
