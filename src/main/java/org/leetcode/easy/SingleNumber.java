package org.leetcode.easy;

/**
 * <b>#136 - Single Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * 
 * 
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,2,1]
 * 
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: nums = [4,1,2,1,2]
 * 
 * 
 * Output: 4
 * 
 * Example 3:
 * 
 * Input: nums = [1]
 * 
 * 
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 3 * 104
 * 	
 * -3 * 104 &lt;= nums[i] &lt;= 3 * 104
 * 	
 * Each element in the array appears twice except for one element which appears only once.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about the XOR (^) operator's property.
 *
 * <h2>Approach</h2>
 * XOR all numbers. Duplicate numbers cancel out (a^a=0) and 0^x=x.
 * The last remaining value is the unique element.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/single-number/">LeetCode #136</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class SingleNumber {

    /**
     * Finds the single number in an array where every other element appears twice.
     * @param nums integer array
     * @return the unique element
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) result ^= n; // XOR cancels duplicates
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac SingleNumber.java &amp;&amp; java org.leetcode.easy.SingleNumber
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(new int[]{2,2,1}));       // 1
        System.out.println(sol.singleNumber(new int[]{4,1,2,1,2}));   // 4
    }
}
