package org.leetcode.medium;


/**
 * <b>#2054 - Two Best Non-Overlapping Events</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.
 *
 *
 * Return this maximum sum.
 *
 *
 * Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time t, the next event must start at or after t + 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: events = [[1,3,2],[4,5,2],[2,4,3]]
 * Output: 4
 * Explanation: Choose the green events, 0 and 1 for a sum of 2 + 2 = 4.
 *
 * Example 2:
 *
 * Input: events = [[1,3,2],[4,5,2],[1,5,5]]
 * Output: 5
 * Explanation: Choose event 2 for a sum of 5.
 *
 * Example 3:
 *
 * Input: events = [[1,5,3],[1,5,1],[6,6,5]]
 * Output: 8
 * Explanation: Choose events 0 and 2 for a sum of 3 + 5 = 8.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= events.length &lt;= 105
 *
 * events[i].length == 3
 *
 * 1 &lt;= startTimei &lt;= endTimei &lt;= 109
 *
 * 1 &lt;= valuei &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can sorting the events on the basis of their start times help? How about end times?
 * Hint 2: How can we quickly get the maximum score of an interval not intersecting with the interval we chose?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/two-best-non-overlapping-events/">LeetCode #2054</a>
 */
public class TwoBestNonOverlappingEvents {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Two Best Non-Overlapping Events");
    }

    public static void main(String[] args) {
        System.out.println("=== TwoBestNonOverlappingEvents ===");
        TwoBestNonOverlappingEvents sol = new TwoBestNonOverlappingEvents();
        System.out.println(sol.solve(null));
    }
}
