package org.leetcode.medium;


/**
 * <b>#1922 - Count Good Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).
 *
 *
 * For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
 *
 * Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 5
 * Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".
 *
 * Example 2:
 *
 * Input: n = 4
 * Output: 400
 *
 * Example 3:
 *
 * Input: n = 50
 * Output: 564908303
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a formula we can use to find the count of all the good numbers?
 * Hint 2: Exponentiation can be done very fast if we looked at the binary bits of n.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Recursion).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-good-numbers/">LeetCode #1922</a>
 */
public class CountGoodNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Good Numbers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountGoodNumbers ===");
        CountGoodNumbers sol = new CountGoodNumbers();
        System.out.println(sol.solve(null));
    }
}
