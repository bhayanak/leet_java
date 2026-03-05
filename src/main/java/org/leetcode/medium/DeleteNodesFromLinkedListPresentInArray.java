package org.leetcode.medium;


/**
 * <b>#3217 - Delete Nodes From Linked List Present in Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Linked List</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], head = [1,2,3,4,5]
 *
 *
 * Output: [4,5]
 *
 *
 * Explanation:
 *
 * Remove the nodes with values 1, 2, and 3.
 *
 * Example 2:
 *
 * Input: nums = [1], head = [1,2,1,2,1,2]
 *
 *
 * Output: [2,2,2]
 *
 *
 * Explanation:
 *
 * Remove the nodes with value 1.
 *
 * Example 3:
 *
 * Input: nums = [5], head = [1,2,3,4]
 *
 *
 * Output: [1,2,3,4]
 *
 *
 * Explanation:
 *
 * No node has value 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * All elements in nums are unique.
 *
 * The number of nodes in the given list is in the range [1, 105].
 *
 * 1 &lt;= Node.val &lt;= 105
 *
 * The input is generated such that there is at least one node in the linked list that has a value not present in nums.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Add all elements of <code>nums</code> into a Set.
 * Hint 2: Scan the list to check if the current element should be deleted by checking the Set.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Linked List).
 *
 * @see <a href="https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/">LeetCode #3217</a>
 */
public class DeleteNodesFromLinkedListPresentInArray {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Delete Nodes From Linked List Present in Array");
    }

    public static void main(String[] args) {
        System.out.println("=== DeleteNodesFromLinkedListPresentInArray ===");
        DeleteNodesFromLinkedListPresentInArray sol = new DeleteNodesFromLinkedListPresentInArray();
        System.out.println(sol.solve(null));
    }
}
