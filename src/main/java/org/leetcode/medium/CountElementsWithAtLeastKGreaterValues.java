package org.leetcode.medium;


/**
 * <b>#3759 - Count Elements With at Least K Greater Values</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Divide and Conquer, Sorting, Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an integer k.
 *
 *
 * An element in nums is said to be qualified if there exist at least k elements in the array that are strictly greater than it.
 *
 *
 * Return an integer denoting the total number of qualified elements in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2], k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The elements 1 and 2 each have at least k = 1 element greater than themselves.
 *
 * ​​​​​​​No element is greater than 3. Therefore, the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [5,5,5], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Since all elements are equal to 5, no element is greater than the other. Therefore, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort <code>nums</code>, build distinct <code>values</code> and <code>count</code>.
 * Hint 2: For each <code>val</code>: find <code>upper_bound</code>, compute <code>greater = n - upper_bound_idx</code>; if <code>greater &gt;= k</code> add <code>count[val]</code> to <code>ans</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Divide and Conquer, Sorting, Quickselect).
 *
 * @see <a href="https://leetcode.com/problems/count-elements-with-at-least-k-greater-values/">LeetCode #3759</a>
 */
public class CountElementsWithAtLeastKGreaterValues {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Elements With at Least K Greater Values");
    }

    public static void main(String[] args) {
        System.out.println("=== CountElementsWithAtLeastKGreaterValues ===");
        CountElementsWithAtLeastKGreaterValues sol = new CountElementsWithAtLeastKGreaterValues();
        System.out.println(sol.solve(null));
    }
}
