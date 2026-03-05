package org.leetcode.medium;

/**
 * <b>#148 - Sort List</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Two Pointers, Divide and Conquer, Sorting, Merge Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the head of a linked list, return the list after sorting it in ascending order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 * 
 * Example 2:
 * 
 * Input: head = [-1,5,3,4,0]
 * Output: [-1,0,3,4,5]
 * 
 * Example 3:
 * 
 * Input: head = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the list is in the range [0, 5 * 104].
 * 	
 * -105 &lt;= Node.val &lt;= 105
 * 
 *  
 * 
 * Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
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
 * @see <a href="https://leetcode.com/problems/sort-list/">LeetCode #148</a>
 */
public class SortList {

    /**
     * TODO: Implement solution for "Sort List".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Sort List");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac SortList.java &amp;&amp; java org.leetcode.medium.SortList
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== SortList ===");
        SortList sol = new SortList();
        System.out.println(sol.solve(null));
    }
}
