/*

 * Tue Mar 03 10:14:54 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.nonstiff.StepProblem;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class EventState_ESTest_Botsing extends EventState_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1745.49747291137), (-1745.49747291137), 0.0).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 1988.1407106167403, 1988.1407106167403, 0);
      double[] doubleArray0 = new double[7];
      doubleArray0[0] = (double) 0;
      doubleArray0[1] = 1995.4722697403;
      doubleArray0[2] = (-1745.49747291137);
      doubleArray0[3] = (double) 0;
      doubleArray0[4] = 1988.1407106167403;
      doubleArray0[5] = (double) 0;
      doubleArray0[6] = (-1745.49747291137);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) null, (Object) null).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      double[] doubleArray1 = new double[8];
      doubleArray1[0] = 1988.1407106167403;
      doubleArray1[1] = 12.0;
      doubleArray1[2] = 12.0;
      StepProblem stepProblem0 = new StepProblem(0, 1397.32, 12.0);
      EventState eventState1 = new EventState(stepProblem0, 1988.1407106167403, 23.134608717688, 150);
      eventState1.getConvergence();
  }
}
