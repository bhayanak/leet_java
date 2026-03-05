package org.leetcode.medium;

/**
 * <b>#117 - Populating Next Right Pointers in Each Node II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Linked List, Tree, Depth-First Search, Breadth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree
 * 
 * struct Node {
 *   int val;
 *   Node *left;
 *   Node *right;
 *   Node *next;
 * }
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * 
 * 
 * Initially, all next pointers are set to NULL.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,2,3,4,5,null,7]
 * Output: [1,#,2,3,#,4,5,7,#]
 * Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.
 * 
 * Example 2:
 * 
 * Input: root = []
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [0, 6000].
 * 	
 * -100 &lt;= Node.val &lt;= 100
 * 
 *  
 * 
 * Follow-up:
 * 
 * 	
 * You may only use constant extra space.
 * 	
 * The recursive approach is fine. You may assume implicit stack space does not count as extra space for this problem.
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
 * @see <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/">LeetCode #117</a>
 */
public class PopulatingNextRightPointersInEachNodeIi {

    /**
     * TODO: Implement solution for "Populating Next Right Pointers in Each Node II".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Populating Next Right Pointers in Each Node II");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac PopulatingNextRightPointersInEachNodeIi.java &amp;&amp; java org.leetcode.medium.PopulatingNextRightPointersInEachNodeIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== PopulatingNextRightPointersInEachNodeIi ===");
        PopulatingNextRightPointersInEachNodeIi sol = new PopulatingNextRightPointersInEachNodeIi();
        System.out.println(sol.solve(null));
    }
}
