/*

 * Tue Mar 03 12:03:02 UTC 2020
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;

public class DateTimeFormatter_ESTest_Botsing extends DateTimeFormatter_ESTest_scaffolding_Botsing {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("1kfehBP=:^-4/|Xh-").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("1kfehBP=:^-4/|Xh-");
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("@]t`o");
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, (-1744)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Printing not supported");
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 670, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      // Undeclared exception!
      DateTime.parse("Paring Xno suppored");
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      // Undeclared exception!
      DateTime.parse("Pr{ing Xno s[ppored");
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("#U;b8").when(dateTimeParser0).toString();
      doReturn((-74)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("#U;b8");
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Printing not supported").when(dateTimeParser0).toString();
      doReturn((-50)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Printing not supported");
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("rknmz8&nV//N").when(dateTimeParser0).toString();
      doReturn((-366)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("rknmz8&nV//N");
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("]||");
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("~`%mxPo`,T\"VWIA_").when(dateTimeParser0).toString();
      doReturn((-4925)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("~`%mxPo`,T\"VWIA_");
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 87, 87, (-562)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      dateTimeFormatter0.parseMutableDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("/#@KCl?F}MaL ").when(dateTimeParser0).toString();
      doReturn((-4925)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("/#@KCl?F}MaL ");
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 174, 174);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("yEP8(LB6&)");
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("f>+iHkl\"S<");
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-4925)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("v0jf-zN7");
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 174, 174);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("yEP(LB6&)");
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("bOb |#/M$n").when(dateTimeParser0).toString();
      doReturn((-2002)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("bOb |#/M$n");
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 3, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("-ix");
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("]z(Pi").when(dateTimeParser0).toString();
      doReturn(7).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Printing not supported");
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Range duration field must be precise");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-2986)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 23).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DurationFieldType$StandardDurationFieldType");
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("**:-~.S").when(dateTimeParser0).toString();
      doReturn((-1115)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("**:-~.S");
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("1vhBP=:^-4/|Xh-").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("1vhBP=:^-4/|Xh-");
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("5Z`?").when(dateTimeParser0).toString();
      doReturn((-10)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("5Z`?");
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("z<\"");
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("]-u;qN4");
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("V$`7W,K").when(dateTimeParser0).toString();
      doReturn(4).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      MutableDateTime.parse("V$`7W,K", dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 17, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(";C2b!r").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime(";C2b!r");
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(83, 83, 83, (-70)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      dateTimeFormatter0.parseMutableDateTime("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral((String) null);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-1), false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("g").when(dateTimeParser0).toString();
      doReturn((-771)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("g");
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("H c<#:");
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("A&");
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.DateMidnight$Property").when(dateTimeParser0).toString();
      doReturn((-3295)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      DateTime.parse("org.joda.time.DateMidnight$Property", dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("ELmP&x(kT0/P|-]T6V");
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("'");
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MonthDay monthDay0 = MonthDay.now();
      Partial partial0 = new Partial(monthDay0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("aMW;RG$&u]h");
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Partial partial0 = new Partial(localTime0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Bg_7%EV'");
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("G/Ycy");
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Parsing not supported").when(dateTimeParser0).toString();
      doReturn((-1996)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Parsing not supported");
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("D3gwedJ").when(dateTimeParser0).toString();
      doReturn((-1741)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("D3gwedJ");
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-1815)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn((-752)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("]||");
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(3).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("below the supported minimum of ");
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.convert.NullConverter").when(dateTimeParser0).toString();
      doReturn(24).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.convert.NullConverter");
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Os56eZ8Ws");
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\"G#~IfyMpp2").when(dateTimeParser0).toString();
      doReturn((-417)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("\"G#~IfyMpp2");
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 19).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.TestAbstractPartial");
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("r_GCRjNHvUI`").when(dateTimeParser0).toString();
      doReturn((-4925)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("r_GCRjNHvUI`");
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("yEP(LB6&)");
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfDay();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, 174, 174);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("yEP(LB6&)");
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfHour();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TextField0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("a`q");
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('t');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_CharacterLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Parsing not supported");
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("bOb |#/M$n").when(dateTimeParser0).toString();
      doReturn((-2024)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("bOb |#/M$n");
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(":`,d").when(dateTimeParser0).toString();
      doReturn((-103)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime(":`,d");
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("\"EyU_p]moD");
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.UnpaddedNumber dateTimeFormatterBuilder_UnpaddedNumber0 = new DateTimeFormatterBuilder.UnpaddedNumber((DateTimeFieldType) null, 84, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_UnpaddedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("GIO--z)aA}Ky@lfq");
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("O");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Printing not supported");
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 19).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DurationFieldType$StandardDurationFieldType");
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-1)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("M?,lu(");
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("KS#/QH\"jU").when(dateTimeParser0).toString();
      doReturn((-4268)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("KS#/QH\"jU");
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("#<Ew*[r>");
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("GMT+").when(dateTimeParser0).toString();
      doReturn((-1510)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("GMT+");
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_TimeZoneId0, dateTimeFormatterBuilder_TimeZoneId0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimePrinter0).toString();
      doReturn(1410).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-731)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.print((ReadableInstant) null);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("]z(Pi").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("]z(Pi");
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("-alm").when(dateTimeParser0).toString();
      doReturn((-4925)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("-alm");
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("(zece#n9lKDmaOv");
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 87, 87, (-851)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      dateTimeFormatter0.parseMutableDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-420), false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("UvAagI_~_K@G");
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-3207)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      // Undeclared exception!
      DateTime.parse("aing Xno suppored");
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("gRI3Xu\u0001Vx<4?Z0@Der").when(dateTimeParser0).toString();
      doReturn(8).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("gRI3Xu\u0001Vx<4?Z0@Der");
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 691, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Ra:q;7;#|8.J");
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.DateMidnight$Property").when(dateTimeParser0).toString();
      doReturn((-1991)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DateMidnight$Property");
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.chrono.LenientChronology").when(dateTimeParser0).toString();
      doReturn(1).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.chrono.LenientChronology");
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(dateTimePrinter0).toString();
      doReturn(0).when(dateTimePrinter0).estimatePrintedLength();
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("[~4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      dateTimeFormatter0.print((ReadableInstant) null);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeFormatterBuilder.Fraction dateTimeFormatterBuilder_Fraction0 = new DateTimeFormatterBuilder.Fraction(dateTimeFieldType0, (-1013), (-1013));
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Fraction0, dateTimeFormatterBuilder_Fraction0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("-ix");
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn((-1)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("A&");
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("C]0&%ZEx>0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.base.BaseDuration");
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("84Ad| 8b").when(dateTimeParser0).toString();
      doReturn((-1)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("84Ad| 8b");
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.year();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 18, true, 18);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_PaddedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("(,");
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("below the supported minimum of ");
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.DateMidnight$Property").when(dateTimeParser0).toString();
      doReturn((-3260)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DateMidnight$Property");
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("The partial must not be null").when(dateTimeParser0).toString();
      doReturn((-58)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("The partial must not be null");
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(87, 87, 19).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Partial must not be null");
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 3, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("-ix");
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-3681)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      LocalTime localTime0 = LocalTime.MIDNIGHT;
      Partial partial0 = new Partial(localTime0);
      DateTimeFormatter dateTimeFormatter0 = partial0.getFormatter();
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("--MM-dd").when(dateTimeParser0).toString();
      doReturn((-1887)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("--MM-dd");
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("XK\"").when(dateTimeParser0).toString();
      doReturn(2).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("XK\"");
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("(%x").when(dateTimeParser0).toString();
      doReturn((-70)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("(%x");
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("Instant must not be null").when(dateTimeParser0).toString();
      doReturn((-8105)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Instant must not be null");
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("9rxJqzug<;z:>D").when(dateTimeParser0).toString();
      doReturn((-1)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("9rxJqzug<;z:>D");
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Range duration field must be precise");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("org.joda.time.DateMidnight$Property").when(dateTimeParser0).toString();
      doReturn((-3318)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DateMidnight$Property");
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(2).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("SM<nVxWvX%N>s");
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("", "").when(dateTimeParser0).toString();
      doReturn(2, (-3971)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseMutableDateTime("");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("C]0&%ZEx>0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Africa/Harare");
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn(17).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Parsing not supported");
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("u4R99VD,V#}?gk~6V").when(dateTimeParser0).toString();
      doReturn((-50)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("u4R99VD,V#}?gk~6V");
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-723)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("[~4");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime(".Kh@/E<Hgu");
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("1vhB$=:^-4/aXh-").when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("1vhB$=:^-4/aXh-");
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("[z{ITRV-(S?x|v (hG").when(dateTimeParser0).toString();
      doReturn((-65)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("[z{ITRV-(S?x|v (hG");
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("R3").when(dateTimeParser0).toString();
      doReturn(5).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.YearMonth");
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      // Undeclared exception!
      DateTime.parse("");
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName((-1879), hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneName0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("DurationField[millis]");
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("v0jf-zN7");
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("myc mv[G~*W] ").when(dateTimeParser0).toString();
      doReturn((-2333)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("myc mv[G~*W] ");
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 670, true);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter((DateTimePrinter) null, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime(".Kh@/E<Hgu");
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dateTimeParser0).toString();
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("<Zp");
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("\".cz-uKVMS'w~,,z|").when(dateTimeParser0).toString();
      doReturn((-1458)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("\".cz-uKVMS'w~,,z|");
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("6fu!");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_StringLiteral0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&%ZEx>0", "C]0&%ZEx>0", "C]0&%ZEx>0").when(dateTimeParser0).toString();
      doReturn(95, 95, 48).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&%ZEx>0");
      dateTimeFormatter0.parseMillis("C]0&%ZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DurationFieldType$StandardDuqationFieldType");
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Range duration field must be precise");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("The partial must not be null");
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("C]0&xZEx>0", "C]0&xZEx>0", "C]0&xZEx>0").when(dateTimeParser0).toString();
      doReturn(95, 95, 48).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      dateTimeFormatter0.parseLocalDateTime("C]0&xZEx>0");
      dateTimeFormatter0.parseMillis("C]0&xZEx>0");
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("org.joda.time.DurationFieldType$StandardDuqationFieldType");
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      // Undeclared exception!
      MutableDateTime.parse("C]0&%ZEx>0");
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("org.joda.time.DateMidnight$Property");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime(".Kh@/E<Hgu");
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      DateTimeFormatterBuilder.CharacterLiteral dateTimeFormatterBuilder_CharacterLiteral0 = new DateTimeFormatterBuilder.CharacterLiteral('e');
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_CharacterLiteral0, dateTimeFormatterBuilder_CharacterLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("Ra:q;7S;#|8J");
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("1vhBP=:^-4/|Xh-");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("f");
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      HashMap<String, DateTimeZone> hashMap0 = new HashMap<String, DateTimeZone>();
      DateTimeFormatterBuilder.TimeZoneName dateTimeFormatterBuilder_TimeZoneName0 = new DateTimeFormatterBuilder.TimeZoneName((-1879), hashMap0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TimeZoneName0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("lhr[");
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      // Undeclared exception!
      DateTime.parse(":X72v");
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("Range duration field must be precise");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("'");
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("uUgR/1c").when(dateTimeParser0).toString();
      doReturn((-451)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("uUgR/1c");
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("C]0&%ZEx>0");
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_StringLiteral0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("'");
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfEra();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 532, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_FixedNumber0, dateTimeFormatterBuilder_FixedNumber0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeFormatterBuilder_TextField0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("AgkC!V*:n[fqnt*%<");
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn("").when(dateTimeParser0).toString();
      doReturn((-2457)).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      // Undeclared exception!
      dateTimeFormatter0.parseDateTime("");
  }
}
