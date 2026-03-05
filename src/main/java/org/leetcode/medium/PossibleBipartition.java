package org.leetcode.medium;


/**
 * <b>#886 - Possible Bipartition</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We want to split a group of n people (labeled from 1 to n) into two groups of any size. Each person may dislike some other people, and they should not go into the same group.
 *
 *
 * Given the integer n and the array dislikes where dislikes[i] = [ai, bi] indicates that the person labeled ai does not like the person labeled bi, return true if it is possible to split everyone into two groups in this way.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, dislikes = [[1,2],[1,3],[2,4]]
 * Output: true
 * Explanation: The first group has [1,4], and the second group has [2,3].
 *
 * Example 2:
 *
 * Input: n = 3, dislikes = [[1,2],[1,3],[2,3]]
 * Output: false
 * Explanation: We need at least 3 groups to divide them. We cannot put them in two groups.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2000
 *
 * 0 &lt;= dislikes.length &lt;= 104
 *
 * dislikes[i].length == 2
 *
 * 1 &lt;= ai &lt; bi &lt;= n
 *
 * All the pairs of dislikes are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/possible-bipartition/">LeetCode #886</a>
 */
public class PossibleBipartition {

    /**
     * TODO: Implement "Possible Bipartition".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Possible Bipartition");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PossibleBipartition.java &amp;&amp; java org.leetcode.medium.PossibleBipartition</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PossibleBipartition ===");
        PossibleBipartition sol = new PossibleBipartition();
        System.out.println(sol.solve(null));
    }
}
