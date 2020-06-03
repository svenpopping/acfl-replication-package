/*

 * Tue Mar 03 11:47:19 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.EstimatedParameter;
import org.apache.commons.math.estimation.EstimationProblem;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.WeightedMeasurement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class AbstractEstimator_ESTest_Botsing extends AbstractEstimator_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("S~t3[swXfi7)^b");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[1];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maxial number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[4];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maxial number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[4];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[11];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[7];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurementArray0[2]);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[2];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[7];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of ealuatins exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("mauimal number o4 evaluations ewceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maxil nmber f evaluations exceded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[5];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[1];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[2];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("max0mal number of evMluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number f valuations exceede ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[1];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal n?kber of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[18];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal nmber of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[8];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[6];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      levenbergMarquardtEstimator0.getCostEvaluations();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0, 0, 0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[6];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[8];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("sF~-u7(]fkM]^):*<Cj");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[2];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[8];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number f valuations exceede ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("<0e_Xb");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[3];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[2];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[13];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evalutions exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint((-2541.98703), (-2541.98703), (-2541.98703));
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[14];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of Fvaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[1];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[4];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("maximal number of evaluations exceeded ({0})");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement[] weightedMeasurementArray0 = new WeightedMeasurement[5];
      EstimatedParameter[] estimatedParameterArray0 = new EstimatedParameter[3];
      EstimationProblem estimationProblem0 = mock(EstimationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(estimatedParameterArray0).when(estimationProblem0).getAllParameters();
      doReturn(weightedMeasurementArray0).when(estimationProblem0).getMeasurements();
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(estimationProblem0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.estimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      WeightedMeasurement weightedMeasurement0 = mock(WeightedMeasurement.class, new ViolatedAssumptionAnswer());
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addMeasurement(weightedMeasurement0);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
