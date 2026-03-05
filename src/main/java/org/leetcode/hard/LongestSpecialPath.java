package org.leetcode.hard;


/**
 * <b>#3425 - Longest Special Path</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Tree, Depth-First Search, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected tree rooted at node 0 with n nodes numbered from 0 to n - 1, represented by a 2D array edges of length n - 1, where edges[i] = [ui, vi, lengthi] indicates an edge between nodes ui and vi with length lengthi. You are also given an integer array nums, where nums[i] represents the value at node i.
 *
 *
 * A special path is defined as a downward path from an ancestor node to a descendant node such that all the values of the nodes in that path are unique.
 *
 *
 * Note that a path may start and end at the same node.
 *
 *
 * Return an array result of size 2, where result[0] is the length of the longest special path, and result[1] is the minimum number of nodes in all possible longest special paths.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: edges = [[0,1,2],[1,2,3],[1,3,5],[1,4,4],[2,5,6]], nums = [2,1,2,1,3,1]
 *
 *
 * Output: [6,2]
 *
 *
 * Explanation:
 *
 * In the image below, nodes are colored by their corresponding values in nums
 *
 * The longest special paths are 2 -&gt; 5 and 0 -&gt; 1 -&gt; 4, both having a length of 6. The minimum number of nodes across all longest special paths is 2.
 *
 * Example 2:
 *
 * Input: edges = [[1,0,8]], nums = [2,2]
 *
 *
 * Output: [0,1]
 *
 *
 * Explanation:
 *
 * The longest special paths are 0 and 1, both having a length of 0. The minimum number of nodes across all longest special paths is 1.
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
 * Hint 1: Use DFS to traverse the tree and maintain the current path length from the root (starting at 0) to the current node.
 * Hint 2: Use prefix sums to calculate the longest path ending at the current node with all unique values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Tree, Depth-First Search, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/longest-special-path/">LeetCode #3425</a>
 */
public class LongestSpecialPath {

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
        throw new UnsupportedOperationException("Not yet implemented: Longest Special Path");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSpecialPath ===");
        LongestSpecialPath sol = new LongestSpecialPath();
        System.out.println(sol.solve(null));
    }
}
