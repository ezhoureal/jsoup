/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 22:04:02 GMT 2021
 */

package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cleaner_ESTest extends Cleaner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner(whitelist0);
      cleaner0.isValidBodyHtml(".");
      Document document0 = Parser.parseBodyFragment(".", ".");
      // Undeclared exception!
      try { 
        cleaner0.isValid(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.safety.Safelist", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Safelist safelist0 = Safelist.relaxed();
      Cleaner cleaner0 = new Cleaner(safelist0);
      boolean boolean0 = cleaner0.isValidBodyHtml("<");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner((Safelist) whitelist0);
      boolean boolean0 = cleaner0.isValidBodyHtml("<fwd$jmeS>1");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Document document0 = new Document("");
      document0.title("TfTI::8vQCdXX8gL8y");
      boolean boolean0 = cleaner0.isValid(document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Safelist safelist0 = Safelist.none();
      Cleaner cleaner0 = new Cleaner(safelist0);
      Document document0 = Document.createShell("org.jsoup.safety.Cleaner$CleaningVisitor");
      boolean boolean0 = cleaner0.isValid(document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, true, false).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Document document0 = Parser.parse("<fwd$jmeS>1", "<fwd$jmeS>1");
      boolean boolean0 = cleaner0.isValid(document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Safelist safelist0 = Safelist.none();
      Cleaner cleaner0 = new Cleaner(safelist0);
      Document document0 = Document.createShell("org.jsoup.safety.Cleaner$CleaningVisitor");
      Document document1 = cleaner0.clean(document0);
      assertNotSame(document1, document0);
  }
}
