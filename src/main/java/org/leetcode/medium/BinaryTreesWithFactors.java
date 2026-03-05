package org.leetcode.medium;


/**
 * <b>#823 - Binary Trees With Factors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of unique integers, arr, where each integer arr[i] is strictly greater than 1.
 *
 *
 * We make a binary tree using these integers, and each number may be used for any number of times. Each non-leaf node's value should be equal to the product of the values of its children.
 *
 *
 * Return the number of binary trees we can make. The answer may be too large so return the answer modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,4]
 * Output: 3
 * Explanation: We can make these trees: [2], [4], [4, 2, 2]
 *
 * Example 2:
 *
 * Input: arr = [2,4,5,10]
 * Output: 7
 * Explanation: We can make these trees: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 1000
 *
 * 2 &lt;= arr[i] &lt;= 109
 *
 * All the values of arr are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-trees-with-factors/">LeetCode #823</a>
 */
public class BinaryTreesWithFactors {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Binary Trees With Factors".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Trees With Factors");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryTreesWithFactors.java &amp;&amp; java org.leetcode.medium.BinaryTreesWithFactors</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreesWithFactors ===");
        BinaryTreesWithFactors sol = new BinaryTreesWithFactors();
        System.out.println(sol.solve(null));
    }
}
