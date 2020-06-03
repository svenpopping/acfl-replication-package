/*

 * Tue Mar 03 11:15:36 UTC 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class NumberUtils_ESTest_Botsing extends NumberUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
        NumberUtils.createNumber("-0X-0X-0X#");
      
         //
         // Sign character in wrong position
         //
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
        NumberUtils.createNumber("0X^");
      
         //
         // For input string: \"^\"
         //
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
        NumberUtils.createNumber("#';JI?)'");
      
         //
         // For input string: \"';JI?)'\"
         //
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
        NumberUtils.createNumber("-0X");
      
         //
         // For input string: \"-\"
         //
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
        NumberUtils.createNumber("0x");
      
         //
         // For input string: \"\"
         //
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
        NumberUtils.createNumber("0x#");
      
         //
         // For input string: \"#\"
         //
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
        NumberUtils.createNumber("##");
      
         //
         // For input string: \"#\"
         //
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
        NumberUtils.createNumber("-0X#");
      
         //
         // For input string: \"-#\"
         //
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
        NumberUtils.createNumber("-0xR");
      
         //
         // For input string: \"-R\"
         //
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
        NumberUtils.createNumber("0X");
      
         //
         // For input string: \"\"
         //
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
        NumberUtils.createNumber("#");
      
         //
         // For input string: \"\"
         //
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
        NumberUtils.createNumber("-0x#");
      
         //
         // For input string: \"-#\"
         //
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
        NumberUtils.createNumber("-#");
      
         //
         // For input string: \"-\"
         //
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
        NumberUtils.createNumber("-0X-0X#");
      
         //
         // Sign character in wrong position
         //
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
        NumberUtils.createNumber("-0xL");
      
         //
         // For input string: \"-L\"
         //
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
        NumberUtils.createNumber("#A,#");
      
         //
         // For input string: \"A,#\"
         //
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
        NumberUtils.createNumber("-0x");
      
         //
         // For input string: \"-\"
         //
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
        NumberUtils.createNumber("#'aq={-_");
      
         //
         // For input string: \"'aq={-_\"
         //
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
        NumberUtils.createNumber("-0XO~");
      
         //
         // For input string: \"-O~\"
         //
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
        NumberUtils.createNumber("#'=?){'-_");
      
         //
         // For input string: \"'=?){'-_\"
         //
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
        NumberUtils.createNumber("#'c?){'/_");
      
         //
         // For input string: \"'c?){'/_\"
         //
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
        NumberUtils.createNumber("#'=){-_");
      
         //
         // For input string: \"'=){-_\"
         //
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
        NumberUtils.createNumber("0X-0X#");
      
         //
         // Sign character in wrong position
         //
  }
}
