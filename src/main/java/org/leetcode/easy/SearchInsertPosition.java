package org.leetcode.easy;

/**
 * <b>#35 - Search Insert Position</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * 
 * Example 3:
 * 
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 104
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * 	
 * nums contains distinct values sorted in ascending order.
 * 	
 * -104 &lt;= target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Standard binary search. When target is not found, lo is the correct insertion index.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/search-insert-position/">LeetCode #35</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class SearchInsertPosition {

    /**
     * Returns the index to insert target in a sorted array (no duplicates).
     *
     * @param nums   sorted array of distinct integers
     * @param target value to search or insert
     * @return       index of target if found, else where it would be inserted
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo; // insertion point
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
                SearchInsertPosition sol = new SearchInsertPosition();
                System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5)); // 2
                System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2)); // 1
                System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 7)); // 4
    }
}
