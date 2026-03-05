package org.leetcode.medium;


/**
 * <b>#1834 - Single-Threaded CPU</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given n​​​​​​ tasks labeled from 0 to n - 1 represented by a 2D integer array tasks, where tasks[i] = [enqueueTimei, processingTimei] means that the i​​​​​​th​​​​ task will be available to process at enqueueTimei and will take processingTimei to finish processing.
 *
 *
 * You have a single-threaded CPU that can process at most one task at a time and will act in the following way:
 *
 *
 * If the CPU is idle and there are no available tasks to process, the CPU remains idle.
 *
 * If the CPU is idle and there are available tasks, the CPU will choose the one with the shortest processing time. If multiple tasks have the same shortest processing time, it will choose the task with the smallest index.
 *
 * Once a task is started, the CPU will process the entire task without stopping.
 *
 * The CPU can finish a task then start a new one instantly.
 *
 * Return the order in which the CPU will process the tasks.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tasks = [[1,2],[2,4],[3,2],[4,1]]
 * Output: [0,2,3,1]
 * Explanation: The events go as follows: 
 * - At time = 1, task 0 is available to process. Available tasks = {0}.
 * - Also at time = 1, the idle CPU starts processing task 0. Available tasks = {}.
 * - At time = 2, task 1 is available to process. Available tasks = {1}.
 * - At time = 3, task 2 is available to process. Available tasks = {1, 2}.
 * - Also at time = 3, the CPU finishes task 0 and starts processing task 2 as it is the shortest. Available tasks = {1}.
 * - At time = 4, task 3 is available to process. Available tasks = {1, 3}.
 * - At time = 5, the CPU finishes task 2 and starts processing task 3 as it is the shortest. Available tasks = {1}.
 * - At time = 6, the CPU finishes task 3 and starts processing task 1. Available tasks = {}.
 * - At time = 10, the CPU finishes task 1 and becomes idle.
 *
 * Example 2:
 *
 * Input: tasks = [[7,10],[7,12],[7,5],[7,4],[7,2]]
 * Output: [4,3,2,0,1]
 * Explanation: The events go as follows:
 * - At time = 7, all the tasks become available. Available tasks = {0,1,2,3,4}.
 * - Also at time = 7, the idle CPU starts processing task 4. Available tasks = {0,1,2,3}.
 * - At time = 9, the CPU finishes task 4 and starts processing task 3. Available tasks = {0,1,2}.
 * - At time = 13, the CPU finishes task 3 and starts processing task 2. Available tasks = {0,1}.
 * - At time = 18, the CPU finishes task 2 and starts processing task 0. Available tasks = {1}.
 * - At time = 28, the CPU finishes task 0 and starts processing task 1. Available tasks = {}.
 * - At time = 40, the CPU finishes task 1 and becomes idle.
 *
 *
 *
 * Constraints:
 *
 *
 * tasks.length == n
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= enqueueTimei, processingTimei &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To simulate the problem we first need to note that if at any point in time there are no enqueued tasks we need to wait to the smallest enqueue time of a non-processed element
 * Hint 2: We need a data structure like a min-heap to support choosing the task with the smallest processing time from all the enqueued tasks
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/single-threaded-cpu/">LeetCode #1834</a>
 */
public class SingleThreadedCpu {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Single-Threaded CPU");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SingleThreadedCpu ===");
        SingleThreadedCpu sol = new SingleThreadedCpu();
        System.out.println(sol.solve(null));
    }
}
