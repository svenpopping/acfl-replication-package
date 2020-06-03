/*

 * Tue Mar 03 10:40:19 UTC 2020
 */

package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class KMeansPlusPlusClusterer_ESTest_Botsing extends KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random random0 = mock(Random.class, new ViolatedAssumptionAnswer());
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      Random random1 = new Random();
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer1 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      int[] intArray0 = new int[3];
      intArray0[0] = (-2664);
      intArray0[1] = Integer.MAX_VALUE;
      intArray0[2] = Integer.MAX_VALUE;
      EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
      Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
      List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
      cluster0.addPoint(euclideanIntegerPoint0);
      KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer2 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(random1);
      kMeansPlusPlusClusterer2.cluster(list0, (-345), 0);
      cluster0.addPoint(euclideanIntegerPoint0);
      cluster0.addPoint(euclideanIntegerPoint0);
      // Undeclared exception!
      kMeansPlusPlusClusterer2.cluster(list0, (-302), 1);
  }
}
