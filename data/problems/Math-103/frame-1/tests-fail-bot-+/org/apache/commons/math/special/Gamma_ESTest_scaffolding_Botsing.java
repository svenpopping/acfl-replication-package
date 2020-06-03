/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:48:41 UTC 2020
 */
package org.apache.commons.math.special;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class Gamma_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Gamma_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.ConvergenceException"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Gamma_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxIterationsExceededException"
    );
  }
}
