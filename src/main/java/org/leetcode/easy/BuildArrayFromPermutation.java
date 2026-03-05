package org.leetcode.easy;


/**
 * <b>#1920 - Build Array from Permutation</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 &lt;= i &lt; nums.length and return it.
 *
 *
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,2,1,5,3,4]
 * Output: [0,1,2,4,5,3]
 * Explanation: The array ans is built as follows: 
 * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *     = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
 *     = [0,1,2,4,5,3]
 *
 * Example 2:
 *
 * Input: nums = [5,0,1,2,3,4]
 * Output: [4,5,0,1,2,3]
 * Explanation: The array ans is built as follows:
 * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
 *     = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
 *     = [4,5,0,1,2,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt; nums.length
 *
 * The elements in nums are distinct.
 *
 *
 *
 * Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Just apply what's said in the statement.
 * Hint 2: Notice that you can't apply it on the same array directly since some elements will change after application
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/build-array-from-permutation/">LeetCode #1920</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class BuildArrayFromPermutation {

    /**
     * Builds Build array.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++) ans[i]=nums[nums[i]];
        return ans;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        BuildArrayFromPermutation sol = new BuildArrayFromPermutation();
                System.out.println(java.util.Arrays.toString(sol.buildArray(new int[]{0,2,1,5,3,4}))); // [0,1,2,4,5,3]
                System.out.println(java.util.Arrays.toString(sol.buildArray(new int[]{5,0,1,2,3,4}))); // [4,5,0,1,2,3]
    }
}
