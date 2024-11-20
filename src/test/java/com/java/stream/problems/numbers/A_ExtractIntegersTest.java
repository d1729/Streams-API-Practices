package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralNumbersProblemSolution;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a list of Strings : ["as", "123", "32", "2as"],
 * Create another list that contains only integers.
 * The output should be: [123,32]
 */
class A_ExtractIntegersTest {
    @Test
    void testCheckAllIntegersWithoutAlphabets(){
        var input = List.of("1","12","12a","a12");
        var yourSolution = input
                .stream()
                .filter(s -> s.matches("-?\\d+"))
//                .map(Integer::valueOf)
                .toList();
        var mySolution = GeneralNumbersProblemSolution.getNumberOnly(input);

        Assertions.assertEquals(mySolution, yourSolution);

    }
}
