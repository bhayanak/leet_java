package org.leetcode.medium;


/**
 * <b>#2001 - Number of Pairs of Interchangeable Rectangles</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
 *
 *
 * Two rectangles i and j (i &lt; j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
 *
 *
 * Return the number of pairs of interchangeable rectangles in rectangles.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rectangles = [[4,8],[3,6],[10,20],[15,30]]
 * Output: 6
 * Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
 * - Rectangle 0 with rectangle 1: 4/8 == 3/6.
 * - Rectangle 0 with rectangle 2: 4/8 == 10/20.
 * - Rectangle 0 with rectangle 3: 4/8 == 15/30.
 * - Rectangle 1 with rectangle 2: 3/6 == 10/20.
 * - Rectangle 1 with rectangle 3: 3/6 == 15/30.
 * - Rectangle 2 with rectangle 3: 10/20 == 15/30.
 *
 * Example 2:
 *
 * Input: rectangles = [[4,5],[7,8]]
 * Output: 0
 * Explanation: There are no interchangeable pairs of rectangles.
 *
 *
 *
 * Constraints:
 *
 *
 * n == rectangles.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * rectangles[i].length == 2
 *
 * 1 &lt;= widthi, heighti &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store the rectangle height and width ratio in a hashmap.
 * Hint 2: Traverse the ratios, and for each ratio, use the frequency of the ratio to add to the total pair count.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/number-of-pairs-of-interchangeable-rectangles/">LeetCode #2001</a>
 */
public class NumberOfPairsOfInterchangeableRectangles {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Pairs of Interchangeable Rectangles");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPairsOfInterchangeableRectangles ===");
        NumberOfPairsOfInterchangeableRectangles sol = new NumberOfPairsOfInterchangeableRectangles();
        System.out.println(sol.solve(null));
    }
}
