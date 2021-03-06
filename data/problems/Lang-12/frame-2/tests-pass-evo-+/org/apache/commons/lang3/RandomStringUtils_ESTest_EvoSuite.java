/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:22:25 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;

public class RandomStringUtils_ESTest_EvoSuite extends RandomStringUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[0] = '!';
      charArray0[1] = '\"';
      charArray0[2] = '4';
      charArray0[3] = '@';
      charArray0[4] = 'C';
      charArray0[5] = 'i';
      MockRandom mockRandom0 = new MockRandom(0L);
      mockRandom0.setSeed((-1L));
      mockRandom0.nextFloat();
      mockRandom0.nextDouble();
      RandomStringUtils.random(0, 57343, (-570), true, true, charArray0, (Random) mockRandom0);
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.random(0, charArray0);
      RandomStringUtils.randomAlphanumeric(0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RandomStringUtils randomStringUtils0 = new RandomStringUtils();
      RandomStringUtils.random(0, false, false);
      RandomStringUtils.random(0, false, false);
      RandomStringUtils.randomAlphabetic(0);
      char[] charArray0 = new char[0];
      MockRandom mockRandom0 = new MockRandom();
      RandomStringUtils.random(0, (-5133), 3629, false, true, charArray0, (Random) mockRandom0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RandomStringUtils.randomAscii(2098);
      RandomStringUtils.randomAscii(2098);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = 'w';
      charArray0[1] = 'o';
      charArray0[2] = '<';
      charArray0[3] = '5';
      charArray0[4] = 'k';
      charArray0[5] = 'p';
      charArray0[6] = '>';
      charArray0[7] = 'q';
      RandomStringUtils.random(0, charArray0);
  }

}
