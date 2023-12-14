package org.example;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int sumOddNumbers = sumOddNumbers(numbers);
        System.out.println("Sum of odd numbers in array is: " + sumOddNumbers);

        int productPowerNumbers = productPowerNumbers(numbers);
        System.out.println("Product of raised numbers to the power is: " + productPowerNumbers);

        List<Integer> perfectNumbers = List.of(6, 28, 496, 7, 5, 1);
        int maxPerfectNumber = maxPerfectNumber(perfectNumbers);
        System.out.println("Max perfect number in array is: " + maxPerfectNumber);

        List<Pair<Student, Integer>> studentGrades = List.of(
                new Pair<>(new Student("Bob", "UBB"), 9),
                new Pair<>(new Student("Dob", "UBB"), 10),
                new Pair<>(new Student("Lob", "UBB"), 8),
                new Pair<>(new Student("Zob", "UBB"), 10)
        );

        System.out.println("Students with best grades are: " + studentMaxGrade(studentGrades));

        Student bob = new Student("Bob", "UBB");
        Student dob = new Student("Dob", "UBB");
        Student lob = new Student("Lob", "UTCN");
        Student zob = new Student("Zob", "UTCN");

        List<Student> studentList = List.of(bob, dob, lob, zob);
        Map<String, Long> countStudentsByUni = countStudentsByUni(studentList);
        System.out.println("The number of students each uni has is: " + countStudentsByUni);

        Student bob1 = new Student("Bob", "UBB",List.of(new Pair<>("Mate", 10)));
        Student dob1 = new Student("Dob", "UBB", List.of(new Pair<>("Istorie", 8)));
        Student lob1 = new Student("Lob", "UBB", List.of(new Pair<>("Mate", 7)));
        Student zob1 = new Student("Zob", "UBB", List.of(new Pair<>("Istorie", 9)));

        List<Student> studentCourses = List.of(bob1, dob1, lob1, zob1);

        Map<String, Double> getAverageCourses = coursesAverage(studentCourses);

        System.out.println("The average grade for every course is: " + getAverageCourses);

    }

    public static int sumOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
//                .mapToInt(Integer::intValue)
                .mapToInt(n -> Integer.valueOf(n))
                .sum();
    }

    public static int productPowerNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .map(n -> n * n)
                .reduce(1, (a,b) -> a * b);
    }

    public static int maxPerfectNumber(List<Integer> perfectNumbers) {
        return perfectNumbers
                .stream()
//                .filter(Main::isPerfectNumber)
                .filter(num -> (num == IntStream
                        .rangeClosed(1, num/2)
                        .filter(div -> num % div == 0)
                        .sum()))
                .max(Integer::compareTo)
                .orElse(-1);
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 1;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                sum += i;
                if(i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static List<Student> studentMaxGrade(List<Pair<Student, Integer>> studentGrades) {

        int maxGrade = studentGrades
                .stream()
                .map(Pair::getSecond)
                .max(Integer::compareTo)
                .orElse(-1);

        return studentGrades
                .stream()
                .filter(entry -> entry.getSecond() == maxGrade)
                .map(Pair::getFirst)
                .toList();
//        return studentGrades
//                .stream()
//                .filter(studentGrade ->
//                        Objects.equals(studentGrade.getSecond(), studentGrades
//                                .stream()
//                                .map(Pair::getSecond)
//                                .max(Integer::compareTo)
//                                .orElse(-1)))
//                .map(Pair::getFirst)
//                .toList();
    }

    public static Map<String, Long> countStudentsByUni (List<Student> studentList) {
        return studentList
                .stream()
                .collect(Collectors.groupingBy(Student::getUniversity, Collectors.counting()));
    }

    public static Map<String, Double> coursesAverage(List<Student> studentList) {
        return studentList
                .stream()
                .flatMap(student -> student.getCourse().stream())
                .collect(Collectors.groupingBy(Pair::getFirst, Collectors.averagingDouble(Pair::getSecond)));
    }



}