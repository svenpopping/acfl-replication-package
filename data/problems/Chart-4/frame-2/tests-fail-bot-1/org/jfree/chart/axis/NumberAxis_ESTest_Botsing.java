/*

 * Tue Mar 03 09:55:36 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.image.ShortLookupTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.gantt.XYTaskDataset;

public class NumberAxis_ESTest_Botsing extends NumberAxis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      numberAxis3D0.autoAdjustRange();
      short[][] shortArray0 = new short[6][6];
      short[] shortArray1 = new short[9];
      shortArray1[0] = (short) (-2272);
      shortArray1[1] = (short) (-732);
      shortArray1[2] = (short)1935;
      shortArray1[3] = (short)8;
      shortArray1[4] = (short)75;
      shortArray1[5] = (short)96;
      shortArray1[6] = (short) (-1902);
      shortArray1[7] = (short)500;
      shortArray1[8] = (short)2318;
      shortArray0[0] = shortArray1;
      short[] shortArray2 = new short[7];
      shortArray2[0] = (short) (-732);
      shortArray2[1] = (short)2318;
      shortArray2[2] = (short)500;
      shortArray2[3] = (short)31;
      shortArray2[4] = (short)75;
      shortArray2[5] = (short) (-1902);
      shortArray2[6] = (short)2318;
      shortArray0[1] = shortArray2;
      short[] shortArray3 = new short[4];
      shortArray3[0] = (short)75;
      shortArray3[1] = (short)75;
      shortArray3[2] = (short) (-732);
      shortArray3[3] = (short)96;
      shortArray0[2] = shortArray3;
      short[] shortArray4 = new short[6];
      shortArray4[0] = (short)96;
      shortArray4[1] = (short)8;
      shortArray4[2] = (short)31;
      shortArray4[3] = (short)75;
      shortArray4[4] = (short)500;
      shortArray4[5] = (short)500;
      shortArray0[3] = shortArray4;
      short[] shortArray5 = new short[1];
      short short0 = (short) (-1136);
      shortArray5[0] = (short) (-1136);
      shortArray0[4] = shortArray5;
      short[] shortArray6 = new short[0];
      shortArray0[5] = shortArray6;
      ShortLookupTable shortLookupTable0 = new ShortLookupTable(500, shortArray0);
      String string0 = "S.%}uG{I%)r0";
      TaskSeriesCollection taskSeriesCollection0 = new TaskSeriesCollection();
      XYTaskDataset xYTaskDataset0 = new XYTaskDataset(taskSeriesCollection0);
      CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
      combinedDomainXYPlot0.getRendererForDataset(xYTaskDataset0);
      XYPlot xYPlot0 = new XYPlot(xYTaskDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
