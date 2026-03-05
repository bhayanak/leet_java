package org.leetcode.medium;


/**
 * <b>#3290 - Maximum Multiplication Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array a of size 4 and another integer array b of size at least 4.
 *
 *
 * You need to choose 4 indices i0, i1, i2, and i3 from the array b such that i0 &lt; i1 &lt; i2 &lt; i3. Your score will be equal to the value a[0] * b[i0] + a[1] * b[i1] + a[2] * b[i2] + a[3] * b[i3].
 *
 *
 * Return the maximum score you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = [3,2,5,6], b = [2,-6,4,-5,-3,2,-7]
 *
 *
 * Output: 26
 *
 *
 * Explanation:
 *
 * We can choose the indices 0, 1, 2, and 5. The score will be 3 * 2 + 2 * (-6) + 5 * 4 + 6 * 2 = 26.
 *
 * Example 2:
 *
 * Input: a = [-1,4,5,-2], b = [-5,-1,-3,-2,-4]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 * We can choose the indices 0, 1, 3, and 4. The score will be (-1) * (-5) + 4 * (-1) + 5 * (-2) + (-2) * (-4) = -1.
 *
 *
 *
 * Constraints:
 *
 *
 * a.length == 4
 *
 * 4 &lt;= b.length &lt;= 105
 *
 * -105 &lt;= a[i], b[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using dynamic programming.
 * Hint 2: Consider a dp with the following states: The current position in the array b, and the number of indices considered.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximum-multiplication-score/">LeetCode #3290</a>
 */
public class MaximumMultiplicationScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Multiplication Score");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumMultiplicationScore ===");
        MaximumMultiplicationScore sol = new MaximumMultiplicationScore();
        System.out.println(sol.solve(null));
    }
}
