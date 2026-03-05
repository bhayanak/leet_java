package org.leetcode.easy;


/**
 * <b>#1752 - Check if Array Is Sorted and Rotated</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
 *
 *
 * There may be duplicates in the original array.
 *
 *
 * Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,1,2]
 * Output: true
 * Explanation: [1,2,3,4,5] is the original sorted array.
 * You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
 *
 * Example 2:
 *
 * Input: nums = [2,1,3,4]
 * Output: false
 * Explanation: There is no sorted array once rotated that can make nums.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: true
 * Explanation: [1,2,3] is the original sorted array.
 * You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force and check if it is possible for a sorted array to start from each position.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/">LeetCode #1752</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfArrayIsSortedAndRotated {

    /**
     * Checks Check.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean check(int[] nums) {
        int n=nums.length, drops=0;
        for (int i=0;i<n;i++)
            if (nums[i]>nums[(i+1)%n]) drops++;
        return drops<=1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated sol = new CheckIfArrayIsSortedAndRotated();
                System.out.println(sol.check(new int[]{3,4,5,1,2})); // true
                System.out.println(sol.check(new int[]{2,1,3,4}));   // false
                System.out.println(sol.check(new int[]{1,2,3}));     // true
    }
}
