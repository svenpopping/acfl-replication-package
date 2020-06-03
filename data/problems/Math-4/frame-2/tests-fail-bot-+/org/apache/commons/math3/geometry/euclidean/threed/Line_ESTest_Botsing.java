/*

 * Tue Mar 03 11:20:09 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class Line_ESTest_Botsing extends Line_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.intersection(line0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.5463024377822876).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      Line line0 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = Vector3D.POSITIVE_INFINITY;
      Line line1 = new Line(vector3D2, vector3D1);
      line1.intersection(line0);
      // Undeclared exception!
      line1.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.intersection(line0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = new Vector3D(3157.2793302, vector3D0, 3157.2793302, vector3D0, 3157.2793302, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.intersection(line0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_K;
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.wholeLine();
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(1.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
