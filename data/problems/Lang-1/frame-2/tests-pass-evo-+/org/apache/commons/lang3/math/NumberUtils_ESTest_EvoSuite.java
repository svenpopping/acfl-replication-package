/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:21:01 GMT 2020
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
      short short0 = NumberUtils.max((short)0, (short)0, (short) (-1));
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      int int0 = NumberUtils.max(7, (-586), (int) (short) (-586));
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      long long0 = NumberUtils.max(458L, (-618L), (-1L));
      assertEquals(458L, long0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)0, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-348), (short) (-348), (short) (-23));
      assertEquals((short) (-348), short0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      int int0 = NumberUtils.min(0, 2, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[2] = (double) 1626.0F;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(6, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 1626.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(1626.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (int) (byte)46;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(7, intArray0.length);
      assertArrayEquals(new int[] {46, 0, 0, 0, 0, 0, 0}, intArray0);
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      short short0 = NumberUtils.toShort("B", (short) (byte)57);
      assertEquals((short)57, short0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      short short0 = NumberUtils.toShort("", (short) (-586));
      assertEquals((short) (-586), short0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      short short0 = NumberUtils.toShort("08");
      assertEquals((short)8, short0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      long long0 = NumberUtils.toLong("", (-721L));
      assertEquals((-721L), long0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      int int0 = NumberUtils.toInt("The Array must not be null", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      int int0 = NumberUtils.toInt("jP", (int) (short) (-23));
      assertEquals((-23), int0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      float float0 = NumberUtils.toFloat("", (-2137.2F));
      assertEquals((-2137.2F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      double double0 = NumberUtils.toDouble("", (double) (short) (-586));
      assertEquals((-586.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = NumberUtils.toDouble("27");
      assertEquals(27.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte)22);
      assertEquals((byte)22, byte0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short)2610;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals(1, shortArray0.length);
      assertArrayEquals(new short[] {(short)2610}, shortArray0);
      assertEquals((short)2610, short0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (-1542);
      short short0 = NumberUtils.min(shortArray0);
      assertEquals(5, shortArray0.length);
      assertArrayEquals(new short[] {(short) (-1542), (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short) (-1542), short0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[0] = 1158L;
      longArray0[1] = 1L;
      longArray0[2] = 1L;
      longArray0[3] = 1158L;
      longArray0[4] = 1L;
      longArray0[5] = 1158L;
      long long0 = NumberUtils.min(longArray0);
      assertEquals(6, longArray0.length);
      assertArrayEquals(new long[] {1158L, 1L, 1L, 1158L, 1L, 1158L}, longArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 3707;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {3707}, intArray0);
      assertEquals(3707, int0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = (int) (byte) (-53);
      int int0 = NumberUtils.min(intArray0);
      assertEquals(7, intArray0.length);
      assertArrayEquals(new int[] {0, (-53), 0, 0, 0, 0, 0}, intArray0);
      assertEquals((-53), int0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      float[] floatArray0 = new float[1];
      floatArray0[0] = (float) 7;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(1, floatArray0.length);
      assertArrayEquals(new float[] {7.0F}, floatArray0, 0.01F);
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[0] = (-679.857F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(4, floatArray0.length);
      assertArrayEquals(new float[] {(-679.857F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-679.857F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 1L;
      doubleArray0[1] = (double) 378L;
      doubleArray0[2] = (double) 378L;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {1.0, 378.0, 378.0}, doubleArray0, 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) (int)numberUtils0.INTEGER_MINUS_ONE;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(4, doubleArray0.length);
      assertArrayEquals(new double[] {(-1.0), 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)68;
      byteArray0[1] = (byte)2;
      byteArray0[2] = (byte)2;
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals(3, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)68, (byte)2, (byte)2}, byteArray0);
      assertEquals((byte)2, byte0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      short short0 = NumberUtils.min((short)3079, (short)970, (short)970);
      assertEquals((short)970, short0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      long long0 = NumberUtils.min(1L, 1158L, 1158L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int int0 = NumberUtils.min(0, 0, 70);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = NumberUtils.min((int) (short)68, (int) (short)68, (int) (short)68);
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      float float0 = NumberUtils.min(1626.0F, (float) 0, (float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = NumberUtils.min(4169.53F, 4169.53F, 4169.53F);
      assertEquals(4169.53F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      double double0 = NumberUtils.min(0.0, 1040.4544632338175, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = NumberUtils.min((-355.312151), 1989.351096804364, 0.0);
      assertEquals((-355.312151), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)104, (byte)104, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)108, (byte)108, (byte)76);
      assertEquals((byte)76, byte0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[1] = (short) (byte)104;
      short short0 = NumberUtils.max(shortArray0);
      assertEquals(7, shortArray0.length);
      assertArrayEquals(new short[] {(short)0, (short)104, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)104, short0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short) (-276);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals(1, shortArray0.length);
      assertArrayEquals(new short[] {(short) (-276)}, shortArray0);
      assertEquals((short) (-276), short0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      long[] longArray0 = new long[3];
      longArray0[1] = (long) (int)numberUtils0.INTEGER_ONE;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(3, longArray0.length);
      assertArrayEquals(new long[] {0L, 1L, 0L}, longArray0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (-1L);
      long long0 = NumberUtils.max(longArray0);
      assertEquals(1, longArray0.length);
      assertArrayEquals(new long[] {(-1L)}, longArray0);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (int) (short) (-586);
      intArray0[1] = (int) (short) (-586);
      intArray0[2] = (int) (short) (-586);
      intArray0[3] = (int) (short) (-586);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {(-586), (-586), (-586), (-586)}, intArray0);
      assertEquals((-586), int0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      float[] floatArray0 = new float[5];
      floatArray0[3] = (float) (int)numberUtils0.INTEGER_ONE;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(5, floatArray0.length);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 1.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) (short) (-586);
      doubleArray0[1] = (-586.0);
      doubleArray0[2] = (double) (short) (-586);
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(3, doubleArray0.length);
      assertArrayEquals(new double[] {(-586.0), (-586.0), (-586.0)}, doubleArray0, 0.01);
      assertEquals((-586.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)62;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals(8, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)62, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals((byte)62, byte0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-53);
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals(1, byteArray0.length);
      assertArrayEquals(new byte[] {(byte) (-53)}, byteArray0);
      assertEquals((byte) (-53), byte0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-346), (short)0, (short) (-1426));
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      short short0 = NumberUtils.max((short) (byte) (-18), (short) (byte) (-60), (short) (byte) (-18));
      assertEquals((short) (-18), short0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int int0 = NumberUtils.max((-1334), 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      float float0 = NumberUtils.max((-1.0F), (-2094.03F), 1555.8618F);
      assertEquals(1555.8618F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float float0 = NumberUtils.max((-1863.7814F), (-1863.7814F), (-179.44066F));
      assertEquals((-179.44066F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = NumberUtils.max((-2522.056247), 0.0, (double) 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = NumberUtils.max((-184.09438), (-562.3), (-184.09438));
      assertEquals((-184.09438), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-55), (byte) (-1), (byte) (-55));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Long long0 = NumberUtils.createLong("0XF");
      assertNotNull(long0);
      assertEquals(15L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("0");
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Long long0 = NumberUtils.createLong("0");
      assertNotNull(long0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("0", (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, (double) 3236);
      assertEquals(3236.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double double0 = NumberUtils.toDouble("_q?+0QrsZ", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      float float0 = NumberUtils.toFloat("", (float) 1);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      long long0 = NumberUtils.toLong("t-ge)", (long) 2526);
      assertEquals(2526L, long0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      int int0 = NumberUtils.toInt("", 2526);
      assertEquals(2526, int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("h");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+v.XeH?e]XDX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("E!");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0XN>{1<p");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-#The Array must not be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("0");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("&-$U{UC\"(*o'^D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-1), (byte) (-76), (byte)30);
      assertEquals((byte)30, byte0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte)0, (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-116), (short)2687, (short)0);
      assertEquals((short)2687, short0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      short short0 = NumberUtils.max((short)43, (short) (byte) (-97), (short) (byte)114);
      assertEquals((short)114, short0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      int int0 = NumberUtils.max(0, 0, 68);
      assertEquals(68, int0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = NumberUtils.max((-2541), (-343), (-2541));
      assertEquals((-343), int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      long long0 = NumberUtils.max((-2673L), (-2673L), (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      long long0 = NumberUtils.max(1L, 378L, 0L);
      assertEquals(378L, long0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      long long0 = NumberUtils.max(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-53), (byte)46, (byte)46);
      assertEquals((byte) (-53), byte0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)7, (byte) (-1), (byte) (-55));
      assertEquals((byte) (-55), byte0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      short short0 = NumberUtils.min((short)45, (short)0, (short) (-285));
      assertEquals((short) (-285), short0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short)859, (short)120);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      int int0 = NumberUtils.min((-1399), (-1399), (-1829));
      assertEquals((-1829), int0);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      int int0 = NumberUtils.min((int) (byte) (-53), (-375), (int) (byte)46);
      assertEquals((-375), int0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      long long0 = NumberUtils.min((long) (byte)46, (long) (byte) (-53), (long) (byte) (-53));
      assertEquals((-53L), long0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      long long0 = NumberUtils.min(1L, 1L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[0] = (-1294.635F);
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(8, floatArray0.length);
      assertArrayEquals(new float[] {(-1294.635F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[8] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(9, floatArray0.length);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, Float.NaN}, floatArray0, 0.01F);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[6] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(8, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.NaN, 0.0}, doubleArray0, 0.01);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(5, doubleArray0.length);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals(2, byteArray0.length);
      assertArrayEquals(new byte[] {(byte)0, (byte)0}, byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short) (-4089);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals(7, shortArray0.length);
      assertArrayEquals(new short[] {(short) (-4089), (short)0, (short)0, (short)0, (short)0, (short)0, (short)0}, shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 166;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 166}, intArray0);
      assertEquals(166, int0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (-3773L);
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[0] = (float) 1L;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = 2470.43;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[2] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte) (-97);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-97), byte0);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      short[] shortArray0 = new short[9];
      shortArray0[0] = (short)5;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[0] = (int) (byte)46;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      long[] longArray0 = new long[8];
      longArray0[1] = (-4608L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-4608L), long0);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      long[] longArray0 = new long[7];
      long long0 = NumberUtils.min(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger("8");
      assertEquals((byte)8, bigInteger0.byteValue());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte) (-88));
      assertEquals((byte) (-88), byte0);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, (float) (short)0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, 278);
      assertEquals(278, int0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      float float0 = NumberUtils.toFloat("0");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      int int0 = NumberUtils.toInt("iDNsEEqqM<r");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      long long0 = NumberUtils.toLong(" is not a valid number.");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      double double0 = NumberUtils.max(0.0, 0.0, 378.0);
      assertEquals(378.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("cLqUtR|GdFkVQ}> H");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) numberUtils0.BYTE_MINUS_ONE;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      double double0 = NumberUtils.min(1426.1589, 1.0, (double) (byte)109);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      float float0 = NumberUtils.min((-1.0F), 3689.4F, (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      float float0 = NumberUtils.max(0.0F, (float) 0L, (-1874.52F));
      assertEquals(0.0F, float0, 0.01F);
  }
}
