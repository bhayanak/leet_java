package org.leetcode.easy;


/**
 * <b>#2089 - Find Target Indices After Sorting Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and a target element target.
 *
 *
 * A target index is an index i such that nums[i] == target.
 *
 *
 * Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 *
 * Example 3:
 *
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i], target &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try "sorting" the array first.
 * Hint 2: Now find all indices in the array whose values are equal to target.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-target-indices-after-sorting-array/">LeetCode #2089</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class FindTargetIndicesAfterSortingArray {

    public java.util.List<Integer> targetIndices(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        java.util.List<Integer> res = new java.util.ArrayList<>();
        for (int i=0;i<nums.length;i++) if (nums[i]==target) res.add(i);
        return res;
    }

    public static void main(String[] args) {
        FindTargetIndicesAfterSortingArray sol = new FindTargetIndicesAfterSortingArray();
        System.out.println("No method available");
    }
}
