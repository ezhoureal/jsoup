/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 19:55:28 GMT 2021
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Elements_ESTest extends Elements_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.getElementsByIndexLessThan(45);
      List<TextNode> list0 = elements0.textNodes();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      List<FormElement> list0 = elements0.forms();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("6rZ{w8wxh4");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "m7\",K4_C\"44;xGR", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      Elements elements0 = formElement1.elements();
      List<FormElement> list0 = elements0.forms();
      assertTrue(list0.contains(formElement0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("L]Jo,0");
      Elements elements0 = document0.getElementsByAttributeValue("L]Jo,0", " ");
      Element element0 = elements0.last();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("6rZ{w8wxh4");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "m7\",K4_C\"44;xGR", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      Elements elements0 = formElement1.elements();
      Element element0 = elements0.last();
      assertFalse(element0.hasParent());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Elements elements0 = new Elements();
      Element element0 = elements0.first();
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.parents();
      assertNotSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.getElementsByIndexLessThan(45);
      Elements elements1 = elements0.prev();
      assertEquals(1, elements1.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.getElementsByIndexLessThan(45);
      Elements elements1 = elements0.nextAll("fvS-");
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      boolean boolean0 = elements0.is("org.jsoup.select.Elements");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Element element0 = new Element("[ix7D:eBLO~Ie~oX");
      Elements elements0 = element0.previousElementSiblings();
      // Undeclared exception!
      try { 
        elements0.eq((-432));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.eq(2464);
      assertNotSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Document document0 = new Document((String) null);
      Elements elements0 = document0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag tag0 = Tag.valueOf("6rZ{w8wxh4");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "m7\",K4_C\"44;xGR", attributes0);
      Elements elements0 = formElement0.elements();
      Elements elements1 = elements0.remove();
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Document document0 = Parser.parse("org.jsoup.internal.StringUtil$1", "org.jsoup.internal.StringUtil$1");
      Elements elements0 = document0.getElementsByIndexGreaterThan(0);
      Elements elements1 = elements0.empty();
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Elements elements0 = new Elements(1625);
      Elements elements1 = elements0.empty();
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("", "`0`|^6r3yuV&7m");
      Elements elements0 = document0.getElementsContainingText("");
      // Undeclared exception!
      try { 
        elements0.unwrap();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      elements0.clear();
      Elements elements1 = elements0.unwrap();
      assertEquals(0, elements1.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.wrap(" u5c|StXR99#<\"GbJ");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Document document0 = Parser.parse("org.jsoup.internal.StringUtil$1", "org.jsoup.internal.StringUtil$1");
      Elements elements0 = document0.getElementsByIndexGreaterThan(0);
      Elements elements1 = elements0.after("org.jsoup.internal.StringUtil$1");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Document document0 = Document.createShell("title");
      Elements elements0 = document0.getAllElements();
      // Undeclared exception!
      try { 
        elements0.before("g&83J.c\"\"3CrSpx?,");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      elements0.clear();
      Elements elements1 = elements0.before("h9nMF{2nc[Q/");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.append(" u5c|StXR99#<\"GbJ");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      elements0.prepend("7veri");
      assertEquals(2, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("=", "=");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.html("=");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Document document0 = Parser.parse("org.jsoup.internal.StringUtil$1", "org.jsoup.internal.StringUtil$1");
      Elements elements0 = document0.getElementsByIndexGreaterThan(0);
      // Undeclared exception!
      try { 
        elements0.tagName("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tag name must not be empty.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Elements elements0 = new Elements(430);
      Elements elements1 = elements0.tagName((String) null);
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Document document0 = Document.createShell("] p.ZrPIf,Cq");
      Pattern pattern0 = Pattern.compile("");
      Elements elements0 = document0.getElementsMatchingOwnText(pattern0);
      String string0 = elements0.toString();
      assertEquals("<html>\n <head></head>\n <body></body>\n</html>\n<html>\n <head></head>\n <body></body>\n</html>\n<head></head>\n<body></body>", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      String string0 = elements0.html();
      assertEquals("<html>\n <head></head>\n <body>\n  7veri\n </body>\n</html>\n<head></head>\n<body>\n 7veri\n</body>\n\n7veri", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Document document0 = Parser.parse("7veri", "7veri");
      Elements elements0 = document0.getAllElements();
      List<String> list0 = elements0.eachText();
      assertTrue(list0.contains("7veri"));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Document document0 = Document.createShell(" ");
      Elements elements0 = document0.children();
      boolean boolean0 = elements0.hasText();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      boolean boolean0 = elements0.hasText();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.getElementsByIndexLessThan(45);
      String string0 = elements0.text();
      assertEquals(" u5c|StXR99#<\"GbJ   u5c|StXR99#<\"GbJ", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.val("v[*@u-");
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Document document0 = Document.createShell("title");
      Elements elements0 = document0.getAllElements();
      String string0 = elements0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Tag tag0 = Tag.valueOf("6rZ{w8wxh4");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "m7\",K4_C\"44;xGR", attributes0);
      Elements elements0 = formElement0.elements();
      String string0 = elements0.val();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      boolean boolean0 = elements0.hasClass(";\"bGKr'VL0iCJ3fX");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.toggleClass("v[*@u-");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("", "`0`|^6r3yuV&7m");
      Elements elements0 = document0.getElementsContainingText("");
      Elements elements1 = elements0.removeClass("aRfL^BN\"^dbVO+A69^");
      assertSame(elements0, elements1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Document document0 = Document.createShell("J<F>M}c_em*s@h+F'F");
      Elements elements0 = document0.getElementsByIndexGreaterThan(2088);
      Elements elements1 = elements0.addClass("");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.removeAttr("");
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      List<String> list0 = elements0.eachAttr("v[*@u-");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Tag tag0 = Tag.valueOf("6rZ{w8wxh4");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "m7\",K4_C\"44;xGR", attributes0);
      attributes0.put("m7\",K4_C\"44;xGR", "");
      FormElement formElement1 = formElement0.addElement(formElement0);
      Elements elements0 = formElement1.elements();
      boolean boolean0 = elements0.hasAttr("m7\",K4_C\"44;xGR");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      boolean boolean0 = elements0.hasAttr(" ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      Elements elements1 = elements0.attr(" u5c|StXR99#<\"GbJ", "");
      String string0 = elements1.attr(" u5c|StXR99#<\"GbJ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment(" u5c|StXR99#<\"GbJ", " u5c|StXR99#<\"GbJ");
      Elements elements0 = document0.children();
      String string0 = elements0.attr(" u5c|StXR99#<\"GbJ");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Document document0 = new Document((String) null);
      Elements elements0 = document0.getAllElements();
      Elements elements1 = elements0.clone();
      assertNotSame(elements1, elements0);
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Elements elements0 = new Elements();
      Elements elements1 = elements0.next();
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Document document0 = Document.createShell("82Gv,J&J/");
      Elements elements0 = document0.children();
      List<Comment> list0 = elements0.comments();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("", "-a!gDd@mjT");
      Elements elements0 = document0.getElementsMatchingOwnText("d0z1./~+o~h3G7");
      // Undeclared exception!
      try { 
        elements0.prev("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Elements elements0 = new Elements();
      // Undeclared exception!
      try { 
        elements0.not((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Element[] elementArray0 = new Element[0];
      Elements elements0 = new Elements(elementArray0);
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("", "`0`|^6r3yuV&7m");
      Elements elements0 = document0.getElementsContainingText("");
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Elements elements1 = elements0.traverse(nodeVisitor0);
      assertFalse(elements1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Document document0 = Document.createShell("\n");
      Elements elements0 = document0.nextElementSiblings();
      // Undeclared exception!
      try { 
        elements0.select("\n");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '': unexpected token at ''
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Elements elements0 = new Elements(1625);
      Elements elements1 = elements0.nextAll();
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Elements elements0 = new Elements();
      List<DataNode> list0 = elements0.dataNodes();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Elements elements0 = new Elements(1625);
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(combiningEvaluator_And0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Elements elements1 = elements0.filter(collector_FirstFinder0);
      assertSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Elements elements0 = new Elements();
      // Undeclared exception!
      try { 
        elements0.prevAll("*MY}o}H4;{'z~*z");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Could not parse query '*MY}o}H4;{'z~*z': unexpected token at '}o}H4;{'z~*z'
         //
         verifyException("org.jsoup.select.QueryParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Document document0 = new Document("em");
      Elements elements0 = document0.previousElementSiblings();
      Elements elements1 = elements0.next("em");
      assertNotSame(elements1, elements0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("YURSPS7J", "g P0,.&");
      Element element0 = document0.body();
      Elements elements0 = element0.previousElementSiblings();
      elements0.addClass("_Ww/Eq");
  }
}
