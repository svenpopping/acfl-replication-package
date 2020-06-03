/**
 * Scaffolding file used to store all the setups needed to run 
 * Fri Mar 20 16:44:33 UTC 2020
 */
package org.apache.commons.math.stat.clustering;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing {
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.stat.clustering.Clusterable",
      "org.apache.commons.math.stat.clustering.Cluster",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer",
      "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint",
      "org.apache.commons.math.stat.clustering.Cluster",
      "org.apache.commons.math.util.MathUtils"
    );
  }
}
