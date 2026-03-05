package org.leetcode.medium;

/**
 * <b>#173 - Binary Search Tree Iterator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Stack, Tree, Design, Binary Search Tree, Binary Tree, Iterator</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):
 * 
 * 	
 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
 * 	
 * boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
 * 	
 * int next() Moves the pointer to the right, then returns the number at the pointer.
 * 
 * Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.
 * 
 * 
 * You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"]
 * [[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
 * Output
 * [null, 3, 7, true, 9, true, 15, true, 20, false]
 * 
 * Explanation
 * BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
 * bSTIterator.next();    // return 3
 * bSTIterator.next();    // return 7
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 9
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 15
 * bSTIterator.hasNext(); // return True
 * bSTIterator.next();    // return 20
 * bSTIterator.hasNext(); // return False
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * The number of nodes in the tree is in the range [1, 105].
 * 	
 * 0 &lt;= Node.val &lt;= 106
 * 	
 * At most 105 calls will be made to hasNext, and next.
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * Could you implement next() and hasNext() to run in average O(1) time and use O(h) memory, where h is the height of the tree?
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
 * @see <a href="https://leetcode.com/problems/binary-search-tree-iterator/">LeetCode #173</a>
 */
public class BinarySearchTreeIterator {

    /**
     * TODO: Implement solution for "Binary Search Tree Iterator".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Search Tree Iterator");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BinarySearchTreeIterator.java &amp;&amp; java org.leetcode.medium.BinarySearchTreeIterator
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== BinarySearchTreeIterator ===");
        BinarySearchTreeIterator sol = new BinarySearchTreeIterator();
        System.out.println(sol.solve(null));
    }
}
