package org.example;

import java.util.List;

import static org.example.StreamsArray.sumInArray;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);


        System.out.println(sumInArray(numbers));
    }
}