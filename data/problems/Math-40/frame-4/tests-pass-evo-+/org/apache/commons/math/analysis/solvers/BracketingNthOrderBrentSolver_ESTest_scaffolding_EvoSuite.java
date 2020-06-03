/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Feb 24 16:38:10 GMT 2020
 */
package org.apache.commons.math.analysis.solvers;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
@EvoSuiteClassExclude
public class BracketingNthOrderBrentSolver_ESTest_scaffolding_EvoSuite {
  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();
  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
  } 
  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 
  @Before 
  public void initTestCase(){ 
    setSystemProperties(); 
  } 
  @After 
  public void doneWithTestCase(){ 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
  } 
  public static void setSystemProperties() {
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Etc/UTC"); 
  }
  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BracketingNthOrderBrentSolver_ESTest_scaffolding_EvoSuite.class.getClassLoader() ,
      "org.apache.commons.math.analysis.function.Log10$1",
      "org.apache.commons.math.analysis.function.Asinh",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.analysis.function.Constant",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.analysis.function.Logistic$1",
      "org.apache.commons.math.analysis.function.Cbrt$1",
      "org.apache.commons.math.analysis.function.Logit$1",
      "org.apache.commons.math.analysis.function.Ceil",
      "org.apache.commons.math.analysis.function.HarmonicOscillator$1",
      "org.apache.commons.math.util.Precision",
      "org.apache.commons.math.analysis.function.Asin$1",
      "org.apache.commons.math.analysis.function.Sigmoid$1",
      "org.apache.commons.math.analysis.function.Log",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.analysis.function.Tanh",
      "org.apache.commons.math.analysis.function.Cbrt",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver",
      "org.apache.commons.math.util.FastMath$ExpIntTable",
      "org.apache.commons.math.analysis.function.Asin",
      "org.apache.commons.math.analysis.function.Acos$1",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.analysis.function.Power",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.analysis.function.Expm1$1",
      "org.apache.commons.math.analysis.solvers.AllowedSolution",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.analysis.function.Atanh",
      "org.apache.commons.math.util.MathArrays$2",
      "org.apache.commons.math.analysis.function.Exp",
      "org.apache.commons.math.analysis.function.Rint",
      "org.apache.commons.math.util.MathArrays$1",
      "org.apache.commons.math.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.util.MathArrays",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.analysis.function.StepFunction",
      "org.apache.commons.math.analysis.function.Log10",
      "org.apache.commons.math.analysis.function.Gaussian$1",
      "org.apache.commons.math.analysis.function.Identity",
      "org.apache.commons.math.analysis.function.Sinc$1",
      "org.apache.commons.math.analysis.function.Sinc$2",
      "org.apache.commons.math.exception.NoBracketingException",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.analysis.function.Sqrt",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.analysis.function.Atan$1",
      "org.apache.commons.math.analysis.function.Inverse",
      "org.apache.commons.math.analysis.function.Tan$1",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils",
      "org.apache.commons.math.analysis.function.Sinc",
      "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver$1",
      "org.apache.commons.math.analysis.function.Sinh",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolver",
      "org.apache.commons.math.exception.NonMonotonicSequenceException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.analysis.function.Logit",
      "org.apache.commons.math.analysis.function.Gaussian",
      "org.apache.commons.math.analysis.function.Acos",
      "org.apache.commons.math.analysis.function.Sin",
      "org.apache.commons.math.analysis.function.Minus",
      "org.apache.commons.math.analysis.function.Log1p",
      "org.apache.commons.math.util.Pair",
      "org.apache.commons.math.analysis.function.Power$1",
      "org.apache.commons.math.analysis.function.Acosh$1",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.analysis.function.Signum",
      "org.apache.commons.math.analysis.function.Sqrt$1",
      "org.apache.commons.math.analysis.function.Asinh$1",
      "org.apache.commons.math.analysis.function.Inverse$1",
      "org.apache.commons.math.analysis.function.Ulp",
      "org.apache.commons.math.analysis.function.Log1p$1",
      "org.apache.commons.math.analysis.function.Exp$1",
      "org.apache.commons.math.analysis.function.Cosh",
      "org.apache.commons.math.analysis.function.Tan",
      "org.apache.commons.math.analysis.function.Atanh$1",
      "org.apache.commons.math.analysis.function.Logistic",
      "org.apache.commons.math.analysis.function.Sigmoid",
      "org.apache.commons.math.analysis.UnivariateFunction",
      "org.apache.commons.math.analysis.function.Acosh",
      "org.apache.commons.math.analysis.function.HarmonicOscillator",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.exception.MathInternalError",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.util.MathArrays$OrderDirection",
      "org.apache.commons.math.analysis.function.Floor",
      "org.apache.commons.math.analysis.function.Tanh$1",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.analysis.function.Atan",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.analysis.function.Cos",
      "org.apache.commons.math.analysis.function.Expm1",
      "org.apache.commons.math.analysis.function.Abs",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.analysis.function.Log$1",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.util.FastMath$ExpFracTable",
      "org.apache.commons.math.analysis.function.Cos$1"
    );
  } 
  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BracketingNthOrderBrentSolver_ESTest_scaffolding_EvoSuite.class.getClassLoader()); 
    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver",
      "org.apache.commons.math.analysis.solvers.AllowedSolution",
      "org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver$1",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.analysis.function.Log10",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.analysis.function.Expm1",
      "org.apache.commons.math.analysis.function.Expm1$1",
      "org.apache.commons.math.analysis.function.Tanh",
      "org.apache.commons.math.analysis.function.Tanh$1",
      "org.apache.commons.math.analysis.function.Minus",
      "org.apache.commons.math.util.Precision",
      "org.apache.commons.math.analysis.function.Sinc",
      "org.apache.commons.math.analysis.function.Sinc$1",
      "org.apache.commons.math.analysis.function.Log1p",
      "org.apache.commons.math.analysis.function.Log1p$1",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.analysis.function.Log10$1",
      "org.apache.commons.math.exception.NoBracketingException",
      "org.apache.commons.math.analysis.function.Gaussian",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.analysis.function.StepFunction",
      "org.apache.commons.math.util.MathArrays",
      "org.apache.commons.math.util.MathArrays$OrderDirection",
      "org.apache.commons.math.util.MathArrays$2",
      "org.apache.commons.math.exception.NonMonotonicSequenceException",
      "org.apache.commons.math.analysis.function.Tan",
      "org.apache.commons.math.analysis.function.Tan$1",
      "org.apache.commons.math.analysis.function.Exp",
      "org.apache.commons.math.analysis.function.Exp$1",
      "org.apache.commons.math.util.FastMath$ExpIntTable",
      "org.apache.commons.math.util.FastMath$ExpFracTable",
      "org.apache.commons.math.analysis.function.Inverse",
      "org.apache.commons.math.analysis.function.Inverse$1",
      "org.apache.commons.math.analysis.function.Atan",
      "org.apache.commons.math.analysis.function.Atan$1",
      "org.apache.commons.math.analysis.function.Identity",
      "org.apache.commons.math.analysis.function.Abs",
      "org.apache.commons.math.analysis.function.Constant",
      "org.apache.commons.math.analysis.function.Atanh",
      "org.apache.commons.math.analysis.function.Logit",
      "org.apache.commons.math.analysis.function.Logit$1",
      "org.apache.commons.math.analysis.function.Ceil",
      "org.apache.commons.math.analysis.function.Atanh$1",
      "org.apache.commons.math.analysis.function.Signum",
      "org.apache.commons.math.analysis.function.Logistic",
      "org.apache.commons.math.analysis.function.Logistic$1",
      "org.apache.commons.math.analysis.function.Asinh",
      "org.apache.commons.math.analysis.function.Gaussian$1",
      "org.apache.commons.math.analysis.function.Sigmoid",
      "org.apache.commons.math.analysis.function.Sqrt",
      "org.apache.commons.math.analysis.function.Sqrt$1",
      "org.apache.commons.math.analysis.function.Ulp",
      "org.apache.commons.math.analysis.function.Rint",
      "org.apache.commons.math.analysis.function.Cos",
      "org.apache.commons.math.analysis.function.Cos$1",
      "org.apache.commons.math.analysis.function.Cbrt",
      "org.apache.commons.math.analysis.function.Cbrt$1",
      "org.apache.commons.math.analysis.function.Floor",
      "org.apache.commons.math.analysis.function.Acos",
      "org.apache.commons.math.analysis.function.Acos$1",
      "org.apache.commons.math.analysis.function.Sin",
      "org.apache.commons.math.analysis.function.Sinc$2",
      "org.apache.commons.math.analysis.function.Log",
      "org.apache.commons.math.analysis.function.Asin",
      "org.apache.commons.math.analysis.function.Asin$1",
      "org.apache.commons.math.analysis.function.Cosh",
      "org.apache.commons.math.analysis.function.Sinh",
      "org.apache.commons.math.analysis.function.Log$1",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.analysis.function.Sigmoid$1",
      "org.apache.commons.math.analysis.function.Power",
      "org.apache.commons.math.analysis.function.Power$1",
      "org.apache.commons.math.analysis.function.HarmonicOscillator",
      "org.apache.commons.math.analysis.function.HarmonicOscillator$1",
      "org.apache.commons.math.analysis.function.Asinh$1",
      "org.apache.commons.math.analysis.function.Acosh",
      "org.apache.commons.math.analysis.function.Acosh$1",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.util.Pair",
      "org.apache.commons.math.util.MathArrays$1"
    );
  }
}
