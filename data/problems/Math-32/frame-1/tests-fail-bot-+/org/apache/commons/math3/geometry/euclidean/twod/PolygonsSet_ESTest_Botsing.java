/*

 * Tue Mar 03 11:24:48 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class PolygonsSet_ESTest_Botsing extends PolygonsSet_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1948.577267039959);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(0.0, (-861.56), 3.4028234663852886E38, 0.0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-972.683));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0, segment0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(false);
      bSPTree0.setAttribute(subLine0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.7853981633974483, 0.7853981633974483);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0, euclidean2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(polygonsSet0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(segment0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(4321.37673127329, 3.4028234663852886E38, (-948.391038), 4321.37673127329);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(polygonsSet0, polygonsSet0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0, segment0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1948.577267039959);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      SubOrientedPoint subOrientedPoint0 = orientedPoint0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subOrientedPoint0).when(bSPTree0).getAttribute();
      doReturn((SubHyperplane<Euclidean2D>) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0, line0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getBarycenter();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      PolygonsSet polygonsSet0 = new PolygonsSet((-1809.025092398572), (-814.09), (-1809.025092398572), (-814.09));
      BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, (-1809.025092398572));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree1 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subPlane0, bSPTree0).when(bSPTree1).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree1).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree1);
      // Undeclared exception!
      polygonsSet1.getBarycenter();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet((-861.56), (-1854.6225), 3.4028234663852886E38, (-861.56));
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2.0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, segment0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, 0.036);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.036, 0.036);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, line0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Euclidean1D euclidean1D0 = Euclidean1D.getInstance();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("", euclidean1D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2.0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subLine0, vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1948.0225144173985);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(2.0, 2.0);
      Plane plane0 = new Plane(vector3D0);
      Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("").when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1979791.6761723105);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1948.577267039959);
      SubLine subLine0 = line0.wholeHyperplane();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(4321.37673127329, 3.4028234663852886E38, 4321.37673127329, 3.4028234663852886E38);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(vector2D0, object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2.0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subLine0, intervalsSet0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("").when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.7853981633974483, 0.7853981633974483);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0, segment0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector1D vector1D0 = Vector1D.ZERO;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      SubOrientedPoint subOrientedPoint0 = orientedPoint0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subOrientedPoint0).when(bSPTree0).getAttribute();
      doReturn((SubHyperplane<Euclidean2D>) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      PolygonsSet polygonsSet0 = new PolygonsSet((-1809.025092398572), (-814.09), (-1809.025092398572), (-814.09));
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, (-1809.025092398572));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subPlane0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getBarycenter();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 0.19999954120254515);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, 694.86, 3.4028234663852886E38, 694.86);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector1D vector1D0 = Vector1D.NaN;
      OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, false);
      SubOrientedPoint subOrientedPoint0 = orientedPoint0.wholeHyperplane();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subOrientedPoint0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      SubLine subLine0 = line0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("", subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getBarycenter();
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      PolygonsSet polygonsSet0 = new PolygonsSet((-1809.025092398572), (-814.09), (-1809.025092398572), 0.0);
      SubPlane subPlane0 = new SubPlane(plane0, polygonsSet0);
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, (-1809.025092398572));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subPlane0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getBarycenter();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      SubPlane subPlane0 = plane0.wholeHyperplane();
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0, subPlane0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.NaN;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 2.0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(subLine0, line0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(line0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(4321.37673127329, 3.4028234663852886E38, (-948.391038), 3.4028234663852886E38);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, 1948.577267039959);
      SubLine subLine0 = line0.wholeHyperplane();
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean2D0, segment0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.7853981633974483, 0.7853981633974483);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0, "").when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(line0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D vector2D0 = Vector2D.ZERO;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(polygonsSet0, vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
      PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector2D0, vector2D0);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(subLine0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(3.4028234663852886E38, (-1460.412659288), 3.4028234663852886E38, (-1460.412659288));
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Line line0 = new Line(vector2D0, (-972.683));
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.7853981633974483, 0.7853981633974483);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
      Euclidean1D euclidean1D0 = euclidean2D0.getSubSpace();
      Vector2D vector2D0 = Vector2D.NaN;
      Line line0 = new Line(vector2D0, vector2D0);
      IntervalsSet intervalsSet0 = new IntervalsSet(0.7853981633974483, 0.7853981633974483);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(euclidean1D0, subLine0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet(4321.37673127329, 3.4028234663852886E38, (-948.391038), 3.0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.ZERO;
      Line line0 = new Line(vector2D0, vector2D0);
      Segment segment0 = new Segment(vector2D0, vector2D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn("", vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, subLine0).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.computeGeometricalProperties();
  }
}
