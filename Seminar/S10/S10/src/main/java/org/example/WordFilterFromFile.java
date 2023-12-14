package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WordFilterFromFile {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/file.txt";

        try {
            var words = Files.lines(Paths.get(filePath))
                    .flatMap(line -> Arrays.stream(line.split("\\s+"))) // Split each line into words
                    .filter(word -> word.toLowerCase().contains("ete") || word.toLowerCase().contains("ar")) // Filter words that contain either "ete" or "ar"
                    .sorted(Comparator.naturalOrder())
                    .map(word -> word.toUpperCase() + "!")
                    .collect(Collectors.toList());

            words.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}