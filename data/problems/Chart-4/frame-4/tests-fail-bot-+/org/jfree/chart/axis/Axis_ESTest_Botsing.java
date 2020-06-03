/*

 * Tue Mar 03 11:07:01 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.EventListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CyclicNumberAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultWindDataset;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.XYIntervalSeriesCollection;

public class Axis_ESTest_Botsing extends Axis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      combinedDomainXYPlot0.getRendererForDataset(matrixSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(xYIntervalSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(xYIntervalSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      TimeSeries timeSeries0 = new TimeSeries(true);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(timeSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot(numberAxis0);
      combinedDomainXYPlot0.getRendererForDataset(timeSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Object[][][] objectArray0 = new Object[0][7][9];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      combinedDomainXYPlot0.getRendererForDataset(defaultWindDataset0);
      XYPlot xYPlot0 = new XYPlot(defaultWindDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      combinedDomainXYPlot0.getRendererForDataset(matrixSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRenderer(10);
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(xYIntervalSeriesCollection0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F);
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      numberAxis0.setPlot((Plot) null);
      numberAxis0.getFixedDimension();
      numberAxis0.isTickMarksVisible();
      numberAxis0.getLabelInsets();
      numberAxis0.hasListener((EventListener) null);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      Object[][][] objectArray0 = new Object[0][7][9];
      DefaultWindDataset defaultWindDataset0 = new DefaultWindDataset(objectArray0);
      combinedDomainXYPlot0.getRendererForDataset(defaultWindDataset0);
      XYPlot xYPlot0 = new XYPlot(defaultWindDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      TimeSeries timeSeries0 = new TimeSeries(true);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      combinedDomainXYPlot0.getRendererForDataset(timeSeriesCollection0);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      combinedDomainXYPlot0.getRendererForDataset(defaultXYZDataset0);
      XYPlot xYPlot0 = new XYPlot(defaultXYZDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
