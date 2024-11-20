package com.java.stream.interview;

import com.github.javafaker.Faker;
import com.java.stream.interview.employee.domain_related.Person;
import com.java.stream.solutions.InterviewProblemSolutions;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * There is a list of Employees and Employee object has a field called e-mail.
 *
 * Find the list of domains ( gmail.com, yahoo.com..) and the no of occurrences for each domain?
 * */
class D_UniqueEmailCountTest {
  @Test
  void findUniqueDomainsWithCount() {
    final var employees =
        List.of(
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""),
            new Person(Faker.instance().internet().emailAddress(), ""));

    final var mySolution = InterviewProblemSolutions.findUniqueDomainsCount(employees);

    final Map<String, ? extends Number> yourSolution =
            employees.stream()
                    .collect(Collectors.groupingBy(p -> p.email().split("@")[1], Collectors.counting()));

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
