package org.leetcode.medium;

/**
 * <b>#99 - Recover Binary Search Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: root = [1,3,null,null,2]
 * Output: [3,1,null,null,2]
 * Explanation: 3 cannot be a left child of 1 because 3 &gt; 1. Swapping 1 and 3 makes the BST valid.
 * 
 * Example 2:
 * 
 * Input: root = [3,1,4,null,null,2]
 * Output: [2,1,4,null,null,3]
 * Explanation: 2 cannot be in the right subtree of 3 because 2 &lt; 3. Swapping 2 and 3 makes the BST valid.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [2, 1000].
 * 	
 * -231 &lt;= Node.val &lt;= 231 - 1
 * 
 *  
 * Follow up: A solution using O(n) space is pretty straight-forward. Could you devise a constant O(1) space solution?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/recover-binary-search-tree/">LeetCode #99</a>
 */
public class RecoverBinarySearchTree {

    /**
     * TODO: Implement solution for "Recover Binary Search Tree".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Recover Binary Search Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        RecoverBinarySearchTree sol = new RecoverBinarySearchTree();
        System.out.println(sol.solve(null));
    }
}
