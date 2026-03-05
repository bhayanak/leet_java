package org.leetcode.medium;


/**
 * <b>#3542 - Minimum Operations to Convert All Elements to Zero</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of size n, consisting of non-negative integers. Your task is to apply some (possibly zero) operations on the array so that all elements become 0.
 *
 *
 * In one operation, you can select a subarray [i, j] (where 0 &lt;= i &lt;= j &lt; n) and set all occurrences of the minimum non-negative integer in that subarray to 0.
 *
 *
 * Return the minimum number of operations required to make all elements in the array 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,2]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Select the subarray [1,1] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0].
 *
 * Thus, the minimum number of operations required is 1.
 *
 * Example 2:
 *
 * Input: nums = [3,1,2,1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Select subarray [1,3] (which is [1,2,1]), where the minimum non-negative integer is 1. Setting all occurrences of 1 to 0 results in [3,0,2,0].
 *
 * Select subarray [2,2] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [3,0,0,0].
 *
 * Select subarray [0,0] (which is [3]), where the minimum non-negative integer is 3. Setting all occurrences of 3 to 0 results in [0,0,0,0].
 *
 * Thus, the minimum number of operations required is 3.
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,2,1,2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Select subarray [0,5] (which is [1,2,1,2,1,2]), where the minimum non-negative integer is 1. Setting all occurrences of 1 to 0 results in [0,2,0,2,0,2].
 *
 * Select subarray [1,1] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,2,0,2].
 *
 * Select subarray [3,3] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,0,0,2].
 *
 * Select subarray [5,5] (which is [2]), where the minimum non-negative integer is 2. Setting all occurrences of 2 to 0 results in [0,0,0,0,0,0].
 *
 * Thus, the minimum number of operations required is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Process the values in nums from smallest to largest (excluding 0).
 * Hint 2: For each target value v, identify its maximal contiguous segments (subarrays where nums[i] == v); each segment can be zeroed out in one operation.
 * Hint 3: After setting those segments to zero, dynamically update the remaining array and repeat with the next value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Stack, Greedy, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/">LeetCode #3542</a>
 */
public class MinimumOperationsToConvertAllElementsToZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Convert All Elements to Zero");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToConvertAllElementsToZero ===");
        MinimumOperationsToConvertAllElementsToZero sol = new MinimumOperationsToConvertAllElementsToZero();
        System.out.println(sol.solve(null));
    }
}
