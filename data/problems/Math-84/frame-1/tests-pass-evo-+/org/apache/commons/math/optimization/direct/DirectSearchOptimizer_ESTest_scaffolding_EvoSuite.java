/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:44:03 GMT 2020
 */
package org.apache.commons.math.optimization.direct;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DirectSearchOptimizer_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DirectSearchOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.analysis.MultivariateVectorialFunction",
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer$1",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.optimization.RealConvergenceChecker",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.Field",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.linear.FieldMatrixChangingVisitor",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.optimization.MultivariateRealOptimizer",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.optimization.OptimizationException",
      "org.apache.commons.math.optimization.direct.NelderMead",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.optimization.LeastSquaresConverter",
      "org.apache.commons.math.FieldElement",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.direct.MultiDirectional",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
      "org.apache.commons.math.optimization.GoalType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, DirectSearchOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math.analysis.MultivariateVectorialFunction", false, DirectSearchOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader()));
  }
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DirectSearchOptimizer_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer$1",
      "org.apache.commons.math.optimization.direct.NelderMead",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.direct.MultiDirectional",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.optimization.LeastSquaresConverter",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.optimization.OptimizationException",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.MatrixIndexException"
    );
  }
}
