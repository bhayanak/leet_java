package org.leetcode.medium;


/**
 * <b>#1546 - Maximum Number of Non-Overlapping Subarrays With Sum Equals Target</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums and an integer target, return the maximum number of non-empty non-overlapping subarrays such that the sum of values in each subarray is equal to target.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,1,1], target = 2
 * Output: 2
 * Explanation: There are 2 non-overlapping subarrays [1,1,1,1,1] with sum equals to target(2).
 *
 * Example 2:
 *
 * Input: nums = [-1,3,5,1,4,2,-9], target = 6
 * Output: 2
 * Explanation: There are 3 subarrays with sum equal to 6.
 * ([5,1], [4,2], [3,5,1,4,2,-9]) but only the first 2 are non-overlapping.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -104 &lt;= nums[i] &lt;= 104
 *
 * 0 &lt;= target &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of prefix sums to quickly look up what subarray that sums "target" can be formed at each step of scanning the input array.
 * Hint 2: It can be proved that greedily forming valid subarrays as soon as one is found is optimal.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target/">LeetCode #1546</a>
 */
public class MaximumNumberOfNonOverlappingSubarraysWithSumEqualsTarget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Non-Overlapping Subarrays With Sum Equals Target");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfNonOverlappingSubarraysWithSumEqualsTarget ===");
        MaximumNumberOfNonOverlappingSubarraysWithSumEqualsTarget sol = new MaximumNumberOfNonOverlappingSubarraysWithSumEqualsTarget();
        System.out.println(sol.solve(null));
    }
}
