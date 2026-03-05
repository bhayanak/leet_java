package org.leetcode.hard;


/**
 * <b>#3116 - Kth Smallest Amount With Single Denomination Combination</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Bit Manipulation, Combinatorics, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array coins representing coins of different denominations and an integer k.
 *
 *
 * You have an infinite number of coins of each denomination. However, you are not allowed to combine coins of different denominations.
 *
 *
 * Return the kth smallest amount that can be made using these coins.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [3,6,9], k = 3
 *
 *
 * Output:  9
 *
 *
 * Explanation: The given coins can make the following amounts:
 *
 * Coin 3 produces multiples of 3: 3, 6, 9, 12, 15, etc.
 *
 * Coin 6 produces multiples of 6: 6, 12, 18, 24, etc.
 *
 * Coin 9 produces multiples of 9: 9, 18, 27, 36, etc.
 *
 * All of the coins combined produce: 3, 6, 9, 12, 15, etc.
 *
 * Example 2:
 *
 * Input: coins = [5,2], k = 7
 *
 *
 * Output: 12 
 *
 *
 * Explanation: The given coins can make the following amounts:
 *
 * Coin 5 produces multiples of 5: 5, 10, 15, 20, etc.
 *
 * Coin 2 produces multiples of 2: 2, 4, 6, 8, 10, 12, etc.
 *
 * All of the coins combined produce: 2, 4, 5, 6, 8, 10, 12, 14, 15, etc.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= coins.length &lt;= 15
 *
 * 1 &lt;= coins[i] &lt;= 25
 *
 * 1 &lt;= k &lt;= 2 * 109
 *
 * coins contains pairwise distinct integers.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary search the answer <code>x</code>.
 * Hint 2: Use the inclusion-exclusion principle to count the number of distinct amounts that can be made up to <code>x</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Bit Manipulation, Combinatorics, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/">LeetCode #3116</a>
 */
public class KthSmallestAmountWithSingleDenominationCombination {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Kth Smallest Amount With Single Denomination Combination");
    }

    public static void main(String[] args) {
        System.out.println("=== KthSmallestAmountWithSingleDenominationCombination ===");
        KthSmallestAmountWithSingleDenominationCombination sol = new KthSmallestAmountWithSingleDenominationCombination();
        System.out.println(sol.solve(null));
    }
}
