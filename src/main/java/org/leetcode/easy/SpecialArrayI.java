package org.leetcode.easy;


/**
 * <b>#3151 - Special Array I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An array is considered special if the parity of every pair of adjacent elements is different. In other words, one element in each pair must be even, and the other must be odd.
 *
 *
 * You are given an array of integers nums. Return true if nums is a special array, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * There is only one element. So the answer is true.
 *
 * Example 2:
 *
 * Input: nums = [2,1,4]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.
 *
 * Example 3:
 *
 * Input: nums = [4,3,1,6]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * nums[1] and nums[2] are both odd. So the answer is false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to check the parity of each element and its previous element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/special-array-i/">LeetCode #3151</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class SpecialArrayI {

    /**
     * Returns true if Is array special.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isArraySpecial(int[] nums) {
        for (int i=1;i<nums.length;i++) if (nums[i]%2==nums[i-1]%2) return false;
        return true;
    }

    public static void main(String[] args) {
        SpecialArrayI sol = new SpecialArrayI();
        System.out.println(sol.isArraySpecial(new int[]{1,2,3}));
    }
}
