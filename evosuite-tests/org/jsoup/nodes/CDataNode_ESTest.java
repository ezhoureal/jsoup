/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:59:47 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedWriter;
import java.io.PipedWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CDataNode_ESTest extends CDataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("I6\"'SH~~@%5|=W0");
      CDataNode cDataNode1 = cDataNode0.clone();
      assertNotSame(cDataNode0, cDataNode1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("#cdata");
      cDataNode0.text();
      assertEquals("#cdata", cDataNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("#cdata");
      PipedWriter pipedWriter0 = new PipedWriter();
      BufferedWriter bufferedWriter0 = new BufferedWriter(pipedWriter0);
      cDataNode0.html(bufferedWriter0);
      assertEquals("#cdata", cDataNode0.nodeName());
  }
}
