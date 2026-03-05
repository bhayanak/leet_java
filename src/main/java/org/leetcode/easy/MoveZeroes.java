package org.leetcode.easy;

/**
 * <b>#283 - Move Zeroes</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 104
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 
 *  
 * Follow up: Could you minimize the total number of operations done?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <b>In-place</b> means we should not be allocating any space for extra array. But we are allowed to modify the existing array. However, as a first step, try coming up with a solution that makes use of additional space. For this problem as well, first apply the idea discussed using an additional array and the in-place solution will pop up eventually.
 * Hint 2: A <b>two-pointer</b> approach could be helpful here. The idea would be to have one pointer for iterating the array and another pointer that just works on the non-zero elements of the array.
 *
 * <h2>Approach</h2>
 * Two-pointer: maintain insert position. Non-zero elements are moved to front.
 * Fill remainder with zeros.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/">LeetCode #283</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class MoveZeroes {

    /**
     * Solves the problem: Move zeroes.
     *
     * @param nums the nums (int[])
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int n:nums) if(n!=0) nums[pos++]=n;
        while(pos<nums.length) nums[pos++]=0;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();
        int[] a={0,1,0,3,12}; sol.moveZeroes(a);
        System.out.println(java.util.Arrays.toString(a)); // [1,3,12,0,0]
    }
}
