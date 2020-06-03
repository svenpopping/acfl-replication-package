/*

 * Tue Mar 03 10:10:13 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class OpenMapRealVector_ESTest_Botsing extends OpenMapRealVector_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = 901.03;
      doubleArray0[2] = (-2524.15);
      doubleArray0[3] = 0.0;
      doubleArray0[4] = 0.0;
      doubleArray0[5] = (-415.875254);
      doubleArray0[6] = (-1.0);
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      double double0 = 1.5830993332061267E-10;
      RealVector realVector0 = openMapRealVector0.combineToSelf(531.63082993371, 1.5830993332061267E-10, doubleArray0);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
