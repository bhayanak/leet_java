package org.leetcode.medium;

/**
 * <b>#2 - Add Two Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * 
 * 
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in each linked list is in the range [1, 100].
 * 	
 * 0 &lt;= Node.val &lt;= 9
 * 	
 * It is guaranteed that the list represents a number that does not have leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Simulate grade-school addition on two linked lists (digits stored in
 * reverse order). Walk both lists together, summing digits plus any carry.
 * Continue until both lists and carry are exhausted.
 *
 * <h2>Complexity</h2>
* Time: O(max(m,n))  |  Space: O(max(m,n))
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers/">LeetCode #2</a>
 */
public class AddTwoNumbers {

    /**
     * Definition for singly-linked list node (inner class for self-containment).
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int v) { val = v; }
    }

    /**
     * Adds two non-negative integers represented as reversed linked lists.
     *
     * @param l1 head of the first number list
     * @param l2 head of the second number list
     * @return   head of the resulting sum list (also reversed)
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return dummy.next;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                AddTwoNumbers sol = new AddTwoNumbers();
                // 342 + 465 = 807
                ListNode l1 = new ListNode(2); l1.next = new ListNode(4); l1.next.next = new ListNode(3);
                ListNode l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(4);
                ListNode res = sol.addTwoNumbers(l1, l2);
                while (res != null) { System.out.print(res.val + " "); res = res.next; }
                System.out.println(); // 7 0 8
    }
}
