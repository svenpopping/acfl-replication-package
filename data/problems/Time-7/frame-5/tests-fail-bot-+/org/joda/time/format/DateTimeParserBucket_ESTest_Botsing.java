/*

 * Tue Mar 03 11:54:30 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.temporal.ChronoField;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;

public class DateTimeParserBucket_ESTest_Botsing extends DateTimeParserBucket_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 541);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1034L, islamicChronology0, (Locale) null, (Integer) 1, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 119);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "Ue$=5p.a@}])9.*@");
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("!}^-e}", "!}^-e}");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1540);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 726);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1534);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "2002 \uFFFD\uFFFD");
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Integer integer0 = new Integer(12825000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(12825000, gJChronology0, (Locale) null, integer0, 12825000);
      dateTimeParserBucket0.restoreState("s|`V2Pj-bAQtl");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 12825000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(durationField0).isSupported();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, (Locale) null);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2019));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Integer integer0 = new Integer(12825000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3L, gJChronology0, (Locale) null, integer0, 12825000);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 12825000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1093);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState("!}^-e}");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 48);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1529);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 17);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-160737));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-j}");
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1529);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2392L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 41);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "kN");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState("!}^-e}");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 19);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("\": ", "\": ");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, 1440);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "\": ");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, gJChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1540, buddhistChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2412);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}-e}");
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2387L), chronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1883L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState("!}^-e}");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 48);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1588);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.TAIWAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState(buddhistChronology0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1059);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("\": ", "\": ");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "\": ");
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "\": ");
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-13));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^e}");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1540);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "m");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2366L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale0 = Locale.getDefault(locale_Category0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1540, buddhistChronology0, locale0, (Integer) 1);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1540);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}-e}");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1534);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 758);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "Illegal instant due to time zone offset transition (");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}-e");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2387L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-1746));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "}s-e}");
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1540);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Integer integer0 = new Integer(12825000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3L, gJChronology0, (Locale) null, integer0, 12825000);
      dateTimeParserBucket0.restoreState("s|`V2Pj-bAQtl");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 12825000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2030));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "DayTime");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState(buddhistChronology0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1529);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-14));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      Integer integer0 = new Integer(12825000);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(12825000, gJChronology0, (Locale) null, integer0, 12825000);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 12825000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, (Locale) null);
      dateTimeParserBucket0.restoreState(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1417);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-226999));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.ROOT;
      Integer integer0 = new Integer(168);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0, integer0, 168);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 168);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "21JPIBrR'8j");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 34);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.FRANCE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1, 48);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 48);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "[?9UjmLwO0");
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(durationField0).isSupported();
      DateTimeParserBucket.compareReverse(durationField0, durationField0);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "eCzy");
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3L, gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-1));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = new Locale("MIN > MAX", "MIN > MAX", "MIN > MAX");
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(10, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "MIN > MAX");
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.restoreState("!}^-e}");
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 498);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 48);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1533);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 7200000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1588);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-1756));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "Illegal instant due to time zone offset transition (");
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.AMPM_OF_DAY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.equals(chronoField0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1529);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1972);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-j}");
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 14);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(81, copticChronology0, locale0, (Integer) 1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfYear();
      dateTimeParserBucket0.saveField(dateTimeField0, 3600000);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "`'.mT,G?|wY9yrd");
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1540);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2387L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.JAPANESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.UK;
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1671));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis();
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(dateTimeZone0).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, chronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DateTimeZone) null).when(chronology0).getZone();
      doReturn((Chronology) null).when(chronology0).withUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(61, chronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      Locale locale0 = new Locale("", "", "");
      Integer integer0 = new Integer((-2002));
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2002), (Chronology) null, locale0, integer0, (-2002));
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, (Locale) null);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2001));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "[?9UjmLwO0");
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.AMPM_OF_DAY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.equals(chronoField0);
      Locale locale0 = Locale.KOREA;
      locale0.getDisplayScript(locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      dateTimeParserBucket0.saveField(dateTimeField0, Integer.MAX_VALUE);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2387L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-1986));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeField0, 1551);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "a3,I[00!$NUQ[T8~N");
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.AMPM_OF_DAY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.equals(chronoField0);
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      locale0.getDisplayScript(locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, (String) null);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.ITALY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, (Chronology) null, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "s|`V2Pj-bAQtl");
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      dateTimeParserBucket0.restoreState("!}^-e}");
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      Locale locale0 = Locale.FRANCE;
      StrictChronology strictChronology0 = StrictChronology.getInstance(buddhistChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, strictChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeField0, (-1188));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "o'=E6D:DD");
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-2387L), gJChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 61);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "m");
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfMonth();
      DateTimeParserBucket.SavedField dateTimeParserBucket_SavedField0 = new DateTimeParserBucket.SavedField(dateTimeField0, "", locale0);
      dateTimeParserBucket_SavedField0.compareTo(dateTimeParserBucket_SavedField0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, 0);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1806);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}-e}");
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, (-13));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^e}");
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 8);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.ROOT;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2002));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "The datetime zone id '");
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      buddhistChronology0.equals(buddhistChronology0);
      Locale locale0 = Locale.KOREA;
      locale0.getDisplayScript(locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "");
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfMonth();
      Locale locale0 = Locale.CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-4543));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "-e}");
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Locale locale0 = Locale.GERMANY;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1L, julianChronology0, locale0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, (String) null);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CHINA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 10);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "!}^-e}");
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.AMPM_OF_DAY;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      buddhistChronology0.equals(chronoField0);
      Locale locale0 = Locale.FRANCE;
      locale0.getDisplayScript(locale0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0, (Integer) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 2365);
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(false, "");
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1863L, copticChronology0, (Locale) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, (-2001));
      // Undeclared exception!
      dateTimeParserBucket0.computeMillis(true, "a3,I[00!$NUQ[T8~N");
  }
}
