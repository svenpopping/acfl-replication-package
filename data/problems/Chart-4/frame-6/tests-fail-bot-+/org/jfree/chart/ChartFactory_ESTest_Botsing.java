/*

 * Tue Mar 03 11:07:20 UTC 2020
 */

package org.jfree.chart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.general.WaferMapDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.time.TimePeriodValuesCollection;
import org.jfree.data.xy.CategoryTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.DefaultXYZDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYDataset;

public class ChartFactory_ESTest_Botsing extends ChartFactory_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Vr613%", "Vr613%", "Vr613%", defaultXYZDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(1).when(xYDataset0).getItemCount(anyInt());
      doReturn(0.0).when(xYDataset0).getXValue(anyInt() , anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", categoryTableXYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(726).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'transformer' argument.", "Null 'transformer' argument.", "Null 'transformer' argument.", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-2208)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("RHpl x1", "RHpl x1", "RHpl x1", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("8f=-tZ>", "8f=-tZ>", "8f=-tZ>", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      ChartFactory.createWaterfallChart((String) null, (String) null, (String) null, (CategoryDataset) null, plotOrientation0, true, true, true);
      DefaultXYDataset defaultXYDataset0 = new DefaultXYDataset();
      XYBarDataset xYBarDataset0 = new XYBarDataset(defaultXYDataset0, 0.5F);
      PlotOrientation plotOrientation1 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, (String) null, (String) null, xYBarDataset0, plotOrientation1, true, true, true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1098806016)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("FgX!Mx =5", "FgX!Mx =5", "FgX!Mx =5", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("+*QJ@cWKL", "+*QJ@cWKL", "+*QJ@cWKL", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("I#=bs", "I#=bs", "I#=bs", defaultXYZDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-3708)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(3667).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("c", "c", "c", defaultXYZDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(xYDataset0).getSeriesCount();
      doReturn(4, 4, 4, 4).when(xYDataset0).getItemCount(anyInt());
      doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(xYDataset0).getXValue(anyInt() , anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fourth", "Fourth", "Fourth", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TimePeriodValuesCollection timePeriodValuesCollection0 = new TimePeriodValuesCollection();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot(")f6'>", ")f6'>", ")f6'>", timePeriodValuesCollection0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "";
      WaferMapDataset waferMapDataset0 = mock(WaferMapDataset.class, new ViolatedAssumptionAnswer());
      doReturn((Number) null).when(waferMapDataset0).getMaxValue();
      doReturn((Number) null).when(waferMapDataset0).getMinValue();
      doReturn((Set) null).when(waferMapDataset0).getUniqueValues();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      // Undeclared exception!
      ChartFactory.createWaferMapChart("", waferMapDataset0, plotOrientation0, false, true, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Bright ", "Bright ", "Bright ", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("org.jfree.chart.renderer.xy.StackedXYAreaRenderer", "org.jfree.chart.renderer.xy.StackedXYAreaRenderer", "org.jfree.chart.renderer.xy.StackedXYAreaRenderer", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(" @J~", " @J~", " @J~", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(1).when(xYDataset0).getItemCount(anyInt());
      doReturn(0.0).when(xYDataset0).getXValue(anyInt() , anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("RHpl x1", "RHpl x1", "RHpl x1", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, (String) null, (String) null, xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("33Shd,", "33Shd,", "33Shd,", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(")f6'>", ")f6'>", ")f6'>", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("=]::@", "=]::@", "=]::@", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PieDataset pieDataset0 = mock(PieDataset.class, new ViolatedAssumptionAnswer());
      Locale locale0 = Locale.TAIWAN;
      ChartFactory.createPieChart(")f6'>", pieDataset0, true, true, locale0);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(15).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(")f6'>", ")f6'>", ")f6'>", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("OBR~HbwU]0Z$ZM[j?", "OBR~HbwU]0Z$ZM[j?", "OBR~HbwU]0Z$ZM[j?", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(193).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", defaultXYZDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1229)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("c", "c", "c", defaultXYZDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot((String) null, (String) null, (String) null, xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1061)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("R", "R", "R", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String string0 = "+*QJ@cWKL";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = true;
      boolean boolean1 = false;
      // Undeclared exception!
      ChartFactory.createScatterPlot("+*QJ@cWKL", "+*QJ@cWKL", "+*QJ@cWKL", xYDataset0, plotOrientation0, true, false, false);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-485)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("=]::@", "=]::@", "=]::@", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1009)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("NjT6", "NjT6", "NjT6", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("OBR~HbwU]0Z$ZM[j?", "OBR~HbwU]0Z$ZM[j?", "OBR~HbwU]0Z$ZM[j?", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("RHpl x1", "RHpl x1", "RHpl x1", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(9).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(16).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'transformer' argument.", "Null 'transformer' argument.", "Null 'transformer' argument.", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fourth", "Fourth", "Fourth", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-759)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCCategoryDataset jDBCCategoryDataset0 = new JDBCCategoryDataset(connection0);
      PlotOrientation plotOrientation1 = PlotOrientation.VERTICAL;
      ChartFactory.createBarChart("Series Title", "j!6#N|>9mv-dna", "j!6#N|>9mv-dna", jDBCCategoryDataset0, plotOrientation1, false, true, true);
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(xYDataset0).getSeriesCount();
      doReturn(0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fourth", "Fourth", "Fourth", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("@N0", "@N0", "@N0", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'orientation' argument.", "Null 'orientation' argument.", "Null 'orientation' argument.", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("SortOrder.DESCENDING", "SortOrder.DESCENDING", "SortOrder.DESCENDING", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("E9,~CgM\"UQBxHf", "E9,~CgM\"UQBxHf", "E9,~CgM\"UQBxHf", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(4774).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", "($}}w0_?gE@UK\"eR", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("org.jfree.chart.util.RectangleAnchor", "org.jfree.chart.util.RectangleAnchor", "org.jfree.chart.util.RectangleAnchor", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CategoryTableXYDataset categoryTableXYDataset0 = new CategoryTableXYDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", categoryTableXYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = PlotOrientation.VERTICAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("c", "c", "c", defaultXYZDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("RHpl x1", "RHpl x1", "RHpl x1", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-4829)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("33Shd,", "33Shd,", "33Shd,", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("c", "c", "c", defaultXYZDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      PieDataset pieDataset0 = mock(PieDataset.class, new ViolatedAssumptionAnswer());
      ChartFactory.createRingChart("org.jfree.chart.renderer.xy.StackedXYAreaRenderer", pieDataset0, true, true, true);
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(15).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("org.jfree.chart.renderer.xy.StackedXYAreaRenderer", "org.jfree.chart.renderer.xy.StackedXYAreaRenderer", "org.jfree.chart.renderer.xy.StackedXYAreaRenderer", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(2817).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-1839)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fourth", "Fourth", "Fourth", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'orientation' argument.", "Null 'orientation' argument.", "Null 'orientation' argument.", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("RHpl x1", "RHpl x1", "RHpl x1", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-503)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Vr613", "Vr613", "Vr613", defaultXYZDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'transformer' argument.", "Null 'transformer' argument.", "Null 'transformer' argument.", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      String string0 = "Null 'orientation' argument.";
      String string1 = "";
      String string2 = "qY4_}M4nZ!B'";
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = false;
      boolean boolean1 = false;
      // Undeclared exception!
      ChartFactory.createScatterPlot("Null 'orientation' argument.", "", "qY4_}M4nZ!B'", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(80).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("+*QJ@cWKL", "+*QJ@cWKL", "+*QJ@cWKL", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      TaskSeriesCollection taskSeriesCollection0 = mock(TaskSeriesCollection.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(taskSeriesCollection0).getSeriesCount();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("%", "%", "%", xYTaskDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(510).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-759)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Series Title", "Series Title", "Series Title", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(">Iqm)H<l)u5Y", ">Iqm)H<l)u5Y", ">Iqm)H<l)u5Y", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Rotation.CLOCKWISE", "Rotation.CLOCKWISE", "Rotation.CLOCKWISE", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      DefaultXYZDataset defaultXYZDataset0 = new DefaultXYZDataset();
      PlotOrientation plotOrientation0 = PlotOrientation.HORIZONTAL;
      // Undeclared exception!
      ChartFactory.createScatterPlot("c", "c", "c", defaultXYZDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(120).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("33Shd,", "33Shd,", "33Shd,", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(xYDataset0).getSeriesCount();
      doReturn(0, 0, 0, 0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("Fourth", "Fourth", "Fourth", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot(",q1=", ",q1=", ",q1=", xYDataset0, plotOrientation0, true, true, true);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn((-732)).when(xYDataset0).getSeriesCount();
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      XYDataset xYDataset0 = mock(XYDataset.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(xYDataset0).getSeriesCount();
      doReturn(0).when(xYDataset0).getItemCount(anyInt());
      PlotOrientation plotOrientation0 = mock(PlotOrientation.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      ChartFactory.createScatterPlot("", "", "", xYDataset0, plotOrientation0, false, false, false);
  }
}
