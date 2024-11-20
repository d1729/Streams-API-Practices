package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class D_NumberOfOccurencesOfEachCharacterTest {
  @Test
  @Disabled("Remove This Once you Complete The Exercise")
  void numberOfOccurencesOfEachCharacter() {
    final String input = "the quick brown fox jumps right over the little lazy dog little";
    final var mySolution = GeneralStringProblemsSolution.findOccurenceOfCharacter(input);
    final Map<Character, Long> yourSolution =
             Arrays.stream(input.split(" "))
                    .flatMap(s -> s.chars().mapToObj(ch -> (char)ch))
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    assertEquals(mySolution, yourSolution);
  }
}
