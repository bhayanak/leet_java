package org.leetcode.easy;


/**
 * <b>#2553 - Separate the Digits in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.
 *
 *
 * To separate the digits of an integer is to get all the digits it has in the same order.
 *
 *
 * For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [13,25,83,77]
 * Output: [1,3,2,5,8,3,7,7]
 * Explanation: 
 * - The separation of 13 is [1,3].
 * - The separation of 25 is [2,5].
 * - The separation of 83 is [8,3].
 * - The separation of 77 is [7,7].
 * answer = [1,3,2,5,8,3,7,7]. Note that answer contains the separations in the same order.
 *
 * Example 2:
 *
 * Input: nums = [7,1,3,9]
 * Output: [7,1,3,9]
 * Explanation: The separation of each integer in nums is itself.
 * answer = [7,1,3,9].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert each number into a list and append that list to the answer.
 * Hint 2: You can convert the integer into a string to do that easily.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/separate-the-digits-in-an-array/">LeetCode #2553</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class SeparateTheDigitsInAnArray {

    public java.util.List<Integer> separateDigits(int[] nums) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for (int n:nums) {
            String s=String.valueOf(n);
            for (char c:s.toCharArray()) res.add(c-'0');
        }
        return res;
    }

    public static void main(String[] args) {
        SeparateTheDigitsInAnArray sol = new SeparateTheDigitsInAnArray();
        System.out.println("No method available");
    }
}
