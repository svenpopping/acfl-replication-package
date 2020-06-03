/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:19:42 GMT 2020
 */
package org.apache.commons.lang3.time;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FastDateFormat_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastDateFormat_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.lang3.time.FastDatePrinter$TextField",
      "org.apache.commons.lang3.time.FastDatePrinter$NumberRule",
      "org.apache.commons.lang3.time.FastDateParser$5",
      "org.apache.commons.lang3.time.FormatCache",
      "org.apache.commons.lang3.time.FastDateParser$4",
      "org.apache.commons.lang3.time.FastDateParser$3",
      "org.apache.commons.lang3.time.FastDateParser$2",
      "org.apache.commons.lang3.time.FastDateParser$1",
      "org.apache.commons.lang3.time.FastDateParser$NumberStrategy",
      "org.apache.commons.lang3.time.DateParser",
      "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey",
      "org.apache.commons.lang3.time.FastDatePrinter$StringLiteral",
      "org.apache.commons.lang3.time.FastDatePrinter$Rule",
      "org.apache.commons.lang3.time.FastDateParser$KeyValue",
      "org.apache.commons.lang3.time.FormatCache$MultipartKey",
      "org.apache.commons.lang3.time.FastDatePrinter",
      "org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField",
      "org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule",
      "org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy",
      "org.apache.commons.lang3.time.FastDateParser$Strategy",
      "org.apache.commons.lang3.time.FastDateParser$TextStrategy",
      "org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral",
      "org.apache.commons.lang3.time.FastDateFormat$1",
      "org.apache.commons.lang3.time.FastDateFormat",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField",
      "org.apache.commons.lang3.time.DatePrinter",
      "org.apache.commons.lang3.time.FastDateParser",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.text.Format$Field", false, FastDateFormat_ESTest_scaffolding_EvoSuite.class.getClassLoader()));
  }
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastDateFormat_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.time.FormatCache",
      "org.apache.commons.lang3.time.FastDateFormat$1",
      "org.apache.commons.lang3.time.FastDateFormat",
      "org.apache.commons.lang3.time.FormatCache$MultipartKey",
      "org.apache.commons.lang3.time.FastDatePrinter",
      "org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField",
      "org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral",
      "org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField",
      "org.apache.commons.lang3.time.FastDatePrinter$TextField",
      "org.apache.commons.lang3.time.FastDateParser$1",
      "org.apache.commons.lang3.time.FastDateParser$NumberStrategy",
      "org.apache.commons.lang3.time.FastDateParser$2",
      "org.apache.commons.lang3.time.FastDateParser$TextStrategy",
      "org.apache.commons.lang3.time.FastDateParser$3",
      "org.apache.commons.lang3.time.FastDateParser$4",
      "org.apache.commons.lang3.time.FastDateParser$5",
      "org.apache.commons.lang3.time.FastDateParser",
      "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy",
      "org.apache.commons.lang3.time.FastDateParser$KeyValue",
      "org.apache.commons.lang3.time.FastDatePrinter$StringLiteral",
      "org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField",
      "org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey",
      "org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy",
      "org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField"
    );
  }
}
