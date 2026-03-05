package org.leetcode.medium;

/**
 * <b>#34 - Find First and Last Position of Element in Sorted Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * 
 * 
 * If target is not found in the array, return [-1, -1].
 * 
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= nums.length &lt;= 105
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * 	
 * nums is a non-decreasing array.
 * 	
 * -109 &lt;= target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Two binary searches: one to find the leftmost position, one for the rightmost.
 * Helper: binary search biased towards left or right boundary.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">LeetCode #34</a>
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    /**
     * Returns [first, last] indices of target in sorted nums, or [-1,-1] if absent.
     *
     * @param nums   sorted array
     * @param target value to find
     * @return       int[2] with first and last occurrence indices
     */
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }

    private int findBound(int[] nums, int target, boolean first) {
        int lo = 0, hi = nums.length - 1, bound = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                bound = mid;
                if (first) hi = mid - 1; // push left
                else       lo = mid + 1; // push right
            } else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return bound;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                FindFirstAndLastPositionOfElementInSortedArray sol = new FindFirstAndLastPositionOfElementInSortedArray();
                System.out.println(java.util.Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10}, 8))); // [3,4]
                System.out.println(java.util.Arrays.toString(sol.searchRange(new int[]{5,7,7,8,8,10}, 6))); // [-1,-1]
    }
}
