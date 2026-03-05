package org.leetcode.medium;


/**
 * <b>#865 - Smallest Subtree with all the Deepest Nodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, the depth of each node is the shortest distance to the root.
 *
 *
 * Return the smallest subtree such that it contains all the deepest nodes in the original tree.
 *
 *
 * A node is called the deepest if it has the largest depth possible among any node in the entire tree.
 *
 *
 * The subtree of a node is a tree consisting of that node, plus the set of all descendants of that node.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4]
 * Output: [2,7,4]
 * Explanation: We return the node with value 2, colored in yellow in the diagram.
 * The nodes coloured in blue are the deepest nodes of the tree.
 * Notice that nodes 5, 3 and 2 contain the deepest nodes in the tree but node 2 is the smallest subtree among them, so we return it.
 *
 * Example 2:
 *
 * Input: root = [1]
 * Output: [1]
 * Explanation: The root is the deepest node in the tree.
 *
 * Example 3:
 *
 * Input: root = [0,1,3,null,2]
 * Output: [2]
 * Explanation: The deepest node in the tree is 2, the valid subtrees are the subtrees of nodes 2, 1 and 0 but the subtree of node 2 is the smallest.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree will be in the range [1, 500].
 *
 * 0 &lt;= Node.val &lt;= 500
 *
 * The values of the nodes in the tree are unique.
 *
 *
 *
 * Note: This question is the same as 1123: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Breadth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/">LeetCode #865</a>
 */
public class SmallestSubtreeWithAllTheDeepestNodes {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Smallest Subtree with all the Deepest Nodes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Subtree with all the Deepest Nodes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestSubtreeWithAllTheDeepestNodes.java &amp;&amp; java org.leetcode.medium.SmallestSubtreeWithAllTheDeepestNodes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestSubtreeWithAllTheDeepestNodes ===");
        SmallestSubtreeWithAllTheDeepestNodes sol = new SmallestSubtreeWithAllTheDeepestNodes();
        System.out.println(sol.solve(null));
    }
}
