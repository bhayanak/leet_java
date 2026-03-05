package org.leetcode.medium;


/**
 * <b>#1981 - Minimize the Difference Between Target and Chosen Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix mat and an integer target.
 *
 *
 * Choose one integer from each row in the matrix such that the absolute difference between target and the sum of the chosen elements is minimized.
 *
 *
 * Return the minimum absolute difference.
 *
 *
 * The absolute difference between two numbers a and b is the absolute value of a - b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], target = 13
 * Output: 0
 * Explanation: One possible choice is to:
 * - Choose 1 from the first row.
 * - Choose 5 from the second row.
 * - Choose 7 from the third row.
 * The sum of the chosen elements is 13, which equals the target, so the absolute difference is 0.
 *
 * Example 2:
 *
 * Input: mat = [[1],[2],[3]], target = 100
 * Output: 94
 * Explanation: The best possible choice is to:
 * - Choose 1 from the first row.
 * - Choose 2 from the second row.
 * - Choose 3 from the third row.
 * The sum of the chosen elements is 6, and the absolute difference is 94.
 *
 * Example 3:
 *
 * Input: mat = [[1,2,9,8,7]], target = 6
 * Output: 1
 * Explanation: The best choice is to choose 7 from the first row.
 * The absolute difference is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n == mat[i].length
 *
 * 1 &lt;= m, n &lt;= 70
 *
 * 1 &lt;= mat[i][j] &lt;= 70
 *
 * 1 &lt;= target &lt;= 800
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The sum of chosen elements will not be too large. Consider using a hash set to record all possible sums while iterating each row.
 * Hint 2: Instead of keeping track of all possible sums, since in each row, we are adding positive numbers, only keep those that can be a candidate, not exceeding the target by too much.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimize-the-difference-between-target-and-chosen-elements/">LeetCode #1981</a>
 */
public class MinimizeTheDifferenceBetweenTargetAndChosenElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize the Difference Between Target and Chosen Elements");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimizeTheDifferenceBetweenTargetAndChosenElements ===");
        MinimizeTheDifferenceBetweenTargetAndChosenElements sol = new MinimizeTheDifferenceBetweenTargetAndChosenElements();
        System.out.println(sol.solve(null));
    }
}
