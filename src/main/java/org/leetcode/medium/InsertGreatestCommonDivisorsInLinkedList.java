package org.leetcode.medium;


/**
 * <b>#2807 - Insert Greatest Common Divisors in Linked List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list head, in which each node contains an integer value.
 *
 *
 * Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
 *
 *
 * Return the linked list after insertion.
 *
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [18,6,10,3]
 * Output: [18,6,6,2,10,1,3]
 * Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes (nodes in blue are the inserted nodes).
 * - We insert the greatest common divisor of 18 and 6 = 6 between the 1st and the 2nd nodes.
 * - We insert the greatest common divisor of 6 and 10 = 2 between the 2nd and the 3rd nodes.
 * - We insert the greatest common divisor of 10 and 3 = 1 between the 3rd and the 4th nodes.
 * There are no more adjacent nodes, so we return the linked list.
 *
 * Example 2:
 *
 * Input: head = [7]
 * Output: [7]
 * Explanation: The 1st diagram denotes the initial linked list and the 2nd diagram denotes the linked list after inserting the new nodes.
 * There are no pairs of adjacent nodes, so we return the initial linked list.
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the list is in the range [1, 5000].
 *
 * 1 &lt;= Node.val &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/">LeetCode #2807</a>
 */
public class InsertGreatestCommonDivisorsInLinkedList {

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
        throw new UnsupportedOperationException("Not yet implemented: Insert Greatest Common Divisors in Linked List");
    }

    public static void main(String[] args) {
        System.out.println("=== InsertGreatestCommonDivisorsInLinkedList ===");
        InsertGreatestCommonDivisorsInLinkedList sol = new InsertGreatestCommonDivisorsInLinkedList();
        System.out.println(sol.solve(null));
    }
}
