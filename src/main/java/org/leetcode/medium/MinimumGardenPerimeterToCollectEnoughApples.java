package org.leetcode.medium;


/**
 * <b>#1954 - Minimum Garden Perimeter to Collect Enough Apples</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a garden represented as an infinite 2D grid, there is an apple tree planted at every integer coordinate. The apple tree planted at an integer coordinate (i, j) has |i| + |j| apples growing on it.
 *
 *
 * You will buy an axis-aligned square plot of land that is centered at (0, 0).
 *
 *
 * Given an integer neededApples, return the minimum perimeter of a plot such that at least neededApples apples are inside or on the perimeter of that plot.
 *
 *
 * The value of |x| is defined as:
 *
 *
 * x if x &gt;= 0
 *
 * -x if x &lt; 0
 *
 *
 *
 * Example 1:
 *
 * Input: neededApples = 1
 * Output: 8
 * Explanation: A square plot of side length 1 does not contain any apples.
 * However, a square plot of side length 2 has 12 apples inside (as depicted in the image above).
 * The perimeter is 2 * 4 = 8.
 *
 * Example 2:
 *
 * Input: neededApples = 13
 * Output: 16
 *
 * Example 3:
 *
 * Input: neededApples = 1000000000
 * Output: 5040
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= neededApples &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find a formula for the number of apples inside a square with a side length L.
 * Hint 2: Iterate over the possible lengths of the square until enough apples are collected.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-garden-perimeter-to-collect-enough-apples/">LeetCode #1954</a>
 */
public class MinimumGardenPerimeterToCollectEnoughApples {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Garden Perimeter to Collect Enough Apples");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumGardenPerimeterToCollectEnoughApples ===");
        MinimumGardenPerimeterToCollectEnoughApples sol = new MinimumGardenPerimeterToCollectEnoughApples();
        System.out.println(sol.solve(null));
    }
}
