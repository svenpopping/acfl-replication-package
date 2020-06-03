/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:05:20 UTC 2020
 */
package org.apache.commons.lang3;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class StringUtils_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(StringUtils_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "org.apache.commons.io.IOCase",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.CharUtils",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.filefilter.CanWriteFileFilter"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(StringUtils_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.StringUtils",
      "org.apache.commons.lang3.SystemUtils",
      "org.apache.commons.lang3.ClassUtils",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.CharUtils"
    );
  }
}
