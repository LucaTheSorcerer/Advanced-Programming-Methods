package org.example;

import java.util.List;

public class MaxPerfectNumber {

    public static int maxPerfectNumber(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(MaxPerfectNumber::isPerfectNumber)
                .max(Integer::compareTo)
                .orElse(0);
    }

    private static boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
