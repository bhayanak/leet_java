package org.leetcode.hard;


/**
 * <b>#2209 - Minimum White Tiles After Covering With Carpets</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed binary string floor, which represents the colors of tiles on a floor:
 *
 *
 * floor[i] = '0' denotes that the ith tile of the floor is colored black.
 *
 * On the other hand, floor[i] = '1' denotes that the ith tile of the floor is colored white.
 *
 * You are also given numCarpets and carpetLen. You have numCarpets black carpets, each of length carpetLen tiles. Cover the tiles with the given carpets such that the number of white tiles still visible is minimum. Carpets may overlap one another.
 *
 *
 * Return the minimum number of white tiles still visible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: floor = "10110101", numCarpets = 2, carpetLen = 2
 * Output: 2
 * Explanation: 
 * The figure above shows one way of covering the tiles with the carpets such that only 2 white tiles are visible.
 * No other way of covering the tiles with the carpets can leave less than 2 white tiles visible.
 *
 * Example 2:
 *
 * Input: floor = "11111", numCarpets = 2, carpetLen = 3
 * Output: 0
 * Explanation: 
 * The figure above shows one way of covering the tiles with the carpets such that no white tiles are visible.
 * Note that the carpets are able to overlap one another.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= carpetLen &lt;= floor.length &lt;= 1000
 *
 * floor[i] is either '0' or '1'.
 *
 * 1 &lt;= numCarpets &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you think of a DP solution?
 * Hint 2: Let DP[i][j] denote the minimum number of white tiles still visible from indices i to floor.length-1 after covering with at most j carpets.
 * Hint 3: The transition will be whether to put down the carpet at position i (if possible), or not.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-white-tiles-after-covering-with-carpets/">LeetCode #2209</a>
 */
public class MinimumWhiteTilesAfterCoveringWithCarpets {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum White Tiles After Covering With Carpets");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumWhiteTilesAfterCoveringWithCarpets ===");
        MinimumWhiteTilesAfterCoveringWithCarpets sol = new MinimumWhiteTilesAfterCoveringWithCarpets();
        System.out.println(sol.solve(null));
    }
}
