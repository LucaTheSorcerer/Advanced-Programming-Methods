package org.example;

import java.util.Arrays;

public class UppercaseWordFilter {
    public static void main(String[] args) {
        String inputText = "Ana Merge la Piata sa Cumpere mere si Pere";

        String[] words = inputText.split("\\s+");

        Arrays.stream(words)
                .filter(word -> !word.isEmpty() && Character.isUpperCase(word.charAt(0)))
                .forEach(System.out::println);
    }
}
