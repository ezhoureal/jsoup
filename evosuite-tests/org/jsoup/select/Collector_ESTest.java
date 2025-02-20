/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:13:57 GMT 2021
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.StructuralEvaluator;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Collector_ESTest extends Collector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Evaluator.ContainsOwnText evaluator_ContainsOwnText0 = new Evaluator.ContainsOwnText("h");
      Collector.FirstFinder collector_FirstFinder0 = new Collector.FirstFinder(evaluator_ContainsOwnText0);
      Document document0 = Document.createShell("");
      document0.prepend("h");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = collector_FirstFinder0.head(document0, (-4008));
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("zEj '_yI", "zEj '_yI");
      Evaluator.AttributeWithValueEnding evaluator_AttributeWithValueEnding0 = new Evaluator.AttributeWithValueEnding("zEj '_yI", "org.jsoup.select.Collector");
      Elements elements0 = Collector.collect(evaluator_AttributeWithValueEnding0, document0);
      assertTrue(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("zEj '_yI");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_Tag0);
      Collector.FirstFinder collector_FirstFinder0 = structuralEvaluator_Has0.finder;
      Document document0 = Parser.parseBodyFragment("zEj '_yI", "zEj '_yI");
      Element element0 = collector_FirstFinder0.find(document0, document0);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Evaluator.Tag evaluator_Tag0 = new Evaluator.Tag("zEj '_yI");
      StructuralEvaluator.Has structuralEvaluator_Has0 = new StructuralEvaluator.Has(evaluator_Tag0);
      Element element0 = Collector.findFirst(structuralEvaluator_Has0, (Element) null);
      assertNull(element0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Document document0 = Document.createShell("");
      Elements elements0 = document0.getAllElements();
      assertFalse(elements0.isEmpty());
  }
}
