/*

 * Tue Mar 03 10:19:52 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BigMatrixImpl_ESTest_Botsing extends BigMatrixImpl_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[7][7];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[3];
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      bigDecimalArray1[0] = bigDecimal0;
      BigInteger bigInteger0 = BigInteger.TEN;
      bigDecimalArray1[1] = bigDecimal0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1);
      BigDecimal[] bigDecimalArray2 = new BigDecimal[1];
      bigDecimalArray2[0] = bigDecimal0;
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray2);
  }
}
