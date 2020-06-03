/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:47:19 UTC 2020
 */
package org.apache.commons.math.estimation;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractEstimator_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractEstimator_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.estimation.MinpackTest$FreudensteinRothFunction",
      "org.apache.commons.math.estimation.EstimatedParameter",
      "org.apache.commons.math.estimation.MinpackTest$MinpackFunction",
      "org.apache.commons.math.estimation.MinpackTest$LinearRank1ZeroColsAndRowsFunction",
      "org.apache.commons.math.estimation.MinpackTest$Box3DimensionalFunction",
      "org.apache.commons.math.estimation.EstimationException",
      "org.apache.commons.math.estimation.MinpackTest$KowalikOsborneFunction",
      "org.apache.commons.math.estimation.MinpackTest$PowellSingularFunction",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.estimation.MinpackTest$HelicalValleyFunction",
      "org.apache.commons.math.estimation.GaussNewtonEstimatorTest$LinearProblem",
      "org.apache.commons.math.estimation.GaussNewtonEstimatorTest$Circle$PointModel",
      "org.apache.commons.math.estimation.Estimator",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimator",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$QuadraticProblem$LocalMeasurement",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.estimation.WeightedMeasurementTest$MyMeasurement",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.estimation.GaussNewtonEstimatorTest$Circle",
      "org.apache.commons.math.estimation.MinpackTest$LinearRank1Function",
      "org.apache.commons.math.estimation.EstimationProblem",
      "org.apache.commons.math.estimation.MinpackTest$JennrichSampsonFunction",
      "org.apache.commons.math.estimation.MinpackTest$MinpackFunction$MinpackMeasurement",
      "org.apache.commons.math.estimation.MinpackTest$LinearFullRankFunction",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.estimation.MinpackTest$ChebyquadFunction",
      "org.apache.commons.math.estimation.WeightedMeasurement",
      "org.apache.commons.math.estimation.SimpleEstimationProblem",
      "org.apache.commons.math.estimation.MinpackTest$BrownAlmostLinearFunction",
      "org.apache.commons.math.estimation.MinpackTest$RosenbrockFunction",
      "org.apache.commons.math.estimation.MinpackTest$WatsonFunction",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.estimation.MinpackTest$Osborne1Function",
      "org.apache.commons.math.estimation.MinpackTest$Osborne2Function",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$Circle",
      "org.apache.commons.math.estimation.MinpackTest$MeyerFunction",
      "org.apache.commons.math.estimation.GaussNewtonEstimatorTest$LinearMeasurement",
      "org.apache.commons.math.estimation.AbstractEstimator",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$QuadraticProblem",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$Circle$PointModel",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest",
      "org.apache.commons.math.estimation.MinpackTest$BardFunction",
      "org.apache.commons.math.estimation.MinpackTest$BrownDennisFunction",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$LinearMeasurement",
      "org.apache.commons.math.estimation.GaussNewtonEstimator",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$LinearProblem"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.estimation.EstimationProblem", false, AbstractEstimator_ESTest_scaffolding_Botsing.class.getClassLoader()));
    mock(Class.forName("org.apache.commons.math.estimation.WeightedMeasurement", false, AbstractEstimator_ESTest_scaffolding_Botsing.class.getClassLoader()));
  }
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractEstimator_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimator",
      "org.apache.commons.math.estimation.GaussNewtonEstimator",
      "org.apache.commons.math.estimation.EstimatedParameter",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$LinearMeasurement",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.estimation.EstimationException",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$QuadraticProblem$LocalMeasurement",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$Circle$PointModel"
    );
  }
}
