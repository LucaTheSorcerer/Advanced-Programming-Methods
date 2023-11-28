package org.example;

import java.util.*;

public class BagOfWords {
    private Map<String, Integer> wordFrequency;

    public BagOfWords(List<String> sentences) {
        wordFrequency = new HashMap<>();
        generateWordFrequency(sentences);
    }

    public Map<String, Integer> getWordFrequency() {
        return wordFrequency;
    }

    private void generateWordFrequency(List<String> sentences) {
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+"); // Split the sentence into words
            for (String word : words) {
                word = word.toLowerCase(); // Convert to lowercase to ignore case sensitivity
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
    }

    public static void main(String[] args) {
        // Example usage
        List<String> sentences = new ArrayList<>();
        sentences.add("This is an example sentence.");
        sentences.add("Another example of a sentence.");

        BagOfWords bagOfWords = new BagOfWords(sentences);

        Map<String, Integer> wordFrequency = bagOfWords.getWordFrequency();

        System.out.println("Word Frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
