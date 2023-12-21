package org.example;

import java.util.Arrays;

public class StartEndFilter {

    public static void main(String[] args) {


        String inputText = "Ana merge la piata";

        String[] words = inputText.split("\\s+");


        String result = Arrays.stream(words).map(word -> word.toUpperCase()).reduce("Start: ", (a, b) -> a + b + " ") + ":End";

        System.out.println(result);



    }
}
