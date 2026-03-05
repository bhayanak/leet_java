package org.leetcode.medium;

/**
 * <b>#19 - Remove Nth Node From End of List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * 
 * Example 2:
 * 
 * Input: head = [1], n = 1
 * Output: []
 * 
 * Example 3:
 * 
 * Input: head = [1,2], n = 1
 * Output: [1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is sz.
 * 	
 * 1 &lt;= sz &lt;= 30
 * 	
 * 0 &lt;= Node.val &lt;= 100
 * 	
 * 1 &lt;= n &lt;= sz
 * 
 *  
 * 
 * Follow up: Could you do this in one pass?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Maintain two pointers and update one with a delay of n steps.
 *
 * <h2>Approach</h2>
 * Two pointers: advance the fast pointer n steps ahead.
 * Then move both until fast reaches the last node — slow is just before the target.
 * Use a dummy head to simplify deletion of the first node.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">LeetCode #19</a>
 */
public class RemoveNthNodeFromEndOfList {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Removes the n-th node from the end of a linked list.
     *
     * @param head the head of the list
     * @param n    position from the end (1-indexed)
     * @return     head of the modified list
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i <= n; i++) fast = fast.next; // advance fast by n+1
        while (fast != null) { fast = fast.next; slow = slow.next; }
        slow.next = slow.next.next; // remove target node
        return dummy.next;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList sol = new RemoveNthNodeFromEndOfList();
        // Build list 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode r = sol.removeNthFromEnd(head, 2);
        for (ListNode n = r; n != null; n = n.next) System.out.print(n.val + " "); // 1 2 3 5
    }
}
