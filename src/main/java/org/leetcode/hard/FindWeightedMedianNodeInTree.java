package org.leetcode.hard;


/**
 * <b>#3585 - Find Weighted Median Node in Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an undirected, weighted tree rooted at node 0 with n nodes numbered from 0 to n - 1. This is represented by a 2D array edges of length n - 1, where edges[i] = [ui, vi, wi] indicates an edge from node ui to vi with weight wi.
 *
 *
 * The weighted median node is defined as the first node x on the path from ui to vi such that the sum of edge weights from ui to x is greater than or equal to half of the total path weight.
 *
 *
 * You are given a 2D integer array queries. For each queries[j] = [uj, vj], determine the weighted median node along the path from uj to vj.
 *
 *
 * Return an array ans, where ans[j] is the node index of the weighted median for queries[j].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, edges = [[0,1,7]], queries = [[1,0],[0,1]]
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 *
 *
 *
 * 			Query
 * 			Path
 * 			Edge
 *
 * 			Weights
 * 			Total
 *
 * 			Path
 *
 * 			Weight
 * 			Half
 * 			Explanation
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			[1, 0]
 * 			1 → 0
 * 			[7]
 * 			7
 * 			3.5
 * 			Sum from 1 → 0 = 7 &gt;= 3.5, median is node 0.
 * 			0
 *
 *
 *
 *
 * 			[0, 1]
 * 			0 → 1
 * 			[7]
 * 			7
 * 			3.5
 * 			Sum from 0 → 1 = 7 &gt;= 3.5, median is node 1.
 * 			1
 *
 *
 *
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1,2],[2,0,4]], queries = [[0,1],[2,0],[1,2]]
 *
 *
 * Output: [1,0,2]
 *
 *
 * Explanation:
 *
 *
 *
 *
 * 			Query
 * 			Path
 * 			Edge
 *
 * 			Weights
 * 			Total
 *
 * 			Path
 *
 * 			Weight
 * 			Half
 * 			Explanation
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			[0, 1]
 * 			0 → 1
 * 			[2]
 * 			2
 * 			1
 * 			Sum from 0 → 1 = 2 &gt;= 1, median is node 1.
 * 			1
 *
 *
 *
 *
 * 			[2, 0]
 * 			2 → 0
 * 			[4]
 * 			4
 * 			2
 * 			Sum from 2 → 0 = 4 &gt;= 2, median is node 0.
 * 			0
 *
 *
 *
 *
 * 			[1, 2]
 * 			1 → 0 → 2
 * 			[2, 4]
 * 			6
 * 			3
 * 			Sum from 1 → 0 = 2 &lt; 3.
 *
 * 			Sum from 1 → 2 = 2 + 4 = 6 &gt;= 3, median is node 2.
 * 			2
 *
 *
 *
 *
 * Example 3:
 *
 * Input: n = 5, edges = [[0,1,2],[0,2,5],[1,3,1],[2,4,3]], queries = [[3,4],[1,2]]
 *
 *
 * Output: [2,2]
 *
 *
 * Explanation:
 *
 *
 *
 *
 * 			Query
 * 			Path
 * 			Edge
 *
 * 			Weights
 * 			Total
 *
 * 			Path
 *
 * 			Weight
 * 			Half
 * 			Explanation
 * 			Answer
 *
 *
 *
 *
 *
 *
 * 			[3, 4]
 * 			3 → 1 → 0 → 2 → 4
 * 			[1, 2, 5, 3]
 * 			11
 * 			5.5
 * 			Sum from 3 → 1 = 1 &lt; 5.5.
 *
 * 			Sum from 3 → 0 = 1 + 2 = 3 &lt; 5.5.
 *
 * 			Sum from 3 → 2 = 1 + 2 + 5 = 8 &gt;= 5.5, median is node 2.
 * 			2
 *
 *
 *
 *
 * 			[1, 2]
 * 			1 → 0 → 2
 * 			[2, 5]
 * 			7
 * 			3.5
 *
 *
 * Sum from 1 → 0 = 2 &lt; 3.5.
 *
 * 			Sum from 1 → 2 = 2 + 5 = 7 &gt;= 3.5, median is node 2.
 *
 * 			2
 *
 *
 *
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
 * edges[i] == [ui, vi, wi]
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * 1 &lt;= wi &lt;= 109
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[j] == [uj, vj]
 *
 * 0 &lt;= uj, vj &lt; n
 *
 * The input is generated such that edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use binary lifting and lowest common ancestor.
 * Hint 2: Let the query nodes be <code>u</code> and <code>v</code>, with lowest common ancestor <code>l</code> and total path weight <code>tot</code>.
 * Hint 3: If the median lies on the path from <code>u</code> up to <code>l</code>: find the first node where <code>2 * sum &gt;= tot</code> (equivalently, the last where <code>2 * sum &lt; tot</code> and move one node above).
 * Hint 4: Otherwise, it lies on the path from <code>v</code> up to <code>l</code>: use the same <code>2 * sum &gt;= tot</code> criterion as you climb.
 * Hint 5: In both cases, binary lifting with sparse tables lets you jump by powers of two while tracking cumulative weights to locate the weighted median in O(log n)
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Bit Manipulation, Tree, Depth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/find-weighted-median-node-in-tree/">LeetCode #3585</a>
 */
public class FindWeightedMedianNodeInTree {

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
        throw new UnsupportedOperationException("Not yet implemented: Find Weighted Median Node in Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== FindWeightedMedianNodeInTree ===");
        FindWeightedMedianNodeInTree sol = new FindWeightedMedianNodeInTree();
        System.out.println(sol.solve(null));
    }
}
