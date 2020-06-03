/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:16:45 UTC 2020
 */
package org.apache.commons.math.optimization.direct;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DirectSearchOptimizer_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DirectSearchOptimizer_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.analysis.MultivariateVectorialFunction",
      "org.apache.commons.math.optimization.general.MinpackTest$WatsonFunction",
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer$1",
      "org.apache.commons.math.optimization.general.MinpackTest$LinearRank1Function",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.optimization.general.MinpackTest$KowalikOsborneFunction",
      "org.apache.commons.math.optimization.RealConvergenceChecker",
      "org.apache.commons.math.optimization.general.MinpackTest$LinearFullRankFunction",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest$Circle",
      "org.apache.commons.math.linear.ArrayRealVectorTest$RealVectorTestImpl",
      "org.apache.commons.math.optimization.general.MinpackTest$Osborne2Function",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.linear.RealMatrixImplTest$SetVisitor",
      "org.apache.commons.math.optimization.general.MinpackTest$RosenbrockFunction",
      "org.apache.commons.math.linear.RealMatrixImplTest$GetVisitor",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizerTest$LinearProblem",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest$Circle",
      "org.apache.commons.math.optimization.MultivariateRealOptimizer",
      "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateRealOptimizerTest$Circle",
      "org.apache.commons.math.linear.SparseRealVectorTest",
      "org.apache.commons.math.analysis.DifferentiableMultivariateRealFunction",
      "org.apache.commons.math.linear.ArrayRealVectorTest",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.optimization.general.MinpackTest$MinpackFunction",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.optimization.general.MinpackTest$FreudensteinRothFunction",
      "org.apache.commons.math.optimization.general.MinpackTest$HelicalValleyFunction",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.general.MinpackTest$LinearRank1ZeroColsAndRowsFunction",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.optimization.general.MinpackTest$ChebyquadFunction",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.optimization.general.MinpackTest$BardFunction",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.optimization.MultiStartMultivariateRealOptimizerTest$Rosenbrock",
      "org.apache.commons.math.optimization.general.MinpackTest$PowellSingularFunction",
      "org.apache.commons.math.linear.Array2DRowRealMatrixTest$SetVisitor",
      "org.apache.commons.math.optimization.general.MinpackTest$Osborne1Function",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.linear.SparseRealVectorTest$SparseRealVectorTestImpl",
      "org.apache.commons.math.optimization.OptimizationException",
      "org.apache.commons.math.optimization.direct.NelderMead",
      "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest$QuadraticProblem",
      "org.apache.commons.math.linear.DecompositionSolver",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.MaxEvaluationsExceededException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest$LinearProblem",
      "org.apache.commons.math.optimization.LeastSquaresConverter",
      "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest$LinearProblem",
      "org.apache.commons.math.MaxIterationsExceededException",
      "org.apache.commons.math.optimization.general.MinpackTest$BrownAlmostLinearFunction",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.optimization.general.MinpackTest$Box3DimensionalFunction",
      "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.BlockRealMatrixTest$GetVisitor",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.optimization.general.MinpackTest$BrownDennisFunction",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.optimization.direct.MultiDirectional",
      "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.Array2DRowRealMatrixTest$GetVisitor",
      "org.apache.commons.math.optimization.general.MinpackTest$MeyerFunction",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.linear.BlockRealMatrixTest$SetVisitor",
      "org.apache.commons.math.optimization.direct.DirectSearchOptimizer",
      "org.apache.commons.math.optimization.general.MinpackTest$JennrichSampsonFunction",
      "org.apache.commons.math.optimization.GoalType"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.analysis.MultivariateRealFunction", false, DirectSearchOptimizer_ESTest_scaffolding_Botsing.class.getClassLoader()));
  }
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DirectSearchOptimizer_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.ConvergenceException",
      "org.apache.commons.math.optimization.OptimizationException",
      "org.apache.commons.math.MaxIterationsExceededException"
    );
  }
}
