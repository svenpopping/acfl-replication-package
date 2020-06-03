/*

 * Tue Mar 03 10:17:13 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class Frequency_ESTest_Botsing extends Frequency_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(comparator0).compare(anyLong() , anyLong());
      Frequency frequency0 = new Frequency(comparator0);
      frequency0.getCumFreq((-382L));
      Frequency frequency1 = new Frequency();
      frequency1.getCumPct(')');
      Integer integer0 = new Integer(0);
      frequency1.addValue(integer0);
      Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency2 = new Frequency(comparator1);
      frequency0.addValue((long) 0);
      // Undeclared exception!
      frequency1.addValue((Object) frequency2);
  }
}
