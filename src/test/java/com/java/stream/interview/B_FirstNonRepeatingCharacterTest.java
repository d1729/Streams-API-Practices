package com.java.stream.interview;

import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Q17.  Given a String find the first non-repeating character:
 *
 * String = The quick brown fox jumps over the lazy dog, find the first non-repeated character.
 * (Google interview)
 */
class B_FirstNonRepeatingCharacterTest {

  @Test
  void testFirstNonRepeatingCharacter() {
    final var input =
        "The quick brown fox jumps over the lazy dog, find the first non repeated character.";
    final var yourSolution = input.chars()
            .mapToObj(ch -> (char)ch + "")
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.toList()))
            .values()
            .stream()
            .filter(l -> l.size() == 1)
            .map(l -> l.get(0).charAt(0))
            .findFirst().orElse(null);
    final var mySolution = InterviewProblemSolutions.firstNonRepeatingCharacter(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
