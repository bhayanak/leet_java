package org.leetcode.medium;


/**
 * <b>#1171 - Remove Zero Sum Consecutive Nodes from Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
 *
 *
 * After doing so, return the head of the final linked list.  You may return any such answer.
 *
 *
 *
 *
 * (Note that in the examples below, all sequences are serializations of ListNode objects.)
 *
 *
 * Example 1:
 *
 * Input: head = [1,2,-3,3,1]
 * Output: [3,1]
 * Note: The answer [1,2,1] would also be accepted.
 *
 * Example 2:
 *
 * Input: head = [1,2,3,-3,4]
 * Output: [1,2,4]
 *
 * Example 3:
 *
 * Input: head = [1,2,3,-3,-2]
 * Output: [1]
 *
 *
 *
 * Constraints:
 *
 *
 * The given linked list will contain between 1 and 1000 nodes.
 *
 * Each node in the linked list has -1000 &lt;= node.val &lt;= 1000.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the linked list into an array.
 * Hint 2: While you can find a non-empty subarray with sum = 0, erase it.
 * Hint 3: Convert the array into a linked list.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Linked List).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/">LeetCode #1171</a>
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {

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
     * TODO: Implement "Remove Zero Sum Consecutive Nodes from Linked List".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove Zero Sum Consecutive Nodes from Linked List");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RemoveZeroSumConsecutiveNodesFromLinkedList.java &amp;&amp; java org.leetcode.medium.RemoveZeroSumConsecutiveNodesFromLinkedList</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RemoveZeroSumConsecutiveNodesFromLinkedList ===");
        RemoveZeroSumConsecutiveNodesFromLinkedList sol = new RemoveZeroSumConsecutiveNodesFromLinkedList();
        System.out.println(sol.buildList(0));
    }
}
