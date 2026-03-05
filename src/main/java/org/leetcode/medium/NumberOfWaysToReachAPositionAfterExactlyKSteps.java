package org.leetcode.medium;


/**
 * <b>#2400 - Number of Ways to Reach a Position After Exactly k Steps</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers startPos and endPos. Initially, you are standing at position startPos on an infinite number line. With one step, you can move either one position to the left, or one position to the right.
 *
 *
 * Given a positive integer k, return the number of different ways to reach the position endPos starting from startPos, such that you perform exactly k steps. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Two ways are considered different if the order of the steps made is not exactly the same.
 *
 *
 * Note that the number line includes negative integers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: startPos = 1, endPos = 2, k = 3
 * Output: 3
 * Explanation: We can reach position 2 from 1 in exactly 3 steps in three ways:
 * - 1 -&gt; 2 -&gt; 3 -&gt; 2.
 * - 1 -&gt; 2 -&gt; 1 -&gt; 2.
 * - 1 -&gt; 0 -&gt; 1 -&gt; 2.
 * It can be proven that no other way is possible, so we return 3.
 *
 * Example 2:
 *
 * Input: startPos = 2, endPos = 5, k = 10
 * Output: 0
 * Explanation: It is impossible to reach position 5 from position 2 in exactly 10 steps.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= startPos, endPos, k &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many steps to the left and to the right do you need to make exactly?
 * Hint 2: Does the order of the steps matter?
 * Hint 3: Use combinatorics to find the number of ways to order the steps.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps/">LeetCode #2400</a>
 */
public class NumberOfWaysToReachAPositionAfterExactlyKSteps {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Reach a Position After Exactly k Steps");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToReachAPositionAfterExactlyKSteps ===");
        NumberOfWaysToReachAPositionAfterExactlyKSteps sol = new NumberOfWaysToReachAPositionAfterExactlyKSteps();
        System.out.println(sol.solve(null));
    }
}
