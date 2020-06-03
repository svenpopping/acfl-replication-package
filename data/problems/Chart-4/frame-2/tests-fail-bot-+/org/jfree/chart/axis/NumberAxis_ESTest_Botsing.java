/*

 * Tue Mar 03 11:13:20 GMT+00:00 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValuesCollection;

public class NumberAxis_ESTest_Botsing extends NumberAxis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("r");
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      XYPlot xYPlot0 = new XYPlot(timePeriodValuesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
