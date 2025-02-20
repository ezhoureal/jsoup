/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:15:47 GMT 2021
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StructuralEvaluator_ESTest extends StructuralEvaluator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Parser.parseBodyFragment("=;'#", "=;'#");
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Root0);
      Element element0 = document0.body();
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_ImmediatePreviousSibling0);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("%s ", parseSettings0);
      structuralEvaluator_ImmediatePreviousSibling0.evaluator = (Evaluator) structuralEvaluator_Not0;
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "wl-?2_ay,cnL", attributes0);
      boolean boolean0 = structuralEvaluator_Not0.matches(formElement0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Parser.parseBodyFragment("=;'#", "=;'#");
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Root0);
      Element element0 = document0.body();
      boolean boolean0 = structuralEvaluator_ImmediatePreviousSibling0.matches(document0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_Root0);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_ImmediateParent0);
      boolean boolean0 = structuralEvaluator_ImmediatePreviousSibling0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Parser.parseBodyFragment("=;'#", "=;'#");
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(structuralEvaluator_Root0);
      Element element0 = document0.body();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("%s ", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "wl-?2_ay,cnL", attributes0);
      boolean boolean0 = structuralEvaluator_PreviousSibling0.matches(formElement0, element0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_AllElements0);
      Document document0 = new Document("8iOX_[2");
      Document document1 = document0.normalise();
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_AllElements0);
      structuralEvaluator_ImmediateParent0.evaluator = (Evaluator) structuralEvaluator_PreviousSibling0;
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediateParent0.evaluator);
      boolean boolean0 = structuralEvaluator_Has0.matches(document1, document1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Parser.parseBodyFragment("=;'#", "=;'#");
      Element element0 = document0.prependElement("%s ");
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_Root0);
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_ImmediatePreviousSibling0);
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("%s ", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "wl-?2_ay,cnL", attributes0);
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_Not0);
      boolean boolean0 = structuralEvaluator_ImmediateParent0.matches(formElement0, element0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_Tag0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_ImmediateParent0);
      Document document0 = Parser.parse("", "");
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      Document document0 = Document.createShell("");
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_Root0);
      boolean boolean0 = structuralEvaluator_ImmediateParent0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("W}j/w|[", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "W}j/w|[", attributes0);
      FormElement formElement1 = formElement0.clone();
      Evaluator.IndexEquals evaluator_IndexEquals0 = new Evaluator.IndexEquals((-1805));
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_IndexEquals0);
      boolean boolean0 = structuralEvaluator_ImmediateParent0.matches(formElement1, formElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      Document document0 = Document.createShell("");
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluator_AllElements0);
      boolean boolean0 = structuralEvaluator_Parent0.matches((Element) null, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("W}j/w|[", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "W}j/w|[", attributes0);
      Evaluator.IndexEquals evaluator_IndexEquals0 = new Evaluator.IndexEquals((-1805));
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(evaluator_IndexEquals0);
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(structuralEvaluator_ImmediateParent0.evaluator);
      boolean boolean0 = structuralEvaluator_Parent0.matches(formElement0, formElement0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Evaluator.ContainsOwnText evaluator_ContainsOwnText0 = new Evaluator.ContainsOwnText(">:%");
      Document document0 = Document.createShell("");
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluator_ContainsOwnText0);
      document0.prepend("eYSS;{Z_wOT0`bx9`");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      Document document0 = Document.createShell("");
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluator_AllElements0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      boolean boolean0 = structuralEvaluator_Has0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document document0 = new Document("8iOX_[2");
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      boolean boolean0 = structuralEvaluator_Root0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedHashSet<Evaluator> linkedHashSet0 = new LinkedHashSet<Evaluator>();
      CombiningEvaluator.And combiningEvaluator_And0 = new CombiningEvaluator.And(linkedHashSet0);
      ArrayList<Evaluator> arrayList0 = combiningEvaluator_And0.evaluators;
      CombiningEvaluator.Or combiningEvaluator_Or0 = new CombiningEvaluator.Or(arrayList0);
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(combiningEvaluator_Or0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_PreviousSibling0);
      String string0 = structuralEvaluator_Has0.toString();
      assertEquals(":has( ~ )", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.PreviousSibling structuralEvaluator_PreviousSibling0 = new StructuralEvaluator.PreviousSibling(evaluator_AllElements0);
      Document document0 = new Document("8iOX_[2");
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(structuralEvaluator_PreviousSibling0);
      boolean boolean0 = structuralEvaluator_Not0.matches(document0, document0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.Not structuralEvaluator_Not0 = new StructuralEvaluator.Not(evaluator_AllElements0);
      String string0 = structuralEvaluator_Not0.toString();
      assertEquals(":not(*)", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StructuralEvaluator.Root structuralEvaluator_Root0 = new StructuralEvaluator.Root();
      StructuralEvaluator.ImmediateParent structuralEvaluator_ImmediateParent0 = new StructuralEvaluator.ImmediateParent(structuralEvaluator_Root0);
      StructuralEvaluator.ImmediatePreviousSibling structuralEvaluator_ImmediatePreviousSibling0 = new StructuralEvaluator.ImmediatePreviousSibling(structuralEvaluator_ImmediateParent0);
      String string0 = structuralEvaluator_ImmediatePreviousSibling0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Evaluator.AllElements evaluator_AllElements0 = new Evaluator.AllElements();
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluator_AllElements0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      String string0 = structuralEvaluator_Has0.toString();
      assertEquals(":has(* )", string0);
  }
}
