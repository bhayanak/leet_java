package org.leetcode.hard;


/**
 * <b>#1840 - Maximum Building Height</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You want to build n new buildings in a city. The new buildings will be built in a line and are labeled from 1 to n.
 *
 *
 * However, there are city restrictions on the heights of the new buildings:
 *
 *
 * The height of each building must be a non-negative integer.
 *
 * The height of the first building must be 0.
 *
 * The height difference between any two adjacent buildings cannot exceed 1.
 *
 * Additionally, there are city restrictions on the maximum height of specific buildings. These restrictions are given as a 2D integer array restrictions where restrictions[i] = [idi, maxHeighti] indicates that building idi must have a height less than or equal to maxHeighti.
 *
 *
 * It is guaranteed that each building will appear at most once in restrictions, and building 1 will not be in restrictions.
 *
 *
 * Return the maximum possible height of the tallest building.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, restrictions = [[2,1],[4,1]]
 * Output: 2
 * Explanation: The green area in the image indicates the maximum allowed height for each building.
 * We can build the buildings with heights [0,1,2,1,2], and the tallest building has a height of 2.
 *
 * Example 2:
 *
 * Input: n = 6, restrictions = []
 * Output: 5
 * Explanation: The green area in the image indicates the maximum allowed height for each building.
 * We can build the buildings with heights [0,1,2,3,4,5], and the tallest building has a height of 5.
 *
 * Example 3:
 *
 * Input: n = 10, restrictions = [[5,3],[2,5],[7,4],[10,3]]
 * Output: 5
 * Explanation: The green area in the image indicates the maximum allowed height for each building.
 * We can build the buildings with heights [0,1,2,3,3,4,4,5,4,3], and the tallest building has a height of 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 109
 *
 * 0 &lt;= restrictions.length &lt;= min(n - 1, 105)
 *
 * 2 &lt;= idi &lt;= n
 *
 * idi is unique.
 *
 * 0 &lt;= maxHeighti &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is it possible to find the max height if given the height range of a particular building?
 * Hint 2: You can find the height range of a restricted building by doing 2 passes from the left and right.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-building-height/">LeetCode #1840</a>
 */
public class MaximumBuildingHeight {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Building Height");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumBuildingHeight ===");
        MaximumBuildingHeight sol = new MaximumBuildingHeight();
        System.out.println(sol.solve(null));
    }
}
