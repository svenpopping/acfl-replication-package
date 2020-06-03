/*

 * Tue Mar 03 11:06:58 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.MatrixSeriesCollection;

public class XYPlot_ESTest_Botsing extends XYPlot_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      TimeSeries timeSeries0 = new TimeSeries(500);
      TimeZone timeZone0 = TimeZone.getTimeZone("NF-B|%24$ains5");
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0, timeZone0);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
      // Undeclared exception!
      xYPlot0.getDataRange((ValueAxis) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F, 1.0F, "");
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F, 0.0F, "");
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, (ValueAxis) null, logAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, (ValueAxis) null, (ValueAxis) null, (XYItemRenderer) null);
      // Undeclared exception!
      xYPlot0.getDataRange((ValueAxis) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LogAxis logAxis0 = new LogAxis();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, periodAxis0, logAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      LogAxis logAxis0 = new LogAxis();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, logAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      PeriodAxis periodAxis0 = new PeriodAxis("y5");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, periodAxis0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HistogramDataset histogramDataset0 = new HistogramDataset();
      LogAxis logAxis0 = new LogAxis();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, logAxis0, logAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis("");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, periodAxis0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      HistogramDataset histogramDataset0 = new HistogramDataset();
      LogAxis logAxis0 = new LogAxis();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D0, logAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      PeriodAxis periodAxis0 = new PeriodAxis((String) null);
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, numberAxis3D0, periodAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PeriodAxis periodAxis0 = new PeriodAxis(",jNQ;_]!`");
      HistogramDataset histogramDataset0 = new HistogramDataset();
      XYPlot xYPlot0 = new XYPlot(histogramDataset0, periodAxis0, periodAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
