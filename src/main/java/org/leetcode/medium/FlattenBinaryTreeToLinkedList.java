package org.leetcode.medium;

/**
 * <b>#114 - Flatten Binary Tree to Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Stack, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the root of a binary tree, flatten the tree into a "linked list":
 * 
 * 	
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
 * 	
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,5,3,4,null,6]
 * Output: [1,null,2,null,3,null,4,null,5,null,6]
 * 
 * Example 2:
 * 
 * Input: root = []
 * Output: []
 * 
 * Example 3:
 * 
 * Input: root = [0]
 * Output: [0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 2000].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 
 *  
 * Follow up: Can you flatten the tree in-place (with O(1) extra space)?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/">LeetCode #114</a>
 */
public class FlattenBinaryTreeToLinkedList {

    /**
     * TODO: Implement solution for "Flatten Binary Tree to Linked List".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Flatten Binary Tree to Linked List");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac FlattenBinaryTreeToLinkedList.java &amp;&amp; java org.leetcode.medium.FlattenBinaryTreeToLinkedList
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== FlattenBinaryTreeToLinkedList ===");
        FlattenBinaryTreeToLinkedList sol = new FlattenBinaryTreeToLinkedList();
        System.out.println(sol.solve(null));
    }
}
