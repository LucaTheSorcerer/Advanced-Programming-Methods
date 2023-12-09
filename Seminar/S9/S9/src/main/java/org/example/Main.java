package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbersA = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfOddNumbers = SumOddArray.sumOfOddNumbers(numbersA);
        System.out.println("Sum of odd numbers in array is: " + sumOfOddNumbers);

        List<Integer> numbersB = List.of(1, 2, 3, 4, 5, 6);
        int productSquaredNumbers = ProductSquareNumbers.productOfSquareNumbers(numbersB);
        System.out.println("Product of squared numbers is: " + productSquaredNumbers);

        List<Integer> numbersC = List.of(6, 100, 6, 7, 9, 15, 28);
        int maxPerfectNumber = MaxPerfectNumber.maxPerfectNumber(numbersC);
        System.out.println("Maximum perfect number of array is: " + maxPerfectNumber);

        Pair<Student, Integer> stud1 = new Pair<>(new Student("Zob", "UBB"), 90);
        Pair<Student, Integer> stud2 = new Pair<>(new Student("Bob", "UBB"), 95);
        Pair<Student, Integer> stud3 = new Pair<>(new Student("Dob", "UBB"), 100);
        Pair<Student, Integer> stud4 = new Pair<>(new Student("Lob", "UBB"), 100);

        List<Pair<Student, Integer>> studentGrades = List.of(stud1, stud2, stud3, stud4);
        List<Student> studentsWithBestGrades = StudenWithBestGrade.studentWithBestGrade(studentGrades);
        System.out.println("Students with the best grade are: " + studentsWithBestGrades);


        Student student1 = new Student("Bob", "UBB");
        Student student2 = new Student("Dob", "UBB");
        Student student3 = new Student("Lob", "UTCN");
        Student student4 = new Student("Zob", "UTCN");

        List<Student> studentList = List.of(student1, student2, student3, student4);
        Map<String, Long> studentByUni = CountStudentsByUni.countStudentByUni(studentList);
        System.out.println("Student count by Uni is: " + studentByUni);

        Student student5 = new Student("Alice", "University1");
        student5.addGrade("Math", 85);
        student5.addGrade("Physics", 90);

        Student student6 = new Student("Bob", "University2");
        student6.addGrade("Math", 92);
        student6.addGrade("Physics", 88);

        List<Student> students = Arrays.asList(student5, student6);
        Map<String, Double> averageGradePerCourse = AddGradetoCourse.averageGradePerCourse(students);

        System.out.println("Average Grade per Course: " + averageGradePerCourse);
    }
}