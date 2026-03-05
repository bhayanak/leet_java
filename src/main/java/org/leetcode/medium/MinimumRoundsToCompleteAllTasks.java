package org.leetcode.medium;


/**
 * <b>#2244 - Minimum Rounds to Complete All Tasks</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task. In each round, you can complete either 2 or 3 tasks of the same difficulty level.
 *
 *
 * Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [2,2,3,3,2,4,4,4,4,4]
 * Output: 4
 * Explanation: To complete all the tasks, a possible plan is:
 * - In the first round, you complete 3 tasks of difficulty level 2. 
 * - In the second round, you complete 2 tasks of difficulty level 3. 
 * - In the third round, you complete 3 tasks of difficulty level 4. 
 * - In the fourth round, you complete 2 tasks of difficulty level 4.  
 * It can be shown that all the tasks cannot be completed in fewer than 4 rounds, so the answer is 4.
 *
 * Example 2:
 *
 * Input: tasks = [2,3,3]
 * Output: -1
 * Explanation: There is only 1 task of difficulty level 2, but in each round, you can only complete either 2 or 3 tasks of the same difficulty level. Hence, you cannot complete all the tasks, and the answer is -1.
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
 *
 *
 * Note: This question is the same as 2870: Minimum Number of Operations to Make Array Empty.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which data structure can you use to store the number of tasks of each difficulty level?
 * Hint 2: For any particular difficulty level, what can be the optimal strategy to complete the tasks using minimum rounds?
 * Hint 3: When can we not complete all tasks of a difficulty level?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/">LeetCode #2244</a>
 */
public class MinimumRoundsToCompleteAllTasks {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Rounds to Complete All Tasks");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumRoundsToCompleteAllTasks ===");
        MinimumRoundsToCompleteAllTasks sol = new MinimumRoundsToCompleteAllTasks();
        System.out.println(sol.solve(null));
    }
}
