package org.leetcode.medium;

/**
 * <b>#142 - Linked List Cycle II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Linked List, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 * 
 * 
 * Do not modify the linked list.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 * 
 * Example 2:
 * 
 * Input: head = [1,2], pos = 0
 * Output: tail connects to node index 0
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 * 
 * Example 3:
 * 
 * Input: head = [1], pos = -1
 * Output: no cycle
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
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/linked-list-cycle-ii/">LeetCode #142</a>
 */
public class LinkedListCycleIi {

    /**
     * TODO: Implement solution for "Linked List Cycle II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Linked List Cycle II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac LinkedListCycleIi.java &amp;&amp; java org.leetcode.medium.LinkedListCycleIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== LinkedListCycleIi ===");
        LinkedListCycleIi sol = new LinkedListCycleIi();
        System.out.println(sol.solve(null));
    }
}
