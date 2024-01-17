package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = List.of(
                new Employee("John", 100),
                new Employee("John", 60),
                new Employee("John", 65),
                new Employee("John", 90));

        Calculator calculator = new Calculator();
        calculator.employee_statistics(employeeList);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Statistics statistics = new Statistics(numbers);
        statistics.computeSum();
        statistics.computeProduct();
    }
}