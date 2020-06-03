/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:46:47 UTC 2020
 */
package org.apache.commons.math.linear;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class BigMatrixImpl_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BigMatrixImpl_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.BigMatrixImpl",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.BigMatrix"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BigMatrixImpl_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.linear.BigMatrixImpl",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.InvalidMatrixException"
    );
  }
}
