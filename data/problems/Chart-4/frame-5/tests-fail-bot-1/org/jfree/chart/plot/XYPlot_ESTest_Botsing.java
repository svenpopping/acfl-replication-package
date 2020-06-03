/*

 * Tue Mar 03 09:51:58 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.text.TextBox;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class XYPlot_ESTest_Botsing extends XYPlot_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("RV$sS)mnN68i!I|D`C1", "").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      TextBox textBox0 = new TextBox("fye,3Z4[ZA?r.M6j");
      RectangleInsets rectangleInsets0 = textBox0.getInteriorGap();
      xYPlot0.setInsets(rectangleInsets0);
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(607.02947192475);
      XYPlot xYPlot1 = new XYPlot(vectorSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }
}
