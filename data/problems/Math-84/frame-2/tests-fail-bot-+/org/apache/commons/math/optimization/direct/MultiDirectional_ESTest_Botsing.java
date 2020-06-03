/*

 * Tue Mar 03 11:40:04 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.direct.MultiDirectional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class MultiDirectional_ESTest_Botsing extends MultiDirectional_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-5));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-5) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-34));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-34) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-48));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-48) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations(0);
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-928));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-928) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-493));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-493) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-497));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-497) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1468));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,468) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-514));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-514) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-507));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-507) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2209));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,209) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-473));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-473) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-517));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-517) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-520));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-520) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-500));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-500) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1538));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,538) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-470));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-470) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-489));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-489) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-464));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-464) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-3355));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-3,355) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-437));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-437) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-905));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-905) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-778));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-778) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-163));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-163) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1312));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,312) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-48));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-48) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-23));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-23) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-463));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-463) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-523));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-523) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-541));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-541) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2124));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,124) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-445));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-445) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1460));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,460) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-1756));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,756) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-753));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-753) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-493));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-493) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1983));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,983) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-493));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-493) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-4157));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-4,157) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-471));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-471) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-541));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-541) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-112));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-112) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-48));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-48) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-481));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-481) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-604));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-604) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-488));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-488) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-480));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-480) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-38));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-38) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-466));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-466) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations(0);
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-521));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-521) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-479));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-479) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-5993));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-5,993) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-468));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-468) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-2209));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,209) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1022));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,022) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-459));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-459) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-490));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-490) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-503));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-503) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2246));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,246) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-481));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-481) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations(0);
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-502));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-502) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-520));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-520) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-501));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-501) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-314));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-314) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-206));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-206) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-622));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-622) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-529));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-529) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-114));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-114) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-483));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-483) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-431));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-431) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-481));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-481) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-447));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-447) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2139));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,139) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-494));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-494) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations(0);
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-475));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-475) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-493));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-493) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-340));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-340) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-453));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-453) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-23));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-23) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1657));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,657) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2250));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,250) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-472));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-472) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-68));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-68) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-446));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-446) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-680));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-680) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1457));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,457) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-46));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-46) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2209));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,209) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-104));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-104) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-498));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-498) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1004));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,004) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-486));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-486) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2572));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,572) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2653));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,653) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-23));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-23) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-506));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-506) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-232));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-232) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-2299));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,299) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional((-481), (-481));
      multiDirectional0.setMaxIterations((-481));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-481) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2054));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,054) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1775));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,775) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-456));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-456) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-506));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-506) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-2148));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,148) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1247));
        multiDirectional0.iterateSimplex((Comparator<RealPointValuePair>) null);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1,247) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-1));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-4882));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-4,882) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-2005));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,005) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-443));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-443) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-496));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-496) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-495));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-495) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-481));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-481) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-65));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-65) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-2087));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-2,087) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-1));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-478));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-478) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      MultiDirectional multiDirectional0 = new MultiDirectional((-493), (-493));
      multiDirectional0.setMaxIterations((-493));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-493) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      multiDirectional0.setMaxIterations((-514));
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-514) exceeded
         //
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      MultiDirectional multiDirectional0 = new MultiDirectional();
      multiDirectional0.setMaxIterations((-486));
      Comparator<RealPointValuePair> comparator0 = (Comparator<RealPointValuePair>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        multiDirectional0.iterateSimplex(comparator0);
      
         //
         // org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-486) exceeded
         //
  }
}
