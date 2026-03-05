package org.leetcode.easy;

/**
 * <b>#203 - Remove Linked List Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 * 
 * Example 2:
 * 
 * Input: head = [], val = 1
 * Output: []
 * 
 * Example 3:
 * 
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [0, 104].
 * 	
 * 1 &lt;= Node.val &lt;= 50
 * 	
 * 0 &lt;= val &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Use a sentinel/dummy head to avoid special-casing the head removal.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/remove-linked-list-elements/">LeetCode #203</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class RemoveLinkedListElements {

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
     * Removes Remove elements.
     *
     * @param head the head (ListNode)
     * @param val the val (int)
     * @return the computed ListNode result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        RemoveLinkedListElements sol = new RemoveLinkedListElements();
        System.out.println(llStr(sol.removeElements(ll(1,2,6,3,4,5,6), 6))); // 1->2->3->4->5
        System.out.println(llStr(sol.removeElements(ll(7,7,7,7), 7)));        // (empty)
    }
}
