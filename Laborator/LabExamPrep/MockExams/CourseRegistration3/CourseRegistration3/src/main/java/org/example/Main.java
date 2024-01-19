package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Student> studentArrayList = ReadFromFile.readFromFile("src/main/java/org/example/course_registration.csv");
        System.out.println(studentArrayList);

        StudentFilter.studentFilter(studentArrayList);

        WriteToFile.writeToFile(studentArrayList,"src/main/java/org/example/failed_students.txt");

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("German");
        courses.add("English");
        CourseOrganizatorTest courseOrganizatorTest = new CourseOrganizatorTest();

        courseOrganizatorTest.test(courses);

        ArrayList<Student> students = new ArrayList<>();

        CoursesThreads.monitorCourses(students);


    }
}