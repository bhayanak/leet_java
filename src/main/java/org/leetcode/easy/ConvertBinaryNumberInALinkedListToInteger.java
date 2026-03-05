package org.leetcode.easy;


/**
 * <b>#1290 - Convert Binary Number in a Linked List to Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Linked List, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
 *
 *
 * Return the decimal value of the number in the linked list.
 *
 *
 * The most significant bit is at the head of the linked list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: head = [1,0,1]
 * Output: 5
 * Explanation: (101) in base 2 = (5) in base 10
 *
 * Example 2:
 *
 * Input: head = [0]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * The Linked List is not empty.
 *
 * Number of nodes will not exceed 30.
 *
 * Each node's value is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the linked list and store all values in a string or array. convert the values obtained to decimal value.
 * Hint 2: You can solve the problem in O(1) memory using bits operation. use shift left operation ( &lt;&lt; ) and or operation ( | ) to get the decimal value in one operation.
 *
 * <h2>Approach</h2>
 * Think about the category (Linked List, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/">LeetCode #1290</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class ConvertBinaryNumberInALinkedListToInteger {

    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * Returns Get decimal value.
     *
     * @param head the head (ListNode)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int getDecimalValue(ListNode head) {
        int val = 0;
        while (head != null) { val = val*2 + head.val; head = head.next; }
        return val;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger sol = new ConvertBinaryNumberInALinkedListToInteger();
                ListNode h = new ListNode(1); h.next = new ListNode(0); h.next.next = new ListNode(1);
                System.out.println(sol.getDecimalValue(h)); // 5
                ListNode h2 = new ListNode(0);
                System.out.println(sol.getDecimalValue(h2)); // 0
    }
}
