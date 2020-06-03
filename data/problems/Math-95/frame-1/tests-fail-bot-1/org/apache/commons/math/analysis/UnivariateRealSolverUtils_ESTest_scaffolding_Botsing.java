/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:17:40 UTC 2020
 */
package org.apache.commons.math.analysis;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class UnivariateRealSolverUtils_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UnivariateRealSolverUtils_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.analysis.PolynomialSplineFunction",
      "org.apache.commons.math.analysis.UnivariateRealSolver",
      "org.apache.commons.math.analysis.Expm1Function",
      "org.apache.commons.math.analysis.QuinticFunction$1",
      "org.apache.commons.math.analysis.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.analysis.MonitoredFunction",
      "org.apache.commons.math.DuplicateSampleAbscissaException",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.PolynomialFunction",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.analysis.QuinticFunction",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.analysis.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.ArgumentOutsideDomainException",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl",
      "org.apache.commons.math.analysis.SinFunction",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactory"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UnivariateRealSolverUtils_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.QuinticFunction",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException"
    );
  }
}
