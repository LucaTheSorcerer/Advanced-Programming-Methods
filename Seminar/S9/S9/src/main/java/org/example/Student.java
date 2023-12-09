package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String university;

    Map<String, Integer> grades = new HashMap<>();

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public void addGrade(String course, int grade) {
        grades.put(course, grade);
    }

    public double getAverageGrade() {
        return grades
                .values()
                .stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
