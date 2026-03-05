package org.leetcode.medium;


/**
 * <b>#1986 - Minimum Number of Work Sessions to Finish the Tasks</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n tasks assigned to you. The task times are represented as an integer array tasks of length n, where the ith task takes tasks[i] hours to finish. A work session is when you work for at most sessionTime consecutive hours and then take a break.
 *
 *
 * You should finish the given tasks in a way that satisfies the following conditions:
 *
 *
 * If you start a task in a work session, you must complete it in the same work session.
 *
 * You can start a new task immediately after finishing the previous one.
 *
 * You may complete the tasks in any order.
 *
 * Given tasks and sessionTime, return the minimum number of work sessions needed to finish all the tasks following the conditions above.
 *
 *
 * The tests are generated such that sessionTime is greater than or equal to the maximum element in tasks[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [1,2,3], sessionTime = 3
 * Output: 2
 * Explanation: You can finish the tasks in two work sessions.
 * - First work session: finish the first and the second tasks in 1 + 2 = 3 hours.
 * - Second work session: finish the third task in 3 hours.
 *
 * Example 2:
 *
 * Input: tasks = [3,1,3,1,1], sessionTime = 8
 * Output: 2
 * Explanation: You can finish the tasks in two work sessions.
 * - First work session: finish all the tasks except the last one in 3 + 1 + 3 + 1 = 8 hours.
 * - Second work session: finish the last task in 1 hour.
 *
 * Example 3:
 *
 * Input: tasks = [1,2,3,4,5], sessionTime = 15
 * Output: 1
 * Explanation: You can finish all the tasks in one work session.
 *
 *
 *
 * Constraints:
 *
 *
 * n == tasks.length
 *
 * 1 &lt;= n &lt;= 14
 *
 * 1 &lt;= tasks[i] &lt;= 10
 *
 * max(tasks[i]) &lt;= sessionTime &lt;= 15
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all possible ways of assignment.
 * Hint 2: If we can store the assignments in form of a state then we can reuse that state and solve the problem in a faster way.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-work-sessions-to-finish-the-tasks/">LeetCode #1986</a>
 */
public class MinimumNumberOfWorkSessionsToFinishTheTasks {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Work Sessions to Finish the Tasks");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfWorkSessionsToFinishTheTasks ===");
        MinimumNumberOfWorkSessionsToFinishTheTasks sol = new MinimumNumberOfWorkSessionsToFinishTheTasks();
        System.out.println(sol.solve(null));
    }
}
