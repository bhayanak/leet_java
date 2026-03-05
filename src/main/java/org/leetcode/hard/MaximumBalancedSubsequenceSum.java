package org.leetcode.hard;


/**
 * <b>#2926 - Maximum Balanced Subsequence Sum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * A subsequence of nums having length k and consisting of indices i0 &lt; i1 &lt; ... &lt; ik-1 is balanced if the following holds:
 *
 *
 * nums[ij] - nums[ij-1] &gt;= ij - ij-1, for every j in the range [1, k - 1].
 *
 * A subsequence of nums having length 1 is considered balanced.
 *
 *
 * Return an integer denoting the maximum possible sum of elements in a balanced subsequence of nums.
 *
 *
 * A subsequence of an array is a new non-empty array that is formed from the original array by deleting some (possibly none) of the elements without disturbing the relative positions of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,3,5,6]
 * Output: 14
 * Explanation: In this example, the subsequence [3,5,6] consisting of indices 0, 2, and 3 can be selected.
 * nums[2] - nums[0] &gt;= 2 - 0.
 * nums[3] - nums[2] &gt;= 3 - 2.
 * Hence, it is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
 * The subsequence consisting of indices 1, 2, and 3 is also valid.
 * It can be shown that it is not possible to get a balanced subsequence with a sum greater than 14.
 *
 * Example 2:
 *
 * Input: nums = [5,-1,-3,8]
 * Output: 13
 * Explanation: In this example, the subsequence [5,8] consisting of indices 0 and 3 can be selected.
 * nums[3] - nums[0] &gt;= 3 - 0.
 * Hence, it is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
 * It can be shown that it is not possible to get a balanced subsequence with a sum greater than 13.
 *
 * Example 3:
 *
 * Input: nums = [-2,-1]
 * Output: -1
 * Explanation: In this example, the subsequence [-1] can be selected.
 * It is a balanced subsequence, and its sum is the maximum among the balanced subsequences of nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[x]</code> represent the maximum sum of a balanced subsequence ending at <code>x</code>.
 * Hint 2: Rewriting the formula <code>nums[i<sub>j</sub>] - nums[i<sub>j-1</sub>] &gt;= i<sub>j</sub> - i<sub>j-1</sub></code> gives <code>nums[i<sub>j</sub>] - i<sub>j</sub> &gt;= nums[i<sub>j-1</sub>] - i<sub>j-1</sub></code>.
 * Hint 3: So, for some index <code>x</code>, we need to find an index <code>y</code>, <code>y &lt; x</code>, such that <code>dp[x] = nums[x] + dp[y]</code> is maximized, and <code>nums[x] - x &gt;= nums[y] - y</code>.
 * Hint 4: There are many ways to achieve this. One method involves sorting the values of <code>nums[x] - x</code> for all indices <code>x</code> and using a segment/Fenwick tree with coordinate compression.
 * Hint 5: Hence, using a dictionary or map, let's call it <code>dict</code>, where <code>dict[nums[x] - x]</code> represents the position of the value, <code>nums[x] - x</code>, in the segment tree.
 * Hint 6: The tree is initialized with zeros initially.
 * Hint 7: For indices <code>x</code> in order from <code>[0, n - 1]</code>, <code>dp[x] = max(nums[x]</code>, <code>nums[x]</code> + the maximum query from the tree in the range <code>[0, dict[nums[x] - x]])</code>, and if <code>dp[x]</code> is greater than the value in the tree at position <code>dict[nums[x] - x]</code>, we update the value in the tree.
 * Hint 8: The answer to the problem is the maximum value in <code>dp</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/maximum-balanced-subsequence-sum/">LeetCode #2926</a>
 */
public class MaximumBalancedSubsequenceSum {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximum Balanced Subsequence Sum");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumBalancedSubsequenceSum ===");
        MaximumBalancedSubsequenceSum sol = new MaximumBalancedSubsequenceSum();
        System.out.println(sol.solve(null));
    }
}
