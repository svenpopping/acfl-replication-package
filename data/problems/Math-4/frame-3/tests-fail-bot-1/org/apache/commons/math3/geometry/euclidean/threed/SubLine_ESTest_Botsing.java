/*

 * Tue Mar 03 10:02:26 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class SubLine_ESTest_Botsing extends SubLine_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      Segment segment0 = mock(Segment.class, new ViolatedAssumptionAnswer());
      doReturn(vector3D0).when(segment0).getEnd();
      doReturn(line0).when(segment0).getLine();
      doReturn(vector3D0).when(segment0).getStart();
      SubLine subLine0 = new SubLine(segment0);
      // Undeclared exception!
      subLine0.intersection(subLine0, true);
  }
}
