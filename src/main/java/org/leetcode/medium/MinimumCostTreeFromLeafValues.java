package org.leetcode.medium;


/**
 * <b>#1130 - Minimum Cost Tree From Leaf Values</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr of positive integers, consider all binary trees such that:
 *
 *
 * Each node has either 0 or 2 children;
 *
 * The values of arr correspond to the values of each leaf in an in-order traversal of the tree.
 *
 * The value of each non-leaf node is equal to the product of the largest leaf value in its left and right subtree, respectively.
 *
 * Among all possible binary trees considered, return the smallest possible sum of the values of each non-leaf node. It is guaranteed this sum fits into a 32-bit integer.
 *
 *
 * A node is a leaf if and only if it has zero children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [6,2,4]
 * Output: 32
 * Explanation: There are two possible trees shown.
 * The first has a non-leaf node sum 36, and the second has non-leaf node sum 32.
 *
 * Example 2:
 *
 * Input: arr = [4,11]
 * Output: 44
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 40
 *
 * 1 &lt;= arr[i] &lt;= 15
 *
 * It is guaranteed that the answer fits into a 32-bit signed integer (i.e., it is less than 231).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do a DP, where dp(i, j) is the answer for the subarray arr[i]..arr[j].
 * Hint 2: For each possible way to partition the subarray i &lt;= k &lt; j, the answer is max(arr[i]..arr[k]) * max(arr[k+1]..arr[j]) + dp(i, k) + dp(k+1, j).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Stack, Greedy, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-tree-from-leaf-values/">LeetCode #1130</a>
 */
public class MinimumCostTreeFromLeafValues {

    /**
     * TODO: Implement "Minimum Cost Tree From Leaf Values".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost Tree From Leaf Values");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumCostTreeFromLeafValues.java &amp;&amp; java org.leetcode.medium.MinimumCostTreeFromLeafValues</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostTreeFromLeafValues ===");
        MinimumCostTreeFromLeafValues sol = new MinimumCostTreeFromLeafValues();
        System.out.println(sol.solve(null));
    }
}
