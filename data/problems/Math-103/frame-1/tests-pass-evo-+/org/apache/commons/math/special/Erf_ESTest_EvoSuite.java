/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:45:20 GMT 2020
 */

package org.apache.commons.math.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.special.Erf;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class Erf_ESTest_EvoSuite extends Erf_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = Erf.erf(0.9697851673607);
      assertEquals(0.8297756653663975, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = Erf.erf((-9.2));
      assertEquals((-1.000000000000013), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = Erf.erf(0.0);
      assertEquals(0.0, double0, 0.01);
  }
}