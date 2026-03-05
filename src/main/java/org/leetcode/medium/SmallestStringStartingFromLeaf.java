package org.leetcode.medium;


/**
 * <b>#988 - Smallest String Starting From Leaf</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree where each node has a value in the range [0, 25] representing the letters 'a' to 'z'.
 *
 *
 * Return the lexicographically smallest string that starts at a leaf of this tree and ends at the root.
 *
 *
 * As a reminder, any shorter prefix of a string is lexicographically smaller.
 *
 *
 * For example, "ab" is lexicographically smaller than "aba".
 *
 * A leaf of a node is a node that has no children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [0,1,2,3,4,3,4]
 * Output: "dba"
 *
 * Example 2:
 *
 * Input: root = [25,1,3,1,3,0,2]
 * Output: "adz"
 *
 * Example 3:
 *
 * Input: root = [2,2,1,null,1,0,null,0]
 * Output: "abc"
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 8500].
 *
 * 0 &lt;= Node.val &lt;= 25
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-string-starting-from-leaf/">LeetCode #988</a>
 */
public class SmallestStringStartingFromLeaf {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Smallest String Starting From Leaf".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest String Starting From Leaf");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestStringStartingFromLeaf.java &amp;&amp; java org.leetcode.medium.SmallestStringStartingFromLeaf</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestStringStartingFromLeaf ===");
        SmallestStringStartingFromLeaf sol = new SmallestStringStartingFromLeaf();
        System.out.println(sol.solve(null));
    }
}
