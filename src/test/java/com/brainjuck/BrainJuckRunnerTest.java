/*
 * MIT License
 * Copyright (c) 2023 Manish Dait
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 */

package com.brainjuck;

import static org.junit.Assert.assertEquals;

import com.brainjuck.error.BrainJuckException;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;


/**
 * Test for BrainJuck.
 *
 */

public class BrainJuckRunnerTest {
  /**
   * Test for {@link BrainJuckRunner#main(String[])}.
   *
   * @throws BrainJuckException if BrainJuckHandler causes error
   */
  @Test
  public void testBrainJuckRunner() throws BrainJuckException {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);
    System.setOut(printStream);

    String[] args =  {"src/test/resources/handler/Somecode.bf"};
    BrainJuckRunner.main(args);

    String printedOutput = outputStream.toString();
    String expectedOutput = "\n[****  Brainjuck  ****]\n\nHello, World!\n\n";

    assertEquals(expectedOutput, printedOutput);
    
  }
}
