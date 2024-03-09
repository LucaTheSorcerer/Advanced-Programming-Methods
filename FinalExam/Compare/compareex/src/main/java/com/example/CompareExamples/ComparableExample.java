package com.example.CompareExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Bob", 20));
        studentList.add(new Student("Dob", 25));
        studentList.add(new Student("Zob", 40));

        Collections.sort(studentList);

        studentList.forEach(student -> {
            System.out.println(student.getName() + ": " + student.getAge());
        });
    }
}
