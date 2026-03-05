package org.leetcode.medium;


/**
 * <b>#3249 - Count the Number of Good Nodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected tree with n nodes labeled from 0 to n - 1, and rooted at node 0. You are given a 2D integer array edges of length n - 1, where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree.
 *
 *
 * A node is good if all the subtrees rooted at its children have the same size.
 *
 *
 * Return the number of good nodes in the given tree.
 *
 *
 * A subtree of treeName is a tree consisting of a node in treeName and all of its descendants.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * All of the nodes of the given tree are good.
 *
 * Example 2:
 *
 * Input: edges = [[0,1],[1,2],[2,3],[3,4],[0,5],[1,6],[2,7],[3,8]]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 6 good nodes in the given tree. They are colored in the image above.
 *
 *
 * Example 3:
 *
 * Input: edges = [[0,1],[1,2],[1,3],[1,4],[0,5],[5,6],[6,7],[7,8],[0,9],[9,10],[9,12],[10,11]]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * All nodes except node 9 are good.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * The input is generated such that edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DFS.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-good-nodes/">LeetCode #3249</a>
 */
public class CountTheNumberOfGoodNodes {

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
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Good Nodes");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfGoodNodes ===");
        CountTheNumberOfGoodNodes sol = new CountTheNumberOfGoodNodes();
        System.out.println(sol.solve(null));
    }
}
