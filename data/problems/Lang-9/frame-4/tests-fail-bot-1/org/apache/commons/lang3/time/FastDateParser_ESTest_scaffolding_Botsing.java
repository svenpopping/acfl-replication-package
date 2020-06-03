/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:00:32 UTC 2020
 */
package org.apache.commons.lang3.time;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class FastDateParser_ESTest_scaffolding_Botsing {
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastDateParser_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.lang3.time.FastDateParser$5",
      "org.apache.commons.lang3.time.FastDateParser$4",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.commons.lang3.time.FastDateParser$3",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "org.apache.commons.io.IOCase",
      "org.apache.commons.lang3.time.FastDateParser$2",
      "org.apache.commons.lang3.time.FastDateParser$1",
      "org.apache.commons.lang3.time.FastDateParser$NumberStrategy",
      "org.apache.commons.lang3.time.DateParser",
      "org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy",
      "org.apache.commons.lang3.time.FastDateParser$KeyValue",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.apache.commons.lang3.time.FastDateParser$Strategy",
      "org.apache.commons.lang3.time.FastDateParser$TextStrategy",
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
      "org.apache.commons.lang3.time.FastDateParser",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.filefilter.CanWriteFileFilter"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastDateParser_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.lang3.time.FastDateParser"
    );
  }
}
