/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:50:55 GMT 2020
 */
package org.joda.time;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class PeriodType_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
  } 
  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 
  @Before 
  public void initTestCase(){ 
    setSystemProperties(); 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  public static void setSystemProperties() {
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PeriodType_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$RuleSet",
      "org.joda.time.tz.DateTimeZoneBuilder$Transition",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.convert.ConverterSet$Entry",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.format.DateTimeFormatterBuilder$TwoDigitYear",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.DateMidnight$Property",
      "org.joda.time.format.PeriodFormatterBuilder$CompositeAffix",
      "org.joda.time.ReadWritableInterval",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Duration",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.Interval",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.ReadWritablePeriod",
      "org.joda.time.convert.ConverterSet",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.convert.IntervalConverter",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.Months",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId",
      "org.joda.time.YearMonthDay",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.YearMonth",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.DateTime$Property",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.Years",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.Partial",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.Minutes",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BasePartial",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.Hours",
      "org.joda.time.LocalTime",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.TimeOfDay$Property",
      "org.joda.time.format.DateTimeFormat$1",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.TimeOfDay",
      "org.joda.time.Partial$Property",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DateTimeUtils$FixedMillisProvider",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.ReadableDuration",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.DurationField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.DateTime",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.convert.PeriodConverter",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.Instant",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.DateTimeUtils$OffsetMillisProvider",
      "org.joda.time.convert.Converter",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.convert.PartialConverter",
      "org.joda.time.Seconds",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.MutableDateTime$Property",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.field.LenientDateTimeField",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.convert.AbstractConverter",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.PeriodType",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.LocalDateTime$Property",
      "org.joda.time.format.DateTimeFormatterBuilder$TextField",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.YearMonthDay$Property",
      "org.joda.time.field.UnsupportedDateTimeField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.MonthDay",
      "org.joda.time.MutablePeriod",
      "org.joda.time.MutableDateTime",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodParser",
      "org.joda.time.format.PeriodFormatterBuilder$PluralAffix",
      "org.joda.time.DateMidnight",
      "org.joda.time.convert.DurationConverter",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.format.DateTimeParserBucket$SavedState",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$Rule",
      "org.joda.time.Days",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.YearMonth$Property",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.ReadableInstant",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.DurationFieldType",
      "org.joda.time.MutableInterval",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.InstantConverter",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.Period",
      "org.joda.time.Weeks",
      "org.joda.time.Chronology",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "org.joda.time.LocalDate",
      "org.joda.time.format.DateTimeParserBucket$SavedField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.MonthDay$Property",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.field.BaseDurationField"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PeriodType_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.PeriodType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.base.BasePeriod$1",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.MutablePeriod",
      "org.joda.time.format.ISOPeriodFormat",
      "org.joda.time.format.PeriodFormatterBuilder",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.format.PeriodFormatter",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.base.AbstractDuration",
      "org.joda.time.base.BaseDuration",
      "org.joda.time.Duration",
      "org.joda.time.field.FieldUtils",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.chrono.LimitChronology",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.IllegalFieldValueException",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "org.joda.time.Months",
      "org.joda.time.Seconds",
      "org.joda.time.Instant",
      "org.joda.time.Years",
      "org.joda.time.Weeks",
      "org.joda.time.convert.ConverterManager",
      "org.joda.time.convert.ConverterSet",
      "org.joda.time.convert.AbstractConverter",
      "org.joda.time.convert.ReadableInstantConverter",
      "org.joda.time.convert.StringConverter",
      "org.joda.time.convert.CalendarConverter",
      "org.joda.time.convert.DateConverter",
      "org.joda.time.convert.LongConverter",
      "org.joda.time.convert.NullConverter",
      "org.joda.time.convert.ReadablePartialConverter",
      "org.joda.time.convert.ReadableDurationConverter",
      "org.joda.time.convert.ReadableIntervalConverter",
      "org.joda.time.convert.ReadablePeriodConverter",
      "org.joda.time.convert.ConverterSet$Entry",
      "org.joda.time.Minutes",
      "org.joda.time.Days",
      "org.joda.time.Hours",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.LocalTime",
      "org.joda.time.Period",
      "org.joda.time.chrono.GJChronology",
      "org.joda.time.chrono.JulianChronology",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "org.joda.time.field.SkipUndoDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "org.joda.time.LocalDate",
      "org.joda.time.MutableDateTime",
      "org.joda.time.base.BasePartial",
      "org.joda.time.YearMonth",
      "org.joda.time.chrono.StrictChronology",
      "org.joda.time.field.StrictDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.format.DateTimeParserBucket",
      "org.joda.time.format.DateTimeParserBucket$SavedState",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Interval",
      "org.joda.time.chrono.EthiopicChronology",
      "org.joda.time.chrono.LenientChronology",
      "org.joda.time.chrono.IslamicChronology$LeapYearPatternType",
      "org.joda.time.chrono.IslamicChronology",
      "org.joda.time.MutableInterval",
      "org.joda.time.tz.UTCProvider",
      "org.joda.time.Partial",
      "org.joda.time.format.DateTimeFormat$1",
      "org.joda.time.format.DateTimeFormat",
      "org.joda.time.MonthDay",
      "org.joda.time.field.LenientDateTimeField"
    );
  }
}