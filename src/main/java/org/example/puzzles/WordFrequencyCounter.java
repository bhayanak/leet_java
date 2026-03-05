package org.example.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * WordFrequencyCounter
 *
 * Problem: Given a string, count the frequency of each word.
 *
 * Approach: Split the string by whitespace and use a HashMap to count occurrences.
 * This is a common text processing problem, useful for analytics and search engines.
 *
 * Example:
 *   countWordFrequency("the quick brown fox jumps over the lazy dog the fox")
 *   -&gt; {the=3, quick=1, brown=1, fox=2, jumps=1, over=1, lazy=1, dog=1}
 */
public class WordFrequencyCounter {
    /**
     * Counts the frequency of each word in the input string.
     * @param text the input string
     * @return a map of word frequencies
     */
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> freq = new HashMap<>();
        // Split the string by whitespace and count each word
        for (String word : text.split("\\s+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    /**
     * Main method to demonstrate word frequency counting.
     */
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog the fox";
        System.out.println(countWordFrequency(text));
    }
}
