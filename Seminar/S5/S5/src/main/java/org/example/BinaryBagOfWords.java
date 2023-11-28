package org.example;

import java.util.*;

public class BinaryBagOfWords {
    private TrieNode root;

    public BinaryBagOfWords(List<String> sentences) {
        root = new TrieNode();
        generateTrie(sentences);
    }

//    public Map<String, Integer> getWordFrequency() {
//        Map<String, Integer> wordFrequency = new HashMap<>();
//        collectWordFrequency(root, "", wordFrequency);
//        return wordFrequency;
//    }

    private void generateTrie(List<String> sentences) {
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                insertWord(root, word);
            }
        }
    }

    private void insertWord(TrieNode node, String word) {
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isEndOfWord = true;
    }

    private void collectWordFrequency(TrieNode node, String currentWord, Map<String, Integer> wordFrequency) {
        if (node == null) {
            return;
        }

        if (node.isEndOfWord) {
            wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                collectWordFrequency(node.children[i], currentWord + (char) (i + 'a'), wordFrequency);
            }
        }
    }

    private class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
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
