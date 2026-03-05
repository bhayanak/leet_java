package org.leetcode.medium;


/**
 * <b>#3439 - Reschedule Meetings for Maximum Free Time I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer eventTime denoting the duration of an event, where the event occurs from time t = 0 to time t = eventTime.
 *
 *
 * You are also given two integer arrays startTime and endTime, each of length n. These represent the start and end time of n non-overlapping meetings, where the ith meeting occurs during the time [startTime[i], endTime[i]].
 *
 *
 * You can reschedule at most k meetings by moving their start time while maintaining the same duration, to maximize the longest continuous period of free time during the event.
 *
 *
 * The relative order of all the meetings should stay the same and they should remain non-overlapping.
 *
 *
 * Return the maximum amount of free time possible after rearranging the meetings.
 *
 *
 * Note that the meetings can not be rescheduled to a time outside the event.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: eventTime = 5, k = 1, startTime = [1,3], endTime = [2,5]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * Reschedule the meeting at [1, 2] to [2, 3], leaving no meetings during the time [0, 2].
 *
 * Example 2:
 *
 * Input: eventTime = 10, k = 1, startTime = [0,2,9], endTime = [1,4,10]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 * Reschedule the meeting at [2, 4] to [1, 3], leaving no meetings during the time [3, 9].
 *
 * Example 3:
 *
 * Input: eventTime = 5, k = 2, startTime = [0,1,2,3,4], endTime = [1,2,3,4,5]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There is no time during the event not occupied by meetings.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= eventTime &lt;= 109
 *
 * n == startTime.length == endTime.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= k &lt;= n
 *
 * 0 &lt;= startTime[i] &lt; endTime[i] &lt;= eventTime
 *
 * endTime[i] &lt;= startTime[i + 1] where i lies in the range [0, n - 2].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In a sequence of <code>K</code> meetings and <code>K + 1</code> gaps, you could move all meetings to the start of the sequence to get the max free time.
 * Hint 2: Use a sliding window of <code>K + 1</code> size to store sum of gaps and take the maximum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/reschedule-meetings-for-maximum-free-time-i/">LeetCode #3439</a>
 */
public class RescheduleMeetingsForMaximumFreeTimeI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reschedule Meetings for Maximum Free Time I");
    }

    public static void main(String[] args) {
        System.out.println("=== RescheduleMeetingsForMaximumFreeTimeI ===");
        RescheduleMeetingsForMaximumFreeTimeI sol = new RescheduleMeetingsForMaximumFreeTimeI();
        System.out.println(sol.solve(null));
    }
}
