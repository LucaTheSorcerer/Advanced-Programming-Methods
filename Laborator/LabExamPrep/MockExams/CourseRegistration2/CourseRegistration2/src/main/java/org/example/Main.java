package org.example;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Student> studentArrayList = ReadFromFile.readFromFile("src/main/java/org/example/course_registration.csv");

        System.out.println(studentArrayList);

        StudentFilter.studentFilter(studentArrayList);

        WriteToFile.writeToFile(studentArrayList, "src/main/java/org/example/failed_students.txt");

        StudentThreads studentThreads = new StudentThreads();

        ArrayList<Student> arrayList = new ArrayList<>();

        studentThreads.monitorCourses(arrayList);


    }
}