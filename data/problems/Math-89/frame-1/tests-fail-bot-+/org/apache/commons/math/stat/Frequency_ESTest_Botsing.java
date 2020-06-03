/*

 * Tue Mar 03 11:42:16 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class Frequency_ESTest_Botsing extends Frequency_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      char char0 = 'h';
      frequency0.getCumPct('h');
      frequency0.clear();
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      char char0 = 'h';
      frequency0.getCumPct('h');
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.getCumPct('h');
      frequency0.clear();
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.clear();
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      String string0 = "";
      frequency0.getCount((Object) "");
      frequency0.getCount(0L);
      frequency0.toString();
      Frequency frequency1 = new Frequency();
      frequency1.getCount('8');
      frequency0.getCumFreq(9);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      char char0 = 'h';
      frequency0.getPct('h');
      frequency0.clear();
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.getCumFreq('W');
      frequency0.getCumFreq(0L);
      frequency0.getCumFreq((Object) "*6uj&TJh]tz#");
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Object object0 = new Object();
      Frequency frequency0 = new Frequency(comparator0);
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Long long0 = new Long('S');
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer((-1863));
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.clear();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }
}
