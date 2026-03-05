package org.leetcode.medium;


/**
 * <b>#2672 - Number of Adjacent Elements With the Same Color</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing an array colors of length n where all elements are set to 0's meaning uncolored. You are also given a 2D integer array queries where queries[i] = [indexi, colori]. For the ith query:
 *
 *
 * Set colors[indexi] to colori.
 *
 * Count the number of adjacent pairs in colors which have the same color (regardless of colori).
 *
 * Return an array answer of the same length as queries where answer[i] is the answer to the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, queries = [[0,2],[1,2],[3,1],[1,1],[2,1]]
 *
 *
 * Output: [0,1,1,0,2]
 *
 *
 * Explanation:
 *
 *
 * Initially array colors = [0,0,0,0], where 0 denotes uncolored elements of the array.
 *
 * After the 1st query colors = [2,0,0,0]. The count of adjacent pairs with the same color is 0.
 *
 * After the 2nd query colors = [2,2,0,0]. The count of adjacent pairs with the same color is 1.
 *
 * After the 3rd query colors = [2,2,0,1]. The count of adjacent pairs with the same color is 1.
 *
 * After the 4th query colors = [2,1,0,1]. The count of adjacent pairs with the same color is 0.
 *
 * After the 5th query colors = [2,1,1,1]. The count of adjacent pairs with the same color is 2.
 *
 * Example 2:
 *
 * Input: n = 1, queries = [[0,100000]]
 *
 *
 * Output: [0]
 *
 *
 * Explanation:
 *
 *
 * After the 1st query colors = [100000]. The count of adjacent pairs with the same color is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 2
 *
 * 0 &lt;= indexi &lt;= n - 1
 *
 * 1 &lt;=  colori &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since at each query, only one element is being recolored, we just need to focus on its neighbors.
 * Hint 2: If an element that is changed on the i-th query had the same color as its right element answer decreases by 1. Similarly contributes its left element too.
 * Hint 3: After changing the color, if the element has the same color as its right element answer increases by 1. Similarly contributes its left element too.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/number-of-adjacent-elements-with-the-same-color/">LeetCode #2672</a>
 */
public class NumberOfAdjacentElementsWithTheSameColor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Adjacent Elements With the Same Color");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfAdjacentElementsWithTheSameColor ===");
        NumberOfAdjacentElementsWithTheSameColor sol = new NumberOfAdjacentElementsWithTheSameColor();
        System.out.println(sol.solve(null));
    }
}
