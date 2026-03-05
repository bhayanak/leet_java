package org.leetcode.medium;

/**
 * <b>#137 - Single Number II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
 * 
 * 
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,3,2]
 * Output: 3
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [0,1,0,1,0,1,99]
 * Output: 99
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 3 * 104
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 	
 * Each element in nums appears exactly three times except for one element which appears once.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Bit counting: for each of the 32 bit positions, sum that bit across all numbers mod 3.
 * The remainder is the unique element's bit at that position.
 *
 * <h2>Complexity</h2>
* Time: O(32n) = O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/single-number-ii/">LeetCode #137</a>
 */
public class SingleNumberIi {

    /**
     * Finds the element that appears once while every other element appears three times.
     * @param nums integer array
     * @return the unique element
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int bit = 0; bit < 32; bit++) {
            int sum = 0;
            for (int n : nums) sum += (n >> bit) & 1;
            // If bit sum mod 3 != 0, this bit belongs to the unique number
            result |= (sum % 3) << bit;
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac SingleNumberIi.java &amp;&amp; java org.leetcode.medium.SingleNumberIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        SingleNumberIi sol = new SingleNumberIi();
        System.out.println(sol.singleNumber(new int[]{2,2,3,2}));         // 3
        System.out.println(sol.singleNumber(new int[]{0,1,0,1,0,1,99})); // 99
    }
}
