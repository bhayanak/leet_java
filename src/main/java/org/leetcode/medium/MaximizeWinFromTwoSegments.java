package org.leetcode.medium;


/**
 * <b>#2555 - Maximize Win From Two Segments</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are some prizes on the X-axis. You are given an integer array prizePositions that is sorted in non-decreasing order, where prizePositions[i] is the position of the ith prize. There could be different prizes at the same position on the line. You are also given an integer k.
 *
 *
 * You are allowed to select two segments with integer endpoints. The length of each segment must be k. You will collect all prizes whose position falls within at least one of the two selected segments (including the endpoints of the segments). The two selected segments may intersect.
 *
 *
 * For example if k = 2, you can choose segments [1, 3] and [2, 4], and you will win any prize i that satisfies 1 &lt;= prizePositions[i] &lt;= 3 or 2 &lt;= prizePositions[i] &lt;= 4.
 *
 * Return the maximum number of prizes you can win if you choose the two segments optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: prizePositions = [1,1,2,2,3,3,5], k = 2
 * Output: 7
 * Explanation: In this example, you can win all 7 prizes by selecting two segments [1, 3] and [3, 5].
 *
 * Example 2:
 *
 * Input: prizePositions = [1,2,3,4], k = 0
 * Output: 2
 * Explanation: For this example, one choice for the segments is [3, 3] and [4, 4], and you will be able to get 2 prizes. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= prizePositions.length &lt;= 105
 *
 * 1 &lt;= prizePositions[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= 109 
 *
 * prizePositions is sorted in non-decreasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try solving the problem for one interval.
 * Hint 2: Using the solution with one interval, how can you combine that with a second interval?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/maximize-win-from-two-segments/">LeetCode #2555</a>
 */
public class MaximizeWinFromTwoSegments {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Win From Two Segments");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeWinFromTwoSegments ===");
        MaximizeWinFromTwoSegments sol = new MaximizeWinFromTwoSegments();
        System.out.println(sol.solve(null));
    }
}
