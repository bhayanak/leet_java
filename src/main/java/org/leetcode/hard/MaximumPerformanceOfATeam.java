package org.leetcode.hard;


/**
 * <b>#1383 - Maximum Performance of a Team</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and k and two integer arrays speed and efficiency both of length n. There are n engineers numbered from 1 to n. speed[i] and efficiency[i] represent the speed and efficiency of the ith engineer respectively.
 *
 *
 * Choose at most k different engineers out of the n engineers to form a team with the maximum performance.
 *
 *
 * The performance of a team is the sum of its engineers' speeds multiplied by the minimum efficiency among its engineers.
 *
 *
 * Return the maximum performance of this team. Since the answer can be a huge number, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 2
 * Output: 60
 * Explanation: 
 * We have the maximum performance of the team by selecting engineer 2 (with speed=10 and efficiency=4) and engineer 5 (with speed=5 and efficiency=7). That is, performance = (10 + 5) * min(4, 7) = 60.
 *
 * Example 2:
 *
 * Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 3
 * Output: 68
 * Explanation:
 * This is the same example as the first but k = 3. We can select engineer 1, engineer 2 and engineer 5 to get the maximum performance of the team. That is, performance = (2 + 10 + 5) * min(5, 4, 7) = 68.
 *
 * Example 3:
 *
 * Input: n = 6, speed = [2,10,3,1,5,8], efficiency = [5,4,3,9,7,2], k = 4
 * Output: 72
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= n &lt;= 105
 *
 * speed.length == n
 *
 * efficiency.length == n
 *
 * 1 &lt;= speed[i] &lt;= 105
 *
 * 1 &lt;= efficiency[i] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the engineers by their efficiency in decreasing order.
 * Hint 2: Starting from one engineer, to build a team, it suffices to bring K-1 more engineers who have higher efficiencies as well as high speeds.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-performance-of-a-team/">LeetCode #1383</a>
 */
public class MaximumPerformanceOfATeam {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Performance of a Team");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumPerformanceOfATeam ===");
        MaximumPerformanceOfATeam sol = new MaximumPerformanceOfATeam();
        System.out.println(sol.solve(null));
    }
}
