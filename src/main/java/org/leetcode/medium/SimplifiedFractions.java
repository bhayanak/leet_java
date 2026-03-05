package org.leetcode.medium;


/**
 * <b>#1447 - Simplified Fractions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return a list of all simplified fractions between 0 and 1 (exclusive) such that the denominator is less-than-or-equal-to n. You can return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: ["1/2"]
 * Explanation: "1/2" is the only unique fraction with a denominator less-than-or-equal-to 2.
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: ["1/2","1/3","2/3"]
 *
 * Example 3:
 *
 * Input: n = 4
 * Output: ["1/2","1/3","1/4","2/3","3/4"]
 * Explanation: "2/4" is not a simplified fraction because it can be simplified to "1/2".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A fraction is fully simplified if there is no integer that divides cleanly into the numerator and denominator.
 * Hint 2: In other words the greatest common divisor of the numerator and the denominator of a simplified fraction is 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/simplified-fractions/">LeetCode #1447</a>
 */
public class SimplifiedFractions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Simplified Fractions");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SimplifiedFractions ===");
        SimplifiedFractions sol = new SimplifiedFractions();
        System.out.println(sol.solve(null));
    }
}
