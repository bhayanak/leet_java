package org.leetcode.hard;


/**
 * <b>#3117 - Minimum Sum of Values by Dividing Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Bit Manipulation, Segment Tree, Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays nums and andValues of length n and m respectively.
 *
 *
 * The value of an array is equal to the last element of that array.
 *
 *
 * You have to divide nums into m disjoint contiguous subarrays such that for the ith subarray [li, ri], the bitwise AND of the subarray elements is equal to andValues[i], in other words, nums[li] &amp; nums[li + 1] &amp; ... &amp; nums[ri] == andValues[i] for all 1 &lt;= i &lt;= m, where &amp; represents the bitwise AND operator.
 *
 *
 * Return the minimum possible sum of the values of the m subarrays nums is divided into. If it is not possible to divide nums into m subarrays satisfying these conditions, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,3,3,2], andValues = [0,3,3,2]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The only possible way to divide nums is:
 *
 *
 * [1,4] as 1 &amp; 4 == 0.
 *
 * [3] as the bitwise AND of a single element subarray is that element itself.
 *
 * [3] as the bitwise AND of a single element subarray is that element itself.
 *
 * [2] as the bitwise AND of a single element subarray is that element itself.
 *
 * The sum of the values for these subarrays is 4 + 3 + 3 + 2 = 12.
 *
 * Example 2:
 *
 * Input: nums = [2,3,5,7,7,7,5], andValues = [0,7,5]
 *
 *
 * Output: 17
 *
 *
 * Explanation:
 *
 *
 * There are three ways to divide nums:
 *
 *
 * [[2,3,5],[7,7,7],[5]] with the sum of the values 5 + 7 + 5 == 17.
 *
 * [[2,3,5,7],[7,7],[5]] with the sum of the values 7 + 7 + 5 == 19.
 *
 * [[2,3,5,7,7],[7],[5]] with the sum of the values 7 + 7 + 5 == 19.
 *
 * The minimum possible sum of the values is 17.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4], andValues = [2]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * The bitwise AND of the entire array nums is 0. As there is no possible way to divide nums into a single subarray to have the bitwise AND of elements 2, return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 104
 *
 * 1 &lt;= m == andValues.length &lt;= min(n, 10)
 *
 * 1 &lt;= nums[i] &lt; 105
 *
 * 0 &lt;= andValues[j] &lt; 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i][j]</code> be the optimal answer to split  <code>nums[0..(i - 1)]</code> into the first <code>j</code> andValues.
 * Hint 2: <code>dp[i][j] = min(dp[(i - z)][j - 1]) + nums[i - 1]</code> over all <code>x &lt;= z &lt;= y</code> and <code>dp[0][0] = 0</code>, where <code>x</code> and <code>y</code> are the longest and shortest subarrays ending with <code>nums[i - 1]</code> and the bitwise-and of all the values in it is <code>andValues[j - 1]</code>.
 * Hint 3: The answer is <code>dp[n][m]</code>.
 * Hint 4: To calculate <code>x</code> and <code>y</code>, we can use binary search (or sliding window). Note that the more values we have, the smaller the <code>AND</code> value is.
 * Hint 5: To calculate the result, we need to support RMQ (range minimum query). Segment tree is one way to do it in <code>O(log(n))</code>. But we can use Monotonic Queue since the ranges are indeed “sliding to right” which can be reduced to the classical minimum value in sliding window problem, for a <code>O(n)</code> solution.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Bit Manipulation, Segment Tree, Queue).
 *
 * @see <a href="https://leetcode.com/problems/minimum-sum-of-values-by-dividing-array/">LeetCode #3117</a>
 */
public class MinimumSumOfValuesByDividingArray {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Sum of Values by Dividing Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumSumOfValuesByDividingArray ===");
        MinimumSumOfValuesByDividingArray sol = new MinimumSumOfValuesByDividingArray();
        System.out.println(sol.solve(null));
    }
}
