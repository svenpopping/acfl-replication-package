/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:40:19 UTC 2020
 */
package org.apache.commons.math.stat.clustering;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 
  @Before 
  public void initTestCase(){ 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.stat.clustering.Clusterable",
      "org.apache.commons.math.stat.clustering.Cluster",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer",
      "org.apache.commons.math.stat.clustering.EuclideanIntegerPoint"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Random", false, KMeansPlusPlusClusterer_ESTest_scaffolding_Botsing.class.getClassLoader()));
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
