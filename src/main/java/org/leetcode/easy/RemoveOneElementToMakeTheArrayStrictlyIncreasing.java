package org.leetcode.easy;


/**
 * <b>#1909 - Remove One Element to Make the Array Strictly Increasing</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.
 *
 *
 * The array nums is strictly increasing if nums[i - 1] &lt; nums[i] for each index (1 &lt;= i &lt; nums.length).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,10,5,7]
 * Output: true
 * Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
 * [1,2,5,7] is strictly increasing, so return true.
 *
 * Example 2:
 *
 * Input: nums = [2,3,1,2]
 * Output: false
 * Explanation:
 * [3,1,2] is the result of removing the element at index 0.
 * [2,1,2] is the result of removing the element at index 1.
 * [2,3,2] is the result of removing the element at index 2.
 * [2,3,1] is the result of removing the element at index 3.
 * No resulting array is strictly increasing, so return false.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1]
 * Output: false
 * Explanation: The result of removing any element is [1,1].
 * [1,1] is not strictly increasing, so return false.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index i in nums remove this index.
 * Hint 2: If the array becomes sorted return true, otherwise revert to the original array and try different index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/">LeetCode #1909</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {

    /**
     * Returns true if the input can Can be increasing.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean canBeIncreasing(int[] nums) {
        for (int i=1;i<nums.length;i++) {
            if (nums[i]<=nums[i-1]) {
                return isIncreasing(nums,i-1) || isIncreasing(nums,i);
            }
        }
        return true;
    }
    private boolean isIncreasing(int[] nums, int skip) {
        int prev=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) {
            if (i==skip) continue;
            if (nums[i]<=prev) return false;
            prev=nums[i];
        }
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        RemoveOneElementToMakeTheArrayStrictlyIncreasing sol = new RemoveOneElementToMakeTheArrayStrictlyIncreasing();
                System.out.println(sol.canBeIncreasing(new int[]{1,2,10,5,7})); // true
                System.out.println(sol.canBeIncreasing(new int[]{2,3,1,2}));    // false
                System.out.println(sol.canBeIncreasing(new int[]{1,1,1}));      // false
    }
}
