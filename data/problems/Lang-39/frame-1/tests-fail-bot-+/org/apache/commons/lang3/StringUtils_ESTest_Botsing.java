/*

 * Tue Mar 03 11:18:47 UTC 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class StringUtils_ESTest_Botsing extends StringUtils_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "java.runtime.name";
      // Undeclared exception!
      StringUtils.replaceEach("java.runtime.name", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringUtils.replaceChars("-UfX(AO+Tc2d~L", ')', ')');
      String[] stringArray0 = new String[6];
      stringArray0[3] = "-UfX(AO+Tc2d~L";
      // Undeclared exception!
      StringUtils.replaceEach("-UfX(AO+Tc2d~L", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = ">?})XvFS\"e";
      // Undeclared exception!
      StringUtils.replaceEach(">?})XvFS\"e", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "V";
      // Undeclared exception!
      StringUtils.replaceEach("V", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[19];
      stringArray0[1] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "java.runtime.name";
      // Undeclared exception!
      StringUtils.replaceEach("java.runtime.name", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "The stripAccents(String) method is not supported until Java 1.6";
      // Undeclared exception!
      StringUtils.replaceEach("The stripAccents(String) method is not supported until Java 1.6", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[1] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "java.version";
      // Undeclared exception!
      StringUtils.replaceEach("java.version", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "a1AB}s</B>\"0~t\u0003$";
      // Undeclared exception!
      StringUtils.replaceEach("a1AB}s</B>\"0~t\u0003$", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.substringBefore("The list of suffixes must not be null", "The list of suffixes must not be null");
      StringUtils.leftPad("", 4, 'k');
      String[] stringArray0 = new String[6];
      stringArray0[2] = "kkkk";
      // Undeclared exception!
      StringUtils.replaceEach("kkkk", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "y";
      // Undeclared exception!
      StringUtils.replaceEach("y", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "Es";
      // Undeclared exception!
      StringUtils.replaceEach("Es", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "java.util.prefs.PreferencesFactory";
      // Undeclared exception!
      StringUtils.replaceEach("java.util.prefs.PreferencesFactory", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "kP";
      // Undeclared exception!
      StringUtils.replaceEach("kP", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "^";
      // Undeclared exception!
      StringUtils.replaceEach("^", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[1] = "kP";
      // Undeclared exception!
      StringUtils.replaceEach("kP", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[1] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "c9_IX`qW5d;zwtfU8o";
      // Undeclared exception!
      StringUtils.replaceEach("c9_IX`qW5d;zwtfU8o", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "W";
      // Undeclared exception!
      StringUtils.replaceEach("W", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[1] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "kH";
      // Undeclared exception!
      StringUtils.replaceEach("kH", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "#3a*v~reTu+N";
      // Undeclared exception!
      StringUtils.replaceEach("#3a*v~reTu+N", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "java.rutime.name";
      // Undeclared exception!
      StringUtils.replaceEach("java.rutime.name", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[3] = "a1AB}s</B>\"0~t\u0003$";
      // Undeclared exception!
      StringUtils.replaceEach("a1AB}s</B>\"0~t\u0003$", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringUtils.leftPad(">?})XvFS\"e", 0);
      String[] stringArray0 = new String[4];
      stringArray0[2] = ">?})XvFS\"e";
      // Undeclared exception!
      StringUtils.replaceEach(">?})XvFS\"e", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "MJ&FCR1Eh`S^b`^";
      // Undeclared exception!
      StringUtils.replaceEach("MJ&FCR1Eh`S^b`^", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "(lassNotFoundException occurred during 1.6 backcompat code";
      // Undeclared exception!
      StringUtils.replaceEach("(lassNotFoundException occurred during 1.6 backcompat code", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "";
      // Undeclared exception!
      StringUtils.replaceEach("", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = ".";
      // Undeclared exception!
      StringUtils.replaceEach(".", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringUtils.center("The list of suffixes must not be null", 4);
      String[] stringArray0 = new String[6];
      stringArray0[2] = "The list of suffixes must not be null";
      // Undeclared exception!
      StringUtils.replaceEach("The list of suffixes must not be null", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "[";
      // Undeclared exception!
      StringUtils.replaceEach("[", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "XZ~gY#";
      // Undeclared exception!
      StringUtils.replaceEach("XZ~gY#", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[1] = "MJ&FCR1Eh`S^b`^";
      // Undeclared exception!
      StringUtils.replaceEach("MJ&FCR1Eh`S^b`^", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "arr";
      // Undeclared exception!
      StringUtils.replaceEach("arr", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "NoSuchFieldException occurred during 1.6 backcompat code";
      // Undeclared exception!
      StringUtils.replaceEach("NoSuchFieldException occurred during 1.6 backcompat code", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[0] = "MJ&FCR1Eh`S^b`^";
      // Undeclared exception!
      StringUtils.replaceEach("MJ&FCR1Eh`S^b`^", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[2] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[15];
      stringArray0[0] = "java.text.Normalizer$Form";
      // Undeclared exception!
      StringUtils.replaceEach("java.text.Normalizer$Form", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "9";
      // Undeclared exception!
      StringUtils.replaceEach("9", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = " w6Os";
      // Undeclared exception!
      StringUtils.replaceEach(" w6Os", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "[yqX 5OzBC.F68</x";
      // Undeclared exception!
      StringUtils.replaceEach("[yqX 5OzBC.F68</x", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "vm";
      // Undeclared exception!
      StringUtils.replaceEach("vm", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = ",}({a%Y'";
      // Undeclared exception!
      StringUtils.replaceEach(",}({a%Y'", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "H";
      // Undeclared exception!
      StringUtils.replaceEach("H", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "5";
      // Undeclared exception!
      StringUtils.replaceEach("5", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[2] = "*23Z8%fs`";
      // Undeclared exception!
      StringUtils.replaceEach("*23Z8%fs`", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "F,SyCa_WeYY";
      // Undeclared exception!
      StringUtils.replaceEach("F,SyCa_WeYY", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "2";
      // Undeclared exception!
      StringUtils.replaceEach("2", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = ":S";
      // Undeclared exception!
      StringUtils.replaceEach(":S", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[5] = ">?})XvFS\"e";
      // Undeclared exception!
      StringUtils.replaceEach(">?})XvFS\"e", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "<";
      // Undeclared exception!
      StringUtils.replaceEach("<", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = ":AJz=@M";
      // Undeclared exception!
      StringUtils.replaceEach(":AJz=@M", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "Minimum abbreviation width is 4";
      // Undeclared exception!
      StringUtils.replaceEach("Minimum abbreviation width is 4", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      String[] stringArray0 = new String[21];
      stringArray0[1] = "java.runtime.name";
      // Undeclared exception!
      StringUtils.replaceEach("java.runtime.name", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[1] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "Minimum abbreviation width is 4";
      // Undeclared exception!
      StringUtils.replaceEach("Minimum abbreviation width is 4", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "java.runtime.name";
      // Undeclared exception!
      StringUtils.replaceEach("java.runtime.name", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "8";
      // Undeclared exception!
      StringUtils.replaceEach("8", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StringUtils.substringBefore("The list of suffixes must not be null", "The list of suffixes must not be null");
      StringUtils.leftPad("", 4, 'k');
      StringUtils.center("kkkk", (int) 'k');
      String[] stringArray0 = new String[6];
      stringArray0[2] = "kkkk";
      // Undeclared exception!
      StringUtils.replaceEach("                                                   kkkk                                                    ", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "java.util.prefs.PreferencesFactory";
      // Undeclared exception!
      StringUtils.replaceEach("java.util.prefs.PreferencesFactory", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = ")";
      // Undeclared exception!
      StringUtils.replaceEach(")", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "kP";
      // Undeclared exception!
      StringUtils.replaceEach("kP", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[1] = "DF]3i";
      // Undeclared exception!
      StringUtils.replaceEach("DF]3i", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      String[] stringArray0 = new String[22];
      stringArray0[1] = "HE";
      // Undeclared exception!
      StringUtils.replaceEach("HE", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[5] = "The list of suffixes must not be null";
      // Undeclared exception!
      StringUtils.replaceEach("The list of suffixes must not be null", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "XZ~gY#";
      // Undeclared exception!
      StringUtils.replaceEach("XZ~gY#", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      StringUtils.substringBefore("The list of suffixes must not be null", "The list of suffixes must not be null");
      StringUtils.leftPad("", 4, 'k');
      StringUtils.center("kkkk", 4);
      String[] stringArray0 = new String[6];
      stringArray0[2] = "kkkk";
      // Undeclared exception!
      StringUtils.replaceEach("kkkk", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      StringUtils.center("The list of suffixes must not be null", (int) 'k');
      String[] stringArray0 = new String[6];
      stringArray0[2] = "The list of suffixes must not be null";
      // Undeclared exception!
      StringUtils.replaceEach("                                   The list of suffixes must not be null                                   ", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "_MI";
      // Undeclared exception!
      StringUtils.replaceEach("_MI", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "X";
      // Undeclared exception!
      StringUtils.replaceEach("X", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[1] = "Z";
      // Undeclared exception!
      StringUtils.replaceEach("Z", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "r";
      // Undeclared exception!
      StringUtils.replaceEach("r", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      String[] stringArray0 = new String[9];
      stringArray0[5] = ":B&vsQX";
      // Undeclared exception!
      StringUtils.replaceEach(":B&vsQX", stringArray0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[1] = "v3$";
      // Undeclared exception!
      StringUtils.replaceEach("v3$", stringArray0, stringArray0);
  }
}
