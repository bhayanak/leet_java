package org.leetcode.medium;


/**
 * <b>#3169 - Count Days Without Meetings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer days representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array meetings of size n where, meetings[i] = [start_i, end_i] represents the starting and ending days of meeting i (inclusive).
 *
 *
 * Return the count of days when the employee is available for work but no meetings are scheduled.
 *
 *
 * Note: The meetings may overlap.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There is no meeting scheduled on the 4th and 8th days.
 *
 * Example 2:
 *
 * Input: days = 5, meetings = [[2,4],[1,3]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * There is no meeting scheduled on the 5th day.
 *
 * Example 3:
 *
 * Input: days = 6, meetings = [[1,6]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Meetings are scheduled for all working days.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= days &lt;= 109
 *
 * 1 &lt;= meetings.length &lt;= 105
 *
 * meetings[i].length == 2
 *
 * 1 &lt;= meetings[i][0] &lt;= meetings[i][1] &lt;= days
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Merge the overlapping meetings and sort the new meetings timings.
 * Hint 2: Return the sum of difference between the end time of a meeting and the start time of the next meeting for all adjacent pairs.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/count-days-without-meetings/">LeetCode #3169</a>
 */
public class CountDaysWithoutMeetings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Days Without Meetings");
    }

    public static void main(String[] args) {
        System.out.println("=== CountDaysWithoutMeetings ===");
        CountDaysWithoutMeetings sol = new CountDaysWithoutMeetings();
        System.out.println(sol.solve(null));
    }
}
