/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 22:38:26 GMT 2021
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("YmmxZs7?0g!.");
      Element element0 = document0.attr("xmlns:charset", "YmmxZs7?0g!.");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(element0, 3710);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      org.jsoup.nodes.Document document0 = Parser.parse("XE[jzC6_NV`", "XE[jzC6_NV`");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      Document document1 = W3CDom.convert(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
      w3CDom_W3CBuilder0.head((Node) null, (-846));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
      Comment comment0 = new Comment("BQ#?/:C~q");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(comment0, (-1128550499));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
      DataNode dataNode0 = new DataNode("javax.xml.xpath.XPathFactory:jsoup");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(dataNode0, 2545);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("(H(Lxn1! Z4B:IS_4", parseSettings0);
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "javax.xml.xpath.XPathFactory:jsoup", attributes0);
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(element0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Tag tag0 = Tag.valueOf("jsoupSource");
      Attributes attributes0 = new Attributes();
      attributes0.put("xmlns", "xmlns");
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "xmlns", attributes0);
      Document document0 = w3CDom0.fromJsoup((Element) pseudoTextElement0);
      assertNotNull(document0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      org.jsoup.nodes.Document document0 = Parser.parse("xmlns#cdata", "xmlns#cdata");
      DocumentImpl documentImpl0 = (DocumentImpl)W3CDom.convert(document0);
      W3CDom w3CDom0 = new W3CDom();
      Class<org.jsoup.nodes.Document> class0 = org.jsoup.nodes.Document.class;
      List<org.jsoup.nodes.Document> list0 = w3CDom0.sourceNodes((NodeList) documentImpl0, class0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = Parser.parse("jsoupSource", "utf");
      Document document1 = w3CDom0.fromJsoup(document0);
      // Undeclared exception!
      try { 
        w3CDom0.selectXpath("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n</head>\n<body>jsoupSource</body>\n</html>\n", document1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not evaluate XPath query [<html>
         // <head>
         // <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">
         // </head>
         // <body>jsoupSource</body>
         // </html>
         // ]: javax.xml.transform.TransformerException: A location path was expected, but the following token was encountered:  <
         //
         verifyException("org.jsoup.helper.W3CDom", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = Parser.parse("javax.xml.xpath.XPathFactory:jsoup", "");
      Document document1 = w3CDom0.fromJsoup((Element) document0);
      String string0 = w3CDom0.asString(document1);
      assertEquals("<html>\n<head>\n<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n</head>\n<body>javax.xml.xpath.XPathFactory:jsoup</body>\n</html>\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = W3CDom.OutputHtml();
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = Parser.parse("jsoupSource", "utf");
      Document document1 = w3CDom0.fromJsoup(document0);
      String string0 = W3CDom.asString(document1, (Map<String, String>) hashMap0);
      assertEquals("<html><head><META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body>jsoupSource</body></html>", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("javax.xml.xpath.XPathFactory:jsoup");
      Document document1 = w3CDom0.fromJsoup(document0);
      // Undeclared exception!
      try { 
        w3CDom0.convert(document0, document1);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, String> hashMap0 = W3CDom.OutputXml();
      assertEquals(1, hashMap0.size());
  }
}
