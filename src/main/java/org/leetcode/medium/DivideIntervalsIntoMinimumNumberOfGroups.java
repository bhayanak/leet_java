package org.leetcode.medium;


/**
 * <b>#2406 - Divide Intervals Into Minimum Number of Groups</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting, Heap (Priority Queue), Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array intervals where intervals[i] = [lefti, righti] represents the inclusive interval [lefti, righti].
 *
 *
 * You have to divide the intervals into one or more groups such that each interval is in exactly one group, and no two intervals that are in the same group intersect each other.
 *
 *
 * Return the minimum number of groups you need to make.
 *
 *
 * Two intervals intersect if there is at least one common number between them. For example, the intervals [1, 5] and [5, 8] intersect.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
 * Output: 3
 * Explanation: We can divide the intervals into the following groups:
 * - Group 1: [1, 5], [6, 8].
 * - Group 2: [2, 3], [5, 10].
 * - Group 3: [1, 10].
 * It can be proven that it is not possible to divide the intervals into fewer than 3 groups.
 *
 * Example 2:
 *
 * Input: intervals = [[1,3],[5,6],[8,10],[11,13]]
 * Output: 1
 * Explanation: None of the intervals overlap, so we can put all of them in one group.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= intervals.length &lt;= 105
 *
 * intervals[i].length == 2
 *
 * 1 &lt;= lefti &lt;= righti &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you find a different way to describe the question?
 * Hint 2: The minimum number of groups we need is equivalent to the maximum number of intervals that overlap at some point. How can you find that?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting, Heap (Priority Queue), Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/">LeetCode #2406</a>
 */
public class DivideIntervalsIntoMinimumNumberOfGroups {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Divide Intervals Into Minimum Number of Groups");
    }

    public static void main(String[] args) {
        System.out.println("=== DivideIntervalsIntoMinimumNumberOfGroups ===");
        DivideIntervalsIntoMinimumNumberOfGroups sol = new DivideIntervalsIntoMinimumNumberOfGroups();
        System.out.println(sol.solve(null));
    }
}
