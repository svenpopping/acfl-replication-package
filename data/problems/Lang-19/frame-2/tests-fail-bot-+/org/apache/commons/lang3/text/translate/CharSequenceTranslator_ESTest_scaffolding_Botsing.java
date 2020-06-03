/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:24:44 UTC 2020
 */
package org.apache.commons.lang3.text.translate;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class CharSequenceTranslator_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
  } 
  @Before 
  public void initTestCase(){ 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CharSequenceTranslator_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.lang3.text.translate.NumericEntityUnescaper",
      "org.apache.commons.lang3.text.translate.NumericEntityEscaper",
      "org.apache.commons.lang3.text.translate.CharSequenceTranslator",
      "org.apache.commons.lang3.text.translate.AggregateTranslator",
      "org.apache.commons.lang3.text.translate.LookupTranslator",
      "org.apache.commons.lang3.text.translate.CodePointTranslator",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.UnicodeEscaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper$OPTION",
      "org.apache.commons.lang3.text.translate.OctalUnescaper",
      "org.apache.commons.lang3.text.translate.UnicodeUnescaper"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CharSequenceTranslator_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.text.translate.OctalUnescaper"
    );
  }
}
