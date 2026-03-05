package org.leetcode.medium;


/**
 * <b>#1780 - Check if Number is a Sum of Powers of Three</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.
 *
 *
 * An integer y is a power of three if there exists an integer x such that y == 3x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 12
 * Output: true
 * Explanation: 12 = 31 + 32
 *
 * Example 2:
 *
 * Input: n = 91
 * Output: true
 * Explanation: 91 = 30 + 32 + 34
 *
 * Example 3:
 *
 * Input: n = 21
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's note that the maximum power of 3 you'll use in your soln is 3^16
 * Hint 2: The number can not be represented as a sum of powers of 3 if it's ternary presentation has a 2 in it
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/">LeetCode #1780</a>
 */
public class CheckIfNumberIsASumOfPowersOfThree {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if Number is a Sum of Powers of Three");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfNumberIsASumOfPowersOfThree ===");
        CheckIfNumberIsASumOfPowersOfThree sol = new CheckIfNumberIsASumOfPowersOfThree();
        System.out.println(sol.solve(null));
    }
}
