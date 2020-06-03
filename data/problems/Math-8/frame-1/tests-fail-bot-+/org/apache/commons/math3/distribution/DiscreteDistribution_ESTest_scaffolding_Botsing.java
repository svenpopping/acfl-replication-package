/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:23:59 UTC 2020
 */
package org.apache.commons.math3.distribution;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class DiscreteDistribution_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DiscreteDistribution_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.BitsStreamGeneratorTest$BitRandom",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.RetryRunner",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathInternalError",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.random.RandomAdaptorTest",
      "org.apache.commons.math3.random.RandomDataTest",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.random.RandomGeneratorAbstractTest",
      "org.apache.commons.math3.random.RandomAdaptorTest$ConstantGenerator",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.distribution.DiscreteDistribution",
      "org.apache.commons.math3.random.BitsStreamGeneratorTest",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.random.TestRandomGenerator",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.random.AbstractRandomGenerator",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.random.BitsStreamGeneratorTest$TestBitStreamGenerator",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.random.Well512a"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DiscreteDistribution_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant"
    );
  }
}
