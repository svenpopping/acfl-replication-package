/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:06:22 UTC 2020
 */
package org.apache.commons.math.optimization.direct;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException",
      "org.apache.commons.math.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.MultivariateOptimizer",
      "org.apache.commons.math.analysis.MultivariateFunction",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.analysis.SumSincFunction$1",
      "org.apache.commons.math.analysis.SumSincFunction$2",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.analysis.UnivariateFunction",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.linear.RealVector$2",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.optimization.BaseMultivariateOptimizer",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.analysis.SumSincFunction",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.analysis.DifferentiableMultivariateFunction",
      "org.apache.commons.math.analysis.MultivariateVectorFunction",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.optimization.BaseMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.analysis.SincFunction$1",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.analysis.SumSincFunction",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.optimization.RealPointValuePair"
    );
  }
}
