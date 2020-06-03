/*

 * Tue Mar 03 10:02:27 UTC 2020
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
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
      Vector3D vector3D1 = new Vector3D(1457.8469647, vector3D0, 1457.8469647, vector3D0, 1457.8469647, vector3D0);
      Vector3D vector3D2 = mock(Vector3D.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(vector3D2).dotProduct(nullable(org.apache.commons.math3.geometry.Vector.class));
      doReturn(vector3D1).when(vector3D2).subtract(nullable(org.apache.commons.math3.geometry.Vector.class));
      Line line0 = new Line(vector3D2, vector3D2);
      line0.intersection(line0);
      Vector3D vector3D3 = line0.closestPoint(line0);
      line0.contains(vector3D3);
      line0.contains(vector3D3);
      // Undeclared exception!
      line0.toSubSpace((Vector<Euclidean3D>) null);
  }
}
