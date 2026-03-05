package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** GenerateFibonacciSequence solution. */
public class GenerateFibonacciSequence {

    /**
     * Java equivalent of a JS generator that yields Fibonacci numbers.
     * Returns the first n Fibonacci numbers as an array.
     * @param n how many Fibonacci numbers to generate
     * @return int[] of first n Fibonacci numbers starting from 0
     * <p><b>Explanation:</b> Iterative generation: O(n) time, O(n) space.</p>
     */
    public int[] solve(int n) {
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) fib[i] = 0;
            else if (i == 1) fib[i] = 1;
            else fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        GenerateFibonacciSequence sol = new GenerateFibonacciSequence();
        System.out.println(Arrays.toString(sol.solve(5)));  // [0, 1, 1, 2, 3]
        System.out.println(Arrays.toString(sol.solve(10))); // [0,1,1,2,3,5,8,13,21,34]
    }

}
