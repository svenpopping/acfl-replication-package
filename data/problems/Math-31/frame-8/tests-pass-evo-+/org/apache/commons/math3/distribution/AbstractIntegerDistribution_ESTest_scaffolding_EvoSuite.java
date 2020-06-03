/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:30:41 GMT 2020
 */
package org.apache.commons.math3.distribution;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class AbstractIntegerDistribution_ESTest_scaffolding_EvoSuite {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractIntegerDistribution_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.special.Gamma$1",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.special.Erf",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.distribution.IntegerDistribution",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.distribution.NormalDistribution",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.util.ResizableDoubleArray",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.distribution.RealDistribution",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.distribution.UniformIntegerDistribution",
      "org.apache.commons.math3.random.RandomData",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.distribution.PascalDistribution",
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.distribution.BinomialDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.distribution.PoissonDistribution",
      "org.apache.commons.math3.util.DoubleArray",
      "org.apache.commons.math3.distribution.ZipfDistribution",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.util.ArithmeticUtils",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.special.Beta$1"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractIntegerDistribution_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.distribution.AbstractIntegerDistribution",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.distribution.UniformIntegerDistribution",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.ResizableDoubleArray",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.util.ArithmeticUtils",
      "org.apache.commons.math3.random.RandomDataImpl",
      "org.apache.commons.math3.distribution.PoissonDistribution",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.distribution.ZipfDistribution",
      "org.apache.commons.math3.distribution.BinomialDistribution",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.distribution.AbstractRealDistribution",
      "org.apache.commons.math3.distribution.NormalDistribution",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.distribution.PascalDistribution",
      "org.apache.commons.math3.special.Erf",
      "org.apache.commons.math3.special.Gamma",
      "org.apache.commons.math3.util.ContinuedFraction",
      "org.apache.commons.math3.special.Gamma$1",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.distribution.SaddlePointExpansion",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.distribution.HypergeometricDistribution",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.special.Beta",
      "org.apache.commons.math3.special.Beta$1",
      "org.apache.commons.math3.exception.ConvergenceException",
      "org.apache.commons.math3.exception.MathInternalError"
    );
  }
}
