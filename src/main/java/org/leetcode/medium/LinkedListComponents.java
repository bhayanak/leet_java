package org.leetcode.medium;


/**
 * <b>#817 - Linked List Components</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the head of a linked list containing unique integer values and an integer array nums that is a subset of the linked list values.
 *
 *
 * Return the number of connected components in nums where two values are connected if they appear consecutively in the linked list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [0,1,2,3], nums = [0,1,3]
 * Output: 2
 * Explanation: 0 and 1 are connected, so [0, 1] and [3] are the two connected components.
 *
 * Example 2:
 *
 * Input: head = [0,1,2,3,4], nums = [0,3,1,4]
 * Output: 2
 * Explanation: 0 and 1 are connected, 3 and 4 are connected, so [0, 1] and [3, 4] are the two connected components.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the linked list is n.
 *
 * 1 &lt;= n &lt;= 104
 *
 * 0 &lt;= Node.val &lt; n
 *
 * All the values Node.val are unique.
 *
 * 1 &lt;= nums.length &lt;= n
 *
 * 0 &lt;= nums[i] &lt; n
 *
 * All the values of nums are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Linked List).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/linked-list-components/">LeetCode #817</a>
 */
public class LinkedListComponents {

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
     * TODO: Implement "Linked List Components".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Linked List Components");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LinkedListComponents.java &amp;&amp; java org.leetcode.medium.LinkedListComponents</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LinkedListComponents ===");
        LinkedListComponents sol = new LinkedListComponents();
        System.out.println(sol.buildList(0));
    }
}
