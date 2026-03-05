package org.leetcode.hard;


/**
 * <b>#1269 - Number of Ways to Stay in the Same Place After Some Steps</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a pointer at index 0 in an array of size arrLen. At each step, you can move 1 position to the left, 1 position to the right in the array, or stay in the same place (The pointer should not be placed outside the array at any time).
 *
 *
 * Given two integers steps and arrLen, return the number of ways such that your pointer is still at index 0 after exactly steps steps. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: steps = 3, arrLen = 2
 * Output: 4
 * Explanation: There are 4 differents ways to stay at index 0 after 3 steps.
 * Right, Left, Stay
 * Stay, Right, Left
 * Right, Stay, Left
 * Stay, Stay, Stay
 *
 * Example 2:
 *
 * Input: steps = 2, arrLen = 4
 * Output: 2
 * Explanation: There are 2 differents ways to stay at index 0 after 2 steps
 * Right, Left
 * Stay, Stay
 *
 * Example 3:
 *
 * Input: steps = 4, arrLen = 2
 * Output: 8
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= steps &lt;= 500
 *
 * 1 &lt;= arrLen &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try with Dynamic programming, dp(pos,steps): number of ways to back pos = 0 using exactly "steps" moves.
 * Hint 2: Notice that the computational complexity does not depend of "arrlen".
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-stay-in-the-same-place-after-some-steps/">LeetCode #1269</a>
 */
public class NumberOfWaysToStayInTheSamePlaceAfterSomeSteps {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Stay in the Same Place After Some Steps");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToStayInTheSamePlaceAfterSomeSteps ===");
        NumberOfWaysToStayInTheSamePlaceAfterSomeSteps sol = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();
        System.out.println(sol.solve(null));
    }
}
