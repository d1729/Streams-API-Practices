package com.java.stream.problems.strings;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralStringProblemsSolution;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class J_SortListBasedOn2ndCharacterTest {
  /**
   * This test creates a list of random names and passes it to the sortListBasedOn2ndCharacter method.
   * The expected result is compared to the actual result to verify the correctness of the method.
   *
   * @author @ZahidKhan
   * @see GeneralStringProblemsSolution#sortListBasedOn2ndCharacter(List)
   */
  @Test
  void testSortListBasedOn2ndCharacter() {
    final var fakePersons = Faker.instance().name();
    List<String> input =
        List.of(
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name(),
            fakePersons.name());

    List<String> mySolution = GeneralStringProblemsSolution.sortListBasedOn2ndCharacter(input);
    List<String> yourSolution = input.stream()
            .sorted(Comparator.comparing(s -> s.charAt(1))).toList();

    Assertions.assertEquals(mySolution, yourSolution);

  }
}
