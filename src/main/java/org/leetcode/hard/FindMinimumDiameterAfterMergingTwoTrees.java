package org.leetcode.hard;


/**
 * <b>#3203 - Find Minimum Diameter After Merging Two Trees</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There exist two undirected trees with n and m nodes, numbered from 0 to n - 1 and from 0 to m - 1, respectively. You are given two 2D integer arrays edges1 and edges2 of lengths n - 1 and m - 1, respectively, where edges1[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the first tree and edges2[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the second tree.
 *
 *
 * You must connect one node from the first tree with another node from the second tree with an edge.
 *
 *
 * Return the minimum possible diameter of the resulting tree.
 *
 *
 * The diameter of a tree is the length of the longest path between any two nodes in the tree.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges1 = [[0,1],[0,2],[0,3]], edges2 = [[0,1]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * We can obtain a tree of diameter 3 by connecting node 0 from the first tree with any node from the second tree.
 *
 * Example 2:
 *
 * Input: edges1 = [[0,1],[0,2],[0,3],[2,4],[2,5],[3,6],[2,7]], edges2 = [[0,1],[0,2],[0,3],[2,4],[2,5],[3,6],[2,7]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * We can obtain a tree of diameter 5 by connecting node 0 from the first tree with node 0 from the second tree.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 105
 *
 * edges1.length == n - 1
 *
 * edges2.length == m - 1
 *
 * edges1[i].length == edges2[i].length == 2
 *
 * edges1[i] = [ai, bi]
 *
 * 0 &lt;= ai, bi &lt; n
 *
 * edges2[i] = [ui, vi]
 *
 * 0 &lt;= ui, vi &lt; m
 *
 * The input is generated such that edges1 and edges2 represent valid trees.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Suppose that we connected node <code>a</code> in tree1 with node <code>b</code> in tree2. The diameter length of the resulting tree will be the largest of the following 3 values: 
<ol>
<li>The diameter of tree 1.</li>
<li>The diameter of tree 2.</li>
<li>The length of the longest path that starts at node <code>a</code> and that is completely within Tree 1 + The length of the longest path that starts at node <code>b</code> and that is completely within Tree 2 + 1.</li>
</ol> 
The added one in the third value is due to the additional edge that we have added between trees 1 and 2.
 * Hint 2: Values 1 and 2 are constant regardless of our choice of <code>a</code> and <code>b</code>. Therefore, we need to pick <code>a</code> and <code>b</code> in such a way that minimizes value 3.
 * Hint 3: If we pick <code>a</code> and <code>b</code> optimally, they will be in the diameters of Tree 1 and Tree 2, respectively. Exactly which nodes of the diameter should we pick?
 * Hint 4: <code>a</code> is the center of the diameter of tree 1, and <code>b</code> is the center of the diameter of tree 2.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/find-minimum-diameter-after-merging-two-trees/">LeetCode #3203</a>
 */
public class FindMinimumDiameterAfterMergingTwoTrees {

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
        throw new UnsupportedOperationException("Not yet implemented: Find Minimum Diameter After Merging Two Trees");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMinimumDiameterAfterMergingTwoTrees ===");
        FindMinimumDiameterAfterMergingTwoTrees sol = new FindMinimumDiameterAfterMergingTwoTrees();
        System.out.println(sol.solve(null));
    }
}
