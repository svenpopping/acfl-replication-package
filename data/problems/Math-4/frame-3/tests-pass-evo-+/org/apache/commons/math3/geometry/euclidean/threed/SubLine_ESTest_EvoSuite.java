/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:27:54 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class SubLine_ESTest_EvoSuite extends SubLine_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = Vector3D.MINUS_J;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertFalse(vector3D2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      IntervalsSet intervalsSet0 = new IntervalsSet();
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = new Vector3D(1389.742269, 0.0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertEquals(0.2004413775346036, vector3D2.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      RotationOrder rotationOrder0 = RotationOrder.YZY;
      Vector3D vector3D1 = rotationOrder0.getA2();
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Line line0 = new Line(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      Segment segment0 = new Segment(vector3D0, vector3D2, line0);
      SubLine subLine1 = new SubLine(segment0);
      Vector3D vector3D3 = subLine0.intersection(subLine1, false);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RotationOrder rotationOrder0 = RotationOrder.XZY;
      Vector3D vector3D0 = rotationOrder0.getA2();
      Vector3D vector3D1 = Vector3D.ZERO;
      SubLine subLine0 = new SubLine(vector3D0, vector3D1);
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(2756.6648552325, vector3D0, 2756.6648552325, vector3D0, 2756.6648552325, vector3D0);
      SubLine subLine0 = new SubLine(vector3D1, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      SubLine subLine1 = line0.wholeLine();
      Vector3D vector3D2 = subLine1.intersection(subLine0, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = new Vector3D(2756.6648552325, vector3D0, 2756.6648552325, vector3D0, 2756.6648552325, vector3D0);
      SubLine subLine0 = new SubLine(vector3D1, vector3D0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Segment segment0 = new Segment(vector3D0, vector3D1, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D2, vector3D1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D0, vector3D1);
      Segment segment0 = new Segment(vector3D0, vector3D1, line0);
      SubLine subLine0 = new SubLine(segment0);
      List<Segment> list0 = subLine0.getSegments();
      assertEquals(1, list0.size());
  }

}
