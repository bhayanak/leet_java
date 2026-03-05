package org.leetcode.medium;


/**
 * <b>#3224 - Minimum Array Changes to Make Differences Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of size n where n is even, and an integer k.
 *
 *
 * You can perform some changes on the array, where in one change you can replace any element in the array with any integer in the range from 0 to k.
 *
 *
 * You need to perform some changes (possibly none) such that the final array satisfies the following condition:
 *
 *
 * There exists an integer X such that abs(a[i] - a[n - i - 1]) = X for all (0 &lt;= i &lt; n).
 *
 * Return the minimum number of changes required to satisfy the above condition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1,2,4,3], k = 4
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * We can perform the following changes:
 *
 *
 * Replace nums[1] by 2. The resulting array is nums = [1,2,1,2,4,3].
 *
 * Replace nums[3] by 3. The resulting array is nums = [1,2,1,3,4,3].
 *
 * The integer X will be 2.
 *
 * Example 2:
 *
 * Input: nums = [0,1,2,3,3,6,5,4], k = 6
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * We can perform the following operations:
 *
 *
 * Replace nums[3] by 0. The resulting array is nums = [0,1,2,0,3,6,5,4].
 *
 * Replace nums[4] by 4. The resulting array is nums = [0,1,2,0,4,6,5,4].
 *
 * The integer X will be 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == nums.length &lt;= 105
 *
 * n is even.
 *
 * 0 &lt;= nums[i] &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are at most <code>k + 1</code> possible values of the integer <code>X</code>.
 * Hint 2: How do we calculate the minimum number of changes efficiently if we fix the value of <code>X</code> before applying any changes?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-array-changes-to-make-differences-equal/">LeetCode #3224</a>
 */
public class MinimumArrayChangesToMakeDifferencesEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Array Changes to Make Differences Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumArrayChangesToMakeDifferencesEqual ===");
        MinimumArrayChangesToMakeDifferencesEqual sol = new MinimumArrayChangesToMakeDifferencesEqual();
        System.out.println(sol.solve(null));
    }
}
