package org.leetcode.easy;


/**
 * <b>#1929 - Concatenation of Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 &lt;= i &lt; n (0-indexed).
 *
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 *
 * Return the array ans.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 *
 * Example 2:
 *
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 * - ans = [1,3,2,1,1,3,2,1]
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build an array of size 2 * n and assign nums[i] to ans[i] and ans[i + n]
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/concatenation-of-array/">LeetCode #1929</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ConcatenationOfArray {

    /**
     * Returns Get concatenation.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] getConcatenation(int[] nums) {
        int n=nums.length; int[] ans=new int[2*n];
        for (int i=0;i<n;i++) { ans[i]=nums[i]; ans[i+n]=nums[i]; }
        return ans;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ConcatenationOfArray sol = new ConcatenationOfArray();
                System.out.println(java.util.Arrays.toString(sol.getConcatenation(new int[]{1,2,1}))); // [1,2,1,1,2,1]
                System.out.println(java.util.Arrays.toString(sol.getConcatenation(new int[]{1,3,2,1}))); // [1,3,2,1,1,3,2,1]
    }
}
