package com.example.MethodOverloading;

public class OverloadingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2.5, 3.5));
    }
}
