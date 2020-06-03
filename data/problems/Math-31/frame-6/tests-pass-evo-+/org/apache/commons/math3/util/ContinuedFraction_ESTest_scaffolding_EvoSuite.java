/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:36:17 GMT 2020
 */
package org.apache.commons.math3.util;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class ContinuedFraction_ESTest_scaffolding_EvoSuite {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ContinuedFraction_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.util.Localizable"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ContinuedFraction_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.exception.util.LocalizedFormats"
    );
  }
}