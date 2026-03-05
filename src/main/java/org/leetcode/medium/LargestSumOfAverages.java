package org.leetcode.medium;


/**
 * <b>#813 - Largest Sum of Averages</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k. You can partition the array into at most k non-empty adjacent subarrays. The score of a partition is the sum of the averages of each subarray.
 *
 *
 * Note that the partition must use every integer in nums, and that the score is not necessarily an integer.
 *
 *
 * Return the maximum score you can achieve of all the possible partitions. Answers within 10-6 of the actual answer will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [9,1,2,3,9], k = 3
 * Output: 20.00000
 * Explanation: 
 * The best choice is to partition nums into [9], [1, 2, 3], [9]. The answer is 9 + (1 + 2 + 3) / 3 + 9 = 20.
 * We could have also partitioned nums into [9, 1], [2], [3, 9], for example.
 * That partition would lead to a score of 5 + 2 + 6 = 13, which is worse.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5,6,7], k = 4
 * Output: 20.50000
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= nums.length
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
 * @see <a href="https://leetcode.com/problems/largest-sum-of-averages/">LeetCode #813</a>
 */
public class LargestSumOfAverages {

    /**
     * TODO: Implement "Largest Sum of Averages".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Sum of Averages");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestSumOfAverages.java &amp;&amp; java org.leetcode.medium.LargestSumOfAverages</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LargestSumOfAverages ===");
        LargestSumOfAverages sol = new LargestSumOfAverages();
        System.out.println(sol.solve(null));
    }
}
