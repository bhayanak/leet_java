package org.leetcode.medium;


/**
 * <b>#3524 - Find X Value of Array I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums, and a positive integer k.
 *
 *
 * You are allowed to perform an operation once on nums, where in each operation you can remove any non-overlapping prefix and suffix from nums such that nums remains non-empty.
 *
 *
 * You need to find the x-value of nums, which is the number of ways to perform this operation so that the product of the remaining elements leaves a remainder of x when divided by k.
 *
 *
 * Return an array result of size k where result[x] is the x-value of nums for 0 &lt;= x &lt;= k - 1.
 *
 *
 * A prefix of an array is a subarray that starts from the beginning of the array and extends to any point within it.
 *
 *
 * A suffix of an array is a subarray that starts at any point within the array and extends to the end of the array.
 *
 *
 * Note that the prefix and suffix to be chosen for the operation can be empty.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], k = 3
 *
 *
 * Output: [9,2,4]
 *
 *
 * Explanation:
 *
 *
 * For x = 0, the possible operations include all possible ways to remove non-overlapping prefix/suffix that do not remove nums[2] == 3.
 *
 * For x = 1, the possible operations are:
 *
 *
 *
 * Remove the empty prefix and the suffix [2, 3, 4, 5]. nums becomes [1].
 *
 * Remove the prefix [1, 2, 3] and the suffix [5]. nums becomes [4].
 *
 *
 *
 * For x = 2, the possible operations are:
 *
 *
 *
 * Remove the empty prefix and the suffix [3, 4, 5]. nums becomes [1, 2].
 *
 * Remove the prefix [1] and the suffix [3, 4, 5]. nums becomes [2].
 *
 * Remove the prefix [1, 2, 3] and the empty suffix. nums becomes [4, 5].
 *
 * Remove the prefix [1, 2, 3, 4] and the empty suffix. nums becomes [5].
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2,4,8,16,32], k = 4
 *
 *
 * Output: [18,1,2,0]
 *
 *
 * Explanation:
 *
 *
 * For x = 0, the only operations that do not result in x = 0 are:
 *
 *
 *
 *
 * Remove the empty prefix and the suffix [4, 8, 16, 32]. nums becomes [1, 2].
 *
 * Remove the empty prefix and the suffix [2, 4, 8, 16, 32]. nums becomes [1].
 *
 * Remove the prefix [1] and the suffix [4, 8, 16, 32]. nums becomes [2].
 *
 *
 *
 * For x = 1, the only possible operation is:
 *
 *
 *
 * Remove the empty prefix and the suffix [2, 4, 8, 16, 32]. nums becomes [1].
 *
 *
 *
 * For x = 2, the possible operations are:
 *
 *
 *
 * Remove the empty prefix and the suffix [4, 8, 16, 32]. nums becomes [1, 2].
 *
 * Remove the prefix [1] and the suffix [4, 8, 16, 32]. nums becomes [2].
 *
 *
 *
 * For x = 3, there is no possible way to perform the operation.
 *
 * Example 3:
 *
 * Input: nums = [1,1,2,1,1], k = 2
 *
 *
 * Output: [9,6]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= k &lt;= 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Define <code>dp[i][r]</code> as the count of subarrays ending at index <code>i</code> whose product modulo <code>k</code> equals <code>r</code>.
 * Hint 3: Compute <code>dp[i][r]</code> for each index <code>i</code> in <code>nums</code> and sum over all indices to get the final counts for each remainder.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-x-value-of-array-i/">LeetCode #3524</a>
 */
public class FindXValueOfArrayI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find X Value of Array I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindXValueOfArrayI ===");
        FindXValueOfArrayI sol = new FindXValueOfArrayI();
        System.out.println(sol.solve(null));
    }
}
