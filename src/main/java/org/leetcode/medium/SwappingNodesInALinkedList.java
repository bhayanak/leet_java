package org.leetcode.medium;


/**
 * <b>#1721 - Swapping Nodes in a Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the head of a linked list, and an integer k.
 *
 *
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [1,4,3,2,5]
 *
 * Example 2:
 *
 * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
 * Output: [7,9,6,6,8,7,3,0,9,5]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the list is n.
 *
 * 1 &lt;= k &lt;= n &lt;= 105
 *
 * 0 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can traverse the linked list and store the elements in an array.
 * Hint 2: Upon conversion to an array, we can swap the required elements by indexing the array.
 * Hint 3: We can rebuild the linked list using the order of the elements in the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Two Pointers).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/swapping-nodes-in-a-linked-list/">LeetCode #1721</a>
 */
public class SwappingNodesInALinkedList {

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
        throw new UnsupportedOperationException("Not yet implemented: Swapping Nodes in a Linked List");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SwappingNodesInALinkedList ===");
        SwappingNodesInALinkedList sol = new SwappingNodesInALinkedList();
        System.out.println(sol.solve(null));
    }
}
