package org.leetcode.hard;


/**
 * <b>#857 - Minimum Cost to Hire K Workers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n workers. You are given two integer arrays quality and wage where quality[i] is the quality of the ith worker and wage[i] is the minimum wage expectation for the ith worker.
 *
 *
 * We want to hire exactly k workers to form a paid group. To hire a group of k workers, we must pay them according to the following rules:
 *
 *
 * Every worker in the paid group must be paid at least their minimum wage expectation.
 *
 * In the group, each worker's pay must be directly proportional to their quality. This means if a worker’s quality is double that of another worker in the group, then they must be paid twice as much as the other worker.
 *
 * Given the integer k, return the least amount of money needed to form a paid group satisfying the above conditions. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: quality = [10,20,5], wage = [70,50,30], k = 2
 * Output: 105.00000
 * Explanation: We pay 70 to 0th worker and 35 to 2nd worker.
 *
 * Example 2:
 *
 * Input: quality = [3,1,10,10,1], wage = [4,8,2,2,7], k = 3
 * Output: 30.66667
 * Explanation: We pay 4 to 0th worker, 13.33333 to 2nd and 3rd workers separately.
 *
 *
 *
 * Constraints:
 *
 *
 * n == quality.length == wage.length
 *
 * 1 &lt;= k &lt;= n &lt;= 104
 *
 * 1 &lt;= quality[i], wage[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-hire-k-workers/">LeetCode #857</a>
 */
public class MinimumCostToHireKWorkers {

    /**
     * TODO: Implement "Minimum Cost to Hire K Workers".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Hire K Workers");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumCostToHireKWorkers.java &amp;&amp; java org.leetcode.hard.MinimumCostToHireKWorkers</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToHireKWorkers ===");
        MinimumCostToHireKWorkers sol = new MinimumCostToHireKWorkers();
        System.out.println(sol.solve(null));
    }
}
