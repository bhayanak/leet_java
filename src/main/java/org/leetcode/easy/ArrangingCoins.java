package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #441: Arranging Coins
 * @see <a href="https://leetcode.com/problems/arranging-coins/">Problem</a>
 */
public class ArrangingCoins {

    /**
     * LeetCode #441 – Arranging Coins
     * Difficulty: EASY
     * Topics: Math, Binary Search
     *
     * You have n coins and you want to build a staircase with these coins. The
     * staircase consists of k rows where the ith row has exactly i coins. The
     * last row of the staircase may be incomplete.
     * 
     * 
     * Given the integer n, return the number of complete rows of the staircase
     * you will build.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 5
     * Output: 2
     * Explanation: Because the 3rd row is incomplete, we return 2.
     * 
     * Example 2:
     * 
     * Input: n = 8
     * Output: 3
     * Explanation: Because the 4th row is incomplete, we return 3.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= n &lt;= 231 - 1
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    // Binary search: find k such that k*(k+1)/2 <= n < (k+1)*(k+2)/2
    /**
     * Solves the problem: Arrange coins.
     * Uses binary search for O(log n) lookup.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int arrangeCoins(int n) {
        long lo = 0, hi = n;
        while (lo < hi) {
            long mid = lo + (hi - lo + 1) / 2;
            if (mid * (mid + 1) / 2 <= n) lo = mid;
            else hi = mid - 1;
        }
        return (int) lo;
    }

    public static void main(String[] args) {
        ArrangingCoins sol = new ArrangingCoins();
        System.out.println(sol.arrangeCoins(0));
    }
}
