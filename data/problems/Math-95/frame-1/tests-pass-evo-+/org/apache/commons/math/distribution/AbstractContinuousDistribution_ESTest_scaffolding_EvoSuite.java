/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:44:31 GMT 2020
 */
package org.apache.commons.math.distribution;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class AbstractContinuousDistribution_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
  } 
  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 
  @Before 
  public void initTestCase(){ 
    setSystemProperties(); 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  public static void setSystemProperties() {
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractContinuousDistribution_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math.distribution.ExponentialDistribution",
      "org.apache.commons.math.distribution.GammaDistributionImpl",
      "org.apache.commons.math.distribution.HasDensity",
      "org.apache.commons.math.distribution.ChiSquaredDistribution",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.special.Erf",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.distribution.ContinuousDistribution",
      "org.apache.commons.math.distribution.BetaDistributionImpl",
      "org.apache.commons.math.distribution.WeibullDistribution",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.distribution.WeibullDistributionImpl",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.distribution.BetaDistribution",
      "org.apache.commons.math.distribution.CauchyDistributionImpl",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl",
      "org.apache.commons.math.special.Gamma$1",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.distribution.GammaDistribution",
      "org.apache.commons.math.distribution.CauchyDistribution",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.distribution.FDistribution",
      "org.apache.commons.math.distribution.Distribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution$1",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.distribution.TDistribution",
      "org.apache.commons.math.analysis.UnivariateRealSolver",
      "org.apache.commons.math.distribution.ExponentialDistributionImpl",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.distribution.NormalDistribution",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.ChiSquaredDistributionImpl",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactory",
      "org.apache.commons.math.distribution.NormalDistributionImpl",
      "org.apache.commons.math.distribution.AbstractDistribution"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractContinuousDistribution_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.distribution.AbstractDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution",
      "org.apache.commons.math.distribution.AbstractContinuousDistribution$1",
      "org.apache.commons.math.analysis.UnivariateRealSolverUtils",
      "org.apache.commons.math.distribution.BetaDistributionImpl",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactory",
      "org.apache.commons.math.analysis.UnivariateRealSolverFactoryImpl",
      "org.apache.commons.math.analysis.UnivariateRealSolverImpl",
      "org.apache.commons.math.analysis.BrentSolver",
      "org.apache.commons.math.special.Beta",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.distribution.GammaDistributionImpl",
      "org.apache.commons.math.distribution.ExponentialDistributionImpl",
      "org.apache.commons.math.distribution.WeibullDistributionImpl",
      "org.apache.commons.math.distribution.FDistributionImpl",
      "org.apache.commons.math.distribution.TDistributionImpl",
      "org.apache.commons.math.distribution.NormalDistributionImpl",
      "org.apache.commons.math.distribution.ChiSquaredDistributionImpl",
      "org.apache.commons.math.util.ContinuedFraction",
      "org.apache.commons.math.special.Beta$1",
      "org.apache.commons.math.special.Gamma",
      "org.apache.commons.math.distribution.CauchyDistributionImpl",
      "org.apache.commons.math.special.Erf",
      "org.apache.commons.math.special.Gamma$1"
    );
  }
}
