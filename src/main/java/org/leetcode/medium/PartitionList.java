package org.leetcode.medium;

/**
 * <b>#86 - Partition List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * 
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,4,3,2,5,2], x = 3
 * Output: [1,2,2,4,3,5]
 * 
 * Example 2:
 * 
 * Input: head = [2,1], x = 2
 * Output: [1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [0, 200].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 	
 * -200 &lt;= x &lt;= 200
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/partition-list/">LeetCode #86</a>
 */
public class PartitionList {

    /**
     * Definition for singly-linked list node (inner class for self-containment).
     */
    public static class ListNode {
        int val;
        AddTwoNumbers.ListNode next;
        ListNode(int v) { val = v; }
    }

    /**
     * Partitions the linked list so that all nodes less than x come before nodes greater than or equal to x.
     *
     * @param head head of the linked list
     * @param x partition value
     * @return head of the partitioned list
     *
     * <p><b>Explanation:</b> Uses two pointers to build two lists (less and greater), then concatenates them. Preserves original order. Time O(n), Space O(1).</p>
     */
    public ListNode partition(ListNode head, int x) {
        throw new UnsupportedOperationException("Not yet implemented: Partition List");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        PartitionList sol = new PartitionList();
        System.out.println(sol.partition(new ListNode(1), 0)); // Expected: [1]
    }
}
