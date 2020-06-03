/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 10:06:51 UTC 2020
 */
package org.apache.commons.math.analysis.solvers;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
@EvoSuiteClassExclude
public class BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
  } 
  @Before 
  public void initTestCase(){ 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.solvers.LaguerreSolver",
      "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math.analysis.solvers.RiddersSolver",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BisectionSolver",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.analysis.solvers.IllinoisSolver",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.analysis.SinFunction",
      "org.apache.commons.math.analysis.solvers.BaseSecantSolver$1",
      "org.apache.commons.math.analysis.solvers.RegulaFalsiSolver",
      "org.apache.commons.math.analysis.solvers.MullerSolver2",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.AbstractDifferentiableUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.PegasusSolver",
      "org.apache.commons.math.analysis.solvers.PolynomialSolver",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.MullerSolver",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math.analysis.solvers.LaguerreSolver$ComplexSolver",
      "org.apache.commons.math.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math.analysis.solvers.SecantSolver",
      "org.apache.commons.math.analysis.solvers.DifferentiableUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BaseSecantSolver$Method",
      "org.apache.commons.math.analysis.UnivariateFunction",
      "org.apache.commons.math.analysis.solvers.AllowedSolution",
      "org.apache.commons.math.exception.ConvergenceException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.MathInternalError",
      "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.analysis.Expm1Function",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.analysis.solvers.BrentSolver",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.analysis.MonitoredFunction",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.analysis.QuinticFunction",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.analysis.SincFunction$1",
      "org.apache.commons.math.analysis.solvers.AbstractPolynomialSolver",
      "org.apache.commons.math.analysis.solvers.NewtonSolver",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.analysis.XMinus5Function",
      "org.apache.commons.math.exception.NoBracketingException",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BaseAbstractUnivariateRealSolver_ESTest_scaffolding_Botsing.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.analysis.SincFunction",
      "org.apache.commons.math.analysis.solvers.LaguerreSolver",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.analysis.solvers.MullerSolver",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.analysis.solvers.MullerSolver2",
      "org.apache.commons.math.analysis.solvers.SecantSolver",
      "org.apache.commons.math.analysis.solvers.BrentSolver",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.analysis.solvers.RiddersSolver",
      "org.apache.commons.math.analysis.solvers.BaseSecantSolver",
      "org.apache.commons.math.analysis.solvers.NewtonSolver"
    );
  }
}
