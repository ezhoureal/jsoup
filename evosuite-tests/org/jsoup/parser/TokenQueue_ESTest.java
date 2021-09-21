/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 22:23:56 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.TokenQueue;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokenQueue_ESTest extends TokenQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("_");
      tokenQueue0.consumeAttributeKey();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("sxg");
      tokenQueue0.consumeAttributeKey();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("t{6");
      tokenQueue0.consumeCssIdentifier();
      assertEquals("{6", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      Character character0 = Character.valueOf('F');
      tokenQueue0.addFirst(character0);
      assertEquals("F", tokenQueue0.toString());
      
      String string0 = tokenQueue0.consumeCssIdentifier();
      assertEquals("F", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("^[a-zA-Z][a-zA-Z0-9+-.]*:");
      tokenQueue0.consumeToIgnoreCase("d(");
      tokenQueue0.consumeTagName();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Queue not long enough to consume sequence");
      tokenQueue0.consumeWord();
      assertEquals(' ', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("             ");
      boolean boolean0 = tokenQueue0.consumeWhitespace();
      assertEquals("", tokenQueue0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = TokenQueue.unescape(",6<uP)R=Ly\\!.fv");
      assertEquals(",6<uP)R=Ly!.fv", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("CE=");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('C', 'C');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'E='
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("hM&9=lp");
      tokenQueue0.addFirst("         ");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced(' ', 'h');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '        hM&9=lp'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("|SDHZ745\"k6^)\"y3,");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('|', '|');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'SDHZ745\"k6^)\"y3,'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("=Q'y^A</}+E\"@");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('=', '=');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'Q'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not find balanced marker at '");
      Character character0 = Character.valueOf('\"');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\"', '\"');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'Did not find balanced marker at '
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not fin> balanc'd marker at '");
      Character character0 = Character.valueOf('9');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('9', '9');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'Did not fin> balanc'd marker at ''
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("9h:o1N\"p~G6'<");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('9', '9');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'h:o1N'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("'$CCP");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\'', '\'');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '$CCP'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("t<_j<U['FLv");
      tokenQueue0.consumeTagName();
      tokenQueue0.chompBalanced('_', '_');
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('_', '0');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'j<U['
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("OUDx@7^Vw*cLQBEDcV");
      String[] stringArray0 = new String[3];
      tokenQueue0.advance();
      assertEquals('U', tokenQueue0.peek());
      
      stringArray0[0] = "OUDx@7^Vw*cLQBEDcV";
      stringArray0[1] = "OUDx@7^Vw*cLQBEDcV";
      stringArray0[2] = "OUDx@7^Vw*cLQBEDcV";
      tokenQueue0.consumeToAny(stringArray0);
      assertFalse(tokenQueue0.matchesWord());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("LyS:=nE!VJ");
      tokenQueue0.consumeToIgnoreCase("/]VJnx2kZ6y+$GH5");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("                 ");
      tokenQueue0.chompBalanced('u', '6');
      tokenQueue0.consumeToIgnoreCase("                 ");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("OUDx@7^Vw*cLQBEDcV");
      tokenQueue0.consumeToIgnoreCase("*");
      assertEquals('*', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.addFirst("gj");
      tokenQueue0.chompToIgnoreCase("gj");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("             ");
      // Undeclared exception!
      try { 
        tokenQueue0.consume("Wu*6>[d:");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Queue did not match expected sequence
         //
         verifyException("org.jsoup.parser.TokenQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("               ");
      tokenQueue0.consume("");
      assertEquals("               ", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("^[a-zA-Z][a-zA-Z0-9+-.]*:");
      tokenQueue0.advance();
      tokenQueue0.addFirst("rray must not contain any null ob");
      tokenQueue0.chompTo("rray must not contain any null ob");
      tokenQueue0.chompBalanced('r', 'r');
      tokenQueue0.consumeTagName();
      assertEquals("][a-zA-Z0-9+-.]*:", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("hM&9=lp");
      tokenQueue0.chompTo("hM&9=lp");
      tokenQueue0.advance();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("*|");
      tokenQueue0.consumeElementSelector();
      tokenQueue0.consumeWord();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("t<_j<U['FLv");
      boolean boolean0 = tokenQueue0.matchesWhitespace();
      assertFalse(boolean0);
      assertTrue(tokenQueue0.matchesWord());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("t<_j<U['FLv");
      tokenQueue0.chompBalanced('_', '0');
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertEquals('<', tokenQueue0.peek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("t<_j<U['FLv");
      tokenQueue0.chompBalanced('2', 'P');
      tokenQueue0.chompBalanced('2', 'k');
      tokenQueue0.chompBalanced('O', 'O');
      Character character0 = new Character('=');
      tokenQueue0.addFirst(character0);
      tokenQueue0.chompBalanced('O', '0');
      tokenQueue0.chompBalanced('Y', '0');
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertEquals('<', tokenQueue0.peek());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("^[a-zA-Z][a-zA-Z0-9+-.]*:");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("^[a-zA-Z][a-zA-Z0-9+-.]*:");
      tokenQueue0.consumeToIgnoreCase("d(");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertEquals("", tokenQueue0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.addFirst("-");
      assertEquals("-", tokenQueue0.toString());
      
      String string0 = tokenQueue0.consumeCssIdentifier();
      assertEquals("-", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      char[] charArray0 = new char[7];
      boolean boolean0 = tokenQueue0.matchesAny(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("hM&9=lp");
      tokenQueue0.consumeAttributeKey();
      assertEquals('&', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("hM&9=lp");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "'6?YSkhI}yr :vy";
      stringArray0[1] = "hM&9=lp";
      String string0 = tokenQueue0.consumeToAny(stringArray0);
      assertEquals("", string0);
      assertEquals('h', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("hM&9=lp");
      tokenQueue0.consumeElementSelector();
      assertEquals('&', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      assertTrue(tokenQueue0.isEmpty());
      
      char char0 = tokenQueue0.peek();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("LyS:=nE!VJ");
      char char0 = tokenQueue0.peek();
      assertEquals('L', char0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("52pS9U+1<xTu");
      tokenQueue0.chompTo("D{%?;bA");
      tokenQueue0.consumeElementSelector();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("OUDx@7^Vw*cLQBEDcV");
      tokenQueue0.toString();
      assertEquals('O', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("                 ");
      boolean boolean0 = tokenQueue0.matchesCS("                 ");
      assertTrue(boolean0);
  }
}
