package org.leetcode.medium;


/**
 * <b>#986 - Interval List Intersections</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sweep Line</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two lists of closed intervals, firstList and secondList, where firstList[i] = [starti, endi] and secondList[j] = [startj, endj]. Each list of intervals is pairwise disjoint and in sorted order.
 *
 *
 * Return the intersection of these two interval lists.
 *
 *
 * A closed interval [a, b] (with a &lt;= b) denotes the set of real numbers x with a &lt;= x &lt;= b.
 *
 *
 * The intersection of two closed intervals is a set of real numbers that are either empty or represented as a closed interval. For example, the intersection of [1, 3] and [2, 4] is [2, 3].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
 * Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
 *
 * Example 2:
 *
 * Input: firstList = [[1,3],[5,9]], secondList = []
 * Output: []
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= firstList.length, secondList.length &lt;= 1000
 *
 * firstList.length + secondList.length &gt;= 1
 *
 * 0 &lt;= starti &lt; endi &lt;= 109
 *
 * endi &lt; starti+1
 *
 * 0 &lt;= startj &lt; endj &lt;= 109 
 *
 * endj &lt; startj+1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Sweep Line).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/interval-list-intersections/">LeetCode #986</a>
 */
public class IntervalListIntersections {

    /**
     * TODO: Implement "Interval List Intersections".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Interval List Intersections");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac IntervalListIntersections.java &amp;&amp; java org.leetcode.medium.IntervalListIntersections</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== IntervalListIntersections ===");
        IntervalListIntersections sol = new IntervalListIntersections();
        System.out.println(sol.solve(null));
    }
}
