/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 21:38:05 GMT 2021
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("", "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
      DataNode dataNode1 = dataNode0.setWholeData("#data");
      assertEquals("#data", dataNode1.nodeName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("", "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
      DataNode dataNode1 = dataNode0.clone();
      assertEquals(0, dataNode1.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("", "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
      dataNode0.toString();
  }
}
