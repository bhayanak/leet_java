package org.leetcode.easy;

/**
 * <b>#206 - Reverse Linked List</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Example 2:
 * 
 * Input: head = [1,2]
 * Output: [2,1]
 * 
 * Example 3:
 * 
 * Input: head = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is the range [0, 5000].
 * 	
 * -5000 &lt;= Node.val &lt;= 5000
 * 
 *  
 * 
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Iteratively maintain prev, curr pointers. Redirect each node's next to prev.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/">LeetCode #206</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class ReverseLinkedList {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v){val=v;}
    }
    /**
     * Solves the problem: Ll.
     *
     * @param v the v (int...)
     * @return the computed ListNode result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
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
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public static String llStr(ListNode h){
        StringBuilder sb=new StringBuilder();
        while(h!=null){sb.append(h.val);if(h.next!=null)sb.append("->");h=h.next;}
        return sb.toString();
    }
    /**
     * Solves the problem: Reverse list.
     *
     * @param head the head (ListNode)
     * @return the computed ListNode result
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev; prev = curr; curr = next;
        }
        return prev;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();
        System.out.println(llStr(sol.reverseList(ll(1,2,3,4,5)))); // 5->4->3->2->1
        System.out.println(llStr(sol.reverseList(ll(1,2))));       // 2->1
    }
}
