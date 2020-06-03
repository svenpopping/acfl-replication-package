/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 16:26:49 GMT 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
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
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D3 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D2, vector3D3);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(3279.8965240297366, 3279.8965240297366, 3279.8965240297366);
      Vector3D vector3D1 = new Vector3D(3279.8965240297366, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      SubLine subLine0 = line0.wholeLine();
      Vector3D vector3D2 = subLine0.intersection(subLine0, false);
      assertFalse(vector3D2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Vector3D vector3D2 = Vector3D.PLUS_K;
      Line line0 = new Line(vector3D1, vector3D2);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D3 = subLine0.intersection(subLine0, false);
      assertEquals(0.0, vector3D3.getNormSq(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = new Segment(vector3D0, vector3D0, line0);
      SubLine subLine0 = new SubLine(segment0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector3D1, vector3D0);
      Vector3D vector3D3 = subLine0.intersection(subLine1, false);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector3D1, vector3D0);
      Vector3D vector3D3 = subLine1.intersection(subLine0, false);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Vector3D vector3D2 = Vector3D.crossProduct(vector3D0, vector3D1);
      Line line0 = new Line(vector3D2, vector3D1);
      IntervalsSet intervalsSet0 = new IntervalsSet((-5496.27747292438), (-5496.27747292438));
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      SubLine subLine1 = new SubLine(vector3D1, vector3D0);
      Vector3D vector3D3 = subLine1.intersection(subLine0, true);
      assertNull(vector3D3);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Line line0 = new Line(vector3D0, vector3D1);
      IntervalsSet intervalsSet0 = new IntervalsSet((-5496.27747292438), (-5496.27747292438));
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNull(vector3D2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Line line0 = new Line(vector3D0, vector3D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      Vector3D vector3D2 = subLine0.intersection(subLine0, true);
      assertNotSame(vector3D1, vector3D2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = new Vector3D((-5496.27747292438), (-3.4028234663852886E38));
      Line line0 = new Line(vector3D0, vector3D1);
      LinkedList<SubHyperplane<Euclidean1D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean1D>>();
      IntervalsSet intervalsSet0 = new IntervalsSet(linkedList0);
      SubLine subLine0 = new SubLine(line0, intervalsSet0);
      List<Segment> list0 = subLine0.getSegments();
      assertFalse(list0.isEmpty());
  }

}
