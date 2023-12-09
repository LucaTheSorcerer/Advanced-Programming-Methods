package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStudentsByUni {

    public static Map<String, Long> countStudentByUni(List<Student> studentList) {
        return studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getUniversity, Collectors.counting()));
    }
}
