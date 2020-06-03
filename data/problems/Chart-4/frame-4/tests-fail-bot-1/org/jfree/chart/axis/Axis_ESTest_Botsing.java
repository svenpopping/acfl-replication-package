/*

 * Tue Mar 03 10:02:43 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics2D;
import java.time.Instant;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.xy.CategoryTableXYDataset;

public class Axis_ESTest_Botsing extends Axis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      Graphics2D graphics2D0 = null;
      String string0 = "U&!/\\61M-<=&RpO";
      DateAxis dateAxis0 = new DateAxis();
      dateAxis0.getMaximumDate();
      Instant instant0 = Instant.MIN;
      RectangleEdge rectangleEdge0 = RectangleEdge.TOP;
      PeriodAxis periodAxis0 = new PeriodAxis("U&!/1M-<=&RpO");
      periodAxis0.getMinorTickMarkPaint();
      BarRenderer3D barRenderer3D0 = new BarRenderer3D();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot();
      ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
      chartRenderingInfo0.getPlotInfo();
      int int0 = (-1);
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      NumberAxis3D numberAxis3D1 = new NumberAxis3D("U&!/1M-<=&RpO");
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis3D1, numberAxis3D0, (XYItemRenderer) null);
  }
}
