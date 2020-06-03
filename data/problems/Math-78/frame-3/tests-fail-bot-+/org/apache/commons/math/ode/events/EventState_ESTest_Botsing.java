/*

 * Tue Mar 03 11:38:23 UTC 2020
 */

package org.apache.commons.math.ode.events;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.events.EventState;
import org.apache.commons.math.ode.sampling.DummyStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class EventState_ESTest_Botsing extends EventState_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2312.17), (-2312.17), (-2312.17)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2312.17), (-2312.17), 0);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.9607421038181), (-1717.9607421038181), (-1717.9607421038181)).when(eventHandler0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.9607421038181)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      EventState eventState0 = new EventState(eventHandler0, 0.0, (-1717.9607421038181), (-1));
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-3813.7571), (-3813.7571), (-3813.7571)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-3813.7571), (-3813.7571), 1092);
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)1092).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1240.1052006652023), (-1240.1052006652023), (-1240.1052006652023)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1240.1052006652023), (-1240.1052006652023), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1240.1052006652023)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), (-1129));
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), 4);
      double[] doubleArray0 = new double[4];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1670.78), (-1670.78), (-1670.78)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1670.78), (-1670.78), 3);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1670.78)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), (-689));
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-3813.7571), (-3813.7571), (-3813.7571)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-3813.7571), (-3813.7571), 3);
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)3).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1238.3654875731065), (-1238.3654875731065), (-1238.3654875731065)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1238.3654875731065), (-1238.3654875731065), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1238.3654875731065)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[10];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-4675.4), (-4675.4), (-4675.4)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-4675.4), (-4675.4), 0);
      eventState0.stop();
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-4675.4)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2002.7722279930697), (-2002.7722279930697), (-2002.7722279930697)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2002.7722279930697), (-2002.7722279930697), 3);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-2002.7722279930697)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1670.78), (-1670.78), (-1670.78)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1670.78), (-1670.78), 3);
      double[] doubleArray0 = new double[7];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)3).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-3813.7571), (-3813.7571), (-3813.7571)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-3813.7571), (-3813.7571), (-8));
      double[] doubleArray0 = new double[2];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-8)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4067);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1242.735768598411), (-1242.735768598411), (-1242.735768598411)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1242.735768598411), (-1242.735768598411), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1242.735768598411)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4064);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045, (-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), 0);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045).when(stepInterpolator1).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator1).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator1).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045, (-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 2.718281828459045, 2.718281828459045, 0);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2014.01862), (-2014.01862), (-2014.01862)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2014.01862), (-2014.01862), (-1));
      double[] doubleArray0 = new double[5];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2138.7518342), (-2138.7518342), (-2138.7518342)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2138.7518342), (-2138.7518342), 3);
      double[] doubleArray0 = new double[8];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-2138.7518342)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1.2599210498948732), (-1.2599210498948732), (-1.2599210498948732)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1.2599210498948732), (-1.2599210498948732), 3);
      double[] doubleArray0 = new double[3];
      eventState0.reset((-1.2599210498948732), doubleArray0);
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1.2599210498948732)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045, (-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, 2.718281828459045, 2.718281828459045, 0);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748)).when(stepInterpolator1).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator1).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator1).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-2138.7518342), (-2138.7518342), (-2138.7518342)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-2138.7518342), (-2138.7518342), 3);
      double[] doubleArray0 = new double[8];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)3).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0), (-1239.0), (-1239.0)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1239.0), (-1239.0), 4056);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1239.0)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045, (-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), 0);
      double[] doubleArray0 = new double[1];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      eventState0.evaluateStep(dummyStepInterpolator0);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn(2.718281828459045, (-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), 0);
      double[] doubleArray0 = new double[1];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator0).getCurrentTime();
      doReturn(doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      eventState0.evaluateStep(stepInterpolator0);
      StepInterpolator stepInterpolator1 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)0).when(stepInterpolator1).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator1).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator1).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator1);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), (-441));
      double[] doubleArray0 = new double[5];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-939.3129), (-939.3129), (-939.3129)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-939.3129), (-939.3129), (-386));
      double[] doubleArray0 = new double[6];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      // Undeclared exception!
      eventState0.evaluateStep(dummyStepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1218.0701247391619), (-1218.0701247391619), (-1218.0701247391619)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1218.0701247391619), (-1218.0701247391619), 4067);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1218.0701247391619)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.9607421038181), (-1717.9607421038181), (-1717.9607421038181)).when(eventHandler0).g(anyDouble() , any(double[].class));
      double[] doubleArray0 = new double[5];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.9607421038181)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(true, true).when(stepInterpolator0).isForward();
      EventState eventState0 = new EventState(eventHandler0, (-1717.9607421038181), (-1717.9607421038181), (-1));
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1226.2866892135248), (-1226.2866892135248), (-1226.2866892135248)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1226.2866892135248), (-1226.2866892135248), 4093);
      double[] doubleArray0 = new double[0];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((-1226.2866892135248)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
      doReturn((-1717.748), (-1717.748), (-1717.748)).when(eventHandler0).g(anyDouble() , any(double[].class));
      EventState eventState0 = new EventState(eventHandler0, (-1717.748), (-1717.748), (-441));
      double[] doubleArray0 = new double[5];
      StepInterpolator stepInterpolator0 = mock(StepInterpolator.class, new ViolatedAssumptionAnswer());
      doReturn((double)(-441)).when(stepInterpolator0).getCurrentTime();
      doReturn((Object) doubleArray0, (Object) doubleArray0, (Object) doubleArray0).when(stepInterpolator0).getInterpolatedState();
      doReturn(false, false).when(stepInterpolator0).isForward();
      // Undeclared exception!
      eventState0.evaluateStep(stepInterpolator0);
  }
}
