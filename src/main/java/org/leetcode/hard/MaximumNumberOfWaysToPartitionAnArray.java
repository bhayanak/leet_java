package org.leetcode.hard;


/**
 * <b>#2025 - Maximum Number of Ways to Partition an Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Counting, Enumeration, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of length n. The number of ways to partition nums is the number of pivot indices that satisfy both conditions:
 *
 *
 * 1 &lt;= pivot &lt; n
 *
 * nums[0] + nums[1] + ... + nums[pivot - 1] == nums[pivot] + nums[pivot + 1] + ... + nums[n - 1]
 *
 * You are also given an integer k. You can choose to change the value of one element of nums to k, or to leave the array unchanged.
 *
 *
 * Return the maximum possible number of ways to partition nums to satisfy both conditions after changing at most one element.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,-1,2], k = 3
 * Output: 1
 * Explanation: One optimal approach is to change nums[0] to k. The array becomes [3,-1,2].
 * There is one way to partition the array:
 * - For pivot = 2, we have the partition [3,-1 | 2]: 3 + -1 == 2.
 *
 * Example 2:
 *
 * Input: nums = [0,0,0], k = 1
 * Output: 2
 * Explanation: The optimal approach is to leave the array unchanged.
 * There are two ways to partition the array:
 * - For pivot = 1, we have the partition [0 | 0,0]: 0 == 0 + 0.
 * - For pivot = 2, we have the partition [0,0 | 0]: 0 + 0 == 0.
 *
 * Example 3:
 *
 * Input: nums = [22,4,-25,-20,-15,15,-16,7,19,-10,0,-13,-14], k = -33
 * Output: 4
 * Explanation: One optimal approach is to change nums[2] to k. The array becomes [22,4,-33,-20,-15,15,-16,7,19,-10,0,-13,-14].
 * There are four ways to partition the array.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * -105 &lt;= k, nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A pivot point splits the array into equal prefix and suffix. If no change is made to the array, the goal is to find the number of pivot p such that prefix[p-1] == suffix[p].
 * Hint 2: Consider how prefix and suffix will change when we change a number nums[i] to k.
 * Hint 3: When sweeping through each element, can you find the total number of pivots where the difference of prefix and suffix happens to equal to the changes of k-nums[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting, Enumeration, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-ways-to-partition-an-array/">LeetCode #2025</a>
 */
public class MaximumNumberOfWaysToPartitionAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Ways to Partition an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfWaysToPartitionAnArray ===");
        MaximumNumberOfWaysToPartitionAnArray sol = new MaximumNumberOfWaysToPartitionAnArray();
        System.out.println(sol.solve(null));
    }
}
