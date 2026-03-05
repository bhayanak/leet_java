package org.leetcode.medium;


/**
 * <b>#1353 - Maximum Number of Events That Can Be Attended</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.
 *
 *
 * You can attend an event i at any day d where startDayi &lt;= d &lt;= endDayi. You can only attend one event at any time d.
 *
 *
 * Return the maximum number of events you can attend.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: events = [[1,2],[2,3],[3,4]]
 * Output: 3
 * Explanation: You can attend all the three events.
 * One way to attend them all is as shown.
 * Attend the first event on day 1.
 * Attend the second event on day 2.
 * Attend the third event on day 3.
 *
 * Example 2:
 *
 * Input: events= [[1,2],[2,3],[3,4],[1,2]]
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= events.length &lt;= 105
 *
 * events[i].length == 2
 *
 * 1 &lt;= startDayi &lt;= endDayi &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the events by the start time and in case of tie by the end time in ascending order.
 * Hint 2: Loop over the sorted events. Attend as much as you can and keep the last day occupied. When you try to attend new event keep in mind the first day you can attend a new event in.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/">LeetCode #1353</a>
 */
public class MaximumNumberOfEventsThatCanBeAttended {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Events That Can Be Attended");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfEventsThatCanBeAttended ===");
        MaximumNumberOfEventsThatCanBeAttended sol = new MaximumNumberOfEventsThatCanBeAttended();
        System.out.println(sol.solve(null));
    }
}
