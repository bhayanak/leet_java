package org.leetcode.medium;

/**
 * <b>#153 - Find Minimum in Rotated Sorted Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * 
 * 	
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * 	
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * 
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * 
 * 
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * 
 * 
 * You must write an algorithm that runs in O(log n) time.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * Example 2:
 * 
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
 * 
 * Example 3:
 * 
 * Input: nums = [11,13,15,17]
 * Output: 11
 * Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == nums.length
 * 	
 * 1 &lt;= n &lt;= 5000
 * 	
 * -5000 &lt;= nums[i] &lt;= 5000
 * 	
 * All the integers of nums are unique.
 * 	
 * nums is sorted and rotated between 1 and n times.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Array was originally in ascending order. Now that the array is rotated, there would be a point in the array where there is a small deflection from the increasing sequence. eg. The array would be something like [4, 5, 6, 7, 0, 1, 2].
 * Hint 2: You can divide the search space into two and see which direction to go.
Can you think of an algorithm which has O(logN) search complexity?
 * Hint 3: <ol>
<li>All the elements to the left of inflection point &gt; first element of the array.</li>
<li>All the elements to the right of inflection point &lt; first element of the array.</li>
</ol>
 *
 * <h2>Approach</h2>
 * Binary search: if nums[mid] &gt; nums[right], the minimum is in the right half.
 * Otherwise, it's in the left half (including mid).
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/">LeetCode #153</a>
 */
public class FindMinimumInRotatedSortedArray {

    /**
     * Finds the minimum in a rotated sorted array (distinct elements).
     * @param nums rotated sorted array
     * @return minimum element
     */
    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) lo = mid + 1; // min in right half
            else                      hi = mid;      // min in left half (mid included)
        }
        return nums[lo];
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac FindMinimumInRotatedSortedArray.java &amp;&amp; java org.leetcode.medium.FindMinimumInRotatedSortedArray
     *
     * @param args not used
     */
    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray sol = new FindMinimumInRotatedSortedArray();
        System.out.println(sol.findMin(new int[]{3,4,5,1,2})); // 1
        System.out.println(sol.findMin(new int[]{4,5,6,7,0,1,2})); // 0
        System.out.println(sol.findMin(new int[]{11,13,15,17})); // 11
    }
}
