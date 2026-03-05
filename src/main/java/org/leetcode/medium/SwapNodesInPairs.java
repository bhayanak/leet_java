package org.leetcode.medium;

/**
 * <b>#24 - Swap Nodes in Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4]
 * 
 * 
 * Output: [2,1,4,3]
 * 
 * 
 * Explanation:
 * 
 * Example 2:
 * 
 * Input: head = []
 * 
 * 
 * Output: []
 * 
 * Example 3:
 * 
 * Input: head = [1]
 * 
 * 
 * Output: [1]
 * 
 * Example 4:
 * 
 * Input: head = [1,2,3]
 * 
 * 
 * Output: [2,1,3]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [0, 100].
 * 	
 * 0 &lt;= Node.val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Iterative approach with a dummy head.
 * For each pair (first, second): rewire pointers to swap them, then advance by 2.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">LeetCode #24</a>
 */
public class SwapNodesInPairs {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Swaps every two adjacent nodes in the linked list.
     *
     * @param head head of the list
     * @return     new head after all swaps
     */
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next, second = prev.next.next;
            first.next = second.next;
            second.next = first;
            prev.next = second;
            prev = first; // advance past the swapped pair
        }
        return dummy.next;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        SwapNodesInPairs sol = new SwapNodesInPairs();
        System.out.println(sol.swapPairs(null));
    }
}
