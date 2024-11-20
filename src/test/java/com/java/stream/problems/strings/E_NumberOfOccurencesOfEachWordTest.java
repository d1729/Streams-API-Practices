package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class E_NumberOfOccurencesOfEachWordTest {
  @Test
  public void numberOfOccurencesOfEachWord() {
    final var input = "the quick brown fox jumps right over the little lazy dog little";
    final Map<String, Long> mySolution =
        GeneralStringProblemsSolution.numberOfOccurenceOfEachWord(input);

    Map<String, Long> yourSolution =
            Arrays.stream(input.split(" "))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    assertEquals(mySolution, yourSolution);
  }
}
