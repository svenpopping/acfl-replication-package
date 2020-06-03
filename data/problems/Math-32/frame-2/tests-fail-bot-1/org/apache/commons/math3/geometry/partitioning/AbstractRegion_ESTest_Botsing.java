/*

 * Tue Mar 03 10:04:35 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractRegion_ESTest_Botsing extends AbstractRegion_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IntervalsSet intervalsSet0 = new IntervalsSet();
      AbstractRegion<Euclidean1D, Euclidean1D> abstractRegion0 = intervalsSet0.copySelf();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(abstractRegion0);
      PolygonsSet polygonsSet0 = new PolygonsSet();
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
