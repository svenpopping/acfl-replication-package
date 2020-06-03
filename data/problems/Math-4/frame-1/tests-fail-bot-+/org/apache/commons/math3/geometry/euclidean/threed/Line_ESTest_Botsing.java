/*

 * Tue Mar 03 11:20:17 UTC 2020
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
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(3.141592653489793).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-0.4544343373546299), (-0.4544343373546299), (-0.4544343373546299));
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.1102230246251565E-16, 1.1102230246251565E-16);
      Vector3D vector3D1 = Vector3D.POSITIVE_INFINITY;
      Vector3D vector3D2 = new Vector3D(1.1102230246251565E-16, vector3D0, 1.1102230246251565E-16, vector3D1, 1.1102230246251565E-16, vector3D0);
      Line line0 = new Line(vector3D2, vector3D2);
      Vector3D vector3D3 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D3).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D3);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.getAbscissa(vector3D0);
      double double0 = 4647446.0;
      line0.distance(vector3D0);
      Line line1 = new Line(vector3D0, vector3D0);
      Line line2 = new Line(line1);
      line0.intersection(line2);
      line1.wholeLine();
      // Undeclared exception!
      line2.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2.3864205019479124E-14).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-743.72), (-743.72));
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.intersection(line0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      vector3D0.getSpace();
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D0, vector3D1);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(1.5931143546229284E-35).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2.2250738585072014E-308).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((-2382.9541)).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D((-1404.477613331), (-1404.477613331));
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2.2250738585072014E-308).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(2659971.4708615337).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0E-10, 1.0E-10, 1.0E-10);
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Euclidean3D.getInstance();
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = Vector3D.PLUS_K;
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(3.141592653489793).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D0, vector3D1);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(9299333.777046898).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = null;
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_K;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.intersection(line0);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_I;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D0).when(vector3D1).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D1);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn((Vector3D) null).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      // Undeclared exception!
      line0.getAbscissa(vector3D2);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.MINUS_J;
      Vector3D vector3D1 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(3.141592653489793).when(vector3D1).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D1, vector3D0);
      // Undeclared exception!
      line0.getAbscissa((Vector3D) null);
  }
}
