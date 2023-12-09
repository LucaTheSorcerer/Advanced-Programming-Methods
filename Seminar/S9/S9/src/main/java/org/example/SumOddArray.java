package org.example;

import java.util.ArrayList;
import java.util.List;

public class SumOddArray {

    public static int sumOfOddNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
