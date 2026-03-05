package org.leetcode.hard;


/**
 * <b>#2589 - Minimum Time to Complete All Tasks</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Stack, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a computer that can run an unlimited number of tasks at the same time. You are given a 2D integer array tasks where tasks[i] = [starti, endi, durationi] indicates that the ith task should run for a total of durationi seconds (not necessarily continuous) within the inclusive time range [starti, endi].
 *
 *
 * You may turn on the computer only when it needs to run a task. You can also turn it off if it is idle.
 *
 *
 * Return the minimum time during which the computer should be turned on to complete all tasks.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [[2,3,1],[4,5,1],[1,5,2]]
 * Output: 2
 * Explanation: 
 * - The first task can be run in the inclusive time range [2, 2].
 * - The second task can be run in the inclusive time range [5, 5].
 * - The third task can be run in the two inclusive time ranges [2, 2] and [5, 5].
 * The computer will be on for a total of 2 seconds.
 *
 * Example 2:
 *
 * Input: tasks = [[1,3,2],[2,5,3],[5,6,2]]
 * Output: 4
 * Explanation: 
 * - The first task can be run in the inclusive time range [2, 3].
 * - The second task can be run in the inclusive time ranges [2, 3] and [5, 5].
 * - The third task can be run in the two inclusive time range [5, 6].
 * The computer will be on for a total of 4 seconds.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= tasks.length &lt;= 2000
 *
 * tasks[i].length == 3
 *
 * 1 &lt;= starti, endi &lt;= 2000
 *
 * 1 &lt;= durationi &lt;= endi - starti + 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the tasks in ascending order of end time
 * Hint 2: Since there are only up to 2000 time points to consider, you can check them one by one
 * Hint 3: It is always beneficial to run the task as late as possible so that later tasks can run simultaneously.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Stack, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-complete-all-tasks/">LeetCode #2589</a>
 */
public class MinimumTimeToCompleteAllTasks {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Complete All Tasks");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToCompleteAllTasks ===");
        MinimumTimeToCompleteAllTasks sol = new MinimumTimeToCompleteAllTasks();
        System.out.println(sol.solve(null));
    }
}
