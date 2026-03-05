package org.leetcode.medium;


/**
 * <b>#1201 - Ugly Number III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search, Combinatorics, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An ugly number is a positive integer that is divisible by a, b, or c.
 *
 *
 * Given four integers n, a, b, and c, return the nth ugly number.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, a = 2, b = 3, c = 5
 * Output: 4
 * Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.
 *
 * Example 2:
 *
 * Input: n = 4, a = 2, b = 3, c = 4
 * Output: 6
 * Explanation: The ugly numbers are 2, 3, 4, 6, 8, 9, 10, 12... The 4th is 6.
 *
 * Example 3:
 *
 * Input: n = 5, a = 2, b = 11, c = 13
 * Output: 10
 * Explanation: The ugly numbers are 2, 4, 6, 8, 10, 11, 12, 13... The 5th is 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, a, b, c &lt;= 109
 *
 * 1 &lt;= a * b * c &lt;= 1018
 *
 * It is guaranteed that the result will be in range [1, 2 * 109].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Write a function f(k) to determine how many ugly numbers smaller than k. As f(k) is non-decreasing, try binary search.
 * Hint 2: Find all ugly numbers in [1, LCM(a, b, c)] (LCM is Least Common Multiple). Use inclusion-exclusion principle to expand the result.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search, Combinatorics, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/ugly-number-iii/">LeetCode #1201</a>
 */
public class UglyNumberIii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Ugly Number III");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== UglyNumberIii ===");
        UglyNumberIii sol = new UglyNumberIii();
        System.out.println(sol.solve(null));
    }
}
