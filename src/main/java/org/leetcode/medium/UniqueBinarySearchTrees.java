package org.leetcode.medium;

/**
 * <b>#96 - Unique Binary Search Trees</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Tree, Binary Search Tree, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n nodes of unique values from 1 to n.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: 5
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 19
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Catalan number: C(n) = Σ C(i-1)·C(n-i) for i=1..n.
 * dp[n] = number of structurally unique BSTs with n nodes.
 * For each root value i, left subtree has i-1 nodes, right has n-i.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/unique-binary-search-trees/">LeetCode #96</a>
 */
public class UniqueBinarySearchTrees {

    /**
     * Returns the number of structurally unique BSTs with n nodes (keys 1..n).
     *
     * @param n number of nodes
     * @return  count of unique BST structures
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++)
            for (int j = 1; j <= i; j++)
                dp[i] += dp[j-1] * dp[i-j]; // left × right subtrees
        return dp[n];
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                UniqueBinarySearchTrees sol = new UniqueBinarySearchTrees();
                System.out.println(sol.numTrees(3)); // 5
                System.out.println(sol.numTrees(1)); // 1
    }
}
