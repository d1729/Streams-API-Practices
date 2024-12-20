package com.java.stream.solutions;

import com.java.stream.interview.employee.domain_related.Employee;
import com.java.stream.interview.employee.domain_related.Person;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewProblemSolutions
{
  public static Map<String, ? extends Number> findUniqueDomainsCount(List<Person> people) {
    return people.stream()
        .filter(x -> x.email().split("@").length == 2)
        .map(x -> x.email().split("@")[1])
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  public static Integer maxNumberOfVowels(String input) {
    return Arrays.stream(input.split(" "))
        .map(x -> x.length() - x.replaceAll("[aeiouAEIOU]", "").length())
        .max(Comparator.comparing(Integer::intValue))
        .get();
  }

  public static Map<Integer, List<Integer>> groupingOfNumbers(List<Integer> randomIntegers) {
    return randomIntegers.stream().collect(Collectors.groupingBy(e -> e / 10));
  }

  public static Character firstNonRepeatingCharacter(String input) {
    return input
        .chars()
        .mapToObj(x -> (char) x)
        .filter(x -> input.indexOf(x) == input.lastIndexOf(x))
        .findFirst()
        .orElseThrow(RuntimeException::new);
  }

  public static Employee employeesWorkedForMaxProjects(
      List<Employee> employees) {
    return employees.stream()
        .max(
            Comparator.comparing(Employee::projectSize)
                .thenComparing(Employee::sumOfProjectDurations))
        .get();
  }
}
