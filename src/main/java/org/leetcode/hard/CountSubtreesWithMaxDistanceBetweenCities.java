package org.leetcode.hard;


/**
 * <b>#1617 - Count Subtrees With Max Distance Between Cities</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Bit Manipulation, Tree, Enumeration, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n cities numbered from 1 to n. You are given an array edges of size n-1, where edges[i] = [ui, vi] represents a bidirectional edge between cities ui and vi. There exists a unique path between each pair of cities. In other words, the cities form a tree.
 *
 *
 * A subtree is a subset of cities where every city is reachable from every other city in the subset, where the path between each pair passes through only the cities from the subset. Two subtrees are different if there is a city in one subtree that is not present in the other.
 *
 *
 * For each d from 1 to n-1, find the number of subtrees in which the maximum distance between any two cities in the subtree is equal to d.
 *
 *
 * Return an array of size n-1 where the dth element (1-indexed) is the number of subtrees in which the maximum distance between any two cities is equal to d.
 *
 *
 * Notice that the distance between the two cities is the number of edges in the path between them.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 *
 *
 *
 * Input: n = 4, edges = [[1,2],[2,3],[2,4]]
 * Output: [3,4,0]
 * Explanation:
 * The subtrees with subsets {1,2}, {2,3} and {2,4} have a max distance of 1.
 * The subtrees with subsets {1,2,3}, {1,2,4}, {2,3,4} and {1,2,3,4} have a max distance of 2.
 * No subtree has two nodes where the max distance between them is 3.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: n = 2, edges = [[1,2]]
 * Output: [1]
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: n = 3, edges = [[1,2],[2,3]]
 * Output: [2,1]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 2 &lt;= n &lt;= 15
 *
 * edges.length == n-1
 *
 * edges[i].length == 2
 *
 * 1 &lt;= ui, vi &lt;= n
 *
 * All pairs (ui, vi) are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through every possible subtree by doing a bitmask on which vertices to include. How can you determine if a subtree is valid (all vertices are connected)?
 * Hint 2: To determine connectivity, count the number of reachable vertices starting from any included vertex and only traveling on edges connecting 2 vertices in the subtree. The count should be the same as the number of 1s in the bitmask.
 * Hint 3: The diameter is basically the maximum distance between any two nodes. Root the tree at a vertex. The answer is the max of the heights of the two largest subtrees or the longest diameter in any of the subtrees.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Bit Manipulation, Tree, Enumeration, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-subtrees-with-max-distance-between-cities/">LeetCode #1617</a>
 */
public class CountSubtreesWithMaxDistanceBetweenCities {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Subtrees With Max Distance Between Cities");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSubtreesWithMaxDistanceBetweenCities ===");
        CountSubtreesWithMaxDistanceBetweenCities sol = new CountSubtreesWithMaxDistanceBetweenCities();
        System.out.println(sol.solve(null));
    }
}
