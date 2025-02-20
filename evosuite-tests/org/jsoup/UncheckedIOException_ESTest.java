/*
 * This file was automatically generated by EvoSuite
 * Mon Sep 20 22:34:35 GMT 2021
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.jsoup.UncheckedIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UncheckedIOException_ESTest extends UncheckedIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      MockIOException mockIOException0 = new MockIOException("", mockThrowable0);
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException(mockIOException0);
      IOException iOException0 = uncheckedIOException0.ioException();
      assertSame(mockIOException0, iOException0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException((String) null);
  }
}
