package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class I_SecondHighestWordTest {
  @Test
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String mySolution = GeneralStringProblemsSolution.find2ndLargestWordInTheString(input);

    final String yourSolution = Arrays.
            stream(input.split(" ")).
            sorted(Comparator.comparing(String::length, Comparator.reverseOrder())).
            skip(1).
            limit(1).
            findFirst().
            orElseThrow();


    assertEquals(mySolution, yourSolution);
  }

}
