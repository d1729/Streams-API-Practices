package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralStringProblemsSolution;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class K_FindDuplicateStrings {
  @Test
  void findDuplicateStrings() {
    final var input = List.of("Hellow", "World", "How", "are", "you", "How", "are", "you");
    final var mySolution = GeneralStringProblemsSolution.findDuplicateStrings(input);
    final var yourSolution = input.stream()
            .collect(Collectors.groupingBy(Function.identity()))
            .values()
            .stream()
            .filter(l -> l.size() >= 2)
            .map(x -> x.get(0))
            .toList();
//    System.out.println(yourSolution);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
