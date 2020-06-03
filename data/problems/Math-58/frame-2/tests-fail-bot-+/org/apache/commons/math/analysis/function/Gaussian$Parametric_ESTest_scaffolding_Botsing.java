/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:34:10 UTC 2020
 */
package org.apache.commons.math.analysis.function;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class Gaussian$Parametric_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Gaussian$Parametric_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.analysis.function.Gaussian$Parametric",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.analysis.ParametricUnivariateRealFunction",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.MessageFactory",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.analysis.function.Gaussian",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Gaussian$Parametric_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException"
    );
  }
}
