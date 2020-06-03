/*

 * Tue Mar 03 11:46:46 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BigMatrixImpl_ESTest_Botsing extends BigMatrixImpl_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, true);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[6][3];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      bigDecimalArray1[4] = bigDecimalArray0;
      bigDecimalArray1[5] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, true);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[2][7];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, true);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[2][7];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, true);
      bigMatrixImpl0.getColumnDimension();
      bigMatrixImpl0.equals(bigDecimal0);
      bigMatrixImpl0.isSingular();
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[6][3];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      bigDecimalArray1[4] = bigDecimalArray0;
      bigDecimalArray1[5] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[1][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      long long0 = 0L;
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[8][2];
      BigDecimal[] bigDecimalArray1 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(0L);
      bigDecimalArray1[0] = bigDecimal0;
      bigDecimalArray0[0] = bigDecimalArray1;
      BigDecimal[][] bigDecimalArray2 = new BigDecimal[2][7];
      bigDecimalArray2[0] = bigDecimalArray1;
      bigDecimalArray2[1] = bigDecimalArray1;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray2, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigDecimal bigDecimal0 = new BigDecimal(1L);
      bigDecimalArray0[0] = bigDecimal0;
      BigDecimal[][] bigDecimalArray1 = new BigDecimal[6][3];
      bigDecimalArray1[0] = bigDecimalArray0;
      bigDecimalArray1[1] = bigDecimalArray0;
      bigDecimalArray1[2] = bigDecimalArray0;
      bigDecimalArray1[3] = bigDecimalArray0;
      bigDecimalArray1[4] = bigDecimalArray0;
      bigDecimalArray1[5] = bigDecimalArray0;
      BigMatrixImpl bigMatrixImpl0 = new BigMatrixImpl(bigDecimalArray1, false);
      // Undeclared exception!
      bigMatrixImpl0.operate(bigDecimalArray0);
  }
}
