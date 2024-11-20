package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

class G_RemoveDuplicateCharactersTest {
  @Test
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    final String yourSolution = input.chars()
            .mapToObj(ch -> (char) ch + "")
            .distinct()
            .reduce("", String::concat);
    final String mySolution = GeneralStringProblemsSolution.getUniqueCharacters(input);

    assertEquals(mySolution, yourSolution);
  }
}
