/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:44:52 UTC 2020
 */
package org.apache.commons.math.distribution;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class FDistributionImpl_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FDistributionImpl_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.analysis.UnivariateRealSolver",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.distribution.FDistribution",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactory",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution$1"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FDistributionImpl_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException"
    );
  }
}
