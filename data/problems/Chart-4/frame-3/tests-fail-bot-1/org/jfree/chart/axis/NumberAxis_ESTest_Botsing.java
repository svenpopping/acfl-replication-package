/*

 * Tue Mar 03 09:57:21 UTC 2020
 */

package org.jfree.chart.axis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.sql.Connection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.jdbc.JDBCXYDataset;

public class NumberAxis_ESTest_Botsing extends NumberAxis_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberAxis3D numberAxis3D0 = new NumberAxis3D();
      String string0 = "";
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      JDBCXYDataset jDBCXYDataset0 = new JDBCXYDataset(connection0);
      XYPlot xYPlot0 = new XYPlot(jDBCXYDataset0, numberAxis3D0, numberAxis3D0, (XYItemRenderer) null);
  }
}
