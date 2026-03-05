package org.leetcode.hard;


/**
 * <b>#3509 - Maximum Product of Subsequences With an Alternating Sum Equal to K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers, k and limit. Your task is to find a non-empty subsequence of nums that:
 *
 *
 * Has an alternating sum equal to k.
 *
 * Maximizes the product of all its numbers without the product exceeding limit.
 *
 * Return the product of the numbers in such a subsequence. If no subsequence satisfies the requirements, return -1.
 *
 *
 * The alternating sum of a 0-indexed array is defined as the sum of the elements at even indices minus the sum of the elements at odd indices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2, limit = 10
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The subsequences with an alternating sum of 2 are:
 *
 *
 * [1, 2, 3]
 *
 *
 *
 *
 * Alternating Sum: 1 - 2 + 3 = 2
 *
 * Product: 1 * 2 * 3 = 6
 *
 *
 *
 * [2]
 *
 *
 *
 * Alternating Sum: 2
 *
 * Product: 2
 *
 *
 *
 * The maximum product within the limit is 6.
 *
 * Example 2:
 *
 * Input: nums = [0,2,3], k = -5, limit = 12
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * A subsequence with an alternating sum of exactly -5 does not exist.
 *
 * Example 3:
 *
 * Input: nums = [2,2,3,3], k = 0, limit = 9
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * The subsequences with an alternating sum of 0 are:
 *
 *
 * [2, 2]
 *
 *
 *
 *
 * Alternating Sum: 2 - 2 = 0
 *
 * Product: 2 * 2 = 4
 *
 *
 *
 * [3, 3]
 *
 *
 *
 * Alternating Sum: 3 - 3 = 0
 *
 * Product: 3 * 3 = 9
 *
 *
 *
 * [2, 2, 3, 3]
 *
 *
 *
 * Alternating Sum: 2 - 2 + 3 - 3 = 0
 *
 * Product: 2 * 2 * 3 * 3 = 36
 *
 *
 *
 * The subsequence [2, 2, 3, 3] has the greatest product with an alternating sum equal to k, but 36 &gt; 9. The next greatest product is 9, which is within the limit.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 150
 *
 * 0 &lt;= nums[i] &lt;= 12
 *
 * -105 &lt;= k &lt;= 105
 *
 * 1 &lt;= limit &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Save all possible products with a particular sum.
 * Hint 3: Handle the case where a subsequence has a product of <code>0</code> and an alternating sum of <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-subsequences-with-an-alternating-sum-equal-to-k/">LeetCode #3509</a>
 */
public class MaximumProductOfSubsequencesWithAnAlternatingSumEqualToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Product of Subsequences With an Alternating Sum Equal to K");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumProductOfSubsequencesWithAnAlternatingSumEqualToK ===");
        MaximumProductOfSubsequencesWithAnAlternatingSumEqualToK sol = new MaximumProductOfSubsequencesWithAnAlternatingSumEqualToK();
        System.out.println(sol.solve(null));
    }
}
