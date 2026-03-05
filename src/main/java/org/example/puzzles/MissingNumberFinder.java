package org.example.puzzles;

/**
 * MissingNumberFinder
 *
 * Problem: Given an array of size n containing numbers from 1 to n+1 with one missing, find the missing number.
 *
 * Approach: Use the sum formula for 1 to n+1 and subtract the sum of the array.
 * This is a classic math-based interview problem, testing understanding of arithmetic series and array manipulation.
 *
 * Example:
 *   findMissing(new int[]{1,2,4,5,6}) -&gt; 3
 */
public class MissingNumberFinder {
    /**
     * Finds the missing number in the array.
     * @param arr the input array
     * @return the missing number
     */
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2; // Sum of 1 to n+1
        int actualSum = 0;
        for (int num : arr) actualSum += num; // Sum of array elements
        return expectedSum - actualSum; // The difference is the missing number
    }

    /**
     * Main method to demonstrate missing number finding.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(findMissing(arr)); // 3
    }
}
