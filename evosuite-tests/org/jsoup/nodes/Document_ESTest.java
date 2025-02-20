/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:46:37 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Document_ESTest extends Document_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.indentAmount(481);
      assertEquals(481, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        document_OutputSettings0.indentAmount((-2701));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      CharsetEncoder charsetEncoder0 = document_OutputSettings0.encoder();
      assertFalse(document_OutputSettings0.outline());
      assertNotNull(charsetEncoder0);
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Document document0 = parser0.parseInput("~MAlE.qzeA]hR#9;H", "~MAlE.qzeA]hR#9;H");
      Charset charset0 = document0.charset();
      document0.charset(charset0);
      document0.normalise();
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("IZ6v@");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      document0.normalise();
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Document document0 = parser0.parseInput("~MAlE.qzeA]hR#9;H", "~MAlE.qzeA]hR#9;H");
      document0.prependElement("body");
      document0.normalise();
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Document document0 = parser0.parseInput("<html>\n <head></head>\n <body>\n  meta[name=charset]\n </body>\n</html>", "<html>\n <head></head>\n <body>\n  meta[name=charset]\n </body>\n</html>");
      Document document1 = document0.normalise();
      assertEquals("<html>\n <head></head>\n <body>\n  meta[name=charset]\n </body>\n</html>", document1.location());
      assertEquals(1, document1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parse("<", "<");
      document0.title("<");
      document0.title("g__MTW[?j}: }");
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("<", document0.location());
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("2k", "2k");
      document0.title("} :*-B#}<M{h(.l");
      String string0 = document0.title();
      assertEquals("} :*-B#}<M{h(.l", string0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("2k", document0.location());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = new Document("");
      document0.title();
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Document document0 = new Document("A971eDHa{>");
      document0.body();
      document0.normalise();
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      Document document0 = parser0.parseInput("", "");
      document0.documentType();
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("eS1coning", "eS1coning");
      Connection connection0 = document0.connection();
      assertNotNull(connection0);
      assertEquals("eS1coning", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("6F6.A{*o");
      String string0 = document0.nodeName();
      assertEquals("6F6.A{*o", document0.location());
      assertEquals("#document", string0);
      assertFalse(document0.updateMetaCharsetElement());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("encoding", "r$p7?eK?s|fnFtr\"U");
      Class<Comment> class0 = Comment.class;
      document0.selectXpath("x.}1B;o", class0);
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("r$p7?eK?s|fnFtr\"U", document0.location());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Document document0 = new Document("samp");
      boolean boolean0 = document0.updateMetaCharsetElement();
      assertFalse(boolean0);
      assertEquals("samp", document0.location());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Document.createShell(".IGJh#ZB$L%(]CV");
      Document document1 = (Document)document0.text("");
      assertEquals(".IGJh#ZB$L%(]CV", document1.location());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals(1, document1.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("I7OIS=*8*ex/", "I7OIS=*8*ex/");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document document1 = document0.outputSettings(document_OutputSettings0);
      assertEquals(1, document1.childNodeSize());
      assertFalse(document_OutputSettings0.outline());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals("I7OIS=*8*ex/", document1.location());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = new Document("li");
      Document document1 = document0.clone();
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals("li", document1.location());
      assertNotSame(document1, document0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("\"", "\"");
      // Undeclared exception!
      try { 
        document0.createElement("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("encoding", "r$p7?eK?s|fnFtr\"U");
      HttpConnection httpConnection0 = new HttpConnection();
      document0.connection((Connection) httpConnection0);
      Connection connection0 = document0.connection();
      assertEquals("r$p7?eK?s|fnFtr\"U", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertSame(connection0, httpConnection0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("2k", "2k");
      document0.title("} :*-B#}<M{h(.l");
      String string0 = document0.outerHtml();
      assertEquals("2k", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("<html>\n <head>\n  <title>} :*-B#}&lt;M{h(.l</title>\n </head>\n <body>\n  2k\n </body>\n</html>", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(false);
      assertTrue(document_OutputSettings1.prettyPrint());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertFalse(document_OutputSettings0.outline());
  }
}
