/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:31:01 GMT 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class NumberUtils_ESTest_EvoSuite extends NumberUtils_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(")ukP+D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)99, (byte)0, (byte)2);
      assertEquals((byte)99, byte0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      long long0 = NumberUtils.max(3043L, (-1L), 3188L);
      assertEquals(3188L, long0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-93), (byte) (-93), (byte) (-1));
      assertEquals((byte) (-93), byte0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)0, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      long long0 = NumberUtils.min(1816L, 4445L, 1816L);
      assertEquals(1816L, long0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (double) (float)numberUtils0.FLOAT_MINUS_ONE;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      int[] intArray0 = new int[6];
      intArray0[1] = (int) (short)numberUtils0.SHORT_MINUS_ONE;
      int int0 = NumberUtils.min(intArray0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      short short0 = NumberUtils.toShort("", (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      short short0 = NumberUtils.toShort("", (short) (-1));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = NumberUtils.toLong("{f%CjVzjT?Y", 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = NumberUtils.toInt("", (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = NumberUtils.toInt("", (int) (short)518);
      assertEquals(518, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = NumberUtils.toInt("7");
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      float float0 = NumberUtils.toFloat("TZ*0d,*3RQbOG_e2l6", (float) (byte)3);
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      float float0 = NumberUtils.toFloat("1");
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      double double0 = NumberUtils.toDouble("", (double) (byte)0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = NumberUtils.toDouble("@ue0)s?'/AP61", 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte) (-93));
      assertEquals((byte) (-93), byte0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short)97;
      shortArray0[1] = (short)46;
      shortArray0[2] = (short)46;
      shortArray0[3] = (short)1461;
      shortArray0[4] = (short)46;
      shortArray0[5] = (short)46;
      shortArray0[6] = (short)46;
      shortArray0[7] = (short)46;
      shortArray0[8] = (short)1461;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)46, short0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[3] = (short) (-1709);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short) (-1709), short0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) (short)1873;
      longArray0[1] = (long) (short)101;
      longArray0[2] = (long) (short)1873;
      longArray0[3] = (long) (short)1873;
      longArray0[4] = (long) (short)101;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(101L, long0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 7;
      intArray0[1] = 7;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) (byte)120;
      floatArray0[1] = (float) (byte)120;
      floatArray0[2] = (float) (byte)120;
      floatArray0[3] = (float) (byte)120;
      floatArray0[4] = (float) (byte)120;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(120.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 1.0;
      doubleArray0[1] = 2615.550391285;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      short short0 = NumberUtils.min((short)97, (short)1461, (short)46);
      assertEquals((short)46, short0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-1618), (short)46, (short)0);
      assertEquals((short) (-1618), short0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      long long0 = NumberUtils.min(2622L, 1L, 1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      int int0 = NumberUtils.min(0, 43, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      float float0 = NumberUtils.min(0.0F, 0.0F, (float) numberUtils0.SHORT_ONE);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = NumberUtils.min(1.0F, 1102.561F, 1102.561F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      double double0 = NumberUtils.min(1.0, 1900.0, 1042.9);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = NumberUtils.min((-1527.2999189), 1.0, 0.0);
      assertEquals((-1527.2999189), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      short[] shortArray0 = new short[8];
      shortArray0[0] = (short)2308;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)2308, short0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short) (-2271);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short) (-2271), short0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (-890L);
      long long0 = NumberUtils.max(longArray0);
      assertEquals((-890L), long0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (int) (byte) (-69);
      intArray0[1] = (int) (byte) (-69);
      intArray0[2] = (int) (byte) (-69);
      intArray0[3] = (int) (byte) (-69);
      intArray0[4] = (int) (byte) (-69);
      intArray0[5] = (-554);
      intArray0[6] = (int) (byte) (-69);
      intArray0[7] = (int) (byte) (-69);
      int int0 = NumberUtils.max(intArray0);
      assertEquals((-69), int0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 1;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      float[] floatArray0 = new float[7];
      floatArray0[0] = (float) (byte) (-76);
      floatArray0[1] = (float) (byte) (-76);
      floatArray0[2] = (float) (byte) (-76);
      floatArray0[3] = (float) (byte) (-76);
      floatArray0[4] = (float) (byte) (-76);
      floatArray0[5] = (float) (byte) (-76);
      floatArray0[6] = (float) (byte) (-76);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals((-76.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (-2048.7);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals((-2048.7), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-43);
      byteArray0[1] = (byte) (-43);
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte) (-43), byte0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      short short0 = NumberUtils.max((short) (byte)0, (short) (byte)0, (short) (byte)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-96), (short) (-96), (short) (-96));
      assertEquals((short) (-96), short0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      long long0 = NumberUtils.max((-1L), (long) 0, (-1L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      long long0 = NumberUtils.max((-1L), (-1L), (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      int int0 = NumberUtils.max((int) (byte)0, (int) (byte)0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      int int0 = NumberUtils.max((-1855), (-514), (-514));
      assertEquals((-514), int0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      float float0 = NumberUtils.max((-2749.6F), (-2749.6F), 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      float float0 = NumberUtils.max((-2675.5818F), (-1635.3F), (float) (byte) (-109));
      assertEquals((-109.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double double0 = NumberUtils.max((-738.22269745), (-738.22269745), 3364.52);
      assertEquals(3364.52, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      double double0 = NumberUtils.max((-1664.2), (-1664.2), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)0, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-116), (byte) (-116), (byte) (-118));
      assertEquals((byte) (-116), byte0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Float float0 = NumberUtils.createFloat("1");
      assertEquals(1.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-0");
      assertEquals(-0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("6");
      assertEquals(6, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short)3454);
      assertEquals((short)3454, short0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (double) (byte) (-93));
      assertEquals((-93.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      long long0 = NumberUtils.toLong("", (-86L));
      assertEquals((-86L), long0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = NumberUtils.toInt("", (-2925));
      assertEquals((-2925), int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("w");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--RctQH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4B)-v,Z");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xArray cannot be empty.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x is less than 0: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x0m~I^(jN&Z9C{<^$");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-115), (byte)0, (byte)46);
      assertEquals((byte)46, byte0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      short short0 = NumberUtils.max((short)0, (short)0, (short)533);
      assertEquals((short)533, short0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-383), (short)43, (short) (-1627));
      assertEquals((short)43, short0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      short short0 = NumberUtils.max((short)102, (short)0, (short)65);
      assertEquals((short)102, short0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      int int0 = NumberUtils.max((int) (byte)0, (int) (byte)0, 106);
      assertEquals(106, int0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int int0 = NumberUtils.max(0, 120, 0);
      assertEquals(120, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int int0 = NumberUtils.max(2, (-1688), 2);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)36, (byte) (-56));
      assertEquals((byte) (-56), byte0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)104, (byte)48, (byte)48);
      assertEquals((byte)48, byte0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      short short0 = NumberUtils.min((short)3332, (short)28, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short)0, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      int int0 = NumberUtils.min(1, (-1), (int) (short)28);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      int int0 = NumberUtils.min(70, 70, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      long long0 = NumberUtils.min(0L, 0L, (-1796L));
      assertEquals((-1796L), long0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long long0 = NumberUtils.min(2622L, (-2189L), 1L);
      assertEquals((-2189L), long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long long0 = NumberUtils.min(0L, 0L, (long) (short)100);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (-597.0363F);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[1] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 2615.550391285;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(2615.550391285, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[2] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)108;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)108, byte0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      short[] shortArray0 = new short[2];
      shortArray0[0] = (short) numberUtils0.SHORT_MINUS_ONE;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      short[] shortArray0 = new short[2];
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[1] = (int) (short)3332;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(3332, int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[2] = (long) (short)102;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(102L, long0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      long[] longArray0 = new long[5];
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      float[] floatArray0 = new float[9];
      floatArray0[6] = (float) (int)numberUtils0.INTEGER_MINUS_ONE;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      float[] floatArray0 = new float[6];
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      doubleArray0[2] = (-2474.3);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-2474.3), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[1] = (double) Float.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)3;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      int[] intArray0 = new int[2];
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      long[] longArray0 = new long[3];
      longArray0[1] = (-1L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      long[] longArray0 = new long[3];
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("M+", (byte)45);
      assertEquals((byte)45, byte0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      float float0 = NumberUtils.toFloat("", 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, 102L);
      assertEquals(102L, long0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, (-1188));
      assertEquals((-1188), int0);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      int int0 = NumberUtils.toInt("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      long long0 = NumberUtils.toLong("t.\"YN:Sds5&L,7");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      double double0 = NumberUtils.max(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) numberUtils0.BYTE_MINUS_ONE;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = NumberUtils.min(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      float float0 = NumberUtils.min((-3828.1045F), 0.0F, 0.0F);
      assertEquals((-3828.1045F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      float float0 = NumberUtils.max((float) 0, 234.73F, (-1454.6199F));
      assertEquals(234.73F, float0, 0.01F);
  }
}