/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:30:58 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class PolyhedronsSet_ESTest_EvoSuite extends PolyhedronsSet_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(1.0E-10, 1940.0, 1.0E-10, 110.656997148419, 3.0, 3.4028234663852886E38);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(3.0, vector3D0, 3.0, vector3D0, 3.0, vector3D0, 1.0E-10, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-6.801927273298873), 1940.0, (-6.801927273298873), 110.656997148419, 3.0, 3.4028234663852886E38);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(false);
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.getPlus();
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree1);
      PolyhedronsSet polyhedronsSet2 = polyhedronsSet1.translate(vector3D0);
      assertFalse(polyhedronsSet2.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      BSPTree<Euclidean3D> bSPTree0 = polyhedronsSet0.getTree(true);
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.buildNew(bSPTree0);
      assertNotSame(polyhedronsSet0, polyhedronsSet1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-2459.953404), 0.0, 0.0, 2717.7687487899384, 0.0, 0.001);
      RotationOrder rotationOrder0 = RotationOrder.XYX;
      Vector3D vector3D0 = rotationOrder0.getA3();
      PolyhedronsSet polyhedronsSet1 = polyhedronsSet0.translate(vector3D0);
      assertFalse(polyhedronsSet1.equals((Object)polyhedronsSet0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(0.0, 1940.0, 0.0, 1940.0, 3.0, 3.4028234663852886E38);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(3.0, vector3D0, 3.0, vector3D0, 3.0, vector3D0, 0.0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet((-6.801927273298873), 1940.0, (-6.801927273298873), 110.656997148419, 3.0, 3.4028234663852886E38);
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D(3.0, vector3D0, 3.0, vector3D0, 3.0, vector3D0, (-6.801927273298873), vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D0, line0);
      assertFalse(subHyperplane0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Plane plane0 = new Plane(vector3D1, vector3D1);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add(0, (SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubHyperplane<Euclidean3D> subHyperplane0 = polyhedronsSet0.firstIntersection(vector3D1, line0);
      assertFalse(subHyperplane0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      linkedList0.add(0, (SubHyperplane<Euclidean3D>) subPlane0);
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean3D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean3D>>();
      PolyhedronsSet polyhedronsSet0 = new PolyhedronsSet(linkedList0);
      polyhedronsSet0.computeGeometricalProperties();
      assertFalse(polyhedronsSet0.isEmpty());
  }

}