package org.leetcode.easy;

/**
 * <b>#141 - Linked List Cycle</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * 
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * 
 * Example 2:
 * 
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * 
 * Example 3:
 * 
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of the nodes in the list is in the range [0, 104].
 * 	
 * -105 &lt;= Node.val &lt;= 105
 * 	
 * pos is -1 or a valid index in the linked-list.
 * 
 *  
 * 
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Floyd's Cycle Detection (tortoise and hare):
 * slow moves 1 step, fast moves 2. If they meet, a cycle exists.
 * If fast reaches null, no cycle.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/linked-list-cycle/">LeetCode #141</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class LinkedListCycle {

    /** Minimal singly-linked list node.
 *
 * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
 */
    public static class ListNode {
        int val; ListNode next;
        ListNode(int v) { val = v; }
    }

    /** Helper to build a linked list from an array.
 *
 * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
 */
    public static ListNode buildList(int... vals) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for (int v : vals) { cur.next = new ListNode(v); cur = cur.next; }
        return dummy.next;
    }

    /** Helper to print a linked list.
 *
 * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
 */
    public static void printList(ListNode head) {
        StringBuilder sb = new StringBuilder("[");
        while (head != null) { sb.append(head.val); if (head.next != null) sb.append(" -> "); head = head.next; }
        System.out.println(sb.append("]").toString());
    }

    /**
     * Detects whether a linked list has a cycle.
     * @param head head of the linked list
     * @return true if a cycle exists
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // meeting point = cycle
        }
        return false;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac LinkedListCycle.java &amp;&amp; java org.leetcode.easy.LinkedListCycle
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        LinkedListCycle sol = new LinkedListCycle();
        // No cycle
        System.out.println(sol.hasCycle(buildList(3,2,0,-4))); // false (no pos set)
        // Cycle: build [3,2,0,-4] then connect -4 back to index 1
        ListNode head = buildList(3,2,0,-4);
        ListNode tail = head; while (tail.next != null) tail = tail.next;
        tail.next = head.next; // cycle back to index 1
        System.out.println(sol.hasCycle(head)); // true
    }
}
