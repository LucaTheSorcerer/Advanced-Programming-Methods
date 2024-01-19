package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentFilter {

    public static void studentFilter(ArrayList<Student> studentArrayList) {

        Map<Integer, Long> filterStudents = studentArrayList.stream()
                .collect(Collectors.groupingBy(Student::getCourseCode,  Collectors.counting()));

        filterStudents.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
