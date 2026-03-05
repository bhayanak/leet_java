package org.leetcode.hard;


/**
 * <b>#2246 - Longest Path With Different Adjacent Characters</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Tree, Depth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a tree (i.e. a connected, undirected graph that has no cycles) rooted at node 0 consisting of n nodes numbered from 0 to n - 1. The tree is represented by a 0-indexed array parent of size n, where parent[i] is the parent of node i. Since node 0 is the root, parent[0] == -1.
 *
 *
 * You are also given a string s of length n, where s[i] is the character assigned to node i.
 *
 *
 * Return the length of the longest path in the tree such that no pair of adjacent nodes on the path have the same character assigned to them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: parent = [-1,0,0,1,1,2], s = "abacbe"
 * Output: 3
 * Explanation: The longest path where each two adjacent nodes have different characters in the tree is the path: 0 -&gt; 1 -&gt; 3. The length of this path is 3, so 3 is returned.
 * It can be proven that there is no longer path that satisfies the conditions. 
 *
 * Example 2:
 *
 * Input: parent = [-1,0,0,0], s = "aabc"
 * Output: 3
 * Explanation: The longest path where each two adjacent nodes have different characters is the path: 2 -&gt; 0 -&gt; 3. The length of this path is 3, so 3 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * n == parent.length == s.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= parent[i] &lt;= n - 1 for all i &gt;= 1
 *
 * parent[0] == -1
 *
 * parent represents a valid tree.
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do a DFS from the root. At each node, calculate the longest path we can make from two branches of that subtree.
 * Hint 2: To do that, we need to find the length of the longest path from each of the node’s children.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Tree, Depth-First Search, Graph Theory, Topological Sort).
 *
 * @see <a href="https://leetcode.com/problems/longest-path-with-different-adjacent-characters/">LeetCode #2246</a>
 */
public class LongestPathWithDifferentAdjacentCharacters {

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
        throw new UnsupportedOperationException("Not yet implemented: Longest Path With Different Adjacent Characters");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestPathWithDifferentAdjacentCharacters ===");
        LongestPathWithDifferentAdjacentCharacters sol = new LongestPathWithDifferentAdjacentCharacters();
        System.out.println(sol.solve(null));
    }
}
