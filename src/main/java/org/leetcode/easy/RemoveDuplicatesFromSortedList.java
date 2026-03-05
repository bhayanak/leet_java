package org.leetcode.easy;

/**
 * <b>#83 - Remove Duplicates from Sorted List</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,1,2]
 * Output: [1,2]
 * 
 * Example 2:
 * 
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [0, 300].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 	
 * The list is guaranteed to be sorted in ascending order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Walk the list; when node.val == node.next.val, skip node.next.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">LeetCode #83</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class RemoveDuplicatesFromSortedList {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Removes all duplicate elements from a sorted linked list.
     *
     * @param head head of sorted linked list
     * @return     head of the de-duplicated list
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) cur.next = cur.next.next; // skip duplicate
            else cur = cur.next;
        }
        return head;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== RemoveDuplicatesFromSortedList ===");
        System.out.println("See class methods for usage.");
    }
}
