package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddGradetoCourse {

    public static Map<String, Double> averageGradePerCourse(List<Student> studentList) {
        return studentList
                .stream()
                .flatMap(student -> student.grades.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.averagingInt(Map.Entry::getValue)));
    }

}
