package org.leetcode.easy;

/**
 * <b>#160 - Intersection of Two Linked Lists</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
 * 
 * 
 * For example, the following two linked lists begin to intersect at node c1:
 * 
 * 
 * The test cases are generated such that there are no cycles anywhere in the entire linked structure.
 * 
 * 
 * Note that the linked lists must retain their original structure after the function returns.
 * 
 * 
 * Custom Judge:
 * 
 * 
 * The inputs to the judge are given as follows (your program is not given these inputs):
 * 
 * 	
 * intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
 * 	
 * listA - The first linked list.
 * 	
 * listB - The second linked list.
 * 	
 * skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
 * 	
 * skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
 * 
 * The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Intersected at '8'
 * Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 * - Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
 * 
 * Example 2:
 * 
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Intersected at '2'
 * Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
 * From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 * 
 * Example 3:
 * 
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * Output: No intersection
 * Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
 * Explanation: The two lists do not intersect, so return null.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes of listA is in the m.
 * 	
 * The number of nodes of listB is in the n.
 * 	
 * 1 &lt;= m, n &lt;= 3 * 104
 * 	
 * 1 &lt;= Node.val &lt;= 105
 * 	
 * 0 &lt;= skipA &lt;= m
 * 	
 * 0 &lt;= skipB &lt;= n
 * 	
 * intersectVal is 0 if listA and listB do not intersect.
 * 	
 * intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
 * 
 *  
 * Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Two pointers: when each pointer finishes its list, redirect it to the other list's head.
 * If lists intersect they will meet at the intersection node after at most m+n steps.
 *
 * <h2>Complexity</h2>
* Time: O(m+n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">LeetCode #160</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class IntersectionOfTwoLinkedLists {

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
     * Finds the intersecting node of two linked lists (or null if none).
     * @param headA head of list A
     * @param headB head of list B
     * @return intersection node, or null
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a; // null if no intersection
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac IntersectionOfTwoLinkedLists.java &amp;&amp; java org.leetcode.easy.IntersectionOfTwoLinkedLists
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists sol = new IntersectionOfTwoLinkedLists();
        // Build intersecting lists sharing tail [8,4,5]
        ListNode shared = buildList(8,4,5);
        ListNode a = buildList(4,1); a.next.next = shared;
        ListNode b = buildList(5,6,1); b.next.next.next = shared;
        ListNode meet = sol.getIntersectionNode(a, b);
        System.out.println("Intersection at: " + (meet != null ? meet.val : "null")); // 8
    }
}
