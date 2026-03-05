package org.leetcode.hard;


/**
 * <b>#1751 - Maximum Number of Events That Can Be Attended II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of events where events[i] = [startDayi, endDayi, valuei]. The ith event starts at startDayi and ends at endDayi, and if you attend this event, you will receive a value of valuei. You are also given an integer k which represents the maximum number of events you can attend.
 *
 *
 * You can only attend one event at a time. If you choose to attend an event, you must attend the entire event. Note that the end day is inclusive: that is, you cannot attend two events where one of them starts and the other ends on the same day.
 *
 *
 * Return the maximum sum of values that you can receive by attending events.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: events = [[1,2,4],[3,4,3],[2,3,1]], k = 2
 * Output: 7
 * Explanation: Choose the green events, 0 and 1 (0-indexed) for a total value of 4 + 3 = 7.
 *
 * Example 2:
 *
 * Input: events = [[1,2,4],[3,4,3],[2,3,10]], k = 2
 * Output: 10
 * Explanation: Choose event 2 for a total value of 10.
 * Notice that you cannot attend any other event as they overlap, and that you do not have to attend k events.
 *
 * Example 3:
 *
 * Input: events = [[1,1,1],[2,2,2],[3,3,3],[4,4,4]], k = 3
 * Output: 9
 * Explanation: Although the events do not overlap, you can only attend 3 events. Pick the highest valued three.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= events.length
 *
 * 1 &lt;= k * events.length &lt;= 106
 *
 * 1 &lt;= startDayi &lt;= endDayi &lt;= 109
 *
 * 1 &lt;= valuei &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the events by its startTime.
 * Hint 2: For every event, you can either choose it and consider the next event available, or you can ignore it. You can efficiently find the next event that is available using binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/">LeetCode #1751</a>
 */
public class MaximumNumberOfEventsThatCanBeAttendedIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Events That Can Be Attended II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfEventsThatCanBeAttendedIi ===");
        MaximumNumberOfEventsThatCanBeAttendedIi sol = new MaximumNumberOfEventsThatCanBeAttendedIi();
        System.out.println(sol.solve(null));
    }
}
