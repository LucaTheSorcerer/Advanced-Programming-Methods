package org.example;

import java.util.Arrays;
import java.util.List;

public class FilterWordsTab {
    public static void main(String[] args) {

        String inputText = "Ana merge la piata";

        String[] words = inputText.split("\\s+");

//        Arrays.stream(words).map(word -> word.toUpperCase()).forEach(word -> System.out.println(word + "\t"));
        List<String> result = Arrays.stream(words).map(word -> word.toUpperCase()).map(word -> word + "\t").toList();

        System.out.println(result);


    }
}
