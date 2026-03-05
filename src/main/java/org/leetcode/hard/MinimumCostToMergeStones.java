package org.leetcode.hard;


/**
 * <b>#1000 - Minimum Cost to Merge Stones</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n piles of stones arranged in a row. The ith pile has stones[i] stones.
 *
 *
 * A move consists of merging exactly k consecutive piles into one pile, and the cost of this move is equal to the total number of stones in these k piles.
 *
 *
 * Return the minimum cost to merge all piles of stones into one pile. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [3,2,4,1], k = 2
 * Output: 20
 * Explanation: We start with [3, 2, 4, 1].
 * We merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].
 * We merge [4, 1] for a cost of 5, and we are left with [5, 5].
 * We merge [5, 5] for a cost of 10, and we are left with [10].
 * The total cost was 20, and this is the minimum possible.
 *
 * Example 2:
 *
 * Input: stones = [3,2,4,1], k = 3
 * Output: -1
 * Explanation: After any merge operation, there are 2 piles left, and we can't merge anymore.  So the task is impossible.
 *
 * Example 3:
 *
 * Input: stones = [3,5,1,2,6], k = 3
 * Output: 25
 * Explanation: We start with [3, 5, 1, 2, 6].
 * We merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].
 * We merge [3, 8, 6] for a cost of 17, and we are left with [17].
 * The total cost was 25, and this is the minimum possible.
 *
 *
 *
 * Constraints:
 *
 *
 * n == stones.length
 *
 * 1 &lt;= n &lt;= 30
 *
 * 1 &lt;= stones[i] &lt;= 100
 *
 * 2 &lt;= k &lt;= 30
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-merge-stones/">LeetCode #1000</a>
 */
public class MinimumCostToMergeStones {

    /**
     * TODO: Implement "Minimum Cost to Merge Stones".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Merge Stones");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumCostToMergeStones.java &amp;&amp; java org.leetcode.hard.MinimumCostToMergeStones</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToMergeStones ===");
        MinimumCostToMergeStones sol = new MinimumCostToMergeStones();
        System.out.println(sol.solve(null));
    }
}
