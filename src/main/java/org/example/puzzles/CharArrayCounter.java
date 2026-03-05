package org.example.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * CharArrayCounter
 *
 * Problem: Given a character array, count the frequency of each character.
 *
 * Approach: Iterate through the array and use a HashMap to store the frequency of each character.
 * This is a classic frequency counting problem, useful for text analysis and preprocessing.
 *
 * Example:
 *   countChars(new char[]{'a','b','a'}) -&gt; {a=2, b=1}
 */
public class CharArrayCounter {
    /**
     * Counts the frequency of each character in the given array.
     * @param arr the character array
     * @return a map with character frequencies
     */
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : arr) {
            // Increment the count for each character
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    /**
     * Main method to demonstrate character counting.
     */
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        System.out.println(countChars(arr));
    }
}
