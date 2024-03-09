package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {


        List<String> stringList = List.of("Computer1-100", "Computer2-150", "Computer3-200");

        Map<String, Integer> avg = stringList.stream()
                .map(entity -> entity.split("-"))
                .collect(Collectors.toMap(entity -> entity[0], entity -> Integer.parseInt(entity[1])));

        double avg1 = avg.values().stream()
                .mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
        System.out.println(avg1);


        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6);

        List<String> nameList = List.of("Bob", "Zob", "Bob");

        List<String> sortedNames = nameList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        double avg3 = integerList.stream().mapToInt(Integer::intValue).average().orElse(-1);

        Map<String, Integer> integerMap = integerList.stream().collect(Collectors.toMap(number -> number.toString(), number -> number + 1));

        System.out.println(integerMap);

        System.out.println(avg3);



    }
}
