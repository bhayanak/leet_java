package org.leetcode.hard;


/**
 * <b>#1866 - Number of Ways to Rearrange Sticks With K Sticks Visible</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n uniquely-sized sticks whose lengths are integers from 1 to n. You want to arrange the sticks such that exactly k sticks are visible from the left. A stick is visible from the left if there are no longer sticks to the left of it.
 *
 *
 * For example, if the sticks are arranged [1,3,2,5,4], then the sticks with lengths 1, 3, and 5 are visible from the left.
 *
 * Given n and k, return the number of such arrangements. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 2
 * Output: 3
 * Explanation: [1,3,2], [2,3,1], and [2,1,3] are the only arrangements such that exactly 2 sticks are visible.
 * The visible sticks are underlined.
 *
 * Example 2:
 *
 * Input: n = 5, k = 5
 * Output: 1
 * Explanation: [1,2,3,4,5] is the only arrangement such that all 5 sticks are visible.
 * The visible sticks are underlined.
 *
 * Example 3:
 *
 * Input: n = 20, k = 11
 * Output: 647427950
 * Explanation: There are 647427950 (mod 109 + 7) ways to rearrange the sticks such that exactly 11 sticks are visible.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a way to build the solution from a base case?
 * Hint 2: How many ways are there if we fix the position of one stick?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-rearrange-sticks-with-k-sticks-visible/">LeetCode #1866</a>
 */
public class NumberOfWaysToRearrangeSticksWithKSticksVisible {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Rearrange Sticks With K Sticks Visible");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToRearrangeSticksWithKSticksVisible ===");
        NumberOfWaysToRearrangeSticksWithKSticksVisible sol = new NumberOfWaysToRearrangeSticksWithKSticksVisible();
        System.out.println(sol.solve(null));
    }
}
