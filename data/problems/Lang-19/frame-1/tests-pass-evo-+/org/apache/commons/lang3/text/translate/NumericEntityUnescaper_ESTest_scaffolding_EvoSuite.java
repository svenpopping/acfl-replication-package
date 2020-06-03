/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:22:34 GMT 2020
 */
package org.apache.commons.lang3.text.translate;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class NumericEntityUnescaper_ESTest_scaffolding_EvoSuite {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NumericEntityUnescaper_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper$OPTION",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NumericEntityUnescaper_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper"
    );
  }
}
