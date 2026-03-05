package org.example.puzzles;

import java.util.Arrays;

/**
 * AnagramChecker
 * <p>
 * Problem: Given two strings, determine if they are anagrams (contain the same characters in any order).
 * <p>
 * Approach: Count the frequency of each character in both strings and compare, or sort both strings and compare.
 * This is a common interview problem to test string manipulation and hashing/sorting skills.
 * <p>
 * Example:<br>
 *   areAnagrams("listen", "silent") -&gt; true <br>
 *   areAnagrams("hello", "world")   -&gt; false
 */
public class AnagramChecker {
    /**
     * Checks if two strings are anagrams of each other.
     * @param s1 first string
     * @param s2 second string
     * @return true if anagrams, false otherwise
     */
    public static boolean areAnagrams(String s1, String s2) {
        // If lengths differ, they cannot be anagrams
        if (s1.length() != s2.length()) return false;
        // Convert both strings to character arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        // Sort both arrays; anagrams will have identical sorted arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Compare sorted arrays for equality
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Main method to demonstrate anagram checking.
     */
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("hello", "world"));   // false
    }
}
