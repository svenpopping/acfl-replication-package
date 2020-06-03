/*

 * Tue Mar 03 11:30:18 UTC 2020
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
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(31, 31);
      double[] doubleArray0 = openMapRealVector0.getData();
      RealVector realVector0 = openMapRealVector0.add(doubleArray0);
      openMapRealVector0.set(31);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1124, 1124);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(1.0E-12);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1124, 1124);
      openMapRealVector0.set(1.0E-12);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(122, 122);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(122);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1124, 1124);
      OpenMapRealVector openMapRealVector1 = openMapRealVector0.mapAdd(1124);
      // Undeclared exception!
      openMapRealVector1.ebeMultiply((RealVector) openMapRealVector0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(1124, 1124);
      OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(1124, 1124);
      openMapRealVector0.set(1124);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(31, 31);
      double[] doubleArray0 = openMapRealVector0.getData();
      RealVector realVector0 = openMapRealVector0.add(doubleArray0);
      openMapRealVector0.set(1.0E-12);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply(realVector0);
  }
}
