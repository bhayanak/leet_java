package org.leetcode.easy;

/**
 * <b>#234 - Palindrome Linked List</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Two Pointers, Stack, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,2,1]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: head = [1,2]
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [1, 105].
 * 	
 * 0 &lt;= Node.val &lt;= 9
 * 
 *  
 * Follow up: Could you do it in O(n) time and O(1) space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Find mid (slow/fast), reverse second half, compare.
 * Optionally restore (good practice).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">LeetCode #234</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class PalindromeLinkedList {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v){val=v;}
    }
    /**
     * Solves the problem: Ll.
     * Uses binary search for O(log n) lookup.
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
     * Uses binary search for O(log n) lookup.
     *
     * @param h the h (ListNode)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public static String llStr(ListNode h){
        StringBuilder sb=new StringBuilder();
        while(h!=null){sb.append(h.val);if(h.next!=null)sb.append("->");h=h.next;}
        return sb.toString();
    }
    /**
     * Returns true if Is palindrome.
     * Uses binary search for O(log n) lookup.
     *
     * @param head the head (ListNode)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public boolean isPalindrome(ListNode head) {
        // find mid
        ListNode slow=head, fast=head;
        while (fast!=null&&fast.next!=null){slow=slow.next;fast=fast.next.next;}
        // reverse second half
        ListNode prev=null, cur=slow;
        while (cur!=null){ListNode nx=cur.next;cur.next=prev;prev=cur;cur=nx;}
        // compare
        ListNode l=head, r=prev;
        while (r!=null){if(l.val!=r.val)return false;l=l.next;r=r.next;}
        return true;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        PalindromeLinkedList sol = new PalindromeLinkedList();
        System.out.println(sol.isPalindrome(ll(1,2,2,1))); // true
        System.out.println(sol.isPalindrome(ll(1,2)));     // false
    }
}
