package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Unit test for reversing a string that contains special characters.
 *
 * <p>This test class is designed to verify the correctness of a method that reverses a string while
 * preserving the original positions of special characters.
 *
 * @author Zahid Khan.
 */
class H_ReverseStringWithSpecialCharactersTest {
  /**
   * Test case for reversing a string with special characters.
   *
   * @todo Implement this test method
   */
  @Test
  void testReverseStringWithSpecialCharactersTest() {
    var input = "Hello world! This is a test. 😅";
    var mySolution = GeneralStringProblemsSolution.reverseStringWithSpecialCharacters(input);

    var yourSolution =
            input.chars()
                    .mapToObj(ch -> (char) ch)
                    .reduce("", (s, a) -> a + s, (s, a) -> a + s);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
