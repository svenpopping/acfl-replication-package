/*

 * Tue Mar 03 11:06:57 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.SymbolAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.RangeType;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.MatrixSeriesCollection;
import org.jfree.data.xy.VectorSeriesCollection;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class NumberAxis_ESTest_Botsing extends NumberAxis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYSeries xYSeries0 = new XYSeries(0.05, true, true);
      XYSeriesCollection xYSeriesCollection0 = new XYSeriesCollection(xYSeries0);
      XYPlot xYPlot0 = new XYPlot(xYSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultIntervalXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      String[] stringArray0 = new String[2];
      SymbolAxis symbolAxis0 = new SymbolAxis("", stringArray0);
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, symbolAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      RangeType rangeType0 = RangeType.FULL;
      numberAxis0.setRangeType(rangeType0);
      numberAxis0.hashCode();
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      XYItemRenderer xYItemRenderer0 = null;
      categoryTableXYDataset0.getIntervalWidth();
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      XYIntervalSeriesCollection xYIntervalSeriesCollection0 = new XYIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xYIntervalSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      MatrixSeriesCollection matrixSeriesCollection0 = new MatrixSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(matrixSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      RangeType rangeType0 = RangeType.FULL;
      numberAxis0.setRangeType(rangeType0);
      numberAxis0.hashCode();
      XYItemRenderer xYItemRenderer0 = null;
      XYPlot xYPlot0 = new XYPlot(categoryTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultIntervalXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      VectorSeriesCollection vectorSeriesCollection0 = new VectorSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(vectorSeriesCollection0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
