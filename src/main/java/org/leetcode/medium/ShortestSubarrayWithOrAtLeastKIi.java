package org.leetcode.medium;


/**
 * <b>#3097 - Shortest Subarray With OR at Least K II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of non-negative integers and an integer k.
 *
 *
 * An array is called special if the bitwise OR of all of its elements is at least k.
 *
 *
 * Return the length of the shortest special non-empty subarray of nums, or return -1 if no special subarray exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray [3] has OR value of 3. Hence, we return 1.
 *
 * Example 2:
 *
 * Input: nums = [2,1,8], k = 10
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The subarray [2,1,8] has OR value of 11. Hence, we return 3.
 *
 * Example 3:
 *
 * Input: nums = [1,2], k = 0
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray [1] has OR value of 1. Hence, we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2 * 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each <code>nums[i]</code>, we can maintain each subarray’s bitwise <code>OR</code> result ending with it.
 * Hint 2: The property of bitwise <code>OR</code> is that it never unsets any bits and only sets new bits
 * Hint 3: So the number of different results for each <code>nums[i]</code> is at most the number of bits 32.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/">LeetCode #3097</a>
 */
public class ShortestSubarrayWithOrAtLeastKIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Subarray With OR at Least K II");
    }

    public static void main(String[] args) {
        System.out.println("=== ShortestSubarrayWithOrAtLeastKIi ===");
        ShortestSubarrayWithOrAtLeastKIi sol = new ShortestSubarrayWithOrAtLeastKIi();
        System.out.println(sol.solve(null));
    }
}
