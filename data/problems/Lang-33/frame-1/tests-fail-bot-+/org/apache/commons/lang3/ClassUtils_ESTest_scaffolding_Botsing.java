/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 11:15:24 UTC 2020
 */
package org.apache.commons.lang3;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class ClassUtils_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ClassUtils_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ClassUtils_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.builder.ToStringStyle$DefaultToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$NoFieldNameToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle$SimpleToStringStyle",
      "org.apache.commons.lang3.builder.ToStringStyle",
      "org.apache.commons.lang3.StringUtils"
    );
  }
}
