package org.leetcode.easy;


/**
 * <b>#876 - Middle of the Linked List</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 *
 * If there are two middle nodes, return the second middle node.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 *
 * Example 2:
 *
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the list is in the range [1, 100].
 *
 * 1 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Two Pointers).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/middle-of-the-linked-list/">LeetCode #876</a>
 */
public class MiddleOfTheLinkedList {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /** Minimal singly-linked list node.
 *
 * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
 */
    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Builds Build list.
     * Uses binary search for O(log n) lookup.
     *
     * @param vals the vals (int...)
     * @return the computed ListNode result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public static ListNode buildList(int... vals) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for (int v : vals) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }
    /**
     * Solves the problem: Middle node.
     * Uses binary search for O(log n) lookup.
     *
     * @param head the head (ListNode)
     * @return the computed ListNode result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; fast = fast.next.next;
        }
        return slow;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MiddleOfTheLinkedList.java &amp;&amp; java org.leetcode.easy.MiddleOfTheLinkedList</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MiddleOfTheLinkedList sol = new MiddleOfTheLinkedList();
                ListNode h1 = buildList(1,2,3,4,5);
                System.out.println(sol.middleNode(h1).val); // 3
                ListNode h2 = buildList(1,2,3,4,5,6);
                System.out.println(sol.middleNode(h2).val); // 4
    }
}
