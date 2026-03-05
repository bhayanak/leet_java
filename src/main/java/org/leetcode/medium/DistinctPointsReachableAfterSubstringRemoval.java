package org.leetcode.medium;


/**
 * <b>#3694 - Distinct Points Reachable After Substring Removal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of characters 'U', 'D', 'L', and 'R', representing moves on an infinite 2D Cartesian grid.
 *
 *
 * 'U': Move from (x, y) to (x, y + 1).
 *
 * 'D': Move from (x, y) to (x, y - 1).
 *
 * 'L': Move from (x, y) to (x - 1, y).
 *
 * 'R': Move from (x, y) to (x + 1, y).
 *
 * You are also given a positive integer k.
 *
 *
 * You must choose and remove exactly one contiguous substring of length k from s. Then, start from coordinate (0, 0) and perform the remaining moves in order.
 *
 *
 * Return an integer denoting the number of distinct final coordinates reachable.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "LUL", k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * After removing a substring of length 1, s can be "UL", "LL" or "LU". Following these moves, the final coordinates will be (-1, 1), (-2, 0) and (-1, 1) respectively. There are two distinct points (-1, 1) and (-2, 0) so the answer is 2.
 *
 * Example 2:
 *
 * Input: s = "UDLR", k = 4
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * After removing a substring of length 4, s can only be the empty string. The final coordinates will be (0, 0). There is only one distinct point (0, 0) so the answer is 1.
 *
 * Example 3:
 *
 * Input: s = "UU", k = 1
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * After removing a substring of length 1, s becomes "U", which always ends at (0, 1), so there is only one distinct final coordinate.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of only 'U', 'D', 'L', and 'R'.
 *
 * 1 &lt;= k &lt;= s.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix sums for the <code>x</code>-coordinate and <code>y</code>-coordinate.
 * Hint 2: Using the prefix sum arrays, compute the <code>x</code>-coordinate and <code>y</code>-coordinate after removing a subarray of size <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/distinct-points-reachable-after-substring-removal/">LeetCode #3694</a>
 */
public class DistinctPointsReachableAfterSubstringRemoval {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distinct Points Reachable After Substring Removal");
    }

    public static void main(String[] args) {
        System.out.println("=== DistinctPointsReachableAfterSubstringRemoval ===");
        DistinctPointsReachableAfterSubstringRemoval sol = new DistinctPointsReachableAfterSubstringRemoval();
        System.out.println(sol.solve(null));
    }
}
