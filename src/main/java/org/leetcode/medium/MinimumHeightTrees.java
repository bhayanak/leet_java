package org.leetcode.medium;

/**
 * <b>#310 - Minimum Height Trees</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A tree is an undirected graph in which any two vertices are connected by exactly one path. In other words, any connected graph without simple cycles is a tree.
 * 
 * 
 * Given a tree of n nodes labelled from 0 to n - 1, and an array of n - 1 edges where edges[i] = [ai, bi] indicates that there is an undirected edge between the two nodes ai and bi in the tree, you can choose any node of the tree as the root. When you select a node x as the root, the result tree has height h. Among all possible rooted trees, those with minimum height (i.e. min(h))  are called minimum height trees (MHTs).
 * 
 * 
 * Return a list of all MHTs' root labels. You can return the answer in any order.
 * 
 * 
 * The height of a rooted tree is the number of edges on the longest downward path between the root and a leaf.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 4, edges = [[1,0],[1,2],[1,3]]
 * Output: [1]
 * Explanation: As shown, the height of the tree is 1 when the root is the node with label 1 which is the only MHT.
 * 
 * Example 2:
 * 
 * Input: n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
 * Output: [3,4]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 2 * 104
 * 	
 * edges.length == n - 1
 * 	
 * 0 &lt;= ai, bi &lt; n
 * 	
 * ai != bi
 * 	
 * All the pairs (ai, bi) are distinct.
 * 	
 * The given input is guaranteed to be a tree and there will be no repeated edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many MHTs can a graph have at most?
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/minimum-height-trees/">LeetCode #310</a>
 */
public class MinimumHeightTrees {

    /** TODO: implement solution for "Minimum Height Trees". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Height Trees");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== MinimumHeightTrees ===");
        MinimumHeightTrees sol = new MinimumHeightTrees();
        System.out.println(sol.solve(null));
    }
}
