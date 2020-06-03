/*

 * Tue Mar 03 10:02:25 UTC 2020
 */

package org.apache.commons.math3.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigInteger;
import org.apache.commons.math3.fraction.BigFraction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

public class BigFraction_ESTest_Botsing extends BigFraction_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BigFraction bigFraction0 = new BigFraction(1.8847384452819824, (-834));
      BigInteger bigInteger0 = BigInteger.TEN;
      BigFraction bigFraction1 = bigFraction0.pow(bigInteger0);
      bigFraction1.floatValue();
      bigFraction0.intValue();
      BigFraction bigFraction2 = bigFraction1.subtract(bigInteger0);
      BigFraction.getReducedFraction(1, (-1036));
      BigFraction bigFraction3 = new BigFraction(2199);
      bigFraction3.divide((-457));
      bigFraction2.getDenominatorAsLong();
      bigFraction1.floatValue();
      BigFraction bigFraction4 = bigFraction2.multiply(bigFraction0);
      bigFraction1.reduce();
      bigFraction0.getNumeratorAsInt();
      BigFraction bigFraction5 = new BigFraction(bigInteger0);
      bigFraction4.longValue();
      BigFraction bigFraction6 = new BigFraction((-1.0), (-2046));
  }
}
