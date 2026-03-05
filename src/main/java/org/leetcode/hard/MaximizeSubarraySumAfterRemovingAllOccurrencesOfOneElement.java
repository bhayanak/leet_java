package org.leetcode.hard;


/**
 * <b>#3410 - Maximize Subarray Sum After Removing All Occurrences of One Element</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You can do the following operation on the array at most once:
 *
 *
 * Choose any integer x such that nums remains non-empty on removing all occurrences of x.
 *
 * Remove all occurrences of x from the array.
 *
 * Return the maximum subarray sum across all possible resulting arrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-3,2,-2,-1,3,-2,3]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * We can have the following arrays after at most one operation:
 *
 *
 * The original array is nums = [-3, 2, -2, -1, 3, -2, 3]. The maximum subarray sum is 3 + (-2) + 3 = 4.
 *
 * Deleting all occurences of x = -3 results in nums = [2, -2, -1, 3, -2, 3]. The maximum subarray sum is 3 + (-2) + 3 = 4.
 *
 * Deleting all occurences of x = -2 results in nums = [-3, 2, -1, 3, 3]. The maximum subarray sum is 2 + (-1) + 3 + 3 = 7.
 *
 * Deleting all occurences of x = -1 results in nums = [-3, 2, -2, 3, -2, 3]. The maximum subarray sum is 3 + (-2) + 3 = 4.
 *
 * Deleting all occurences of x = 3 results in nums = [-3, 2, -2, -1, -2]. The maximum subarray sum is 2.
 *
 * The output is max(4, 4, 7, 4, 2) = 7.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * It is optimal to not perform any operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -106 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a segment tree data structure to solve the problem.
 * Hint 2: Each node of the segment tree should store the subarray sum, the maximum subarray sum, the maximum prefix sum, and the maximum suffix sum within the subarray defined by that node.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/maximize-subarray-sum-after-removing-all-occurrences-of-one-element/">LeetCode #3410</a>
 */
public class MaximizeSubarraySumAfterRemovingAllOccurrencesOfOneElement {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximize Subarray Sum After Removing All Occurrences of One Element");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeSubarraySumAfterRemovingAllOccurrencesOfOneElement ===");
        MaximizeSubarraySumAfterRemovingAllOccurrencesOfOneElement sol = new MaximizeSubarraySumAfterRemovingAllOccurrencesOfOneElement();
        System.out.println(sol.solve(null));
    }
}
