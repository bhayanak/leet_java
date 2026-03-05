package org.leetcode.easy;

/**
 * <b>#21 - Merge Two Sorted Lists</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * 
 * 
 * Return the head of the merged linked list.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * 
 * Example 2:
 * 
 * Input: list1 = [], list2 = []
 * Output: []
 * 
 * Example 3:
 * 
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in both lists is in the range [0, 50].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 	
 * Both list1 and list2 are sorted in non-decreasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Iterative merge using a dummy head node.
 * Compare the two list heads; attach the smaller one.
 * After one list is exhausted, attach the rest of the other.
 *
 * <h2>Complexity</h2>
* Time: O(m+n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">LeetCode #21</a>
 */
public class MergeTwoSortedLists {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Merges two sorted linked lists into one sorted list in-place.
     *
     * @param list1 head of first sorted list
     * @param list2 head of second sorted list
     * @return      head of the merged sorted list
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0), cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) { cur.next = list1; list1 = list1.next; }
            else                        { cur.next = list2; list2 = list2.next; }
            cur = cur.next;
        }
        cur.next = (list1 != null) ? list1 : list2; // attach remainder
        return dummy.next;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        System.out.println(sol.mergeTwoLists(null, null));
    }
}
