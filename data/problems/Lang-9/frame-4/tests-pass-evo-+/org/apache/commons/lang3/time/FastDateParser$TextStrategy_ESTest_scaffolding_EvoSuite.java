/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:22:20 GMT 2020
 */
package org.apache.commons.lang3.time;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class FastDateParser$TextStrategy_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
  } 
  @Before 
  public void initTestCase(){ 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  public static void setSystemProperties() {
    /*No java.lang.System property to set*/
  }
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastDateParser$TextStrategy_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.lang3.time.FastDateParser$Strategy",
      "org.apache.commons.lang3.time.FastDateParser$TextStrategy"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastDateParser$TextStrategy_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.time.FastDateParser$TextStrategy",
      "org.apache.commons.lang3.time.FastDateParser$1",
      "org.apache.commons.lang3.time.FastDateParser$NumberStrategy",
      "org.apache.commons.lang3.time.FastDateParser$2",
      "org.apache.commons.lang3.time.FastDateParser$3",
      "org.apache.commons.lang3.time.FastDateParser$4",
      "org.apache.commons.lang3.time.FastDateParser$5",
      "org.apache.commons.lang3.time.FastDateParser"
    );
  }
}
