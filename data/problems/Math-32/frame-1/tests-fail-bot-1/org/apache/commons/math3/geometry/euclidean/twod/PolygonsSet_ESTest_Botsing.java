/*

 * Tue Mar 03 10:04:29 UTC 2020
 */

package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
  public void test0()  throws Throwable  {
      Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
      Segment segment0 = new Segment(vector2D0, vector2D0, (Line) null);
      SubLine subLine0 = new SubLine(segment0);
      BSPTree<Euclidean2D> bSPTree0 = (BSPTree<Euclidean2D>) mock(BSPTree.class, new ViolatedAssumptionAnswer());
      doReturn(vector2D0).when(bSPTree0).getAttribute();
      doReturn(subLine0, (SubHyperplane) null).when(bSPTree0).getCut();
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getBarycenter();
  }
}
