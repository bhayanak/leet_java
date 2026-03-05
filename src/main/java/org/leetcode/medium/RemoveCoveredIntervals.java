package org.leetcode.medium;


/**
 * <b>#1288 - Remove Covered Intervals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.
 *
 *
 * The interval [a, b) is covered by the interval [c, d) if and only if c &lt;= a and b &lt;= d.
 *
 *
 * Return the number of remaining intervals.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,4],[3,6],[2,8]]
 * Output: 2
 * Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
 *
 * Example 2:
 *
 * Input: intervals = [[1,4],[2,3]]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= intervals.length &lt;= 1000
 *
 * intervals[i].length == 2
 *
 * 0 &lt;= li &lt; ri &lt;= 105
 *
 * All the given intervals are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to check if an interval is covered by another?
 * Hint 2: Compare each interval to all others and check if it is covered by any interval.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-covered-intervals/">LeetCode #1288</a>
 */
public class RemoveCoveredIntervals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove Covered Intervals");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RemoveCoveredIntervals ===");
        RemoveCoveredIntervals sol = new RemoveCoveredIntervals();
        System.out.println(sol.solve(null));
    }
}
