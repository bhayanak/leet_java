package org.leetcode.easy;


/**
 * <b>#3745 - Maximize Expression of Three Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Choose three elements a, b, and c from nums at distinct indices such that the value of the expression a + b - c is maximized.
 *
 *
 * Return an integer denoting the maximum possible value of this expression.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,2,5]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * We can choose a = 4, b = 5, and c = 1. The expression value is 4 + 5 - 1 = 8, which is the maximum possible.
 *
 * Example 2:
 *
 * Input: nums = [-2,0,5,-2,4]
 *
 *
 * Output: 11
 *
 *
 * Explanation:
 *
 *
 * We can choose a = 5, b = 4, and c = -2. The expression value is 5 + 4 - (-2) = 11, which is the maximum possible.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <code>a</code> and <code>b</code> should be the two largest values in <code>nums</code>
 * Hint 2: <code>c</code> should be the smallest value in <code>nums</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximize-expression-of-three-elements/">LeetCode #3745</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class MaximizeExpressionOfThreeElements {

    /**
     * Finds the longest Longest good subarray.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int longestGoodSubarray(int[] nums, int k) {
        int max=1, lo=0;
        for (int hi=1;hi<nums.length;hi++) {
            while (Math.abs(nums[hi]-nums[hi-1])>k) lo=hi;
            max=Math.max(max,hi-lo+1);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximizeExpressionOfThreeElements sol = new MaximizeExpressionOfThreeElements();
        System.out.println(sol.longestGoodSubarray(new int[]{1,2,3}, 0));
    }
}
