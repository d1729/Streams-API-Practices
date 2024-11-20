package com.java.stream.interview;

import com.github.javafaker.Faker;
import com.java.stream.solutions.InterviewProblemSolutions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Given A String
 * Find the highest number of vowels present in a word.
 *
 * Example:
 * INPUT: HELLO HOW ARE YOU
 * OUTPUT: 2
 * EXPLANATION: HELLO contains 2 vowels.
 * */
class E_WordWithMaxNumberOfVowelsTest {

  @Test
  void testNumberOfVowels() {
    var input = Faker.instance().chuckNorris().fact();
    final var mySolution = InterviewProblemSolutions.maxNumberOfVowels(input);
    final var yourSolution =
            Arrays.stream(input.split(" "))
                    .map(s -> s.length() - s.replaceAll("[aeiouAEIOU]", "").length())
                    .max(Comparator.naturalOrder())
                    .orElse(0);
    Assertions.assertEquals(mySolution, yourSolution);
  }
}
