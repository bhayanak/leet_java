package org.leetcode.medium;


/**
 * <b>#1664 - Ways to Make a Fair Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. You can choose exactly one index (0-indexed) and remove the element. Notice that the index of the elements may change after the removal.
 *
 *
 * For example, if nums = [6,1,7,4,1]:
 *
 *
 * Choosing to remove index 1 results in nums = [6,7,4,1].
 *
 * Choosing to remove index 2 results in nums = [6,1,4,1].
 *
 * Choosing to remove index 4 results in nums = [6,1,7,4].
 *
 * An array is fair if the sum of the odd-indexed values equals the sum of the even-indexed values.
 *
 *
 * Return the number of indices that you could choose such that after the removal, nums is fair. 
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,6,4]
 * Output: 1
 * Explanation:
 * Remove index 0: [1,6,4] -&gt; Even sum: 1 + 4 = 5. Odd sum: 6. Not fair.
 * Remove index 1: [2,6,4] -&gt; Even sum: 2 + 4 = 6. Odd sum: 6. Fair.
 * Remove index 2: [2,1,4] -&gt; Even sum: 2 + 4 = 6. Odd sum: 1. Not fair.
 * Remove index 3: [2,1,6] -&gt; Even sum: 2 + 6 = 8. Odd sum: 1. Not fair.
 * There is 1 index that you can remove to make nums fair.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1]
 * Output: 3
 * Explanation: You can remove any index and the remaining array is fair.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 * Explanation: You cannot make a fair array after removing any index.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The parity of the indices after the removed element changes.
 * Hint 2: Calculate prefix sums for even and odd indices separately to calculate for each index in O(1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/ways-to-make-a-fair-array/">LeetCode #1664</a>
 */
public class WaysToMakeAFairArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Ways to Make a Fair Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== WaysToMakeAFairArray ===");
        WaysToMakeAFairArray sol = new WaysToMakeAFairArray();
        System.out.println(sol.solve(null));
    }
}
