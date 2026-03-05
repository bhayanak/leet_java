package org.leetcode.medium;

/**
 * <b>#81 - Search in Rotated Sorted Array II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 * 
 * 
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 &lt;= k &lt; nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 * 
 * 
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 * 
 * 
 * You must decrease the overall operation steps as much as possible.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [2,5,6,0,0,1,2], target = 3
 * Output: false
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
 * nums is guaranteed to be rotated at some pivot.
 * 	
 * -104 &lt;= target &lt;= 104
 * 
 *  
 * 
 * Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/search-in-rotated-sorted-array-ii/">LeetCode #81</a>
 */
public class SearchInRotatedSortedArrayIi {

    /**
     * TODO: Implement solution for "Search in Rotated Sorted Array II".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Search in Rotated Sorted Array II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        SearchInRotatedSortedArrayIi sol = new SearchInRotatedSortedArrayIi();
        System.out.println(sol.solve(null));
    }
}
