/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:26:39 GMT 2020
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
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      Vector3D vector3D2 = line0.intersection(line1);
      assertEquals(0.5, vector3D2.getY(), 0.01);
      assertNotNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      double double0 = line0.distance(line1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.2275790871536473E7, 1.2275790871536473E7);
      Vector3D vector3D1 = new Vector3D(1.2275790871536473E7, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      Vector1D vector1D1 = line0.toSubSpace(vector3D2);
      assertEquals((-0.7853981633974483), vector3D2.getAlpha(), 0.01);
      assertTrue(vector1D1.equals((Object)vector1D0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D0);
      assertEquals((-0.7071067811865475), vector1D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-223.10874), (-1914.1113255963), 0.0);
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D0);
      Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
      Vector3D vector3D3 = line0.toSpace(vector1D0);
      assertEquals(Double.NEGATIVE_INFINITY, vector3D3.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-1.0), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = line0.toSubSpace(vector3D0);
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals(1.0, vector1D0.getX(), 0.01);
      assertFalse(vector3D2.equals((Object)vector3D1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line0.toSubSpace(vector3D1);
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals(0.7071067811865475, vector1D0.getX(), 0.01);
      assertEquals((-0.9999999999999999), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, (-1.0), vector3D0);
      Vector3D vector3D2 = vector3D1.orthogonal();
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = line0.toSubSpace(vector3D2);
      line0.toSpace(vector1D0);
      assertEquals(0.0, vector1D0.getNormSq(), 0.01);
      assertEquals(0.0, vector1D0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1209.033333269412), 0.4794255495071411);
      Vector3D vector3D1 = new Vector3D((-1209.033333269412), vector3D0, (-2574.3), vector3D0, 0.4794255495071411, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector1D vector1D0 = Vector1D.ZERO;
      Vector3D vector3D2 = line0.toSpace(vector1D0);
      assertEquals(1.7077714554754978E-13, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.pointAt(503.8);
      assertEquals(Double.NaN, vector3D1.getNorm1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.pointAt(1.0E-10);
      assertEquals(0.49999999992928934, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.pointAt(0.0);
      assertEquals(0.0, vector3D2.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-114.4871714), 2080.99190507, (-2100.89238044));
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D0);
      Vector3D vector3D3 = line0.pointAt((-114.4871714));
      assertEquals(2094.87940894492, vector3D3.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 3744.7366994, vector3D0, 0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.intersection(line0);
      assertEquals(3.8162532878790296E-13, vector3D2.getNorm1(), 0.01);
      assertNotNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(0.7853981633974483, vector3D2.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(0.5, vector3D2.getNormInf(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = new Vector3D((-915.609428214948), vector3D0, (-2104.0532905), vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.getOrigin();
      assertEquals(1.5041611326000388E-17, vector3D2.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.getOrigin();
      assertEquals(0.5, vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-354.53434508), (-354.53434508));
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getOrigin();
      assertEquals(Double.NaN, vector3D2.getDelta(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1209.033333269412), 0.4794255495071411);
      Vector3D vector3D1 = new Vector3D((-1209.033333269412), vector3D0, (-2574.3), vector3D0, 0.4794255495071411, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getOrigin();
      assertEquals(1.7077714554754978E-13, vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 3744.7366994, vector3D0, 0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals((-1.0), vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D((-3864.82819796), vector3D0, (-3864.82819796), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals(1.0, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.getDirection();
      assertEquals((-0.7071067811865475), vector3D2.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.getAbscissa(vector3D1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.getAbscissa(vector3D1);
      assertEquals(0.7071067811865475, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.getAbscissa(vector3D0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      double double0 = line0.distance(vector3D0);
      assertEquals(1.2537167179050217E-16, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-114.4871714), 2080.99190507, (-2100.89238044));
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D0);
      Line line1 = new Line(line0);
      line0.reset(vector3D2, vector3D1);
      double double0 = line0.distance(line1);
      assertEquals(2.6985170537470653E-15, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.closestPoint(line0);
      assertNotSame(vector3D0, vector3D1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.PLUS_J;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.closestPoint(line0);
      assertEquals(0.5, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-223.10874), (-1914.1113255963), 0.0);
      Vector3D vector3D1 = Vector3D.PLUS_I;
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D0);
      Vector3D vector3D3 = line0.closestPoint(line0);
      assertEquals(963.5131826074877, vector3D3.getZ(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.closestPoint(line0);
      assertEquals(0.0, vector3D2.getNorm1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.closestPoint(line0);
      assertEquals(0.5, vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.MINUS_J;
      Vector3D vector3D2 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D1);
      line0.reset(vector3D2, vector3D0);
      boolean boolean0 = line0.contains(vector3D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      boolean boolean0 = line0.contains(vector3D1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.pointAt(1.8696552813195186);
      assertEquals((-0.8220459279022737), vector3D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      double double0 = line0.distance(vector3D1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = line0.intersection(line0);
      assertNotNull(vector3D2);
      assertEquals(0.0, vector3D2.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.intersection(line0);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      line1.reset(vector3D1, vector3D0);
      boolean boolean0 = line1.isSimilarTo(line0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.getDirection();
      assertFalse(vector3D1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = line0.wholeLine();
      assertNotNull(subLine0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector1D vector1D0 = line0.toSubSpace(vector3D0);
      Vector3D vector3D1 = line0.toSpace(vector1D0);
      assertTrue(vector3D1.equals((Object)vector3D0));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.getOrigin();
      assertEquals(Double.NaN, vector3D1.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = line0.revert();
      assertNotSame(line1, line0);
  }
}