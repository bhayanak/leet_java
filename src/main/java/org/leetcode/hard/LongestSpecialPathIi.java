package org.leetcode.hard;


/**
 * <b>#3486 - Longest Special Path II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Depth-First Search, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected tree rooted at node 0, with n nodes numbered from 0 to n - 1. This is represented by a 2D array edges of length n - 1, where edges[i] = [ui, vi, lengthi] indicates an edge between nodes ui and vi with length lengthi. You are also given an integer array nums, where nums[i] represents the value at node i.
 *
 *
 * A special path is defined as a downward path from an ancestor node to a descendant node in which all node values are distinct, except for at most one value that may appear twice.
 *
 *
 * Return an array result of size 2, where result[0] is the length of the longest special path, and result[1] is the minimum number of nodes in all possible longest special paths.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [[0,1,1],[1,2,3],[1,3,1],[2,4,6],[4,7,2],[3,5,2],[3,6,5],[6,8,3]], nums = [1,1,0,3,1,2,1,1,0]
 *
 *
 * Output: [9,3]
 *
 *
 * Explanation:
 *
 *
 * In the image below, nodes are colored by their corresponding values in nums.
 *
 * The longest special paths are 1 -&gt; 2 -&gt; 4 and 1 -&gt; 3 -&gt; 6 -&gt; 8, both having a length of 9. The minimum number of nodes across all longest special paths is 3.
 *
 * Example 2:
 *
 * Input: edges = [[1,0,3],[0,2,4],[0,3,5]], nums = [1,1,0,2]
 *
 *
 * Output: [5,2]
 *
 *
 * Explanation:
 *
 * The longest path is 0 -&gt; 3 consisting of 2 nodes with a length of 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 5 * 104
 *
 * edges.length == n - 1
 *
 * edges[i].length == 3
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * 1 &lt;= lengthi &lt;= 103
 *
 * nums.length == n
 *
 * 0 &lt;= nums[i] &lt;= 5 * 104
 *
 * The input is generated such that edges represents a valid tree.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain a special path (from root to current node) dynamically.
 * Hint 2: Also, maintain the positions of each value on the path so we can adjust the start point of the path.
 * Hint 3: Use prefix sum to calculate the path length.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Depth-First Search, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/longest-special-path-ii/">LeetCode #3486</a>
 */
public class LongestSpecialPathIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Longest Special Path II");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSpecialPathIi ===");
        LongestSpecialPathIi sol = new LongestSpecialPathIi();
        System.out.println(sol.solve(null));
    }
}
