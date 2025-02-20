/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:12:05 GMT 2021
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.IsFirstOfType evaluator_IsFirstOfType0 = new Evaluator.IsFirstOfType();
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_IsFirstOfType0);
      Document document0 = Parser.parse("", "");
      Elements elements0 = document0.getElementsByIndexGreaterThan((-365));
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseSettings parseSettings0 = new ParseSettings(true, true);
      Tag tag0 = Tag.valueOf("org.jsoup.select.Evaluator$AttributeWithValueMatching", parseSettings0);
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "", attributes0);
      Elements elements0 = formElement0.children();
      elements0.add((Element) formElement0);
      Evaluator.IsFirstOfType evaluator_IsFirstOfType0 = new Evaluator.IsFirstOfType();
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IsFirstOfType0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Document document0 = Document.createShell("");
      Evaluator.IndexGreaterThan evaluator_IndexGreaterThan0 = new Evaluator.IndexGreaterThan(0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_IndexGreaterThan0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Evaluator.IsFirstOfType evaluator_IsFirstOfType0 = new Evaluator.IsFirstOfType();
      StructuralEvaluator.Parent structuralEvaluator_Parent0 = new StructuralEvaluator.Parent(evaluator_IsFirstOfType0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(structuralEvaluator_Parent0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Document document0 = Document.createShell("A%\"l.45^7qD-MX1");
      NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) document0);
      assertEquals(1, document0.childNodeSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("%22", 400);
      Evaluator.Matches evaluator_Matches0 = new Evaluator.Matches(pattern0);
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_Matches0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter((NodeFilter) collector_FirstFinder0, (Node) null);
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Document document0 = Document.createShell("A%\"l.45^7qD-MX1");
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Elements elements0 = document0.getElementsByIndexGreaterThan((-1548));
      NodeTraversor.traverse(nodeVisitor0, elements0);
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NodeTraversor nodeTraversor0 = new NodeTraversor();
  }
}
