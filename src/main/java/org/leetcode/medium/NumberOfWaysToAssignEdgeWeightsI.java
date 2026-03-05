package org.leetcode.medium;


/**
 * <b>#3558 - Number of Ways to Assign Edge Weights I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Tree, Depth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected tree with n nodes labeled from 1 to n, rooted at node 1. The tree is represented by a 2D integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi.
 *
 *
 * Initially, all edges have a weight of 0. You must assign each edge a weight of either 1 or 2.
 *
 *
 * The cost of a path between any two nodes u and v is the total weight of all edges in the path connecting them.
 *
 *
 * Select any one node x at the maximum depth. Return the number of ways to assign edge weights in the path from node 1 to x such that its total cost is odd.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * Note: Ignore all edges not in the path from node 1 to x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [[1,2]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The path from Node 1 to Node 2 consists of one edge (1 → 2).
 *
 * Assigning weight 1 makes the cost odd, while 2 makes it even. Thus, the number of valid assignments is 1.
 *
 * Example 2:
 *
 * Input: edges = [[1,2],[1,3],[3,4],[3,5]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The maximum depth is 2, with nodes 4 and 5 at the same depth. Either node can be selected for processing.
 *
 * For example, the path from Node 1 to Node 4 consists of two edges (1 → 3 and 3 → 4).
 *
 * Assigning weights (1,2) or (2,1) results in an odd cost. Thus, the number of valid assignments is 2.
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
 * edges[i] == [ui, vi]
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Depth‑First Search (DFS) to compute the depth of each node from the root.
 * Hint 2: Find the maximum depth, <code>max_depth</code>.
 * Hint 3: The number of <code>2</code>s doesn’t affect parity; we only need an odd number of <code>1</code>s along the path.
 * Hint 4: The number of ways to choose an odd count of 1s among <code>max_depth</code> edges is <code>2^(max_depth-1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Tree, Depth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/">LeetCode #3558</a>
 */
public class NumberOfWaysToAssignEdgeWeightsI {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Number of substrings2.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int numberOfSubstrings2(String s) {
        // At least one 'a','b','c'
        int cnt=0, n=s.length();
        int[] last=new int[3]; java.util.Arrays.fill(last,-1);
        for (int i=0;i<n;i++) {
            last[s.charAt(i)-'a']=i;
            if (last[0]>=0&&last[1]>=0&&last[2]>=0)
                cnt+=Math.min(Math.min(last[0],last[1]),last[2])+1;
        }
        return cnt;
    }

    public static void main(String[] args) {
        NumberOfWaysToAssignEdgeWeightsI sol = new NumberOfWaysToAssignEdgeWeightsI();
        System.out.println(sol.numberOfSubstrings2("hello"));
    }
}
