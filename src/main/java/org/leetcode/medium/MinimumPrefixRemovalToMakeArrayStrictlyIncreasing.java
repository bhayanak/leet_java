package org.leetcode.medium;


/**
 * <b>#3818 - Minimum Prefix Removal to Make Array Strictly Increasing</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You need to remove exactly one prefix (possibly empty) from nums.
 *
 *
 * Return an integer denoting the minimum length of the removed prefix such that the remaining array is strictly increasing.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-1,2,3,3,4,5]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Removing the prefix = [1, -1, 2, 3] leaves the remaining array [3, 4, 5] which is strictly increasing.
 *
 * Example 2:
 *
 * Input: nums = [4,3,-2,-5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Removing the prefix = [4, 3, -2] leaves the remaining array [-5] which is strictly increasing.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The array nums = [1, 2, 3, 4] is already strictly increasing so removing an empty prefix is sufficient.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the first index <code>i</code> from the right such that <code>nums[i] &gt;= nums[i + 1]</code>.
 * Hint 2: If such an index exists, the answer is <code>i + 1</code>; otherwise, the array is already strictly increasing.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/minimum-prefix-removal-to-make-array-strictly-increasing/">LeetCode #3818</a>
 */
public class MinimumPrefixRemovalToMakeArrayStrictlyIncreasing {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Prefix Removal to Make Array Strictly Increasing");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumPrefixRemovalToMakeArrayStrictlyIncreasing ===");
        MinimumPrefixRemovalToMakeArrayStrictlyIncreasing sol = new MinimumPrefixRemovalToMakeArrayStrictlyIncreasing();
        System.out.println(sol.solve(null));
    }
}
