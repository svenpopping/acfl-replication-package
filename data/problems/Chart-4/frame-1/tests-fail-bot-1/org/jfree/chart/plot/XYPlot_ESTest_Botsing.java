/*

 * Tue Mar 03 09:51:49 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;

public class XYPlot_ESTest_Botsing extends XYPlot_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("#2c{[bjdi@92<L", "").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      ValueAxis valueAxis1 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      xYPlot0.getDataRange(valueAxis1);
      int int0 = 4;
      int int1 = 60;
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      XYBarDataset xYBarDataset0 = new XYBarDataset(timePeriodValuesCollection0, 500);
      LogAxis logAxis0 = new LogAxis("java.awt.GradientPaint");
      XYPlot xYPlot1 = new XYPlot(xYBarDataset0, logAxis0, logAxis0, (XYItemRenderer) null);
  }
}
