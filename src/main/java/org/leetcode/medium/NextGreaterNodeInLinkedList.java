package org.leetcode.medium;


/**
 * <b>#1019 - Next Greater Node In Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Linked List, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the head of a linked list with n nodes.
 *
 *
 * For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
 *
 *
 * Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [2,1,5]
 * Output: [5,5,0]
 *
 * Example 2:
 *
 * Input: head = [2,7,4,3,5]
 * Output: [7,0,5,5,0]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the list is n.
 *
 * 1 &lt;= n &lt;= 104
 *
 * 1 &lt;= Node.val &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use a stack that stores nodes in monotone decreasing order of value.  When we see a node_j with a larger value, every node_i in the stack has next_larger(node_i) = node_j .
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Linked List, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/next-greater-node-in-linked-list/">LeetCode #1019</a>
 */
public class NextGreaterNodeInLinkedList {

    /** Minimal singly-linked list node. */
    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Builds Build list.
     *
     * @param vals the vals (int...)
     * @return the computed ListNode result
     */
    public static ListNode buildList(int... vals) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for (int v : vals) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }
    /**
     * TODO: Implement "Next Greater Node In Linked List".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Next Greater Node In Linked List");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NextGreaterNodeInLinkedList.java &amp;&amp; java org.leetcode.medium.NextGreaterNodeInLinkedList</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NextGreaterNodeInLinkedList ===");
        NextGreaterNodeInLinkedList sol = new NextGreaterNodeInLinkedList();
        System.out.println(sol.buildList(0));
    }
}
