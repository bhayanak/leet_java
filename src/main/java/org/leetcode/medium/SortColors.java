package org.leetcode.medium;

/**
 * <b>#75 - Sort Colors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * 
 * 
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * 
 * 
 * You must solve this problem without using the library's sort function.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * 
 * Example 2:
 * 
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == nums.length
 * 	
 * 1 &lt;= n &lt;= 300
 * 	
 * nums[i] is either 0, 1, or 2.
 * 
 *  
 * 
 * Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - A rather straight forward solution is a two-pass algorithm using counting sort.
 * - Iterate the array counting number of 0's, 1's, and 2's.
 * - Overwrite array with the total number of 0's, then 1's and followed by 2's.
 *
 * <h2>Approach</h2>
 * Dutch National Flag algorithm (one-pass):
 * Maintain three pointers: lo (next 0 position), mid (current), hi (next 2 position).
 * Swap nums[mid] to the right bucket; only advance mid when not swapping with hi.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/sort-colors/">LeetCode #75</a>
 */
public class SortColors {

    /**
     * Sorts an array of 0s, 1s, and 2s in-place (Dutch National Flag).
     *
     * @param nums array containing only 0, 1, or 2
     */
    public void sortColors(int[] nums) {
        int lo = 0, mid = 0, hi = nums.length - 1;
        while (mid <= hi) {
            if (nums[mid] == 0) swap(nums, lo++, mid++);
            else if (nums[mid] == 1) mid++;
            else swap(nums, mid, hi--);        // don't advance mid after swap from hi
        }
    }

    private void swap(int[] a, int i, int j){ int t=a[i]; a[i]=a[j]; a[j]=t; }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                SortColors sol = new SortColors();
                int[] nums = {2,0,2,1,1,0};
                sol.sortColors(nums);
                System.out.println(java.util.Arrays.toString(nums)); // [0,0,1,1,2,2]
    }
}
