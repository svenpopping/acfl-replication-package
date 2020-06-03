/*

 * Tue Mar 03 11:42:59 UTC 2020
 */

package org.apache.commons.math.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.commons.math.stat.Frequency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class Frequency_ESTest_Botsing extends Frequency_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      Integer integer0 = new Integer('j');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(' ');
      // Undeclared exception!
      frequency0.addValue((int) ' ');
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
      // Undeclared exception!
      frequency0.addValue((-17));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((int) 'S');
      // Undeclared exception!
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('^');
      Integer integer0 = new Integer('^');
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('5');
      Integer integer0 = new Integer('5');
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((int) 'w');
      // Undeclared exception!
      frequency0.addValue('w');
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1228);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('i');
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('5');
      Long long0 = new Long('5');
      // Undeclared exception!
      frequency0.addValue((Object) long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((int) 'f');
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('O');
      // Undeclared exception!
      frequency0.addValue((int) 'O');
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "");
      Integer integer0 = new Integer((-1566));
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('k');
      // Undeclared exception!
      frequency0.addValue((int) 'k');
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1228);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('\u009A');
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((-1566));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long(1188);
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue('\'');
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      frequency0.getCumFreq((Object) iterator0);
      frequency0.addValue(0L);
      frequency0.toString();
      // Undeclared exception!
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n");
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      frequency0.toString();
      frequency0.getCount(object0);
      frequency0.addValue(0L);
      // Undeclared exception!
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((-34));
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "Et?EE");
      // Undeclared exception!
      frequency0.addValue('H');
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 3048);
      // Undeclared exception!
      frequency0.addValue((Object) "YPkBRKY2&F");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer.remainderUnsigned('C', 'C');
      frequency0.addValue('C');
      // Undeclared exception!
      frequency0.addValue((long) 0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.getSumFreq();
      frequency0.addValue(0L);
      // Undeclared exception!
      frequency0.addValue('_');
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long(1733L);
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue(':');
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((-1575));
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-47));
      frequency0.addValue('m');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency0.addValue((Object) comparator0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1228);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('\u0087');
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(0);
      // Undeclared exception!
      frequency0.addValue((Object) "&P#J8JR]^x");
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1L));
      // Undeclared exception!
      frequency0.addValue((Object) "");
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(']');
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-1345));
      // Undeclared exception!
      frequency0.addValue('\"');
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('/');
      // Undeclared exception!
      frequency0.addValue((Object) "3");
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Long long0 = new Long('<');
      // Undeclared exception!
      frequency0.addValue((Object) long0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((-17));
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('v');
      // Undeclared exception!
      frequency0.addValue((int) 'v');
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1498);
      // Undeclared exception!
      frequency0.addValue('X');
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.getCumFreq(' ');
      Long long0 = new Long(0L);
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue(' ');
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.getCount('+');
      Long long0 = Long.getLong("Dv?=!P", 0L);
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue((Object) "Dv?=!P");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1));
      // Undeclared exception!
      frequency0.addValue('\"');
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((Object) "");
      // Undeclared exception!
      frequency0.addValue((int) 'T');
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1228);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('u');
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('u');
      // Undeclared exception!
      frequency0.addValue((-17));
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1));
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('Y');
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Object object0 = new Object();
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-1968));
      frequency0.addValue((Object) integer0);
      // Undeclared exception!
      frequency0.addValue('1');
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-798));
      frequency0.addValue('N');
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\\');
      // Undeclared exception!
      frequency0.addValue((int) '\\');
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Iterator iterator0 = frequency0.valuesIterator();
      // Undeclared exception!
      frequency0.addValue((Object) iterator0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      // Undeclared exception!
      frequency0.addValue((int) '_');
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((int) '%');
      // Undeclared exception!
      frequency0.addValue('%');
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer(1228);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('u');
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\'');
      // Undeclared exception!
      frequency0.addValue((long) 1610612736);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long((-12L));
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue('3');
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('u');
      // Undeclared exception!
      frequency0.addValue((int) 'u');
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer('\\');
      frequency0.addValue('\\');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue((Object) comparator0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Integer integer0 = new Integer((-1674));
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue((Object) "0}");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('@');
      // Undeclared exception!
      frequency0.addValue((long) '@');
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long(' ');
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue(' ');
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long.compare(':', ':');
      frequency0.addValue(':');
      // Undeclared exception!
      frequency0.addValue(0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency0.addValue((Object) comparator0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('>');
      // Undeclared exception!
      frequency0.addValue((long) '>');
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      // Undeclared exception!
      frequency0.addValue((int) '<');
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-88));
      // Undeclared exception!
      frequency0.addValue('B');
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long((-1));
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue(';');
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = Integer.valueOf(1229);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('u');
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('S');
      // Undeclared exception!
      frequency0.addValue((int) 'S');
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer((-106));
      frequency0.addValue((Object) integer0);
      // Undeclared exception!
      frequency0.addValue('#');
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-5212L));
      // Undeclared exception!
      frequency0.addValue(';');
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 1446);
      // Undeclared exception!
      frequency0.addValue('s');
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\u0018');
      // Undeclared exception!
      frequency0.addValue((long) 167);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('#');
      // Undeclared exception!
      frequency0.addValue((int) '#');
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer('t');
      frequency0.addValue((Object) integer0);
      // Undeclared exception!
      frequency0.addValue('t');
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Long long0 = new Long((-2280L));
      frequency0.addValue((Object) long0);
      // Undeclared exception!
      frequency0.addValue((Object) "");
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\u009A');
      // Undeclared exception!
      frequency0.addValue((int) '\u009A');
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('\u0016');
      // Undeclared exception!
      frequency0.addValue((Object) "H$+BZ#o0a,LW:gU");
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.getSumFreq();
      frequency0.addValue('C');
      // Undeclared exception!
      frequency0.addValue(0L);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(2L);
      // Undeclared exception!
      frequency0.addValue('F');
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      frequency0.addValue((-1152));
      // Undeclared exception!
      frequency0.addValue((Object) "&.Tkd1");
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('a');
      Integer integer0 = new Integer('a');
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency(comparator0);
      Frequency frequency1 = new Frequency();
      // Undeclared exception!
      frequency1.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('f');
      // Undeclared exception!
      frequency0.addValue((-1));
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('e');
      Long long0 = new Long('e');
      // Undeclared exception!
      frequency0.addValue((Object) long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-1386));
      // Undeclared exception!
      frequency0.addValue('\\');
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-835));
      // Undeclared exception!
      frequency0.addValue('K');
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Integer integer0 = new Integer('<');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('_');
      // Undeclared exception!
      frequency0.addValue((long) '_');
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('j');
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('>');
      // Undeclared exception!
      frequency0.addValue((Object) "3");
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(']');
      Integer integer0 = new Integer(']');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      Integer integer0 = new Integer('<');
      // Undeclared exception!
      frequency0.addValue(integer0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('y');
      // Undeclared exception!
      frequency0.addValue((-4));
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((int) 's');
      // Undeclared exception!
      frequency0.addValue('s');
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      // Undeclared exception!
      frequency0.addValue((Object) frequency0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) 2073);
      // Undeclared exception!
      frequency0.addValue('P');
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(69);
      // Undeclared exception!
      frequency0.addValue('c');
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      Frequency frequency0 = new Frequency((Comparator) null);
      Object object0 = new Object();
      // Undeclared exception!
      frequency0.addValue(object0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('b');
      Integer integer0 = new Integer('b');
      // Undeclared exception!
      frequency0.addValue((Object) integer0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.toString();
      frequency0.addValue((Object) "Value \t Freq. \t Pct. \t Cum Pct. \n");
      // Undeclared exception!
      frequency0.addValue('3');
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer.compare((-1411), (-1411));
      Integer integer0 = new Integer(0);
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('l');
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue(1);
      // Undeclared exception!
      frequency0.addValue((Object) "&P#J8JR]^x");
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue('0');
      // Undeclared exception!
      frequency0.addValue((int) '0');
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer integer0 = new Integer('.');
      frequency0.addValue(integer0);
      // Undeclared exception!
      frequency0.addValue('.');
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((long) (-351));
      // Undeclared exception!
      frequency0.addValue('5');
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-2472));
      // Undeclared exception!
      frequency0.addValue(',');
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      Integer.remainderUnsigned('0', '0');
      frequency0.addValue('0');
      // Undeclared exception!
      frequency0.addValue(0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      Comparator<Long> comparator0 = (Comparator<Long>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue((Object) comparator0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      Frequency frequency0 = new Frequency();
      // Undeclared exception!
      frequency0.addValue((Object) comparator0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      Frequency frequency0 = new Frequency();
      frequency0.addValue((-3474L));
      // Undeclared exception!
      frequency0.addValue('T');
  }
}
