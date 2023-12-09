package org.example;

import java.util.List;

public class ProductSquareNumbers {

    public static int productOfSquareNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .map(n -> n * n)
                .reduce(1, (a, b) -> a * b);
    }
}
