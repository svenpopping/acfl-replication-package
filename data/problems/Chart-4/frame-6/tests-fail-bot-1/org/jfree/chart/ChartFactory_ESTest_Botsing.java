/*

 * Tue Mar 03 09:51:43 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.DefaultIntervalXYDataset;

public class ChartFactory_ESTest_Botsing extends ChartFactory_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(" )", "7'Uk$jFr", "7'Uk$jFr", defaultIntervalXYDataset0, plotOrientation0, true, true, false);
  }
}
