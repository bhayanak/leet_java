package org.leetcode.medium;


/**
 * <b>#3468 - Find the Number of Copy Arrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array original of length n and a 2D array bounds of length n x 2, where bounds[i] = [ui, vi].
 *
 *
 * You need to find the number of possible arrays copy of length n such that:
 *
 *
 * (copy[i] - copy[i - 1]) == (original[i] - original[i - 1]) for 1 &lt;= i &lt;= n - 1.
 *
 * ui &lt;= copy[i] &lt;= vi for 0 &lt;= i &lt;= n - 1.
 *
 * Return the number of such arrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: original = [1,2,3,4], bounds = [[1,2],[2,3],[3,4],[4,5]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The possible arrays are:
 *
 *
 * [1, 2, 3, 4]
 *
 * [2, 3, 4, 5]
 *
 * Example 2:
 *
 * Input: original = [1,2,3,4], bounds = [[1,10],[2,9],[3,8],[4,7]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The possible arrays are:
 *
 *
 * [1, 2, 3, 4]
 *
 * [2, 3, 4, 5]
 *
 * [3, 4, 5, 6]
 *
 * [4, 5, 6, 7]
 *
 * Example 3:
 *
 * Input: original = [1,2,1,2], bounds = [[1,1],[2,3],[3,3],[2,3]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No array is possible.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == original.length &lt;= 105
 *
 * 1 &lt;= original[i] &lt;= 109
 *
 * bounds.length == n
 *
 * bounds[i].length == 2
 *
 * 1 &lt;= bounds[i][0] &lt;= bounds[i][1] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <code>copy[0]</code> uniquely determines all other values.
 * Hint 2: Possible values for <code>copy[0]</code> are in <code>[u[0], v[0]]</code>.
 * Hint 3: From left to right, compute valid ranges for each index by intersecting bounds with the previous range.
 * Hint 4: The answer is the size of the valid range for the last index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-copy-arrays/">LeetCode #3468</a>
 */
public class FindTheNumberOfCopyArrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Copy Arrays");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfCopyArrays ===");
        FindTheNumberOfCopyArrays sol = new FindTheNumberOfCopyArrays();
        System.out.println(sol.solve(null));
    }
}
