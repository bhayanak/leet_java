package org.leetcode.medium;


/**
 * <b>#2365 - Task Scheduler II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of positive integers tasks, representing tasks that need to be completed in order, where tasks[i] represents the type of the ith task.
 *
 *
 * You are also given a positive integer space, which represents the minimum number of days that must pass after the completion of a task before another task of the same type can be performed.
 *
 *
 * Each day, until all tasks have been completed, you must either:
 *
 *
 * Complete the next task from tasks, or
 *
 * Take a break.
 *
 * Return the minimum number of days needed to complete all tasks.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [1,2,1,2,3,1], space = 3
 * Output: 9
 * Explanation:
 * One way to complete all tasks in 9 days is as follows:
 * Day 1: Complete the 0th task.
 * Day 2: Complete the 1st task.
 * Day 3: Take a break.
 * Day 4: Take a break.
 * Day 5: Complete the 2nd task.
 * Day 6: Complete the 3rd task.
 * Day 7: Take a break.
 * Day 8: Complete the 4th task.
 * Day 9: Complete the 5th task.
 * It can be shown that the tasks cannot be completed in less than 9 days.
 *
 * Example 2:
 *
 * Input: tasks = [5,8,8,5], space = 2
 * Output: 6
 * Explanation:
 * One way to complete all tasks in 6 days is as follows:
 * Day 1: Complete the 0th task.
 * Day 2: Complete the 1st task.
 * Day 3: Take a break.
 * Day 4: Take a break.
 * Day 5: Complete the 2nd task.
 * Day 6: Complete the 3rd task.
 * It can be shown that the tasks cannot be completed in less than 6 days.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= tasks.length &lt;= 105
 *
 * 1 &lt;= tasks[i] &lt;= 109
 *
 * 1 &lt;= space &lt;= tasks.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try taking breaks as late as possible, such that tasks are still spaced appropriately.
 * Hint 2: Whenever considering whether to complete the next task, if it is not the first task of its type, check how many days ago the previous task was completed and add an appropriate number of breaks.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/task-scheduler-ii/">LeetCode #2365</a>
 */
public class TaskSchedulerIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Task Scheduler II");
    }

    public static void main(String[] args) {
        System.out.println("=== TaskSchedulerIi ===");
        TaskSchedulerIi sol = new TaskSchedulerIi();
        System.out.println(sol.solve(null));
    }
}
