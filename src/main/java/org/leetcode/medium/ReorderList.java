package org.leetcode.medium;

/**
 * <b>#143 - Reorder List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Two Pointers, Stack, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the head of a singly linked-list. The list can be represented as:
 * 
 * L0 → L1 → … → Ln - 1 → Ln
 * 
 * Reorder the list to be on the following form:
 * 
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4]
 * Output: [1,4,2,3]
 * 
 * Example 2:
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [1,5,2,4,3]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [1, 5 * 104].
 * 	
 * 1 &lt;= Node.val &lt;= 1000
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
 * @see <a href="https://leetcode.com/problems/reorder-list/">LeetCode #143</a>
 */
public class ReorderList {

    /**
     * TODO: Implement solution for "Reorder List".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Reorder List");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ReorderList.java &amp;&amp; java org.leetcode.medium.ReorderList
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== ReorderList ===");
        ReorderList sol = new ReorderList();
        System.out.println(sol.solve(null));
    }
}
