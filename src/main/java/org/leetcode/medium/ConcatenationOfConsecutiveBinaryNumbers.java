package org.leetcode.medium;


/**
 * <b>#1680 - Concatenation of Consecutive Binary Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Bit Manipulation, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 1
 * Explanation: "1" in binary corresponds to the decimal value 1. 
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: 27
 * Explanation: In binary, 1, 2, and 3 corresponds to "1", "10", and "11".
 * After concatenating them, we have "11011", which corresponds to the decimal value 27.
 *
 * Example 3:
 *
 * Input: n = 12
 * Output: 505379714
 * Explanation: The concatenation results in "1101110010111011110001001101010111100".
 * The decimal value of that is 118505380540.
 * After modulo 109 + 7, the result is 505379714.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Express the nth number value in a recursion formula and think about how we can do a fast evaluation.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/">LeetCode #1680</a>
 */
public class ConcatenationOfConsecutiveBinaryNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Concatenation of Consecutive Binary Numbers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ConcatenationOfConsecutiveBinaryNumbers ===");
        ConcatenationOfConsecutiveBinaryNumbers sol = new ConcatenationOfConsecutiveBinaryNumbers();
        System.out.println(sol.solve(null));
    }
}
