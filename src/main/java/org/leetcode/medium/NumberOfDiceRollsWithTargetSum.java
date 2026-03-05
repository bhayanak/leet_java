package org.leetcode.medium;


/**
 * <b>#1155 - Number of Dice Rolls With Target Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n dice, and each dice has k faces numbered from 1 to k.
 *
 *
 * Given three integers n, k, and target, return the number of possible ways (out of the kn total ways) to roll the dice, so the sum of the face-up numbers equals target. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1, k = 6, target = 3
 * Output: 1
 * Explanation: You throw one die with 6 faces.
 * There is only one way to get a sum of 3.
 *
 * Example 2:
 *
 * Input: n = 2, k = 6, target = 7
 * Output: 6
 * Explanation: You throw two dice, each with 6 faces.
 * There are 6 ways to get a sum of 7: 1+6, 2+5, 3+4, 4+3, 5+2, 6+1.
 *
 * Example 3:
 *
 * Input: n = 30, k = 30, target = 500
 * Output: 222616187
 * Explanation: The answer must be returned modulo 109 + 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, k &lt;= 30
 *
 * 1 &lt;= target &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.  The states are how many dice are remaining, and what sum total you have rolled so far.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/">LeetCode #1155</a>
 */
public class NumberOfDiceRollsWithTargetSum {

    /**
     * TODO: Implement "Number of Dice Rolls With Target Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Dice Rolls With Target Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfDiceRollsWithTargetSum.java &amp;&amp; java org.leetcode.medium.NumberOfDiceRollsWithTargetSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfDiceRollsWithTargetSum ===");
        NumberOfDiceRollsWithTargetSum sol = new NumberOfDiceRollsWithTargetSum();
        System.out.println(sol.solve(null));
    }
}
