package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #725: Split Linked List in Parts
 * @see <a href="https://leetcode.com/problems/split-linked-list-in-parts/">Problem</a>
 */
public class SplitLinkedListInParts {

    static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }
    /**
     * LeetCode #725 – Split Linked List in Parts
     * Difficulty: MEDIUM
     * Topics: Linked List
     *
     * Given the head of a singly linked list and an integer k, split the linked
     * list into k consecutive linked list parts.
     * 
     * 
     * The length of each part should be as equal as possible: no two parts should
     * have a size differing by more than one. This may lead to some parts being
     * null.
     * 
     * 
     * The parts should be in the order of occurrence in the input list, and parts
     * occurring earlier should always have a size greater than or equal to parts
     * occurring later.
     * 
     * 
     * Return an array of the k parts.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: head = [1,2,3], k = 5
     * Output: [[1],[2],[3],[],[]]
     * Explanation:
     * The first element output[0] has output[0].val = 1, output[0].next = null.
     * The last element output[4] is null, but its string representation as a
     * ListNode is [].
     * 
     * Example 2:
     * 
     * Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
     * Output: [[1,2,3,4],[5,6,7],[8,9,10]]
     * Explanation:
     * The input has been split into consecutive parts with size difference at
     * most 1, and earlier parts are a larger size than the later parts.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the list is in the range [0, 1000].
     * 
     * 0 &lt;= Node.val &lt;= 1000
     * 
     * 1 &lt;= k &lt;= 50
     */
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0; ListNode cur = head;
        while (cur != null) { len++; cur = cur.next; }
        int partSize = len / k, extra = len % k;
        ListNode[] parts = new ListNode[k]; cur = head;
        for (int i = 0; i < k && cur != null; i++) {
            parts[i] = cur;
            int size = partSize + (i < extra ? 1 : 0);
            for (int j = 1; j < size; j++) cur = cur.next;
            ListNode next = cur.next; cur.next = null; cur = next;
        }
        return parts;
    }

    public static void main(String[] args) {
        SplitLinkedListInParts sol = new SplitLinkedListInParts();
        System.out.println(sol.splitListToParts(null, 3));
    }
}
