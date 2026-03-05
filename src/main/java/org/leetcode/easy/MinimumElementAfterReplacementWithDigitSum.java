package org.leetcode.easy;


/**
 * <b>#3300 - Minimum Element After Replacement With Digit Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You replace each element in nums with the sum of its digits.
 *
 *
 * Return the minimum element in nums after all replacements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,12,13,14]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * nums becomes [1, 2, 3, 4] after all replacements, with minimum element 1.
 *
 * Example 3:
 *
 * Input: nums = [999,19,199]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * nums becomes [27, 10, 19] after all replacements, with minimum element 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert to string and calculate the sum for each element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/">LeetCode #3300</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumElementAfterReplacementWithDigitSum {

    /**
     * Computes the minimum Min element.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int n:nums) {
            int s=0, tmp=n; while (tmp>0){s+=tmp%10;tmp/=10;} min=Math.min(min,s);
        }
        return min;
    }

    public static void main(String[] args) {
        MinimumElementAfterReplacementWithDigitSum sol = new MinimumElementAfterReplacementWithDigitSum();
                System.out.println(sol.minElement(new int[]{10,12,13,14})); // 1
                System.out.println(sol.minElement(new int[]{1,2,3,4})); // 1
                System.out.println(sol.minElement(new int[]{999,19,199})); // 10
    }
}
