package org.leetcode.medium;

/**
 * <b>#328 - Odd Even Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 * 
 * 
 * The first node is considered odd, and the second node is even, and so on.
 * 
 * 
 * Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * 
 * 
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [1,3,5,2,4]
 * 
 * Example 2:
 * 
 * Input: head = [2,1,3,5,6,4,7]
 * Output: [2,3,6,7,1,5,4]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the linked list is in the range [0, 104].
 * 	
 * -106 &lt;= Node.val &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Maintain separate odd and even chains. Link even's tail to odd's next original head.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/odd-even-linked-list/">LeetCode #328</a>
 */
public class OddEvenLinkedList {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v){val=v;}
    }
    /**
     * Solves the problem: Ll.
     *
     * @param v the v (int...)
     * @return the computed ListNode result
     */
    public static ListNode ll(int... v){
        ListNode d=new ListNode(0),c=d;
        for(int x:v){c.next=new ListNode(x);c=c.next;}
        return d.next;
    }
    /**
     * Solves the problem: Ll str.
     *
     * @param h the h (ListNode)
     * @return the computed String result
     */
    public static String llStr(ListNode h){
        StringBuilder sb=new StringBuilder();
        while(h!=null){sb.append(h.val);if(h.next!=null)sb.append("->");h=h.next;}
        return sb.toString();
    }
    /**
     * Solves the problem: Odd even list.
     *
     * @param head the head (ListNode)
     * @return the computed ListNode result
     */
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head, even=head.next, evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next; odd=odd.next;
            even.next=odd.next; even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        OddEvenLinkedList sol = new OddEvenLinkedList();
        System.out.println(llStr(sol.oddEvenList(ll(1,2,3,4,5)))); // 1->3->5->2->4
        System.out.println(llStr(sol.oddEvenList(ll(2,1,3,5,6,4,7)))); // 2->3->6->7->1->5->4
    }
}
