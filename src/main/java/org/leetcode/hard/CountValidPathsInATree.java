package org.leetcode.hard;


/**
 * <b>#2867 - Count Valid Paths in a Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Tree, Depth-First Search, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an undirected tree with n nodes labeled from 1 to n. You are given the integer n and a 2D integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi in the tree.
 *
 *
 * Return the number of valid paths in the tree.
 *
 *
 * A path (a, b) is valid if there exists exactly one prime number among the node labels in the path from a to b.
 *
 *
 * Note that:
 *
 *
 * The path (a, b) is a sequence of distinct nodes starting with node a and ending with node b such that every two adjacent nodes in the sequence share an edge in the tree.
 *
 * Path (a, b) and path (b, a) are considered the same and counted only once.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, edges = [[1,2],[1,3],[2,4],[2,5]]
 * Output: 4
 * Explanation: The pairs with exactly one prime number on the path between them are: 
 * - (1, 2) since the path from 1 to 2 contains prime number 2. 
 * - (1, 3) since the path from 1 to 3 contains prime number 3.
 * - (1, 4) since the path from 1 to 4 contains prime number 2.
 * - (2, 4) since the path from 2 to 4 contains prime number 2.
 * It can be shown that there are only 4 valid paths.
 *
 * Example 2:
 *
 * Input: n = 6, edges = [[1,2],[1,3],[2,4],[3,5],[3,6]]
 * Output: 6
 * Explanation: The pairs with exactly one prime number on the path between them are: 
 * - (1, 2) since the path from 1 to 2 contains prime number 2.
 * - (1, 3) since the path from 1 to 3 contains prime number 3.
 * - (1, 4) since the path from 1 to 4 contains prime number 2.
 * - (1, 6) since the path from 1 to 6 contains prime number 3.
 * - (2, 4) since the path from 2 to 4 contains prime number 2.
 * - (3, 6) since the path from 3 to 6 contains prime number 3.
 * It can be shown that there are only 6 valid paths.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * edges.length == n - 1
 *
 * edges[i].length == 2
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * The input is generated such that edges represent a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the sieve of Eratosthenes to find all prime numbers in the range <code>[1, n]</code>.****
 * Hint 2: Root the tree at any node.
 * Hint 3: Let <code>dp[i][0] = the number of vertical paths starting from i containing no prime nodes </code>, and <code>dp[i][1] = the number of vertical paths starting from i containing one prime node </code>.
 * Hint 4: If <code>i</code> is not prime, <code>dp[i][0] = sum(dp[child][0]) + 1</code>, and <code>dp[i][1] = sum(dp[child][1])</code> for each <code>child</code> of <code>i</code> in the rooted tree.
 * Hint 5: If <code>i</code> is prime, <code>dp[i][0] = 0</code>, and <code>dp[i][1] = sum(dp[child][0]) + 1</code> for each <code>child</code> of <code>i</code> in the rooted tree.
 * Hint 6: For each node <code>i</code>, and using the computed <code>dp</code> matrix, count the number of unordered pairs <code>(a,b)</code> such that <code>lca(a,b) = i</code>, and there exists exactly one prime number on the path from <code>a</code> to <code>b</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Tree, Depth-First Search, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-valid-paths-in-a-tree/">LeetCode #2867</a>
 */
public class CountValidPathsInATree {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Valid Paths in a Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== CountValidPathsInATree ===");
        CountValidPathsInATree sol = new CountValidPathsInATree();
        System.out.println(sol.solve(null));
    }
}
