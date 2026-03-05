package org.leetcode.medium;


/**
 * <b>#2816 - Double a Number Represented as a Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Math, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
 *
 *
 * Return the head of the linked list after doubling it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [1,8,9]
 * Output: [3,7,8]
 * Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
 *
 * Example 2:
 *
 * Input: head = [9,9,9]
 * Output: [1,9,9,8]
 * Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the list is in the range [1, 104]
 *
 * 0 &lt;= Node.val &lt;= 9
 *
 * The input is generated such that the list represents a number that does not have leading zeros, except the number 0 itself.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the linked list from the least significant digit to the most significant digit and multiply each node's value by 2
 * Hint 2: Handle any carry-over digits that may arise during the doubling process.
 * Hint 3: If there is a carry-over digit on the most significant digit, create a new node with that value and point it to the start of the given linked list and return it.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Math, Stack).
 *
 * @see <a href="https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/">LeetCode #2816</a>
 */
public class DoubleANumberRepresentedAsALinkedList {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Double it.
     *
     * @param head the head (ListNode)
     * @return the computed ListNode result
     */
    public ListNode doubleIt(ListNode head) {
        // Reverse, double, carry, reverse back
        ListNode rev=reverse(head); ListNode cur=rev; int carry=0;
        while (cur!=null) {
            int val=cur.val*2+carry;
            cur.val=val%10; carry=val/10; cur=cur.next;
        }
        rev=reverse(rev);
        if (carry>0) { ListNode newHead=new ListNode(carry); newHead.next=rev; return newHead; }
        return rev;
    }
    private ListNode reverse(ListNode head){ListNode prev=null,cur=head;while(cur!=null){ListNode next=cur.next;cur.next=prev;prev=cur;cur=next;}return prev;}

    public static void main(String[] args) {
        DoubleANumberRepresentedAsALinkedList sol = new DoubleANumberRepresentedAsALinkedList();
                ListNode h=new ListNode(1); h.next=new ListNode(8); h.next.next=new ListNode(9);
                ListNode res=sol.doubleIt(h);
                while(res!=null){System.out.print(res.val+" ");res=res.next;} System.out.println(); // 3 7 8
    }
}
