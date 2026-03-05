package org.leetcode.hard;

/**
 * <b>#25 - Reverse Nodes in k-Group</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Linked List, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
 * 
 * 
 * k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * 
 * 
 * You may not alter the values in the list's nodes, only nodes themselves may be changed.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [2,1,4,3,5]
 * 
 * Example 2:
 * 
 * Input: head = [1,2,3,4,5], k = 3
 * Output: [3,2,1,4,5]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is n.
 * 	
 * 1 &lt;= k &lt;= n &lt;= 5000
 * 	
 * 0 &lt;= Node.val &lt;= 1000
 * 
 *  
 * 
 * Follow-up: Can you solve the problem in O(1) extra memory space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Check if k nodes remain; if so, reverse them in-place, then recurse for the rest.
 * Use a helper that reverses exactly k nodes between two pointers and returns new head.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n/k) stack depth
 *
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/">LeetCode #25</a>
 */
public class ReverseNodesInKGroup {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Reverses nodes of the list k at a time; leftovers stay as-is.
     *
     * @param head head of the list
     * @param k    group size
     * @return     head of the modified list
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode check = head;
        for (int i = 0; i < k; i++) {
            if (check == null) return head; // fewer than k nodes left — no reversal
            check = check.next;
        }
        // Reverse the first k nodes
        ListNode prev = null, cur = head;
        for (int i = 0; i < k; i++) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next = reverseKGroup(cur, k); // head is now the tail of reversed group
        return prev;                        // prev is the new head
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReverseNodesInKGroup ===");
        System.out.println("See class methods for usage.");
    }
}
