package org.leetcode.hard;


/**
 * <b>#2071 - Maximum Number of Tasks You Can Assign</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Greedy, Queue, Sorting, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n tasks and m workers. Each task has a strength requirement stored in a 0-indexed integer array tasks, with the ith task requiring tasks[i] strength to complete. The strength of each worker is stored in a 0-indexed integer array workers, with the jth worker having workers[j] strength. Each worker can only be assigned to a single task and must have a strength greater than or equal to the task's strength requirement (i.e., workers[j] &gt;= tasks[i]).
 *
 *
 * Additionally, you have pills magical pills that will increase a worker's strength by strength. You can decide which workers receive the magical pills, however, you may only give each worker at most one magical pill.
 *
 *
 * Given the 0-indexed integer arrays tasks and workers and the integers pills and strength, return the maximum number of tasks that can be completed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [3,2,1], workers = [0,3,3], pills = 1, strength = 1
 * Output: 3
 * Explanation:
 * We can assign the magical pill and tasks as follows:
 * - Give the magical pill to worker 0.
 * - Assign worker 0 to task 2 (0 + 1 &gt;= 1)
 * - Assign worker 1 to task 1 (3 &gt;= 2)
 * - Assign worker 2 to task 0 (3 &gt;= 3)
 *
 * Example 2:
 *
 * Input: tasks = [5,4], workers = [0,0,0], pills = 1, strength = 5
 * Output: 1
 * Explanation:
 * We can assign the magical pill and tasks as follows:
 * - Give the magical pill to worker 0.
 * - Assign worker 0 to task 0 (0 + 5 &gt;= 5)
 *
 * Example 3:
 *
 * Input: tasks = [10,15,30], workers = [0,10,10,10,10], pills = 3, strength = 10
 * Output: 2
 * Explanation:
 * We can assign the magical pills and tasks as follows:
 * - Give the magical pill to worker 0 and worker 1.
 * - Assign worker 0 to task 0 (0 + 10 &gt;= 10)
 * - Assign worker 1 to task 1 (10 + 10 &gt;= 15)
 * The last pill is not given because it will not make any worker strong enough for the last task.
 *
 *
 *
 * Constraints:
 *
 *
 * n == tasks.length
 *
 * m == workers.length
 *
 * 1 &lt;= n, m &lt;= 5 * 104
 *
 * 0 &lt;= pills &lt;= m
 *
 * 0 &lt;= tasks[i], workers[j], strength &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is it possible to assign the first k smallest tasks to the workers?
 * Hint 2: How can you efficiently try every k?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Greedy, Queue, Sorting, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/">LeetCode #2071</a>
 */
public class MaximumNumberOfTasksYouCanAssign {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Tasks You Can Assign");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfTasksYouCanAssign ===");
        MaximumNumberOfTasksYouCanAssign sol = new MaximumNumberOfTasksYouCanAssign();
        System.out.println(sol.solve(null));
    }
}
