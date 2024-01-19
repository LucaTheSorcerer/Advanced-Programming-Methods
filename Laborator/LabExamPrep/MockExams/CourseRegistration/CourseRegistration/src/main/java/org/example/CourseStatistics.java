package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseStatistics {

    public static void displayStatistics(List<Student> studentList) {
        Map<Integer, Long> studentCount = studentList.stream().collect(Collectors.groupingBy(Student::getCourse_code, Collectors.counting()));

        studentCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
