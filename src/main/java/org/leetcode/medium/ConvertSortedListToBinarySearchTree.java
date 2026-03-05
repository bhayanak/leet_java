package org.leetcode.medium;

/**
 * <b>#109 - Convert Sorted List to Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Divide and Conquer, Tree, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
 * 
 * Example 2:
 * 
 * Input: head = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in head is in the range [0, 2 * 104].
 * 	
 * -105 &lt;= Node.val &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
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
 * @see <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">LeetCode #109</a>
 */
public class ConvertSortedListToBinarySearchTree {

    /**
     * TODO: Implement solution for "Convert Sorted List to Binary Search Tree".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Convert Sorted List to Binary Search Tree");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ConvertSortedListToBinarySearchTree.java &amp;&amp; java org.leetcode.medium.ConvertSortedListToBinarySearchTree
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== ConvertSortedListToBinarySearchTree ===");
        ConvertSortedListToBinarySearchTree sol = new ConvertSortedListToBinarySearchTree();
        System.out.println(sol.solve(null));
    }
}
