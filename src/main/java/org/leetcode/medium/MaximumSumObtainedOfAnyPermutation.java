package org.leetcode.medium;


/**
 * <b>#1589 - Maximum Sum Obtained of Any Permutation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We have an array of integers, nums, and an array of requests where requests[i] = [starti, endi]. The ith request asks for the sum of nums[starti] + nums[starti + 1] + ... + nums[endi - 1] + nums[endi]. Both starti and endi are 0-indexed.
 *
 *
 * Return the maximum total sum of all requests among all permutations of nums.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], requests = [[1,3],[0,1]]
 * Output: 19
 * Explanation: One permutation of nums is [2,1,3,4,5] with the following result: 
 * requests[0] -&gt; nums[1] + nums[2] + nums[3] = 1 + 3 + 4 = 8
 * requests[1] -&gt; nums[0] + nums[1] = 2 + 1 = 3
 * Total sum: 8 + 3 = 11.
 * A permutation with a higher total sum is [3,5,4,2,1] with the following result:
 * requests[0] -&gt; nums[1] + nums[2] + nums[3] = 5 + 4 + 2 = 11
 * requests[1] -&gt; nums[0] + nums[1] = 3 + 5  = 8
 * Total sum: 11 + 8 = 19, which is the best that you can do.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5,6], requests = [[0,1]]
 * Output: 11
 * Explanation: A permutation with the max total sum is [6,5,4,3,2,1] with request sums [11].
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,5,10], requests = [[0,2],[1,3],[1,1]]
 * Output: 47
 * Explanation: A permutation with the max total sum is [4,10,5,3,2,1] with request sums [19,18,10].
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= requests.length &lt;= 105
 *
 * requests[i].length == 2
 *
 * 0 &lt;= starti &lt;= endi &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Indexes with higher frequencies should be bound with larger values
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-obtained-of-any-permutation/">LeetCode #1589</a>
 */
public class MaximumSumObtainedOfAnyPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum Obtained of Any Permutation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSumObtainedOfAnyPermutation ===");
        MaximumSumObtainedOfAnyPermutation sol = new MaximumSumObtainedOfAnyPermutation();
        System.out.println(sol.solve(null));
    }
}
