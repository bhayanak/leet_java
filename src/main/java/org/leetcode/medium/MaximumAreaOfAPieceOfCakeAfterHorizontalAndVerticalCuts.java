package org.leetcode.medium;


/**
 * <b>#1465 - Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:
 *
 *
 * horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
 *
 * verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.
 *
 * Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: h = 5, w = 4, horizontalCuts = [1,2,4], verticalCuts = [1,3]
 * Output: 4 
 * Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green piece of cake has the maximum area.
 *
 * Example 2:
 *
 * Input: h = 5, w = 4, horizontalCuts = [3,1], verticalCuts = [1]
 * Output: 6
 * Explanation: The figure above represents the given rectangular cake. Red lines are the horizontal and vertical cuts. After you cut the cake, the green and yellow pieces of cake have the maximum area.
 *
 * Example 3:
 *
 * Input: h = 5, w = 4, horizontalCuts = [3], verticalCuts = [3]
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= h, w &lt;= 109
 *
 * 1 &lt;= horizontalCuts.length &lt;= min(h - 1, 105)
 *
 * 1 &lt;= verticalCuts.length &lt;= min(w - 1, 105)
 *
 * 1 &lt;= horizontalCuts[i] &lt; h
 *
 * 1 &lt;= verticalCuts[i] &lt; w
 *
 * All the elements in horizontalCuts are distinct.
 *
 * All the elements in verticalCuts are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the arrays, then compute the maximum difference between two consecutive elements for horizontal cuts and vertical cuts.
 * Hint 2: The answer is the product of these maximum values in horizontal cuts and vertical cuts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts/">LeetCode #1465</a>
 */
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts ===");
        MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts sol = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();
        System.out.println(sol.solve(null));
    }
}
