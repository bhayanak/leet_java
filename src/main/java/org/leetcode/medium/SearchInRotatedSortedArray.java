package org.leetcode.medium;

/**
 * <b>#33 - Search in Rotated Sorted Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an integer array nums sorted in ascending order (with distinct values).
 * 
 * 
 * Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 &lt;= k &lt; nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
 * 
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [1], target = 0
 * Output: -1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 5000
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * 	
 * All values of nums are unique.
 * 	
 * nums is an ascending array that is possibly rotated.
 * 	
 * -104 &lt;= target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Binary search with the knowledge that one half is always sorted.
 * Determine which half is sorted and whether target lies in it; adjust lo/hi accordingly.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">LeetCode #33</a>
 */
public class SearchInRotatedSortedArray {

    /**
     * Searches for target in a rotated sorted array; returns its index or -1.
     *
     * @param nums   rotated sorted array with distinct values
     * @param target value to find
     * @return       index of target, or -1
     */
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            // Left half is sorted
            if (nums[lo] <= nums[mid]) {
                if (target >= nums[lo] && target < nums[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                SearchInRotatedSortedArray sol = new SearchInRotatedSortedArray();
                System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 0)); // 4
                System.out.println(sol.search(new int[]{4,5,6,7,0,1,2}, 3)); // -1
                System.out.println(sol.search(new int[]{1}, 0));             // -1
    }
}
