package org.leetcode.hard;

/**
 * <b>#23 - Merge k Sorted Lists</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Linked List, Divide and Conquer, Heap (Priority Queue), Merge Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * 
 * 
 * Merge all the linked-lists into one sorted linked-list and return it.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: lists = [[1,4,5],[1,3,4],[2,6]]
 * Output: [1,1,2,3,4,4,5,6]
 * Explanation: The linked-lists are:
 * [
 *   1-&gt;4-&gt;5,
 *   1-&gt;3-&gt;4,
 *   2-&gt;6
 * ]
 * merging them into one sorted linked list:
 * 1-&gt;1-&gt;2-&gt;3-&gt;4-&gt;4-&gt;5-&gt;6
 * 
 * Example 2:
 * 
 * Input: lists = []
 * Output: []
 * 
 * Example 3:
 * 
 * Input: lists = [[]]
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * k == lists.length
 * 	
 * 0 &lt;= k &lt;= 104
 * 	
 * 0 &lt;= lists[i].length &lt;= 500
 * 	
 * -104 &lt;= lists[i][j] &lt;= 104
 * 	
 * lists[i] is sorted in ascending order.
 * 	
 * The sum of lists[i].length will not exceed 104.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Min-Heap (PriorityQueue): insert all list heads.
 * Repeatedly poll the smallest node, add it to the result, and enqueue its next node.
 * Alternatively, divide-and-conquer merge-pairs runs in O(N log k) too.
 *
 * <h2>Complexity</h2>
* Time: O(N log k)  |  Space: O(k)
 *
 * @see <a href="https://leetcode.com/problems/merge-k-sorted-lists/">LeetCode #23</a>
 */
public class MergeKSortedLists {

    public static class ListNode { int val; ListNode next; ListNode(int v){val=v;} }

    /**
     * Merges k sorted linked lists into one sorted list.
     *
     * @param lists array of k sorted list heads
     * @return      head of merged sorted list
     */
    public ListNode mergeKLists(ListNode[] lists) {
        java.util.PriorityQueue<ListNode> pq = new java.util.PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) if (node != null) pq.offer(node);

        ListNode dummy = new ListNode(0), cur = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            cur = cur.next;
            if (node.next != null) pq.offer(node.next);
        }
        return dummy.next;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MergeKSortedLists ===");
        System.out.println("See class methods for usage.");
    }
}
