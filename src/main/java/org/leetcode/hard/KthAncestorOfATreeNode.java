package org.leetcode.hard;


/**
 * <b>#1483 - Kth Ancestor of a Tree Node</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Binary Search, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search, Breadth-First Search, Design</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a tree with n nodes numbered from 0 to n - 1 in the form of a parent array parent where parent[i] is the parent of ith node. The root of the tree is node 0. Find the kth ancestor of a given node.
 *
 *
 * The kth ancestor of a tree node is the kth node in the path from that node to the root node.
 *
 *
 * Implement the TreeAncestor class:
 *
 *
 * TreeAncestor(int n, int[] parent) Initializes the object with the number of nodes in the tree and the parent array.
 *
 * int getKthAncestor(int node, int k) return the kth ancestor of the given node node. If there is no such ancestor, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["TreeAncestor", "getKthAncestor", "getKthAncestor", "getKthAncestor"]
 * [[7, [-1, 0, 0, 1, 1, 2, 2]], [3, 1], [5, 2], [6, 3]]
 * Output
 * [null, 1, 0, -1]
 *
 * Explanation
 * TreeAncestor treeAncestor = new TreeAncestor(7, [-1, 0, 0, 1, 1, 2, 2]);
 * treeAncestor.getKthAncestor(3, 1); // returns 1 which is the parent of 3
 * treeAncestor.getKthAncestor(5, 2); // returns 0 which is the grandparent of 5
 * treeAncestor.getKthAncestor(6, 3); // returns -1 because there is no such ancestor
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= n &lt;= 5 * 104
 *
 * parent.length == n
 *
 * parent[0] == -1
 *
 * 0 &lt;= parent[i] &lt; n for all 0 &lt; i &lt; n
 *
 * 0 &lt;= node &lt; n
 *
 * There will be at most 5 * 104 queries.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The queries must be answered efficiently to avoid time limit exceeded verdict.
 * Hint 2: Use sparse table (dynamic programming application) to travel the tree upwards in a fast way.
 *
 * <h2>Approach</h2>
 * Think about the category (Binary Search, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search, Breadth-First Search, Design).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/kth-ancestor-of-a-tree-node/">LeetCode #1483</a>
 */
public class KthAncestorOfATreeNode {

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
        throw new UnsupportedOperationException("Not yet implemented: Kth Ancestor of a Tree Node");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== KthAncestorOfATreeNode ===");
        KthAncestorOfATreeNode sol = new KthAncestorOfATreeNode();
        System.out.println(sol.solve(null));
    }
}
