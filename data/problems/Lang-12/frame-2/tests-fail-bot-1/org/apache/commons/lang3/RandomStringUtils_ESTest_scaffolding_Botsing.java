/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:00:26 UTC 2020
 */
package org.apache.commons.lang3;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RandomStringUtils_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RandomStringUtils_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.lang3.RandomStringUtils"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Random", false, RandomStringUtils_ESTest_scaffolding_Botsing.class.getClassLoader()));
  }
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RandomStringUtils_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.RandomStringUtils"
    );
  }
}
