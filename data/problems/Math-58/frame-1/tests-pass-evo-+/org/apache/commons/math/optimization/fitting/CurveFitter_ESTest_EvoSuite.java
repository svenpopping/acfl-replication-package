/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:41:09 GMT 2020
 */

package org.apache.commons.math.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.ParametricUnivariateRealFunction;
import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.analysis.function.HarmonicOscillator;
import org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.fitting.CurveFitter;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class CurveFitter_ESTest_EvoSuite extends CurveFitter_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CurveFitter curveFitter0 = new CurveFitter((DifferentiableMultivariateVectorialOptimizer) null);
      curveFitter0.addObservedPoint(0.0, 729.40009);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CurveFitter curveFitter0 = new CurveFitter((DifferentiableMultivariateVectorialOptimizer) null);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(2167.5051993176116, 2167.5051993176116, 2167.5051993176116);
      curveFitter0.addObservedPoint(weightedObservedPoint0);
      WeightedObservedPoint[] weightedObservedPointArray0 = curveFitter0.getObservations();
      assertEquals(1, weightedObservedPointArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      CurveFitter curveFitter0 = new CurveFitter(differentiableMultivariateVectorialOptimizer0);
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      double[] doubleArray0 = new double[3];
      double[] doubleArray1 = curveFitter0.fit((ParametricUnivariateRealFunction) gaussian_Parametric0, doubleArray0);
      assertNull(doubleArray1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      CurveFitter curveFitter0 = new CurveFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = curveFitter0.fit((ParametricUnivariateRealFunction) null, doubleArray0);
      assertSame(doubleArray1, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(1, 1, 1, (-2646), (-2646)).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 23, unitSphereRandomVectorGenerator0);
      CurveFitter curveFitter0 = new CurveFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = new double[0];
      curveFitter0.fit((ParametricUnivariateRealFunction) null, doubleArray1);
      assertEquals(Integer.MAX_VALUE, multiStartDifferentiableMultivariateVectorialOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair((double[]) null, (double[]) null);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      CurveFitter curveFitter0 = new CurveFitter(differentiableMultivariateVectorialOptimizer0);
      double[] doubleArray0 = curveFitter0.fit((-351), (ParametricUnivariateRealFunction) gaussian_Parametric0, (double[]) null);
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, true);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      CurveFitter curveFitter0 = new CurveFitter(differentiableMultivariateVectorialOptimizer0);
      Gaussian.Parametric gaussian_Parametric0 = new Gaussian.Parametric();
      double[] doubleArray1 = curveFitter0.fit(894, (ParametricUnivariateRealFunction) gaussian_Parametric0, doubleArray0);
      assertNotSame(doubleArray0, doubleArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      VectorialPointValuePair vectorialPointValuePair0 = new VectorialPointValuePair(doubleArray0, doubleArray0, false);
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      doReturn(vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0, vectorialPointValuePair0).when(differentiableMultivariateVectorialOptimizer0).optimize(anyInt() , any(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction.class) , any(double[].class) , any(double[].class) , any(double[].class));
      doReturn(1, 1, 1, (-2646), (-2646)).when(differentiableMultivariateVectorialOptimizer0).getEvaluations();
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 23, unitSphereRandomVectorGenerator0);
      CurveFitter curveFitter0 = new CurveFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      double[] doubleArray1 = new double[6];
      curveFitter0.fit(2643, (ParametricUnivariateRealFunction) null, doubleArray1);
      assertEquals(2643, multiStartDifferentiableMultivariateVectorialOptimizer0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator(0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 342, unitSphereRandomVectorGenerator0);
      CurveFitter curveFitter0 = new CurveFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      curveFitter0.clearObservations();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DifferentiableMultivariateVectorialOptimizer differentiableMultivariateVectorialOptimizer0 = mock(DifferentiableMultivariateVectorialOptimizer.class, new ViolatedAssumptionAnswer());
      Well512a well512a0 = new Well512a((-38));
      UnitSphereRandomVectorGenerator unitSphereRandomVectorGenerator0 = new UnitSphereRandomVectorGenerator((-38), well512a0);
      MultiStartDifferentiableMultivariateVectorialOptimizer multiStartDifferentiableMultivariateVectorialOptimizer0 = new MultiStartDifferentiableMultivariateVectorialOptimizer(differentiableMultivariateVectorialOptimizer0, 1497, unitSphereRandomVectorGenerator0);
      CurveFitter curveFitter0 = new CurveFitter(multiStartDifferentiableMultivariateVectorialOptimizer0);
      WeightedObservedPoint[] weightedObservedPointArray0 = curveFitter0.getObservations();
      assertEquals(0, weightedObservedPointArray0.length);
  }
}
