/*

 * Tue Mar 03 10:20:13 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import junit.framework.TestCase;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.WeightedMeasurement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractEstimator_ESTest_Botsing extends AbstractEstimator_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest("");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimator0.initializeEstimate(levenbergMarquardtEstimatorTest_QuadraticProblem0);
      int int0 = 1;
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest1 = new LevenbergMarquardtEstimatorTest("NF7d./0UrrYws$Hczdq");
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem1 = levenbergMarquardtEstimatorTest1.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addMeasurement((WeightedMeasurement) null);
      Object object0 = new Object();
      TestCase.assertNotNull("lvX=xk4", object0);
      levenbergMarquardtEstimatorTest_QuadraticProblem1.addPoint(0.51938, 0.0, 4225.0022);
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem1);
  }
}
