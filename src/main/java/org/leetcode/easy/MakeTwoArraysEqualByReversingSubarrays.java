package org.leetcode.easy;


/**
 * <b>#1460 - Make Two Arrays Equal by Reversing Subarrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty subarray of arr and reverse it. You are allowed to make any number of steps.
 *
 *
 * Return true if you can make arr equal to target or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = [1,2,3,4], arr = [2,4,1,3]
 * Output: true
 * Explanation: You can follow the next steps to convert arr to target:
 * 1- Reverse subarray [2,4,1], arr becomes [1,4,2,3]
 * 2- Reverse subarray [4,2], arr becomes [1,2,4,3]
 * 3- Reverse subarray [4,3], arr becomes [1,2,3,4]
 * There are multiple ways to convert arr to target, this is not the only way to do so.
 *
 * Example 2:
 *
 * Input: target = [7], arr = [7]
 * Output: true
 * Explanation: arr is equal to target without any reverses.
 *
 * Example 3:
 *
 * Input: target = [3,7,9], arr = [3,7,11]
 * Output: false
 * Explanation: arr does not have value 9 and it can never be converted to target.
 *
 *
 *
 * Constraints:
 *
 *
 * target.length == arr.length
 *
 * 1 &lt;= target.length &lt;= 1000
 *
 * 1 &lt;= target[i] &lt;= 1000
 *
 * 1 &lt;= arr[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each element of target should have a corresponding element in arr, and if it doesn't have a corresponding element, return false.
 * Hint 2: To solve it easiely you can sort the two arrays and check if they are equal.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/">LeetCode #1460</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MakeTwoArraysEqualByReversingSubarrays {

    /**
     * Returns true if the input can Can be equal.
     * Sorts the input first to enable efficient processing.
     *
     * @param target the target (int[])
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public boolean canBeEqual(int[] target, int[] arr) {
        java.util.Arrays.sort(target); java.util.Arrays.sort(arr);
        return java.util.Arrays.equals(target, arr);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        MakeTwoArraysEqualByReversingSubarrays sol = new MakeTwoArraysEqualByReversingSubarrays();
        System.out.println(sol.canBeEqual(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
