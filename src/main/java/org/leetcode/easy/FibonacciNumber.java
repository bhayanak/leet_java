package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #509: Fibonacci Number
 * @see <a href="https://leetcode.com/problems/fibonacci-number/">Problem</a>
 */
public class FibonacciNumber {

    /**
     * Returns the n-th Fibonacci number (0-indexed: F(0)=0, F(1)=1).
     * @param n index
     * @return F(n)
     * <p><b>Explanation:</b> Iterative bottom-up DP: O(n) time, O(1) space.</p>
     */
    public int solve(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }

    public static void main(String[] args) {
        FibonacciNumber sol = new FibonacciNumber();
        System.out.println(sol.solve(2));  // 1
        System.out.println(sol.solve(3));  // 2
        System.out.println(sol.solve(4));  // 3
        System.out.println(sol.solve(10)); // 55
    }

}
