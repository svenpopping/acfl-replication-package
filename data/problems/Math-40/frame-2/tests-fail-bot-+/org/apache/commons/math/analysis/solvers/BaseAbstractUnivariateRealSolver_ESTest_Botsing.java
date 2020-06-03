/*

 * Tue Mar 03 11:29:20 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.DifferentiableUnivariateFunction;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BaseSecantSolver;
import org.apache.commons.math.analysis.solvers.BisectionSolver;
import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver;
import org.apache.commons.math.analysis.solvers.BrentSolver;
import org.apache.commons.math.analysis.solvers.LaguerreSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.MullerSolver2;
import org.apache.commons.math.analysis.solvers.NewtonSolver;
import org.apache.commons.math.analysis.solvers.RiddersSolver;
import org.apache.commons.math.analysis.solvers.SecantSolver;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BaseAbstractUnivariateRealSolver_ESTest_Botsing extends BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-2089.1));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
      newtonSolver0.getMaxEvaluations();
        newtonSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-121.25885607));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue((-11.762950026010557));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue((-2755.5581831));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2.0);
        laguerreSolver0.computeObjectiveValue(2.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1.0E-15);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.0, 0.0);
        mullerSolver2_0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      secantSolver0.solve((-712), (UnivariateFunction) sinFunction0, (double) 2294);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
      mullerSolver2_0.getMaxEvaluations();
        mullerSolver2_0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1872, 1872);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve((-10), (UnivariateFunction) quinticFunction0, (double) (-10), 1.0E-6, 0.0, allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-1983.2408426352906), (-1983.2408426352906));
        mullerSolver2_0.computeObjectiveValue((-1983.2408426352906));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue((-16.887917578510304));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(194);
        laguerreSolver0.computeObjectiveValue(194);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(2350.0097478062803);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(2.244414150254963E-158);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1.4836885929107666);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1.3217328786406564, 1.3217328786406564);
        riddersSolver0.computeObjectiveValue(1.3217328786406564);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1.0209065397163404);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(4086);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(840, 840);
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-30.8));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      newtonSolver0.solve(0, (DifferentiableUnivariateFunction) sincFunction0, 847.0, 847.0, 847.0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue((-1983.2408426352906));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-3599), (-3599));
        riddersSolver0.computeObjectiveValue(0.9375);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-1069.6), (-1069.6));
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-9));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2480.0837341227734), 1197);
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-2480.0837341227734));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-30.77922917008909), 4190);
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
        laguerreSolver0.computeObjectiveValue(Double.NaN);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(310.5665);
        riddersSolver0.computeObjectiveValue(310.5665);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(3159.0);
        brentSolver0.computeObjectiveValue(3159.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-30.77922917));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(26.380577291673664);
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      riddersSolver0.solve(0, (UnivariateFunction) sinFunction0, 26.380577291673664);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(3234.064562, 3234.064562);
      bisectionSolver0.getMaxEvaluations();
        bisectionSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-3249.8141046140645));
        brentSolver0.computeObjectiveValue((-3249.8141046140645));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(257, 257);
        bracketingNthOrderBrentSolver0.computeObjectiveValue(257);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0, 0.0);
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(4124.8148377);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      newtonSolver0.solve(0, (DifferentiableUnivariateFunction) xMinus5Function0, (double) 0, (double) 0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver(1.0E-6);
        newtonSolver0.computeObjectiveValue(4594.74116);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1171);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(1.0E-15);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(4502.7011812098945);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-1391.16523));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1, 1);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-6, 0.0);
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      riddersSolver0.solve(0, (UnivariateFunction) expm1Function0, (double) 0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.1972921361752621);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(2048);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-1.0));
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1248.814490867);
        secantSolver0.computeObjectiveValue(1248.814490867);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(151);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(16.518477619477608);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(0.0, 0.0);
        mullerSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(352, 352);
        mullerSolver2_0.computeObjectiveValue(1590.82406435378);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bisectionSolver0.solve((-3279), (UnivariateFunction) quinticFunction0, (double) (-3279));
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      mullerSolver0.solve((-940), (UnivariateFunction) quinticFunction0, (double) (-940), (double) 5);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(0.5);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(2144.7347528234363);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(1.045647032279984E-172, 1.045647032279984E-172);
        mullerSolver0.computeObjectiveValue(1.045647032279984E-172);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      MonitoredFunction monitoredFunction0 = new MonitoredFunction(xMinus5Function0);
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(1, (UnivariateFunction) monitoredFunction0, (-7.877917738262007E-9), 1.3217328786406564);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-30.77922917008909));
        bisectionSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      bisectionSolver0.solve(0, (UnivariateFunction) expm1Function0, (-255.99404823499233));
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      MullerSolver mullerSolver0 = new MullerSolver(1.0E-6);
        mullerSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-2080.928899769));
        newtonSolver0.computeObjectiveValue((-2080.928899769));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(1.0E-14, 1.0E-14);
        mullerSolver2_0.computeObjectiveValue(1.0E-14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(716);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(571.7079523978961);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      newtonSolver0.solve((-1429), (DifferentiableUnivariateFunction) xMinus5Function0, (double) (-1429), (double) (-1429), 571.7079523978961);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0, 0.0);
        brentSolver0.computeObjectiveValue(119);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(1.040851354598999, 1.040851354598999);
        brentSolver0.computeObjectiveValue(1.040851354598999);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-2088.743224012818));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0);
        riddersSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(1.0E-15, 1.0E-15);
        mullerSolver2_0.computeObjectiveValue(1.0E-15);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(0.0);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-16.053834461936226));
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      bisectionSolver0.solve(0, (UnivariateFunction) sincFunction0, (-16.053834461936226));
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(287);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-14.743324605350818));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-680));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(2253.9887681675);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(2.156647205352783);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(2.8524232604238555E-96);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      // Undeclared exception!
      newtonSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
        mullerSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-9.1973399031975E-8));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1281);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(3631.260028161, 3631.260028161);
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(0.5);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-2002.41448576339), (-2002.41448576339), (-2002.41448576339));
        brentSolver0.computeObjectiveValue((-2002.41448576339));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver((-3.6703535235722304), 1.0209065397163404);
      SinFunction sinFunction0 = new SinFunction();
      bisectionSolver0.setup(1908, sinFunction0, (-3.6703535235722304), 1.0209065397163404, 1.0209065397163404);
      bisectionSolver0.doSolve();
      SecantSolver secantSolver0 = new SecantSolver((-3.377149769616695));
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      NewtonSolver newtonSolver0 = new NewtonSolver((-122.6407043));
      // Undeclared exception!
      newtonSolver0.solve((-1373), (DifferentiableUnivariateFunction) sinFunction0, (-122.6407043), (-122.6407043));
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-141.63591195002664));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2627.506));
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      laguerreSolver0.solve((-579), polynomialFunction0, 0.0, (double) 194);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1908);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1.0E-14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      Expm1Function expm1Function0 = new Expm1Function();
      // Undeclared exception!
      newtonSolver0.solve((-1788), (DifferentiableUnivariateFunction) expm1Function0, (double) (-1788), (double) (-1788), (double) (-1788));
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(1.4047281742095947, 1.4047281742095947);
        laguerreSolver0.computeObjectiveValue(1.4047281742095947);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2627.506));
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      laguerreSolver0.solve((-579), polynomialFunction0, (-2627.506), (double) 194);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-30.77923));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(3234.064562, 3234.064562);
        bisectionSolver0.computeObjectiveValue(3234.064562);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-1.9133127085788433));
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-102.8594));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-4178.206281152167));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
        newtonSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      secantSolver0.solve((-694), (UnivariateFunction) sinFunction0, (double) 2284);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1883.627734484), (-1883.627734484), (-1883.627734484));
        brentSolver0.computeObjectiveValue((-1883.627734484));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(571.7079523978961);
      // Undeclared exception!
      newtonSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(3033.242219114273);
        mullerSolver0.computeObjectiveValue(3033.242219114273);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver(1.0E-6);
        newtonSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
        laguerreSolver0.computeObjectiveValue((-7.498198913676193));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(2246, 2246);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-2101.6068160868463));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver((-122.6407043));
      // Undeclared exception!
      newtonSolver0.solve((-1373), (DifferentiableUnivariateFunction) sinFunction0, (double) 2429, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
        laguerreSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.getEvaluations();
        riddersSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 1.0E-6, 69);
        bracketingNthOrderBrentSolver0.computeObjectiveValue(69);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-616));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      mullerSolver0.solve((-616), (UnivariateFunction) quinticFunction0, (double) (-616));
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver(1.0E-6);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      riddersSolver0.solve((-23), (UnivariateFunction) sinFunction0, (double) (-23), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0, 0.0);
      double[] doubleArray0 = new double[15];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      laguerreSolver0.solve((-1588), polynomialFunction0, 0.0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(584.4366);
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      // Undeclared exception!
      newtonSolver0.solve(0, (DifferentiableUnivariateFunction) xMinus5Function0, (double) 0, 584.4366);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
        mullerSolver0.computeObjectiveValue(309.53365024719216);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(3255.755973046);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver(Double.NaN);
        secantSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0);
        laguerreSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(1142.0499815556745);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2627.506));
        laguerreSolver0.computeObjectiveValue(182);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
        newtonSolver0.computeObjectiveValue(2056);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      secantSolver0.solve((-1084), (UnivariateFunction) sinFunction0, (double) 2284);
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-1471));
        laguerreSolver0.computeObjectiveValue(2.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      riddersSolver0.solve(1, (UnivariateFunction) quinticFunction0, 0.0);
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver(1.0E-6);
      // Undeclared exception!
      newtonSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1495.7273278865343);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      newtonSolver0.solve((-725), (DifferentiableUnivariateFunction) sincFunction0, (double) (-725), (double) (-725), (double) (-725));
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(0.6227030114100348);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1651);
        riddersSolver0.computeObjectiveValue(1651);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(2739);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(0.0);
        newtonSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 478);
        bracketingNthOrderBrentSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0, 0.0, 0.0);
        brentSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2627.506));
        laguerreSolver0.computeObjectiveValue(194);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-1682.289));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(5.37);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-0.16147053588959723));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(65.414782634762);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(1.14585);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-1378), (DifferentiableUnivariateFunction) quinticFunction0, (double) (-1378), (double) 2110, (double) (-1378));
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-1), (DifferentiableUnivariateFunction) quinticFunction0, (double) (-1), (double) (-1), (double) (-1));
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      SinFunction sinFunction0 = new SinFunction();
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver(2429);
      // Undeclared exception!
      newtonSolver0.solve((-1373), (DifferentiableUnivariateFunction) sinFunction0, (-122.6407043), 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test158()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(1.0E-15);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test159()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-656.0), (-656.0));
        brentSolver0.computeObjectiveValue((-656.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test160()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-14.743324605350818), (-14.743324605350818));
        mullerSolver0.computeObjectiveValue((-14.743324605350818));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test161()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-30.77922917008909));
      // Undeclared exception!
      newtonSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test162()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
        laguerreSolver0.computeObjectiveValue(339);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test163()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test164()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test165()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(2307.640455167);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test166()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(570.924799576958);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test167()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      bisectionSolver0.getEvaluations();
        bisectionSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test168()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-427.002));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test169()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-1.0), (-1.0), (-1.0));
        brentSolver0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test170()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-1198), (-1198));
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test171()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver(1.0E-6);
      // Undeclared exception!
      newtonSolver0.solve((-2754), (DifferentiableUnivariateFunction) quinticFunction0, (double) 647, (double) (-2754));
  }

  @Test(timeout = 4000)
  public void test172()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(1.1220467571570283E-7);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test173()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test174()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver();
      double[] doubleArray0 = new double[3];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      secantSolver0.solve(1, (UnivariateFunction) polynomialFunction0, 0.0, 1.0E-6, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test175()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(53.44503537420037, 53.44503537420037);
        mullerSolver0.computeObjectiveValue(53.44503537420037);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test176()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-2314.14560372));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test177()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-1.1346641093555185), (-1.1346641093555185));
      // Undeclared exception!
      riddersSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test178()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(3090.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test179()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(2813.5406, 2813.5406);
        mullerSolver2_0.computeObjectiveValue(2813.5406);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test180()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
        laguerreSolver0.computeObjectiveValue(1133.39693);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test181()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(112.40013200969);
      double[] doubleArray0 = new double[5];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      newtonSolver0.solve((-1), (DifferentiableUnivariateFunction) polynomialFunction0, 0.0, 0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test182()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BrentSolver brentSolver0 = new BrentSolver(1.0E-6);
        brentSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test183()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-6, 1.0E-6);
        riddersSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test184()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver((-2627.506));
        laguerreSolver0.computeObjectiveValue((-2627.506));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test185()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(16);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test186()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(1170);
        brentSolver0.computeObjectiveValue((-2501.7145241992944));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test187()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(1.0E-14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test188()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(2.6102792042257208E-23);
      double[] doubleArray0 = new double[8];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      // Undeclared exception!
      laguerreSolver0.solve((-579), polynomialFunction0, 0.0, 2.6102792042257208E-23);
  }

  @Test(timeout = 4000)
  public void test189()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) quinticFunction0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test190()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-1.134963954323427E-7));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test191()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(5);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test192()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test193()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(14);
        brentSolver0.computeObjectiveValue(14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test194()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver((-30.77922917008909), 1.0E-6);
        riddersSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test195()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue((-3162.941647675611));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test196()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(374.13007220534723);
        mullerSolver0.computeObjectiveValue(374.13007220534723);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test197()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver(1833);
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test198()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test199()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-1378), (DifferentiableUnivariateFunction) quinticFunction0, (double) 2110, (double) 2110, (double) 2110);
  }

  @Test(timeout = 4000)
  public void test200()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test201()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-9.522726334561169E100));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test202()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(0.0, 0.0, 0.0);
        laguerreSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test203()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue((-517.2203228945776));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test204()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-1938.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test205()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue((-1043.393009));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test206()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      newtonSolver0.getEvaluations();
        newtonSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test207()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver((-30.77922917008909), (-30.77922917008909));
        riddersSolver0.computeObjectiveValue((-30.77922917008909));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test208()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2((-1.0), (-1.0));
        mullerSolver2_0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test209()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1.0E-14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test210()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-3177.7985935));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test211()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver(0.0, 0.0);
        brentSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test212()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve((-10), (UnivariateFunction) quinticFunction0, (-1878.5414), 1.0E-6, (double) (-10), allowedSolution0);
  }

  @Test(timeout = 4000)
  public void test213()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver();
        mullerSolver0.computeObjectiveValue((-525.73433292566));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test214()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-1054.42206141698));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test215()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-1384.072950595529));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test216()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver(1251, 1.0E-6);
        secantSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test217()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-30.540001676507377));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test218()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      MullerSolver mullerSolver0 = new MullerSolver();
      // Undeclared exception!
      mullerSolver0.solve(0, (UnivariateFunction) quinticFunction0, (double) 0, (double) 5);
  }

  @Test(timeout = 4000)
  public void test219()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue((-520.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test220()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      secantSolver0.getMaxEvaluations();
        secantSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test221()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-3.4650891244084597E148));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test222()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(194);
        laguerreSolver0.computeObjectiveValue((-2627.506));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test223()  throws Throwable  {
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(18, (UnivariateFunction) xMinus5Function0, (-151.82));
  }

  @Test(timeout = 4000)
  public void test224()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-819.12132793349), (-819.12132793349));
        secantSolver0.computeObjectiveValue((-819.12132793349));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test225()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(0.0, 0.0);
        riddersSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test226()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue((-12.618705116515008));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test227()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver(Double.NaN);
        laguerreSolver0.computeObjectiveValue(Double.NaN);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test228()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-725.9244668835703));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test229()  throws Throwable  {
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      bracketingNthOrderBrentSolver0.getMaximalOrder();
      MullerSolver mullerSolver0 = new MullerSolver((-940), (-1870.983));
      // Undeclared exception!
      mullerSolver0.solve((-940), (UnivariateFunction) quinticFunction0, (double) (-940), (double) 5);
  }

  @Test(timeout = 4000)
  public void test230()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-1), (DifferentiableUnivariateFunction) quinticFunction0, (double) 2110, (double) (-1), (double) 2110);
  }

  @Test(timeout = 4000)
  public void test231()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-3644.0367137226835), (-3644.0367137226835));
        mullerSolver0.computeObjectiveValue((-3644.0367137226835));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test232()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver(1163.4222660189187);
        mullerSolver0.computeObjectiveValue(1163.4222660189187);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test233()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(1105.230652122);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test234()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(2276);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test235()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-1026.636171167945));
        newtonSolver0.computeObjectiveValue((-1026.636171167945));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test236()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(1.3217328786406564);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test237()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0);
        riddersSolver0.computeObjectiveValue(1.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test238()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      SinFunction sinFunction0 = new SinFunction();
      // Undeclared exception!
      secantSolver0.solve((-712), (UnivariateFunction) sinFunction0, (double) 2284);
  }

  @Test(timeout = 4000)
  public void test239()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BrentSolver brentSolver0 = new BrentSolver(1.0E-6);
        brentSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test240()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(0.0);
        mullerSolver2_0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test241()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-8.254443919468538E-9));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test242()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-1742), (DifferentiableUnivariateFunction) quinticFunction0, (double) (-1742));
  }

  @Test(timeout = 4000)
  public void test243()  throws Throwable  {
      MullerSolver2 mullerSolver2_0 = new MullerSolver2();
        mullerSolver2_0.computeObjectiveValue(1.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test244()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue((-1270.867322718));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test245()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-2090.18665407108));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test246()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-6);
        riddersSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test247()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      RiddersSolver riddersSolver0 = new RiddersSolver(1.0E-6);
        riddersSolver0.computeObjectiveValue(310.5665);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test248()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        bracketingNthOrderBrentSolver0.computeObjectiveValue(2253.988768167);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test249()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver((-1863.8563290509912));
      QuinticFunction quinticFunction0 = new QuinticFunction();
      // Undeclared exception!
      newtonSolver0.solve((-504), (DifferentiableUnivariateFunction) quinticFunction0, (double) (-504), (double) (-504));
  }

  @Test(timeout = 4000)
  public void test250()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(3360.14);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test251()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver(4727.849602256678);
      // Undeclared exception!
      newtonSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test252()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-15.452141055956064), (-15.452141055956064));
        secantSolver0.computeObjectiveValue((-15.452141055956064));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test253()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test254()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
      riddersSolver0.getEvaluations();
      SincFunction sincFunction0 = new SincFunction();
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) sincFunction0, (double) 0);
  }

  @Test(timeout = 4000)
  public void test255()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1512.491);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test256()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver();
        brentSolver0.computeObjectiveValue(634);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test257()  throws Throwable  {
      XMinus5Function xMinus5Function0 = new XMinus5Function();
      MullerSolver2 mullerSolver2_0 = new MullerSolver2(1663, 0.0);
      // Undeclared exception!
      mullerSolver2_0.solve(1663, (UnivariateFunction) xMinus5Function0, 0.0);
  }

  @Test(timeout = 4000)
  public void test258()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver();
      // Undeclared exception!
      secantSolver0.doSolve();
  }

  @Test(timeout = 4000)
  public void test259()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue((-1.0));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test260()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(0.0);
        bisectionSolver0.computeObjectiveValue(0.0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test261()  throws Throwable  {
      double double0 = BaseSecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      QuinticFunction quinticFunction0 = new QuinticFunction();
      BisectionSolver bisectionSolver0 = new BisectionSolver();
      // Undeclared exception!
      bisectionSolver0.solve(0, (UnivariateFunction) quinticFunction0, 1.0E-6);
  }

  @Test(timeout = 4000)
  public void test262()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      SecantSolver secantSolver0 = new SecantSolver();
        secantSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test263()  throws Throwable  {
      SecantSolver secantSolver0 = new SecantSolver((-1.7361642105484405));
        secantSolver0.computeObjectiveValue((-1.7361642105484405));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test264()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(1386.3925347801);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test265()  throws Throwable  {
      RiddersSolver riddersSolver0 = new RiddersSolver();
        riddersSolver0.computeObjectiveValue(1184.87656);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test266()  throws Throwable  {
      LaguerreSolver laguerreSolver0 = new LaguerreSolver();
        laguerreSolver0.computeObjectiveValue(1444);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test267()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-551.0146396460437));
        brentSolver0.computeObjectiveValue((-551.0146396460437));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test268()  throws Throwable  {
      BisectionSolver bisectionSolver0 = new BisectionSolver(0, 0);
        bisectionSolver0.computeObjectiveValue(0);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test269()  throws Throwable  {
      MullerSolver mullerSolver0 = new MullerSolver((-291.4167825), (-291.4167825));
        mullerSolver0.computeObjectiveValue((-291.4167825));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test270()  throws Throwable  {
      double double0 = SecantSolver.DEFAULT_ABSOLUTE_ACCURACY;
      BisectionSolver bisectionSolver0 = new BisectionSolver();
        bisectionSolver0.computeObjectiveValue(1.0E-6);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test271()  throws Throwable  {
      NewtonSolver newtonSolver0 = new NewtonSolver();
        newtonSolver0.computeObjectiveValue(Double.NaN);
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test272()  throws Throwable  {
      BrentSolver brentSolver0 = new BrentSolver((-0.8183790948187798), (-0.8183790948187798));
        brentSolver0.computeObjectiveValue((-0.8183790948187798));
      
         //
         // illegal state: maximal count (0) exceeded: evaluations
         //
  }

  @Test(timeout = 4000)
  public void test273()  throws Throwable  {
      BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
      SincFunction sincFunction0 = new SincFunction();
      // Undeclared exception!
      bracketingNthOrderBrentSolver0.solve(0, (UnivariateFunction) sincFunction0, 1463.6164034688836, Double.NaN);
  }
}
