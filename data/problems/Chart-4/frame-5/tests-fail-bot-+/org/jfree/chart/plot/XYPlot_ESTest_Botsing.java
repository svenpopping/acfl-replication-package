/*

 * Tue Mar 03 11:07:17 UTC 2020
 */

package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
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
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYErrorRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XIntervalSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.YIntervalSeriesCollection;

public class XYPlot_ESTest_Botsing extends XYPlot_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      TimeSeries timeSeries0 = new TimeSeries(xYErrorRenderer0.ZERO, (String) null, (String) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F, (String) null);
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, (String) null);
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, Double.NaN, "Null 'axisIndex' argument.");
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberAxis numberAxis0 = new NumberAxis();
      ZoneId zoneId0 = ZoneId.systemDefault();
      TimeZone timeZone0 = TimeZone.getTimeZone(zoneId0);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeZone0);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      TimeSeries timeSeries0 = new TimeSeries(xYErrorRenderer0.ZERO, (String) null, (String) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, (String) null);
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(true);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05);
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("h+J", "h+J").when(xYDataset0).toString();
      doReturn((-2873)).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis("h+J");
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(xYDataset0).toString();
      doReturn(966).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      NumberAxis numberAxis0 = new NumberAxis();
      PeriodAxis periodAxis0 = new PeriodAxis("");
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, periodAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(timePeriodValuesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 1.0F, (String) null);
      XYPlot xYPlot1 = new XYPlot(defaultIntervalXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, (-433.6176096357), "Null 'axisIndex' argument.");
      XYItemRenderer xYItemRenderer0 = null;
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("Null 'stroke' argument.", ">.t2*2xDbtd<fF{2").when(xYDataset0).toString();
      doReturn((-1597)).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      DefaultIntervalXYDataset defaultIntervalXYDataset0 = new DefaultIntervalXYDataset();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 10, (String) null);
      XYPlot xYPlot1 = new XYPlot(defaultIntervalXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getDefault();
      TimeTableXYDataset timeTableXYDataset0 = new TimeTableXYDataset(timeZone0);
      NumberAxis numberAxis0 = new NumberAxis((String) null);
      XYPlot xYPlot0 = new XYPlot(timeTableXYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, (-433.6176096357), "Null 'axisIndex' argument.");
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(788.607, 788.607);
      XYPlot xYPlot0 = new XYPlot(xYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, (XYItemRenderer) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(1.0F, (String) null);
      XYPlot xYPlot1 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("Null 'stroke' argument.", "Null 'stroke' argument.").when(xYDataset0).toString();
      doReturn((-1597)).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("mL]hfk", "mL]hfk").when(xYDataset0).toString();
      doReturn((-3145)).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("h+J", "h+J").when(xYDataset0).toString();
      doReturn(365).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      NumberAxis numberAxis0 = new NumberAxis("h+J");
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      TimeSeries timeSeries0 = new TimeSeries(xYErrorRenderer0.ZERO, (String) null, (String) null);
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection(timeSeries0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) xYErrorRenderer0.ZERO, (String) null);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(873.50149);
      XYPlot xYPlot0 = new XYPlot(xYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((-168.384374415604));
      XYPlot xYPlot0 = new XYPlot(xYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.05);
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset(false);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(2.0F);
      NumberAxis3D numberAxis3D0 = new NumberAxis3D("");
      XYPlot xYPlot1 = new XYPlot(defaultTableXYDataset0, numberAxis3D0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("h+J", "h+J").when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis("h+J");
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(4.0, "TextAnchor.HALF_ASCENT_LEFT");
      DefaultTableXYDataset defaultTableXYDataset0 = new DefaultTableXYDataset();
      XYPlot xYPlot0 = new XYPlot(defaultTableXYDataset0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String string0 = null;
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN, (-433.6176096357), "Null 'axisIndex' argument.");
      XYItemRenderer xYItemRenderer0 = null;
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(5.0E10);
      LogAxis logAxis0 = new LogAxis();
      XYPlot xYPlot0 = new XYPlot(yIntervalSeriesCollection0, cyclicNumberAxis0, logAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(0.0, 500, "37]u:WX+Mn:-}\"mK");
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(Double.NaN);
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(xYDataset0).toString();
      doReturn(0).when(xYDataset0).getSeriesCount();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot0 = new XYPlot(xYDataset0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(10, 10, "");
      XIntervalSeriesCollection xIntervalSeriesCollection0 = new XIntervalSeriesCollection();
      XYPlot xYPlot1 = new XYPlot(xIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XYErrorRenderer xYErrorRenderer0 = new XYErrorRenderer();
      TimeSeriesCollection timeSeriesCollection0 = new TimeSeriesCollection();
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis((double) xYErrorRenderer0.ZERO, (String) null);
      XYPlot xYPlot0 = new XYPlot(timeSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      CyclicNumberAxis cyclicNumberAxis0 = new CyclicNumberAxis(500, (String) null);
      YIntervalSeriesCollection yIntervalSeriesCollection0 = new YIntervalSeriesCollection();
      XYPlot xYPlot0 = new XYPlot(yIntervalSeriesCollection0, cyclicNumberAxis0, cyclicNumberAxis0, (XYItemRenderer) null);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn("`C8{iAJ9", "").when(xYDataset0).toString();
      ValueAxis valueAxis0 = mock(ValueAxis.class, new ViolatedAssumptionAnswer());
      XYItemRenderer xYItemRenderer0 = mock(XYItemRenderer.class, new ViolatedAssumptionAnswer());
      XYPlot xYPlot0 = new XYPlot(xYDataset0, valueAxis0, valueAxis0, xYItemRenderer0);
      XYItemRenderer xYItemRenderer1 = null;
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      NumberAxis numberAxis0 = new NumberAxis();
      XYPlot xYPlot1 = new XYPlot(timePeriodValuesCollection0, numberAxis0, numberAxis0, (XYItemRenderer) null);
  }
}
