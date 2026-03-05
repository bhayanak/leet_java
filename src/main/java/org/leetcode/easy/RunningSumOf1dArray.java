package org.leetcode.easy;


/**
 * <b>#1480 - Running Sum of 1d Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 *
 *
 * Return the running sum of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 *
 * Example 3:
 *
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * -10^6 &lt;= nums[i] &lt;= 10^6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about how we can calculate the i-th number in the running sum from the (i-1)-th number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/running-sum-of-1d-array/">LeetCode #1480</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class RunningSumOf1dArray {

    /**
     * Solves the problem: Running sum.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++) nums[i]+=nums[i-1];
        return nums;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        RunningSumOf1dArray sol = new RunningSumOf1dArray();
                System.out.println(java.util.Arrays.toString(sol.runningSum(new int[]{1,2,3,4}))); // [1,3,6,10]
                System.out.println(java.util.Arrays.toString(sol.runningSum(new int[]{1,1,1,1,1}))); // [1,2,3,4,5]
                System.out.println(java.util.Arrays.toString(sol.runningSum(new int[]{3,1,2,10,1}))); // [3,4,6,16,17]
    }
}
