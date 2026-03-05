package org.leetcode.hard;


/**
 * <b>#3721 - Longest Balanced Subarray II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
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
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store the first (or all) occurrences for each value in <code>pos[val]</code>.
 * Hint 2: Build a lazy segment tree over start indices <code>l in [0..n-1]</code> that supports range add and can tell if any index has value <code>0</code> (keep <code>mn</code>/<code>mx</code>).
 * Hint 3: Use <code>sign = +1</code> for odd values and <code>sign = -1</code> for even values.
 * Hint 4: Initialize by adding each value's contribution with <code>update(p, n-1, sign)</code> where <code>p</code> is its current first occurrence.
 * Hint 5: Slide left <code>l</code>: pop <code>pos[nums[l]]</code>, let <code>next</code> = next occurrence or <code>n</code>, do <code>update(0, next-1, -sign)</code>, then query for any <code>r &gt;= l</code> with value <code>0</code> and update <code>ans = max(ans, r-l+1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Divide and Conquer, Segment Tree, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/longest-balanced-subarray-ii/">LeetCode #3721</a>
 */
public class LongestBalancedSubarrayIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Longest Balanced Subarray II");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestBalancedSubarrayIi ===");
        LongestBalancedSubarrayIi sol = new LongestBalancedSubarrayIi();
        System.out.println(sol.solve(null));
    }
}
