package org.leetcode.hard;


/**
 * <b>#3495 - Minimum Operations to Make Array Elements Zero</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array queries, where queries[i] is of the form [l, r]. Each queries[i] defines an array of integers nums consisting of elements ranging from l to r, both inclusive.
 *
 *
 * In one operation, you can:
 *
 *
 * Select two integers a and b from the array.
 *
 * Replace them with floor(a / 4) and floor(b / 4).
 *
 * Your task is to determine the minimum number of operations required to reduce all elements of the array to zero for each query. Return the sum of the results for all queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [[1,2],[2,4]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * For queries[0]:
 *
 *
 * The initial array is nums = [1, 2].
 *
 * In the first operation, select nums[0] and nums[1]. The array becomes [0, 0].
 *
 * The minimum number of operations required is 1.
 *
 * For queries[1]:
 *
 *
 * The initial array is nums = [2, 3, 4].
 *
 * In the first operation, select nums[0] and nums[2]. The array becomes [0, 3, 1].
 *
 * In the second operation, select nums[1] and nums[2]. The array becomes [0, 0, 0].
 *
 * The minimum number of operations required is 2.
 *
 * The output is 1 + 2 = 3.
 *
 * Example 2:
 *
 * Input: queries = [[2,6]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * For queries[0]:
 *
 *
 * The initial array is nums = [2, 3, 4, 5, 6].
 *
 * In the first operation, select nums[0] and nums[3]. The array becomes [0, 3, 4, 1, 6].
 *
 * In the second operation, select nums[2] and nums[4]. The array becomes [0, 3, 1, 1, 1].
 *
 * In the third operation, select nums[1] and nums[2]. The array becomes [0, 0, 0, 1, 1].
 *
 * In the fourth operation, select nums[3] and nums[4]. The array becomes [0, 0, 0, 0, 0].
 *
 * The minimum number of operations required is 4.
 *
 * The output is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 2
 *
 * queries[i] == [l, r]
 *
 * 1 &lt;= l &lt; r &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a number <code>x</code>, the number of <code>"/4"</code> operations to change it to 0 is <code>floor(log4(x)) + 1</code>.
 * Hint 2: Always pair the 2 numbers with the maximum <code>"/4"</code> operations needed.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-array-elements-zero/">LeetCode #3495</a>
 */
public class MinimumOperationsToMakeArrayElementsZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Array Elements Zero");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeArrayElementsZero ===");
        MinimumOperationsToMakeArrayElementsZero sol = new MinimumOperationsToMakeArrayElementsZero();
        System.out.println(sol.solve(null));
    }
}
