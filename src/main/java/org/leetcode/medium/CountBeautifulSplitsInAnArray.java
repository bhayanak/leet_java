package org.leetcode.medium;


/**
 * <b>#3388 - Count Beautiful Splits in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums.
 *
 *
 * A split of an array nums is beautiful if:
 *
 *
 * The array nums is split into three subarrays: nums1, nums2, and nums3, such that nums can be formed by concatenating nums1, nums2, and nums3 in that order.
 *
 * The subarray nums1 is a prefix of nums2 OR nums2 is a prefix of nums3.
 *
 * Return the number of ways you can make this split.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,1]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The beautiful splits are:
 *
 *
 * A split with nums1 = [1], nums2 = [1,2], nums3 = [1].
 *
 * A split with nums1 = [1], nums2 = [1], nums3 = [2,1].
 *
 * Example 2:
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
 * There are 0 beautiful splits.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5000
 *
 * 0 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use 2D dynamic programming to find the maximum matching prefix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-beautiful-splits-in-an-array/">LeetCode #3388</a>
 */
public class CountBeautifulSplitsInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Beautiful Splits in an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== CountBeautifulSplitsInAnArray ===");
        CountBeautifulSplitsInAnArray sol = new CountBeautifulSplitsInAnArray();
        System.out.println(sol.solve(null));
    }
}
