package org.leetcode.medium;


/**
 * <b>#985 - Sum of Even Numbers After Queries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an array queries where queries[i] = [vali, indexi].
 *
 *
 * For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.
 *
 *
 * Return an integer array answer where answer[i] is the answer to the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
 * Output: [8,6,2,4]
 * Explanation: At the beginning, the array is [1,2,3,4].
 * After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.
 * After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.
 * After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.
 * After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.
 *
 * Example 2:
 *
 * Input: nums = [1], queries = [[4,0]]
 * Output: [0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * -104 &lt;= nums[i] &lt;= 104
 *
 * 1 &lt;= queries.length &lt;= 104
 *
 * -104 &lt;= vali &lt;= 104
 *
 * 0 &lt;= indexi &lt; nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-even-numbers-after-queries/">LeetCode #985</a>
 */
public class SumOfEvenNumbersAfterQueries {

    /**
     * TODO: Implement "Sum of Even Numbers After Queries".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Even Numbers After Queries");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SumOfEvenNumbersAfterQueries.java &amp;&amp; java org.leetcode.medium.SumOfEvenNumbersAfterQueries</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfEvenNumbersAfterQueries ===");
        SumOfEvenNumbersAfterQueries sol = new SumOfEvenNumbersAfterQueries();
        System.out.println(sol.solve(null));
    }
}
