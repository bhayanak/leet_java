package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LeetCode #445: Add Two Numbers II
 * @see <a href="https://leetcode.com/problems/add-two-numbers-ii/">Problem</a>
 */
public class AddTwoNumbersIi {

    static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * LeetCode #445 – Add Two Numbers II
     * Difficulty: MEDIUM
     * Topics: Linked List, Math, Stack
     *
     * You are given two non-empty linked lists representing two non-negative
     * integers. The most significant digit comes first and each of their nodes
     * contains a single digit. Add the two numbers and return the sum as a linked
     * list.
     * 
     * 
     * You may assume the two numbers do not contain any leading zero, except the
     * number 0 itself.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: l1 = [7,2,4,3], l2 = [5,6,4]
     * Output: [7,8,0,7]
     * 
     * Example 2:
     * 
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [8,0,7]
     * 
     * Example 3:
     * 
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
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
     * It is guaranteed that the list represents a number that does not have
     * leading zeros.
     * 
     * 
     * 
     * Follow up: Could you solve it without reversing the input lists?
     */
    // Use stacks to add from least significant digit
    /**
     * Adds Add two numbers.
     *
     * @param l1 the l1 (ListNode)
     * @param l2 the l2 (ListNode)
     * @return the computed ListNode result
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> s1 = new ArrayDeque<>(), s2 = new ArrayDeque<>();
        while (l1 != null) { s1.push(l1.val); l1 = l1.next; }
        while (l2 != null) { s2.push(l2.val); l2 = l2.next; }
        int carry = 0; ListNode dummy = new ListNode(0);
        while (!s1.isEmpty() || !s2.isEmpty() || carry > 0) {
            int sum = carry;
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            node.next = dummy.next; dummy.next = node;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // 7->1->6 + 5->9->2 = 7->0->8 (716 + 592 = 1308? No: reversed = 617, 295, sum=912)
        // Actually: l1 = 7->2->4->3, l2 = 5->6->4 means 7243+564=7807
        System.out.println("Add Two Numbers II - uses stacks to handle no-reverse constraint");
    }
}
