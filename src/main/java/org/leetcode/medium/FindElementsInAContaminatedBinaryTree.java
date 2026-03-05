package org.leetcode.medium;


/**
 * <b>#1261 - Find Elements in a Contaminated Binary Tree</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary tree with the following rules:
 *
 *
 * root.val == 0
 *
 * For any treeNode:
 *
 *
 *
 * If treeNode.val has a value x and treeNode.left != null, then treeNode.left.val == 2 * x + 1
 *
 * If treeNode.val has a value x and treeNode.right != null, then treeNode.right.val == 2 * x + 2
 *
 *
 *
 * Now the binary tree is contaminated, which means all treeNode.val have been changed to -1.
 *
 *
 * Implement the FindElements class:
 *
 *
 * FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and recovers it.
 *
 * bool find(int target) Returns true if the target value exists in the recovered binary tree.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["FindElements","find","find"]
 * [[[-1,null,-1]],[1],[2]]
 * Output
 * [null,false,true]
 * Explanation
 * FindElements findElements = new FindElements([-1,null,-1]); 
 * findElements.find(1); // return False 
 * findElements.find(2); // return True 
 *
 * Example 2:
 *
 * Input
 * ["FindElements","find","find","find"]
 * [[[-1,-1,-1,-1,-1]],[1],[3],[5]]
 * Output
 * [null,true,true,false]
 * Explanation
 * FindElements findElements = new FindElements([-1,-1,-1,-1,-1]);
 * findElements.find(1); // return True
 * findElements.find(3); // return True
 * findElements.find(5); // return False
 *
 * Example 3:
 *
 * Input
 * ["FindElements","find","find","find","find"]
 * [[[-1,null,-1,-1,null,-1]],[2],[3],[4],[5]]
 * Output
 * [null,true,false,false,true]
 * Explanation
 * FindElements findElements = new FindElements([-1,null,-1,-1,null,-1]);
 * findElements.find(2); // return True
 * findElements.find(3); // return False
 * findElements.find(4); // return False
 * findElements.find(5); // return True
 *
 *
 *
 * Constraints:
 *
 *
 * TreeNode.val == -1
 *
 * The height of the binary tree is less than or equal to 20
 *
 * The total number of nodes is between [1, 104]
 *
 * Total calls of find() is between [1, 104]
 *
 * 0 &lt;= target &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DFS to traverse the binary tree and recover it.
 * Hint 2: Use a hashset to store TreeNode.val for finding.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Tree, Depth-First Search, Breadth-First Search, Design, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/">LeetCode #1261</a>
 */
public class FindElementsInAContaminatedBinaryTree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Elements in a Contaminated Binary Tree");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindElementsInAContaminatedBinaryTree ===");
        FindElementsInAContaminatedBinaryTree sol = new FindElementsInAContaminatedBinaryTree();
        System.out.println(sol.solve(null));
    }
}
