package org.leetcode.medium;


/**
 * <b>#1367 - Linked List in Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree root and a linked list with head as the first node. 
 *
 *
 * Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.
 *
 *
 * In this context downward path means a path that starts at some node and goes downwards.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 * Explanation: Nodes in blue form a subpath in the binary Tree.  
 *
 * Example 2:
 *
 * Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: true
 *
 * Example 3:
 *
 * Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
 * Output: false
 * Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree will be in the range [1, 2500].
 *
 * The number of nodes in the list will be in the range [1, 100].
 *
 * 1 &lt;= Node.val &lt;= 100 for each node in the linked list and binary tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create recursive function, given a pointer in a Linked List and any node in the Binary Tree. Check if all the elements in the linked list starting from the head correspond to some downward path in the binary tree.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/linked-list-in-binary-tree/">LeetCode #1367</a>
 */
public class LinkedListInBinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Linked List in Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LinkedListInBinaryTree ===");
        LinkedListInBinaryTree sol = new LinkedListInBinaryTree();
        System.out.println(sol.solve(null));
    }
}
