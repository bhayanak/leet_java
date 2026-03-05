package org.leetcode.hard;


/**
 * <b>#3171 - Find Subarray With Bitwise OR Closest to K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Bit Manipulation, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums and an integer k. You need to find a subarray of nums such that the absolute difference between k and the bitwise OR of the subarray elements is as small as possible. In other words, select a subarray nums[l..r] such that |k - (nums[l] OR nums[l + 1] ... OR nums[r])| is minimum.
 *
 *
 * Return the minimum possible value of the absolute difference.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4,5], k = 3
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The subarray nums[0..1] has OR value 3, which gives the minimum absolute difference |3 - 3| = 0.
 *
 * Example 2:
 *
 * Input: nums = [1,3,1,3], k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray nums[1..1] has OR value 3, which gives the minimum absolute difference |3 - 2| = 1.
 *
 * Example 3:
 *
 * Input: nums = [1], k = 10
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * There is a single subarray with OR value 1, which gives the minimum absolute difference |10 - 1| = 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> be the set of all the bitwise <code>OR</code> of all the subarrays ending at index <code>i</code>.
 * Hint 2: We start from <code>nums[i]</code>, taking the bitwise <code>OR</code> result by including elements one by one from <code>i</code> towards left. Notice that only unset bits can become set on adding an element, and set bits never become unset again.
 * Hint 3: Hence <code>dp[i]</code> can contain at most 30 elements.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Bit Manipulation, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/">LeetCode #3171</a>
 */
public class FindSubarrayWithBitwiseOrClosestToK {

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
        throw new UnsupportedOperationException("Not yet implemented: Find Subarray With Bitwise OR Closest to K");
    }

    public static void main(String[] args) {
        System.out.println("=== FindSubarrayWithBitwiseOrClosestToK ===");
        FindSubarrayWithBitwiseOrClosestToK sol = new FindSubarrayWithBitwiseOrClosestToK();
        System.out.println(sol.solve(null));
    }
}
