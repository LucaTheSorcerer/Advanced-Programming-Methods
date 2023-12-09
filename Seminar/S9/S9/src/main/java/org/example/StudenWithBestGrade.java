package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudenWithBestGrade {

    public static List<Student> studentWithBestGrade(List<Pair<Student, Integer>> studentGrades) {
        Map<Student, Integer> maxGrades = studentGrades
                .stream()
                .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond, Integer::max));

        int maxGrade = maxGrades
                .values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0);

        return maxGrades
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxGrade)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
