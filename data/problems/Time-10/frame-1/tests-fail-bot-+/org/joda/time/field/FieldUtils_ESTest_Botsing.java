/*

 * Tue Mar 03 11:58:40 UTC 2020
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.MockZone;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.DelegatedDateTimeField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.RemainderDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.StrictDateTimeField;
import org.joda.time.field.TestBaseDateTimeField;
import org.joda.time.field.TestOffsetDateTimeField;
import org.joda.time.field.TestPreciseDateTimeField;
import org.joda.time.field.TestPreciseDurationDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;

public class FieldUtils_ESTest_Botsing extends FieldUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2147483645), (-394), (-394));
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-162), 1428, 1428);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-685), 1, (-685));
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      doReturn(false).when(dateTimeField0).isLenient();
      DateTimeField dateTimeField1 = StrictDateTimeField.getInstance(dateTimeField0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, (-4115), 1, (-4115));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 8, 8, (-1688));
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1005), 87, (-1005));
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2810), 1, 1);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 1, 3014, 1);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      FieldUtils.safeNegate((-540));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 540, (-540), (-540));
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2881, 2881);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1, 2615, 2615);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      FieldUtils.safeAdd(0, 0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      testOffsetDateTimeField_MockStandardDateTimeField0.set((ReadablePartial) null, (-20), intArray0, (-20));
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1019), 2230, (-1019));
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      FieldUtils.safeMultiply(0, 0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 2010, 0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1), (-1), (-1946));
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1689, 1);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getMinimumValue((long) (-1351));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3, (-1351), (-1351));
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, (-1));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, (-2810));
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeAdd((long) (-733), (long) (-733));
      FieldUtils.safeToInt((-1466L));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), (-1466), (-1466));
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1, 1320, 1);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, 1320);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, 1320, 1);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4054, 4054, (-2381));
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2228, (-1007));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-394), (-394));
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      FieldUtils.safeNegate(0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1976, 0, 0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, (-1));
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      FieldUtils.safeAdd(2740, 2740);
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 5480, 5480, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 313, 1932, 313);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1013), 2228, (-1013));
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, (-2571), (-2571));
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 540);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) remainderDateTimeField0, 1, 540, 540);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 265, 265);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-140120), (-733), (-140120));
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1019), 2205, (-1019));
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1, 2883, 1);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2145141789), (-369), (-369));
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1035), 2228, (-1035));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1943, 1943, 0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2001, 2001, (-988));
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getMinimumValue((long) (-1351));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1351), 3, 3);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 37, 37);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 932, (-656), (-656));
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 10805);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) dividedDateTimeField0, 10805, 1, 1);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2883, 2883);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      FieldUtils.safeNegate(0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1976, 0, 0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      FieldUtils.safeMultiply(989, 989);
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 978121, 989, 989);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      FieldUtils.getWrappedValue((-354), 77, (-354), 77);
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(gJChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-277), 77, (-354));
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), 3109, (-733));
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfHalfday();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-760), 1, 1);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 932, 932, 870);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2234, (-1007));
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1050), 2228, (-1050));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1030, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-369), 0, (-369));
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      FieldUtils.getWrappedValue((-365), (-365), (-1941), (-365));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1941), (-730), (-365));
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 828, (-365), (-365));
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 23, 1, 1);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1026), 2228, (-1026));
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1), Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2248, (-1007));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-394), 146, (-394));
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, (-20));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, (-20), (-20));
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-540), (-540), (-3623));
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1685), 1, (-1685));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-224), (-224), (-993));
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, (-1), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, (-20));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, 1, (-20));
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-997), 2228, (-997));
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2145141789), (-394), (-394));
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, 313);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, Integer.MIN_VALUE, 2194, 2194);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DelegatedDateTimeField delegatedDateTimeField0 = new DelegatedDateTimeField(testOffsetDateTimeField_MockStandardDateTimeField0, dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) delegatedDateTimeField0, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1008), 2228, (-1008));
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      dateTime0.withDayOfWeek(321);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1000), 5, (-1000));
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-251), 313, 313);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1681), 1, (-1681));
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3540, 3540, (-170));
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 825, 825, (-499));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2883, 2883);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 10805);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(remainderDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, (-1757), 1, 20);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 37, 1);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
        buddhistChronology0.getDateTimeMillis((-1), (-1), (-1), (-1));
      
         //
         // Value -1 for monthOfYear must be in the range [1,12]
         //
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1), 1, (-1));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2011, 2011, (-988));
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1064), 2230, (-1064));
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 23, 23, 1);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-369), (-369));
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      testOffsetDateTimeField_MockStandardDateTimeField0.set((ReadablePartial) null, (-369), intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      FieldUtils.safeAdd((-205), 1);
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-205), (-204), (-205));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      BuddhistChronology.getInstance();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 3026, 2228);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1022), 2228, (-1022));
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-3043), 555, (-3043));
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      FieldUtils.safeMultiply(989, 989);
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 978121, 978121, 989);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 0, 1, 0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2810), Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-1000), (-1000));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1070), 313, 313);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 4054, (-5164), (-5164));
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, (-1000), (-1000));
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2810), Integer.MIN_VALUE, (-3183));
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, (-246), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1059, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 1, (-1007));
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-162), 4, 4);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FieldUtils.safeNegate((-540));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField((Chronology) null);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 540, (-540), (-540));
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 76, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      FieldUtils.safeNegate((-540));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 540, (-540), 0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      FieldUtils.safeNegate(2004);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = dateTimeFieldType0.getField(gJChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2004), 2004, (-2004));
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-373), 2483, (-373));
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      Locale locale0 = Locale.TAIWAN;
      testOffsetDateTimeField_MockStandardDateTimeField0.getMaximumTextLength(locale0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2, 2228, 2);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 1477, 1477, 0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      FieldUtils.getWrappedValue(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, (-3076));
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 77, 654, 77);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2006, 0, 0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, (-2810));
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      FieldUtils.safeAdd(2740, 2740);
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 5480, 5480, 2740);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(testOffsetDateTimeField_MockStandardDateTimeField0, (-1351));
      offsetDateTimeField0.getMinimumValue((long) (-1351));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, (-1348), (-2), (-1348));
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-997), 2145436475, 2145436475);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, (-1000), (-1000), (-1535));
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-778));
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 352831696, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 2140622677, 2140622677);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, (-1007));
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2205, (-1007));
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 826, (-2208), (-2208));
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeNegate((-733));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), 733, (-733));
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1000), 2228, (-1000));
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      FieldUtils.safeMultiply(0L, (-4731));
      FieldUtils.safeMultiplyToInt((-4731), 0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-4731));
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2210, (-1007));
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 0, 1674, 1674);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2883, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1976, 1976, (-988));
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-848), (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-373), 0, 0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1), 0, 0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 5, 5);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-20), 1, 1);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2099, 2099, (-1007));
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1012), 2228, (-1012));
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, (-394));
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      FieldUtils.safeNegate((-540));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 540, (-540), 0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 0, 0, (-1988));
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1000), 2213, (-1000));
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      MockZone mockZone0 = new MockZone((-1013L), 1, 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) mockZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfMinute();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-1938L), (-1938L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 3755844, 3755844, 0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3765, (-93), (-93));
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 2228, (-394), (-394));
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2), (-2), (-1351));
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      FieldUtils.safeMultiply(0L, (-4731));
      FieldUtils.safeMultiplyToInt((-4731), 0L);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.centuryOfEra();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-4731));
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1005), 2214, (-1005));
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2236, (-1007));
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1996, 1996, (-988));
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      LocalDate localDate0 = LocalDate.now((Chronology) julianChronology0);
      // Undeclared exception!
      localDate0.withYear(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      CopticChronology.getInstance((DateTimeZone) null);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      LocalDateTime localDateTime0 = new LocalDateTime();
      int[] intArray0 = new int[7];
      // Undeclared exception!
      testOffsetDateTimeField_MockStandardDateTimeField0.set((ReadablePartial) localDateTime0, (-369), intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2210, 2210);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 924, 924, 1);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, (-1), 2194, 2194);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 3755844);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dividedDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, 0, (-1554), (-1554));
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), 313, 313);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, (-369), (-369));
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1, 313, 1);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, (-540), (-540));
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      Date date0 = new Date();
      LocalDate localDate0 = LocalDate.fromDateFields(date0);
      // Undeclared exception!
      localDate0.withDayOfMonth(1495);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1032, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(buddhistChronology0, testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, 1, 0);
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      BuddhistChronology.getInstance();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-1746), 1, 1);
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 28, (-1268), (-1268));
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 924, 1, 1);
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 0, 0, (-2146376125));
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1035), 2145436475, 2145436475);
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getMinimumValue((ReadablePartial) null);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2810), (-364), 3);
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 932, 932, (-1));
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      FieldUtils.safeNegate((-540));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 540, (-540), (-540));
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1005), 2222, (-1005));
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-162), 0, (-162));
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 365, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 20);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(remainderDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, (-1758), 1, 20);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3540, 3540, (-162));
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-1938L), (-1938L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 3755844, 0, 0);
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1032, (-733), (-2));
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, (-162), (-162));
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2883, Integer.MIN_VALUE, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-1938L), (-1938L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      FieldUtils.safeToInt((-1938L));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-1938), 3755844, 3755844);
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      FieldUtils.safeMultiply(989, 989);
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 2146894489, 2146894489, 978121);
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 613, 989, 989);
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 2448, 2448, 313);
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      testOffsetDateTimeField_MockStandardDateTimeField0.set((ReadablePartial) null, (-369), intArray0, (-369));
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 0, 2228, 0);
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), 1032, 1032);
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1), 924, (-1));
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1320, 1320, 1);
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField(dateTimeFieldType0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 313, 313, 1);
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3765, 3765, (-1058));
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2240, (-1007));
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-1938L), (-1938L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      FieldUtils.safeToInt((-1938L));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-1938), 3755844, (-1938));
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, (-20));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1320, 1320, 1);
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1932, 313, 313);
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2145141789), (-369), (-2145141789));
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      FieldUtils.safeMultiply(0L, (-4731));
      FieldUtils.safeMultiplyToInt((-4731), 0L);
      FieldUtils.safeToInt((-4731));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-4731), 0, 0);
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-1007), (-1007));
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-733), 3004, (-733));
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-348), (-348), (-4375));
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1030, (-733), (-2));
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1007), 1, 1);
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getLeapAmount((-373));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-373), 0, (-373));
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2227, (-1033), (-1033));
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 20);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 1, 20, 1);
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      FieldUtils.safeAdd(13421772, 107);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 13421879);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 107, 13421772, 13421879);
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekyearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1019), 2228, (-1019));
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, (-1000), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      FieldUtils.safeAdd((-205), 848);
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-205), 643, (-205));
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 1918, 1918);
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-1), 0, 1);
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-997), 292, 292);
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1059, (-733), (-2));
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1032, 1032, (-2));
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1000), (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      FieldUtils.safeAdd(12825002, 12825002);
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 12825002, 25650004, 12825002);
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      FieldUtils.safeMultiply(0L, (-4731));
      FieldUtils.safeMultiplyToInt((-4731), 0L);
      FieldUtils.safeToInt((-4731));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-4731), 0, (-4731));
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 21, 21, (-248));
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeMultiply((-3503), (-3503));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-3503), 12271009, (-3503));
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-2), (-2));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) unsupportedDateTimeField0, 4, 1, 1);
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, (-2147483647), 989, (-2147483647));
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2883, 2883);
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-3456), (-3456));
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, (-20));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, 1320, 1);
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-20), (-20), (-3503));
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 117, (-1007));
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, (-733), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2195, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      FieldUtils.safeMultiply(989, 989);
      TestPreciseDateTimeField.MockPreciseDateTimeField testPreciseDateTimeField_MockPreciseDateTimeField0 = new TestPreciseDateTimeField.MockPreciseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDateTimeField_MockPreciseDateTimeField0, 989, 978121, 989);
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-3056), (-162), (-162));
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getMinimumValue(2490L);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3, 2228, 3);
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 1349, 1349, (-21));
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 3571, 1, 1);
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      MockZone mockZone0 = new MockZone(0L, Integer.MIN_VALUE, Integer.MIN_VALUE);
      LocalDateTime localDateTime0 = new LocalDateTime((DateTimeZone) mockZone0);
      // Undeclared exception!
      localDateTime0.withMillisOfSecond(Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      FieldUtils.safeNegate((-2381));
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfDay();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-2381), 2381, (-2381));
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1001), 2228, (-1001));
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 313, (-733), (-733));
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-2810), 0, 0);
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 924, 924);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      FieldUtils.safeToInt((-4384));
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, (-4384), 1, (-4384));
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2217, (-1007));
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2139730999, 2228, 2228);
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 749, 0, 0);
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), (-1007), (-1530));
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2228, 1, 1);
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 999, 999, 434);
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology.getInstanceUTC();
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      int[] intArray0 = new int[5];
      // Undeclared exception!
      testOffsetDateTimeField_MockStandardDateTimeField0.set((ReadablePartial) null, (-20), intArray0, 1);
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 10805);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(remainderDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, 10805, 1, 20);
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, (-800), (-162), (-162));
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1005), 2228, (-1005));
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 16, 1, 1);
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 2883, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-20), 1, (-20));
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, 1, 1, (-20));
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, ethiopicChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, lenientDateTimeField0, 1);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) skipDateTimeField0, 1, (-20), (-20));
  }

  @Test(timeout = 4000)
  public void test274()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, 2228, (-360));
  }

  @Test(timeout = 4000)
  public void test275()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 313, 2228, 313);
  }

  @Test(timeout = 4000)
  public void test276()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeMultiply((-4448), (-4448));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-4448), 19784704, 19784704);
  }

  @Test(timeout = 4000)
  public void test277()  throws Throwable  {
      TestOffsetDateTimeField.MockOffsetDateTimeField testOffsetDateTimeField_MockOffsetDateTimeField0 = new TestOffsetDateTimeField.MockOffsetDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockOffsetDateTimeField0, 1, (-1875), (-1875));
  }

  @Test(timeout = 4000)
  public void test278()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, (-2145942021), 20587500, (-2145942021));
  }

  @Test(timeout = 4000)
  public void test279()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 1, 1, (-2));
  }

  @Test(timeout = 4000)
  public void test280()  throws Throwable  {
      TestBaseDateTimeField.MockBaseDateTimeField testBaseDateTimeField_MockBaseDateTimeField0 = new TestBaseDateTimeField.MockBaseDateTimeField();
      FieldUtils.safeNegate(2740);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockBaseDateTimeField0, 2740, 2740, (-2740));
  }

  @Test(timeout = 4000)
  public void test281()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2342, (-1007));
  }

  @Test(timeout = 4000)
  public void test282()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 924, 924, (-373));
  }

  @Test(timeout = 4000)
  public void test283()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 924, 2483, 924);
  }

  @Test(timeout = 4000)
  public void test284()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2333, 2333, (-1351));
  }

  @Test(timeout = 4000)
  public void test285()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyear();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-2922));
  }

  @Test(timeout = 4000)
  public void test286()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-373), 924, (-373));
  }

  @Test(timeout = 4000)
  public void test287()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-365), 2147483631, 2147483631);
  }

  @Test(timeout = 4000)
  public void test288()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      testOffsetDateTimeField_MockStandardDateTimeField0.getMinimumValue((long) (-1351));
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 3, 3, (-1351));
  }

  @Test(timeout = 4000)
  public void test289()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 3755844);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dividedDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, 0, 0, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test290()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2584, (-365), (-365));
  }

  @Test(timeout = 4000)
  public void test291()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-394), (-394), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test292()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-685), 313, (-685));
  }

  @Test(timeout = 4000)
  public void test293()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      EthiopicChronology.getInstanceUTC();
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1320, (-20), 1);
  }

  @Test(timeout = 4000)
  public void test294()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      FieldUtils.safeNegate(2228);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 2228, (-2228), (-2228));
  }

  @Test(timeout = 4000)
  public void test295()  throws Throwable  {
      FieldUtils.safeNegate(0);
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, 1976, 0, 0);
  }

  @Test(timeout = 4000)
  public void test296()  throws Throwable  {
      TestBaseDateTimeField.MockStandardBaseDateTimeField testBaseDateTimeField_MockStandardBaseDateTimeField0 = new TestBaseDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testBaseDateTimeField_MockStandardBaseDateTimeField0, (-2147483075), (-214), (-214));
  }

  @Test(timeout = 4000)
  public void test297()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, (-20), 1320, (-20));
  }

  @Test(timeout = 4000)
  public void test298()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, (-7200000), 0, 0);
  }

  @Test(timeout = 4000)
  public void test299()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 313, 313, 1);
  }

  @Test(timeout = 4000)
  public void test300()  throws Throwable  {
      FieldUtils.safeAdd(13421772, 13421772);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.weekyear();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, 26843544);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) offsetDateTimeField0, 1, 13421772, 26843544);
  }

  @Test(timeout = 4000)
  public void test301()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-1856));
  }

  @Test(timeout = 4000)
  public void test302()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 3755844);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dividedDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, 0, 1, 3755844);
  }

  @Test(timeout = 4000)
  public void test303()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 10805);
      RemainderDateTimeField remainderDateTimeField0 = new RemainderDateTimeField(dividedDateTimeField0);
      LenientDateTimeField lenientDateTimeField0 = new LenientDateTimeField(remainderDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) lenientDateTimeField0, (-1758), 1, 20);
  }

  @Test(timeout = 4000)
  public void test304()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MIN_VALUE, 2228, Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test305()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      DividedDateTimeField dividedDateTimeField0 = new DividedDateTimeField(dateTimeField0, dateTimeFieldType0, 3755844);
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dividedDateTimeField0, buddhistChronology0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField1, 1, 3755844, 3755844);
  }

  @Test(timeout = 4000)
  public void test306()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1), (-162), (-162));
  }

  @Test(timeout = 4000)
  public void test307()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 2228, 1, (-369));
  }

  @Test(timeout = 4000)
  public void test308()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, 932, (-1246), (-1246));
  }

  @Test(timeout = 4000)
  public void test309()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-4993), (-4993), Integer.MIN_VALUE);
  }

  @Test(timeout = 4000)
  public void test310()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 14, 5257, 5257);
  }

  @Test(timeout = 4000)
  public void test311()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-162), (-162), (-2507));
  }

  @Test(timeout = 4000)
  public void test312()  throws Throwable  {
      TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0 = new TestPreciseDurationDateTimeField.MockStandardBaseDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockStandardBaseDateTimeField0, 1, 0, 0);
  }

  @Test(timeout = 4000)
  public void test313()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.secondOfDay();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, Integer.MIN_VALUE, 1, 2228);
  }

  @Test(timeout = 4000)
  public void test314()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-1007), 2242, (-1007));
  }

  @Test(timeout = 4000)
  public void test315()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, (-394), 540, (-394));
  }

  @Test(timeout = 4000)
  public void test316()  throws Throwable  {
      FieldUtils.safeMultiplyToInt((-1938L), (-1938L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      FieldUtils.safeToInt(0);
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 0, 3755844, 3755844);
  }

  @Test(timeout = 4000)
  public void test317()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      DateTimeField dateTimeField0 = mock(DateTimeField.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeFieldType0).when(dateTimeField0).getType();
      // Undeclared exception!
      FieldUtils.verifyValueBounds(dateTimeField0, 0, 0, (-2926));
  }

  @Test(timeout = 4000)
  public void test318()  throws Throwable  {
      TestOffsetDateTimeField.MockStandardDateTimeField testOffsetDateTimeField_MockStandardDateTimeField0 = new TestOffsetDateTimeField.MockStandardDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testOffsetDateTimeField_MockStandardDateTimeField0, Integer.MAX_VALUE, Integer.MAX_VALUE, 292279536);
  }

  @Test(timeout = 4000)
  public void test319()  throws Throwable  {
      FieldUtils.safeToInt((-20L));
      TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0 = new TestPreciseDurationDateTimeField.MockPreciseDurationDateTimeField();
      // Undeclared exception!
      FieldUtils.verifyValueBounds((DateTimeField) testPreciseDurationDateTimeField_MockPreciseDurationDateTimeField0, 1320, 1320, (-20));
  }
}
