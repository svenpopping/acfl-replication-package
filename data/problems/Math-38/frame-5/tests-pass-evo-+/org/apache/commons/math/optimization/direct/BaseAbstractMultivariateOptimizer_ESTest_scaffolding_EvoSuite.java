/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:33:10 GMT 2020
 */
package org.apache.commons.math.optimization.direct;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class BaseAbstractMultivariateOptimizer_ESTest_scaffolding_EvoSuite {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseAbstractMultivariateOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math.optimization.direct.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.optimization.univariate.BracketFinder",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException",
      "org.apache.commons.math.random.ISAACRandom",
      "org.apache.commons.math.optimization.direct.NelderMeadSimplex",
      "org.apache.commons.math.exception.NotPositiveException",
      "org.apache.commons.math.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.optimization.direct.SimplexOptimizer",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.optimization.univariate.BaseUnivariateOptimizer",
      "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.direct.PowellOptimizer",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.analysis.MultivariateFunction",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction$MicrosphereSurfaceElement",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.optimization.direct.CMAESOptimizer",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.FieldElement",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.random.RandomVectorGenerator",
      "org.apache.commons.math.optimization.direct.AbstractSimplex",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.optimization.BaseMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.optimization.univariate.UnivariateRealOptimizer",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math.linear.AbstractRealMatrix$5",
      "org.apache.commons.math.linear.AbstractRealMatrix$2",
      "org.apache.commons.math.Field",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.optimization.univariate.BrentOptimizer",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.optimization.MultivariateOptimizer",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.analysis.UnivariateFunction",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.linear.RealVector$2",
      "org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.optimization.BaseMultivariateOptimizer",
      "org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.exception.MathUnsupportedOperationException",
      "org.apache.commons.math.random.RandomAdaptor"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseAbstractMultivariateOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.optimization.direct.CMAESOptimizer",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.optimization.direct.PowellOptimizer",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.optimization.direct.SimplexOptimizer",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.random.ISAACRandom",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.optimization.direct.AbstractSimplex",
      "org.apache.commons.math.optimization.direct.NelderMeadSimplex",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.optimization.direct.MultiDirectionalSimplex",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.optimization.univariate.BaseAbstractUnivariateOptimizer",
      "org.apache.commons.math.optimization.univariate.BrentOptimizer",
      "org.apache.commons.math.optimization.direct.PowellOptimizer$LineSearch",
      "org.apache.commons.math.optimization.univariate.BracketFinder",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction$MicrosphereSurfaceElement",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.direct.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.AbstractRealMatrix$2",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.AbstractRealMatrix$5",
      "org.apache.commons.math.exception.MultiDimensionMismatchException"
    );
  }
}
