package org.leetcode.medium;


/**
 * <b>#3584 - Maximum Product of First and Last Elements of a Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer m.
 *
 *
 * Return the maximum product of the first and last elements of any subsequence of nums of size m.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,-9,2,3,-2,-3,1], m = 1
 *
 *
 * Output: 81
 *
 *
 * Explanation:
 *
 *
 * The subsequence [-9] has the largest product of the first and last elements: -9 * -9 = 81. Therefore, the answer is 81.
 *
 * Example 2:
 *
 * Input: nums = [1,3,-5,5,6,-4], m = 3
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * The subsequence [-5, 6, -4] has the largest product of the first and last elements.
 *
 * Example 3:
 *
 * Input: nums = [2,-1,2,-6,5,2,-5,7], m = 2
 *
 *
 * Output: 35
 *
 *
 * Explanation:
 *
 *
 * The subsequence [5, 7] has the largest product of the first and last elements.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -105 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= m &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can select nums[i] as the first element of the subsequence, and the last one can be any of nums[i + m - 1], nums[i + m], ..., nums[n - 1].
 * Hint 2: If we select the first element from the largest i, the suffix just gets longer, and we can update the minimum and maximum values dynamically.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers).
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-first-and-last-elements-of-a-subsequence/">LeetCode #3584</a>
 */
public class MaximumProductOfFirstAndLastElementsOfASubsequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of First and Last Elements of a Subsequence");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfFirstAndLastElementsOfASubsequence ===");
        MaximumProductOfFirstAndLastElementsOfASubsequence sol = new MaximumProductOfFirstAndLastElementsOfASubsequence();
        System.out.println(sol.solve(null));
    }
}
