/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:25:53 UTC 2020
 */
package org.apache.commons.lang.text;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class StrBuilder_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StrBuilder_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderWriter",
      "org.apache.commons.lang.text.StrMatcher$CharMatcher",
      "org.apache.commons.lang.text.StrMatcher$TrimMatcher",
      "org.apache.commons.lang.text.StrMatcher$CharSetMatcher",
      "org.apache.commons.lang.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang.text.StrMatcher$StringMatcher",
      "org.apache.commons.lang.text.StrMatcher$NoMatcher",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.lang.SystemUtils",
      "org.apache.commons.lang.ArrayUtils"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StrBuilder_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang.text.StrBuilder",
      "org.apache.commons.lang.text.StrMatcher",
      "org.apache.commons.lang.text.StrTokenizer",
      "org.apache.commons.lang.ArrayUtils",
      "org.apache.commons.lang.SystemUtils"
    );
  }
}
