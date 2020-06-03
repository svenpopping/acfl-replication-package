/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:20:58 GMT 2020
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
      boolean boolean0 = NumberUtils.isNumber(" f5Cp;f~ xoua,,");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)0, (byte) (-66), (byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      int int0 = NumberUtils.max(1072, 102, 1072);
      assertEquals(1072, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-2480), (short)1, (short) (-1));
      assertEquals((short) (-2480), short0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      long long0 = NumberUtils.min((long) (byte) (-95), (long) (byte) (-95), (long) (byte) (-95));
      assertEquals((-95L), long0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-1.0);
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, (-1.0)}, doubleArray0, 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      long[] longArray0 = new long[6];
      longArray0[2] = (long) (short)numberUtils0.SHORT_ONE;
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 1L, 0L, 0L, 0L}, longArray0);
      assertEquals(0L, long0);
      assertEquals(6, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = NumberUtils.toShort("", (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      short short0 = NumberUtils.toShort("*HK%OS6.EJQU%", (short) (-85));
      assertEquals((short) (-85), short0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = NumberUtils.toLong("GA,\"qT~", (-2093L));
      assertEquals((-2093L), long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      int int0 = NumberUtils.toInt("X0'Q?|4e", (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      float float0 = NumberUtils.toFloat("", 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      double double0 = NumberUtils.toDouble("+]yKA,,B", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      double double0 = NumberUtils.toDouble("", (-2831.5947));
      assertEquals((-2831.5947), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("", (byte) (-10));
      assertEquals((byte) (-10), byte0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short) (byte)7;
      shortArray0[1] = (short) (byte)7;
      shortArray0[2] = (short) (byte)7;
      shortArray0[3] = (short) (byte)7;
      shortArray0[4] = (short) (byte)7;
      short short0 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)7, (short)7, (short)7, (short)7, (short)7}, shortArray0);
      assertEquals((short)7, short0);
      assertEquals(5, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      short[] shortArray0 = new short[4];
      shortArray0[1] = (short) (-1170);
      short short0 = NumberUtils.min(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short) (-1170), (short)0, (short)0}, shortArray0);
      assertEquals((short) (-1170), short0);
      assertEquals(4, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      long[] longArray0 = new long[7];
      longArray0[0] = (long) 101;
      longArray0[1] = (long) 101;
      longArray0[2] = (long) 101;
      longArray0[3] = (long) 101;
      longArray0[4] = (long) 101;
      longArray0[5] = (long) 101;
      longArray0[6] = (long) 101;
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {101L, 101L, 101L, 101L, 101L, 101L, 101L}, longArray0);
      assertEquals(101L, long0);
      assertEquals(7, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      long[] longArray0 = new long[6];
      longArray0[5] = (long) (int)numberUtils0.INTEGER_MINUS_ONE;
      long long0 = NumberUtils.min(longArray0);
      assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, (-1L)}, longArray0);
      assertEquals((-1L), long0);
      assertEquals(6, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = (int) (byte)64;
      intArray0[1] = 1073741824;
      int int0 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {64, 1073741824}, intArray0);
      assertEquals(64, int0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (int) (byte) (-25);
      int int0 = NumberUtils.min(intArray0);
      assertArrayEquals(new int[] {(-25), 0, 0}, intArray0);
      assertEquals((-25), int0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = 35.8742F;
      floatArray0[1] = 1768.7084F;
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {35.8742F, 1768.7084F}, floatArray0, 0.01F);
      assertEquals(35.8742F, float0, 0.01F);
      assertEquals(2, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      float[] floatArray0 = new float[9];
      floatArray0[1] = (float) (-6);
      float float0 = NumberUtils.min(floatArray0);
      assertArrayEquals(new float[] {0.0F, (-6.0F), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals((-6.0F), float0, 0.01F);
      assertEquals(9, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (double) 1466.2971F;
      doubleArray0[1] = (double) 1466.2971F;
      doubleArray0[2] = (double) 1466.2971F;
      doubleArray0[3] = (double) 1466.2971F;
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {1466.297119140625, 1466.297119140625, 1466.297119140625, 1466.297119140625}, doubleArray0, 0.01);
      assertEquals(1466.297119140625, double0, 0.01);
      assertEquals(4, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) (short) (-3464);
      double double0 = NumberUtils.min(doubleArray0);
      assertArrayEquals(new double[] {(-3464.0), 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals((-3464.0), double0, 0.01);
      assertEquals(7, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)24;
      byteArray0[1] = (byte)107;
      byteArray0[2] = (byte)64;
      byte byte0 = NumberUtils.min(byteArray0);
      assertArrayEquals(new byte[] {(byte)24, (byte)107, (byte)64}, byteArray0);
      assertEquals((byte)24, byte0);
      assertEquals(3, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      short short0 = NumberUtils.min((short)0, (short)0, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      long long0 = NumberUtils.min(1489L, 0L, 1888L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      long long0 = NumberUtils.min(749L, 2542L, 2542L);
      assertEquals(749L, long0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      int int0 = NumberUtils.min(3682, (int) (byte)0, 322);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = NumberUtils.min(64, 64, 944);
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = NumberUtils.min((float) 0L, (float) 0L, (float) (short)0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      float float0 = NumberUtils.min(0.0F, (float) (-943), 0.0F);
      assertEquals((-943.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      double double0 = NumberUtils.min(0.0, 0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      double double0 = NumberUtils.min((double) 2473, (double) 2473, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte)0, (byte)93);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)95, (byte)95, (byte)95);
      assertEquals((byte)95, byte0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short[] shortArray0 = new short[3];
      shortArray0[1] = (short)380;
      short short0 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short)0, (short)380, (short)0}, shortArray0);
      assertEquals((short)380, short0);
      assertEquals(3, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      short[] shortArray0 = new short[1];
      shortArray0[0] = (short) (byte) (-1);
      short short0 = NumberUtils.max(shortArray0);
      assertArrayEquals(new short[] {(short) (-1)}, shortArray0);
      assertEquals((short) (-1), short0);
      assertEquals(1, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      long[] longArray0 = new long[1];
      longArray0[0] = (-1L);
      long long0 = NumberUtils.max(longArray0);
      assertArrayEquals(new long[] {(-1L)}, longArray0);
      assertEquals((-1L), long0);
      assertEquals(1, longArray0.length);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[1] = 1395;
      int int0 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {0, 1395, 0}, intArray0);
      assertEquals(1395, int0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-380);
      int int0 = NumberUtils.max(intArray0);
      assertArrayEquals(new int[] {(-380)}, intArray0);
      assertEquals((-380), int0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      float[] floatArray0 = new float[6];
      floatArray0[3] = (float) numberUtils0.FLOAT_ONE;
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(6, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float[] floatArray0 = new float[1];
      floatArray0[0] = (float) (-1L);
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {(-1.0F)}, floatArray0, 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(1, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[3] = 575.9984821442439;
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 575.9984821442439}, doubleArray0, 0.01);
      assertEquals(575.9984821442439, double0, 0.01);
      assertEquals(4, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) (-2129);
      double double0 = NumberUtils.max(doubleArray0);
      assertArrayEquals(new double[] {(-2129.0)}, doubleArray0, 0.01);
      assertEquals((-2129.0), double0, 0.01);
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-95);
      byteArray0[1] = (byte) (-95);
      byte byte0 = NumberUtils.max(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-95), (byte) (-95)}, byteArray0);
      assertEquals((byte) (-95), byte0);
      assertEquals(2, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      assertEquals((byte)0, (byte)byte0);
      assertNotNull(byte0);
      
      short short0 = NumberUtils.max((short) byte0, (short) (byte)0, (short) (byte)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1796), (short) (-2898), (short) (-593));
      assertEquals((short) (-593), short0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      long long0 = NumberUtils.max(0L, 0L, 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      long long0 = NumberUtils.max((-1L), (long) (-1073), (-25L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      int int0 = NumberUtils.max(0, 0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      float float0 = NumberUtils.max((float) (byte)51, (float) (byte)51, (float) (byte) (-25));
      assertEquals(51.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      float float0 = NumberUtils.max((-345.72217F), (float) (short) (-1), (float) (short) (-1));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      double double0 = NumberUtils.max((double) 0L, (double) 0.0F, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      double double0 = NumberUtils.max((double) (-65.0F), (-1917.883554333), (double) (-65.0F));
      assertEquals((-65.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)58, (byte)95, (byte)58);
      assertEquals((byte)95, byte0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-0xA");
      assertEquals((-10), number0);
      assertNotNull(number0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger("-0");
      assertEquals(0, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Double double0 = NumberUtils.createDouble("-0");
      assertEquals(-0.0, (double)double0, 0.01);
      assertNotNull(double0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short)274);
      assertEquals((short)274, short0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      assertNotNull(numberUtils0);
      
      byte byte0 = NumberUtils.toByte("", (byte) numberUtils0.BYTE_ZERO);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null, 1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      float float0 = NumberUtils.toFloat("GA,\"qT~", (-1.0F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      long long0 = NumberUtils.toLong("GA,\"qT~", 0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      int int0 = NumberUtils.toInt("", 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("n");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e9");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5\"ywoS|<SOuOu");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xX0'Q?|4e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xA");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("/");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("---0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("7(f1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-46), (byte) (-46), (byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-482), (short)43, (short)0);
      assertEquals((short)43, short0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      int int0 = NumberUtils.max((-2129), (-2129), 161);
      assertEquals(161, int0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      int int0 = NumberUtils.max(0, 69, 0);
      assertEquals(69, int0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      int int0 = NumberUtils.max((-10), (-10), (-470));
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = NumberUtils.max((-1505L), (long) (byte)68, (-1505L));
      assertEquals(68L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-102), (byte)0, (byte) (-114));
      assertEquals((byte) (-114), byte0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)0, (byte) (-64), (byte)57);
      assertEquals((byte) (-64), byte0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      short short0 = NumberUtils.min((short) (-1), (short) (byte) (-84), (short) (-2322));
      assertEquals((short) (-2322), short0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      short short0 = NumberUtils.min((short)7, (short) (byte)7, (short)7);
      assertEquals((short)7, short0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      int int0 = NumberUtils.min((-1), (int) (short)0, (-4215));
      assertEquals((-4215), int0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      int int0 = NumberUtils.min(0, (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      long long0 = NumberUtils.min(1258L, 0L, (-1L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      float[] floatArray0 = new float[4];
      floatArray0[0] = (float) (-71);
      float float0 = NumberUtils.max(floatArray0);
      assertArrayEquals(new float[] {(-71.0F), 0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(4, floatArray0.length);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[3] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = (double) Float.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)69;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)69, byte0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (byte) (-111);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-1469);
      int int0 = NumberUtils.max(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[7] = 3876L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(3876L, long0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      long[] longArray0 = new long[9];
      long long0 = NumberUtils.max(longArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      float[] floatArray0 = new float[2];
      floatArray0[0] = (float) 1223;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      float[] floatArray0 = new float[8];
      floatArray0[5] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = 2513.366424799012;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      doubleArray0[6] = (double) Float.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-19);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-19), byte0);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      short[] shortArray0 = new short[4];
      shortArray0[0] = (short)97;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[0] = 65;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("---0x");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null, (byte)20);
      assertEquals((byte)20, byte0);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null, 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null, (long) 46);
      assertEquals(46L, long0);
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null, 46);
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      float float0 = NumberUtils.toFloat("3d3'!");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      int int0 = NumberUtils.toInt("L");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      long long0 = NumberUtils.toLong("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = NumberUtils.max((double) (byte)70, (double) (byte)70, 1.0);
      assertEquals(70.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      byte byte0 = NumberUtils.toByte(">HG");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      long long0 = NumberUtils.max((long) numberUtils0.LONG_ZERO, (long) numberUtils0.LONG_MINUS_ONE, (long) numberUtils0.INTEGER_ONE);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      double double0 = NumberUtils.min(0.0, (-1.0), (-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      float float0 = NumberUtils.min(1.0F, 1.0F, 1.0F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      float float0 = NumberUtils.max((-424.07327F), (-424.07327F), 0.0F);
      assertEquals(0.0F, float0, 0.01F);
  }
}