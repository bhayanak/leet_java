package org.leetcode.easy;


/**
 * <b>#2724 - Sort By</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr and a function fn, return a sorted array sortedArr. You can assume fn only returns numbers and those numbers determine the sort order of sortedArr. sortedArr must be sorted in ascending order by fn output.
 *
 *
 * You may assume that fn will never duplicate numbers for a given array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [5, 4, 1, 2, 3], fn = (x) =&gt; x
 * Output: [1, 2, 3, 4, 5]
 * Explanation: fn simply returns the number passed to it so the array is sorted in ascending order.
 *
 * Example 2:
 *
 * Input: arr = [{"x": 1}, {"x": 0}, {"x": -1}], fn = (d) =&gt; d.x
 * Output: [{"x": -1}, {"x": 0}, {"x": 1}]
 * Explanation: fn returns the value for the "x" key. So the array is sorted based on that value.
 *
 * Example 3:
 *
 * Input: arr = [[3, 4], [5, 2], [10, 1]], fn = (x) =&gt; x[1]
 * Output: [[10, 1], [5, 2], [3, 4]]
 * Explanation: arr is sorted in ascending order by number at index=1. 
 *
 *
 *
 * Constraints:
 *
 *
 * arr is a valid JSON array
 *
 * fn is a function that returns a number
 *
 * 1 &lt;= arr.length &lt;= 5 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/sort-by/">LeetCode #2724</a>
  *
  * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
  */
public class SortBy {

    /**
     * Checks Check sorted.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
      */
    public boolean checkSorted(int[] nums) {
        for (int i=1;i<nums.length;i++) if (nums[i]<nums[i-1]) return false;
        return true;
    }

    public static void main(String[] args) {
        SortBy sol = new SortBy();
        System.out.println(sol.checkSorted(new int[]{1,2,3}));
    }
}
