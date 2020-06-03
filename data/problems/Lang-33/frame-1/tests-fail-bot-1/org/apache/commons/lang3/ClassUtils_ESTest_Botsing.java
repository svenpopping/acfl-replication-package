/*

 * Tue Mar 03 10:00:21 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class ClassUtils_ESTest_Botsing extends ClassUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) objectArray0;
      objectArray0[1] = objectArray0[0];
      objectArray0[5] = objectArray0[1];
      objectArray0[3] = objectArray0[2];
      objectArray0[4] = objectArray0[3];
      objectArray0[5] = objectArray0[4];
      objectArray0[6] = objectArray0[5];
      objectArray0[7] = objectArray0[6];
      objectArray0[8] = objectArray0[7];
      // Undeclared exception!
      ClassUtils.toClass(objectArray0);
  }
}
