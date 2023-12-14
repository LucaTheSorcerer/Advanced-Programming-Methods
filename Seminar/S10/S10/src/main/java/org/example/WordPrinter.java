package org.example;

import java.util.Arrays;

public class WordPrinter {
    public static void main(String[] args) {
        String inputText = "Ana merge la piata";

        String[] words = inputText.split("\\s+");

        Arrays.stream(words).forEach(word -> System.out.println(" " + word));
    }
}
