/*

 * Tue Mar 03 11:21:01 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class SubLine_ESTest_Botsing extends SubLine_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      SubLine subLine1 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      line0.isSimilarTo(line0);
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-3385.0), (-3385.0)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine1, false);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Plane plane0 = new Plane(vector3D0);
      Vector3D vector3D1 = Vector3D.NEGATIVE_INFINITY;
      Plane plane1 = new Plane(vector3D1, vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane1);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D1).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      boolean boolean0 = false;
      // Undeclared exception!
      subLine1.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine1 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      SubLine subLine1 = new SubLine(vector3D0, vector3D1);
      // Undeclared exception!
      subLine1.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      Vector3D.distance(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      IntervalsSet intervalsSet0 = new IntervalsSet((-3385.0), (-3385.0));
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      vector3D1.getDelta();
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine1.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine1, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-3385.0), (-3385.0)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      line0.isSimilarTo(line0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, (Vector3D) null).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0);
      Vector3D vector3D2 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D2, vector3D1);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D1).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      IntervalsSet intervalsSet0 = new IntervalsSet();
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-3385.0), (-3385.0)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      SubLine subLine1 = new SubLine(vector3D0, vector3D0);
      SubLine subLine2 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine2, true);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-3385.0), (-3385.0)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane1);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      SubLine subLine1 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      SubLine subLine0 = new SubLine(vector3D0, vector3D0);
      Vector3D.distance(vector3D0, vector3D0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D0);
      Plane plane1 = new Plane(vector3D0, vector3D0, vector3D0);
      Line line0 = plane0.intersection(plane1);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, false);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.ZERO;
      Vector3D vector3D1 = Vector3D.NEGATIVE_INFINITY;
      Plane plane0 = new Plane(vector3D1);
      Line line0 = plane0.intersection(plane0);
      Segment segment0 = new Segment(vector3D1, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-3385.0)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Plane plane0 = new Plane(vector3D0, vector3D0);
      Plane plane1 = new Plane(plane0);
      Line line0 = plane1.intersection(plane0);
      Line line1 = new Line(line0);
      Segment segment0 = new Segment(vector3D1, vector3D1, line0);
      vector3D0.getNormInf();
      SubLine subLine0 = new SubLine(segment0);
      subLine0.getSegments();
      Vector3D vector3D2 = new Vector3D((-3385.0), vector3D0, (-3385.0), vector3D0, (-2437.69414663733), vector3D0);
      vector3D2.getNorm();
      vector3D2.distanceInf((Vector<Euclidean3D>) vector3D0);
      Plane plane2 = new Plane(vector3D2, vector3D2);
      SubLine subLine1 = line1.wholeLine();
      // Undeclared exception!
      subLine0.intersection(subLine1, true);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(589.0583838122674, 589.0583838122674).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0, vector3D0, vector3D0, vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D1, vector3D1);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D1 = new Vector3D(0.0, 0.0, (-1.0));
      Vector3D vector3D2 = new Vector3D(0.0, vector3D0, 753.0, vector3D0, 0.0, vector3D1, 1.0, vector3D1);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D3).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D2, (Vector3D) null).when(vector3D3).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      SubLine subLine0 = new SubLine(vector3D3, vector3D3);
  }
}
