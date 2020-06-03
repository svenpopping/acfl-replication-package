/*

 * Tue Mar 03 11:25:12 UTC 2020
 */

package org.apache.commons.math3.geometry.partitioning;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class AbstractRegion_ESTest_Botsing extends AbstractRegion_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      polygonsSet0.getVertices();
      polygonsSet0.getTree(false);
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>("Cardan angles singularity");
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
      // Undeclared exception!
      polygonsSet0.getSize();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Vector2D vector2D0 = Vector2D.NaN;
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(vector2D0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PolygonsSet polygonsSet0 = new PolygonsSet();
      Object object0 = new Object();
      BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(object0);
      PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree0);
      // Undeclared exception!
      polygonsSet1.getSize();
  }
}
