/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 22:25:46 GMT 2021
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.Reader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("{H<E74UK-]BS<at<8", "{H<E74UK-]BS<at<8");
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Parser parser1 = parser0.setTrackErrors((-2193));
      assertSame(parser1, parser0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      assertFalse(parser0.isTrackErrors());
      
      Parser parser1 = parser0.setTrackErrors(830);
      parser1.parseInput("", "{2M|t#lWG+]ku");
      assertTrue(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      List<Node> list0 = Parser.parseFragment("org.jsoup.parser.Parser", (Element) null, "", parseErrorList0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      boolean boolean0 = parser0.isContentForTagData("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document document0 = Parser.parse("", "");
      assertEquals("", document0.location());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Node> list0 = Parser.parseXmlFragment("", "");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Parser parser1 = parser0.settings((ParseSettings) null);
      assertSame(parser1, parser0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Parser parser1 = parser0.newInstance();
      assertFalse(parser1.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Parser parser1 = parser0.setTreeBuilder(htmlTreeBuilder0);
      assertSame(parser0, parser1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Parser.unescapeEntities("_", true);
      assertEquals("_", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Document.createShell("");
      Element element0 = document0.wrap("5Pg$A~t`6");
      assertEquals(0, element0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        parser0.parseInput((Reader) pipedReader0, "<>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
