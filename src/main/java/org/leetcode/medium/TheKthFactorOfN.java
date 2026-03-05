package org.leetcode.medium;


/**
 * <b>#1492 - The kth Factor of n</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
 *
 *
 * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 12, k = 3
 * Output: 3
 * Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
 *
 * Example 2:
 *
 * Input: n = 7, k = 2
 * Output: 7
 * Explanation: Factors list is [1, 7], the 2nd factor is 7.
 *
 * Example 3:
 *
 * Input: n = 4, k = 4
 * Output: -1
 * Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= n &lt;= 1000
 *
 *
 *
 * Follow up:
 *
 *
 * Could you solve this problem in less than O(n) complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The factors of n will be always in the range [1, n].
 * Hint 2: Keep a list of all factors sorted.  Loop i from 1 to n and add i if n % i == 0. Return the kth factor if it exist in this list.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/the-kth-factor-of-n/">LeetCode #1492</a>
 */
public class TheKthFactorOfN {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: The kth Factor of n");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TheKthFactorOfN ===");
        TheKthFactorOfN sol = new TheKthFactorOfN();
        System.out.println(sol.solve(null));
    }
}
