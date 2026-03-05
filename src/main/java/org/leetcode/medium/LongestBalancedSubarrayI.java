package org.leetcode.medium;


/**
 * <b>#3719 - Longest Balanced Subarray I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Divide and Conquer, Segment Tree, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A subarray is called balanced if the number of distinct even numbers in the subarray is equal to the number of distinct odd numbers.
 *
 *
 * Return the length of the longest balanced subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,4,3]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The longest balanced subarray is [2, 5, 4, 3].
 *
 * It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [5, 3]. Thus, the answer is 4.
 *
 * Example 2:
 *
 * Input: nums = [3,2,2,5,4]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The longest balanced subarray is [3, 2, 2, 5, 4].
 *
 * It has 2 distinct even numbers [2, 4] and 2 distinct odd numbers [3, 5]. Thus, the answer is 5.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,2]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The longest balanced subarray is [2, 3, 2].
 *
 * It has 1 distinct even number [2] and 1 distinct odd number [3]. Thus, the answer is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1500
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use brute force
 * Hint 2: Try every subarray and use a map/set data structure to track the distinct even and odd numbers
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Divide and Conquer, Segment Tree, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/longest-balanced-subarray-i/">LeetCode #3719</a>
 */
public class LongestBalancedSubarrayI {

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
        throw new UnsupportedOperationException("Not yet implemented: Longest Balanced Subarray I");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestBalancedSubarrayI ===");
        LongestBalancedSubarrayI sol = new LongestBalancedSubarrayI();
        System.out.println(sol.solve(null));
    }
}
