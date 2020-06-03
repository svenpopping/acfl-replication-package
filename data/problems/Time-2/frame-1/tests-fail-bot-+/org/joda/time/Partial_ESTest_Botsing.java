/*

 * Tue Mar 03 11:49:29 UTC 2020
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
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Partial;
import org.joda.time.TestYearMonthDay_Basics;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.FixedDateTimeZone;

public class Partial_ESTest_Botsing extends Partial_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
      int[] intArray0 = new int[7];
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.halfdays();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("@", "@").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[7];
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[6] = dateTimeFieldType0;
      int[] intArray0 = new int[7];
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, buddhistChronology0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("+:jleu`DMN\"M5)", "+:jleu`DMN\"M5)").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, iSOChronology0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, gregorianChronology0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("R", "R").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, (Chronology) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.hours();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, (DurationFieldType) null).when(dateTimeFieldType0).getDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      TestYearMonthDay_Basics testYearMonthDay_Basics0 = new TestYearMonthDay_Basics("");
      TestYearMonthDay_Basics.MockInstant testYearMonthDay_Basics_MockInstant0 = testYearMonthDay_Basics0.new MockInstant();
      Chronology chronology0 = testYearMonthDay_Basics_MockInstant0.getChronology();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, chronology0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      GJChronology gJChronology0 = GJChronology.getInstance();
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, gJChronology0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, copticChronology0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[6];
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      StrictChronology strictChronology0 = StrictChronology.getInstance(copticChronology0);
      DateTimeFieldType dateTimeFieldType0 = mock(DateTimeFieldType.class, new ViolatedAssumptionAnswer());
      doReturn(durationFieldType0, durationFieldType0).when(dateTimeFieldType0).getDurationType();
      doReturn("", "").when(dateTimeFieldType0).getName();
      doReturn((DurationFieldType) null, (DurationFieldType) null).when(dateTimeFieldType0).getRangeDurationType();
      dateTimeFieldTypeArray0[0] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[1] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[2] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[3] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[4] = dateTimeFieldType0;
      dateTimeFieldTypeArray0[5] = dateTimeFieldType0;
      int[] intArray0 = new int[6];
      Partial partial0 = new Partial(dateTimeFieldTypeArray0, intArray0, strictChronology0);
  }
}
