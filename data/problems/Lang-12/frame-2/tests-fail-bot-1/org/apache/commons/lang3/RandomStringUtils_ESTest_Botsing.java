/*

 * Tue Mar 03 10:00:26 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class RandomStringUtils_ESTest_Botsing extends RandomStringUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[0];
      RandomStringUtils.random(0, charArray0);
      RandomStringUtils.randomAlphanumeric(0);
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      RandomStringUtils.random(0, 0, 0, true, true, charArray0, random0);
      // Undeclared exception!
      RandomStringUtils.random(466, charArray0);
  }
}
