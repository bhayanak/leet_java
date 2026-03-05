package org.leetcode.medium;


/**
 * <b>#1007 - Minimum Domino Rotations For Equal Row</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
 *
 *
 * We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.
 *
 *
 * Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.
 *
 *
 * If it cannot be done, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]
 * Output: 2
 * Explanation: 
 * The first figure represents the dominoes as given by tops and bottoms: before we do any rotations.
 * If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.
 *
 * Example 2:
 *
 * Input: tops = [3,5,1,2,3], bottoms = [3,6,3,3,4]
 * Output: -1
 * Explanation: 
 * In this case, it is not possible to rotate the dominoes to make one row of values equal.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= tops.length &lt;= 2 * 104
 *
 * bottoms.length == tops.length
 *
 * 1 &lt;= tops[i], bottoms[i] &lt;= 6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/">LeetCode #1007</a>
 */
public class MinimumDominoRotationsForEqualRow {

    /**
     * TODO: Implement "Minimum Domino Rotations For Equal Row".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Domino Rotations For Equal Row");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumDominoRotationsForEqualRow.java &amp;&amp; java org.leetcode.medium.MinimumDominoRotationsForEqualRow</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDominoRotationsForEqualRow ===");
        MinimumDominoRotationsForEqualRow sol = new MinimumDominoRotationsForEqualRow();
        System.out.println(sol.solve(null));
    }
}
