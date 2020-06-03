/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:30:18 UTC 2020
 */
package org.apache.commons.math.linear;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class OpenMapRealVector_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OpenMapRealVector_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.linear.ArrayRealVectorTest$RealVectorTestImpl",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$1",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.AbstractRealVectorTest$TestVectorImpl",
      "org.apache.commons.math.analysis.SinFunction",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.SparseRealVectorTest",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.linear.ArrayRealVectorTest",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.analysis.QuinticFunction$1",
      "org.apache.commons.math.exception.MathUserException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.linear.AbstractRealVector$1",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.linear.AbstractRealVector$EntryImpl",
      "org.apache.commons.math.analysis.function.Divide",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.analysis.FunctionUtils$7",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.analysis.SinFunction$1",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.FunctionUtils",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.analysis.XMinus5Function$1",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.analysis.Expm1Function",
      "org.apache.commons.math.analysis.MonitoredFunction",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.analysis.Expm1Function$1",
      "org.apache.commons.math.analysis.QuinticFunction",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.analysis.SincFunction$1",
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.analysis.function.Multiply",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.analysis.XMinus5Function",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.exception.MathUnsupportedOperationException",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OpenMapRealVector_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.linear.ArrayRealVectorTest$RealVectorTestImpl",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.exception.NumberIsTooLargeException"
    );
  }
}
