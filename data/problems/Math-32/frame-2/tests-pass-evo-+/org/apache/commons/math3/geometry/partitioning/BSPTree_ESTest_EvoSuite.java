/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:37:24 GMT 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class BSPTree_ESTest_EvoSuite extends BSPTree_ESTest_scaffolding_EvoSuite {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>("ZC6");
      BSPTree<Euclidean3D> bSPTree1 = bSPTree0.getPlus();
      assertNull(bSPTree1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, euclidean1D0);
      BSPTree<Euclidean3D> bSPTree2 = bSPTree0.getParent();
      assertNotSame(bSPTree0, bSPTree2);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.getMinus();
      assertNull(bSPTree1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-1061.20271915));
      bSPTree0.insertCut(line0);
      SubHyperplane<Euclidean2D> subHyperplane0 = bSPTree0.getCut();
      assertFalse(subHyperplane0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>((SubHyperplane<Euclidean3D>) null, bSPTree0, bSPTree0, bSPTree0);
      Object object0 = bSPTree1.getAttribute();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      bSPTree0.split(subLine0);
      assertFalse(subLine0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree0, bSPTree1).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree<Euclidean2D> bSPTree2 = bSPTree0.merge(bSPTree1, bSPTree_LeafMerger0);
      assertNotSame(bSPTree2, bSPTree1);
      assertNotSame(bSPTree2, bSPTree0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>("org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor");
      Vector1D vector1D0 = Vector1D.ZERO;
      BSPTree<Euclidean1D> bSPTree1 = bSPTree0.getCell(vector1D0);
      assertSame(bSPTree0, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      BoundarySizeVisitor<Euclidean3D> boundarySizeVisitor0 = new BoundarySizeVisitor<Euclidean3D>();
      bSPTree0.visit(boundarySizeVisitor0);
      assertEquals(0.0, boundarySizeVisitor0.getSize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
      assertNotSame(bSPTree0, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      Object object0 = bSPTree0.getAttribute();
      BSPTree<Euclidean1D> bSPTree1 = new BSPTree<Euclidean1D>(object0);
      SubHyperplane<Euclidean1D> subHyperplane0 = bSPTree1.getCut();
      assertNull(subHyperplane0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      BSPTree<Euclidean1D> bSPTree0 = intervalsSet0.getTree(false);
      bSPTree0.getPlus();
      assertFalse(intervalsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.split(subLine0);
      bSPTree2.insertInTree(bSPTree1, false);
      assertFalse(subLine0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.copySelf();
      bSPTree2.insertInTree(bSPTree1, true);
      assertFalse(subLine0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      bSPTree0.insertInTree(bSPTree1, true);
      assertFalse(subLine0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(vector2D0);
      bSPTree0.insertInTree((BSPTree<Euclidean1D>) null, true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      BSPTree<Euclidean1D> bSPTree0 = intervalsSet0.getTree(false);
      BSPTree<Euclidean1D> bSPTree1 = bSPTree0.getMinus();
      BSPTree.LeafMerger<Euclidean1D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean1D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree1, bSPTree1).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree<Euclidean1D> bSPTree2 = bSPTree1.merge(bSPTree0, bSPTree_LeafMerger0);
      assertNotSame(bSPTree2, bSPTree0);
      assertNotSame(bSPTree2, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.split(subLine0);
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn(bSPTree2, bSPTree1).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      Line line0 = new Line(vector2D0, (-1061.20271915));
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      BSPTree<Euclidean2D> bSPTree3 = bSPTree0.merge(bSPTree2, bSPTree_LeafMerger0);
      assertNotSame(bSPTree3, bSPTree0);
      assertNotSame(bSPTree3, bSPTree2);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      BSPTree<Euclidean3D> bSPTree1 = new BSPTree<Euclidean3D>(subPlane0, bSPTree0, bSPTree0, euclidean1D0);
      BSPTree<Euclidean3D> bSPTree2 = bSPTree1.split(subPlane0);
      assertFalse(bSPTree2.equals((Object)bSPTree0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, object0);
      Line line0 = new Line(vector2D0, 0.9999999999);
      boolean boolean0 = bSPTree0.insertCut(line0);
      assertTrue(boolean0);
      
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn((BSPTree) null, (BSPTree) null, (BSPTree) null).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.merge(bSPTree1, bSPTree_LeafMerger0);
      assertNotSame(bSPTree2, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(2480.354, 1596.578663375, 2480.354, 218.062);
      assertFalse(polygonsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      boolean boolean0 = intervalsSet0.contains(intervalsSet0);
      assertTrue(boolean0);
      assertFalse(intervalsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 1.0);
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      BSPTree<Euclidean2D> bSPTree2 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree1, line0);
      bSPTree1.insertInTree(bSPTree2, false);
      assertFalse(subLine0.isEmpty());
      assertFalse(intervalsSet0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      BSPTree<Euclidean1D> bSPTree0 = intervalsSet0.getTree(false);
      BSPTree<Euclidean1D> bSPTree1 = bSPTree0.getMinus();
      Vector1D vector1D0 = new Vector1D(1.0E-10);
      BSPTree<Euclidean1D> bSPTree2 = bSPTree1.getCell(vector1D0);
      assertNotSame(bSPTree1, bSPTree0);
      assertNotSame(bSPTree2, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, 1.0);
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.getCell(vector2D0);
      assertFalse(subLine0.isEmpty());
      assertSame(bSPTree2, bSPTree1);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, 1.0);
      IntervalsSet intervalsSet0 = new IntervalsSet(1.0, 1.0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.split(subLine0);
      BSPTree<Euclidean2D> bSPTree2 = bSPTree1.getCell(vector2D0);
      assertNotSame(bSPTree2, bSPTree1);
      assertFalse(subLine0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
      BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
      doReturn((BSPTree) null).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class) , anyBoolean() , anyBoolean());
      BSPTree<Euclidean2D> bSPTree1 = bSPTree0.merge(bSPTree0, bSPTree_LeafMerger0);
      assertNull(bSPTree1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean3D> bSPTree0 = new BSPTree<Euclidean3D>(object0);
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      bSPTree0.setAttribute(euclidean2D0);
      assertEquals(2, euclidean2D0.getDimension());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>((Object) null);
      BSPTree<Euclidean1D> bSPTree1 = bSPTree0.getParent();
      assertNull(bSPTree1);
  }
}
