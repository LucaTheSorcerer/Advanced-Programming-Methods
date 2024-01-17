package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsArray {

    public static int sumInArray(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n->Integer.valueOf(n))
                .sum();
    }

    public static int productOfSquaredNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .mapToInt(Integer::valueOf)
                .reduce(1, (a,b) -> a * b);
    }

    public static int maxPerfectNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> (num == IntStream
                        .rangeClosed(1, num/2)
                        .filter(div -> num % div == 0)
                        .sum()))
                .max(Integer::compareTo)
                .orElse(-1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int sumInArrayy = sumInArray(numbers);
        System.out.println(sumInArrayy);


    }


}
