/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:25:34 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class Line_ESTest_EvoSuite extends Line_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D((-554.82), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Line line1 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line1.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(7.50471692155746E-14, vector3D2.getNorm1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Vector3D vector3D2 = new Vector3D((-554.82), vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      Line line1 = new Line(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.closestPoint(line1);
      assertEquals(3.53682605010705E-8, vector3D3.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(vector3D0, vector3D0);
      double double0 = line0.distance(line1);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector1D vector1D0 = line0.toSubSpace(vector3D0);
      assertFalse(vector1D0.isInfinite());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(439.0, (-1784.3224846386), 1.0E-10);
      Vector3D vector3D1 = new Vector3D((-1784.3224846386), vector3D0, (-612.698464946), vector3D0, 1.0E-10, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      Vector1D vector1D1 = line0.toSubSpace(vector3D2);
      assertEquals((-0.7853981633974483), vector3D2.getAlpha(), 0.01);
      assertTrue(vector1D1.equals((Object)vector1D0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(517.881507458748, 1.2424645026244245);
      Vector3D vector3D1 = new Vector3D(517.881507458748, vector3D0, 517.881507458748, vector3D0, 0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals((-1.7364647645110876E-14), vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = vector3D0.crossProduct((Vector<Euclidean3D>) vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D1);
      line0.toSpace(vector1D0);
      assertEquals(0.0, vector1D0.getNormInf(), 0.01);
      assertEquals(0.0, vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D((-2238.2661), vector3D0, (-2238.2661), vector3D0, (-2238.2661), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D0);
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals((-1.0), vector1D0.getX(), 0.01);
      assertEquals((-1.5707963267948966), vector3D2.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D(0.375, vector3D0, 0.375, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D1);
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals((-1.5707963267948966), vector3D2.getAlpha(), 0.01);
      assertEquals((-0.75), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.pointAt(0.0);
      assertEquals(0.0, vector3D2.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(2.34156225367215E-15, vector3D0, 1861.1157, vector3D0, 2.34156225367215E-15, vector3D0, 1.494140625, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.pointAt(1.494140625);
      assertEquals(1.4941406249998408, vector3D2.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(50.0, 50.0, 50.0);
      Vector3D vector3D1 = new Vector3D(0.0, 1.0);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.pointAt(1.0);
      assertEquals((-0.18602614594683647), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = new Vector3D((-2767.713611479), 1.0);
      Vector3D vector3D2 = new Vector3D((-781.608923310803), (-648.7262), 1.0);
      line0.reset(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.intersection(line0);
      assertNotNull(vector3D3);
      assertEquals((-0.21252450846011156), vector3D3.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = Vector3D.ZERO;
      Vector3D vector3D2 = new Vector3D(1.0, (-648.7262), 1.0);
      line0.reset(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.intersection(line0);
      assertNotNull(vector3D3);
      assertEquals(0.0, vector3D3.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = new Vector3D((-0.812684508), (-0.812684508));
      Vector3D vector3D2 = new Vector3D((-0.812684508), (-0.812684508), (-0.812684508));
      line0.reset(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.intersection(line0);
      assertNotNull(vector3D3);
      assertEquals((-0.5684879555613179), vector3D3.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = new Vector3D((-0.812684508), (-0.812684508));
      Vector3D vector3D2 = new Vector3D((-0.812684508), (-0.812684508), (-0.812684508));
      line0.reset(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.getOrigin();
      assertEquals((-0.8937558637958729), vector3D3.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = Vector3D.ZERO;
      Vector3D vector3D2 = new Vector3D(1.0, (-648.7262), 1.0);
      line0.reset(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.getOrigin();
      assertEquals(0.0, vector3D3.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Vector3D vector3D2 = new Vector3D((-554.82), vector3D1);
      Line line0 = new Line(vector3D1, vector3D2);
      Vector3D vector3D3 = line0.getOrigin();
      assertEquals(5.503561923275233E-22, vector3D3.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(1505.936952891, vector3D0, 4532.621377650432, vector3D0, 0.0, vector3D0, (-0.05417713522911072), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals((-1.0), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals((-0.7071067811865476), vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.getAbscissa(vector3D1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D(2.0, 7362.822670932397, 2.0);
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.getAbscissa(vector3D1);
      assertEquals(7362.823214202275, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Vector3D vector3D2 = new Vector3D((-554.82), vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      double double0 = line0.getAbscissa(vector3D0);
      assertEquals((-784.6339687410111), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(2.34156225367215E-15, vector3D0, 1861.1157, vector3D0, 2.34156225367215E-15, vector3D0, 1.494140625, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      double double0 = line0.distance(vector3D0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D((-554.82), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      double double0 = line0.distance(vector3D1);
      assertEquals(8.699263666029522E-11, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D1, vector3D0);
      double double0 = line1.distance(line0);
      assertEquals(2.9405799875150086E-27, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.closestPoint(line0);
      assertEquals(Double.NaN, vector3D1.getNorm1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(0.0, 0.0);
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.closestPoint(line0);
      assertEquals(0.5, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.closestPoint(line0);
      assertEquals(0.0, vector3D2.getNormInf(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Vector3D vector3D2 = new Vector3D((-554.82), vector3D1);
      Vector3D vector3D3 = vector3D0.add((Vector<Euclidean3D>) vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      line0.reset(vector3D2, vector3D3);
      Vector3D vector3D4 = line0.closestPoint(line0);
      assertEquals((-5.5885713168716595E-8), vector3D4.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-554.82), (-554.82), 0.0);
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-3477.561976783679), vector3D0, (-839.022164603), vector3D0);
      Vector3D vector3D2 = new Vector3D((-554.82), vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      boolean boolean0 = line0.contains(vector3D2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D((-2238.2661), vector3D0, (-2238.2661), vector3D0, (-2238.2661), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      boolean boolean0 = line0.contains(vector3D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(line0);
      assertFalse(line1.equals((Object)line0));
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.distance(line0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = line0.revert();
      boolean boolean0 = line1.isSimilarTo(line0);
      assertTrue(boolean0);
      assertNotSame(line1, line0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.getDirection();
      assertEquals(Double.NaN, vector3D1.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Vector3D vector3D1 = line0.toSpace(vector1D0);
      assertEquals(Double.NaN, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      assertNotNull(subLine0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.pointAt((-315.35503652477));
      assertEquals(Double.NaN, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.intersection(line0);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.getOrigin();
      assertEquals(Double.NaN, vector3D1.getZ(), 0.01);
  }
}
