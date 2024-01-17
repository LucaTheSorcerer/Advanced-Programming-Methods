package org.example;

import java.util.Arrays;
import java.util.List;

public class Calculator {

    private int maxSalary = Integer.MAX_VALUE;
    private int minSalary = Integer.MIN_VALUE;
    private double avgSalary = 0;
    private int sumSalary = 0;

    public void employee_statistics(List<Employee> employee) {
        Thread maxThread = new Thread(() -> maxSalary = employee.stream().mapToInt(Employee::getGehalt).max().getAsInt());
        Thread minThread = new Thread(() -> minSalary = employee.stream().mapToInt(Employee::getGehalt).min().getAsInt());
        Thread avgThread = new Thread(() -> avgSalary = employee.stream().mapToInt(Employee::getGehalt).average().getAsDouble());
        Thread sumThread = new Thread(() -> sumSalary = employee.stream().mapToInt(Employee::getGehalt).sum());

        maxThread.start();
        minThread.start();
        avgThread.start();
        sumThread.start();

        try {
            maxThread.join();
            maxThread.join();
            maxThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Max Salary: " + maxSalary);
        System.out.println("Min Salary: " + minSalary);
        System.out.println("Average Salary: " + avgSalary);
        System.out.println("Sum Salary: " + sumSalary);
    }
}
