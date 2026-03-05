package org.leetcode.medium;


/**
 * <b>#3489 - Zero Array Transformation IV</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and a 2D array queries, where queries[i] = [li, ri, vali].
 *
 *
 * Each queries[i] represents the following action on nums:
 *
 *
 * Select a subset of indices in the range [li, ri] from nums.
 *
 * Decrement the value at each selected index by exactly vali.
 *
 * A Zero Array is an array with all its elements equal to 0.
 *
 *
 * Return the minimum possible non-negative value of k, such that after processing the first k queries in sequence, nums becomes a Zero Array. If no such k exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,0,2], queries = [[0,2,1],[0,2,1],[1,1,3]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * For query 0 (l = 0, r = 2, val = 1):
 *
 *
 *
 *
 * Decrement the values at indices [0, 2] by 1.
 *
 * The array will become [1, 0, 1].
 *
 *
 *
 * For query 1 (l = 0, r = 2, val = 1):
 *
 *
 *
 * Decrement the values at indices [0, 2] by 1.
 *
 * The array will become [0, 0, 0], which is a Zero Array. Therefore, the minimum value of k is 2.
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [4,3,2,1], queries = [[1,3,2],[0,2,1]]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * It is impossible to make nums a Zero Array even after all the queries.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,2,1], queries = [[0,1,1],[1,2,1],[2,3,2],[3,4,1],[4,4,1]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * For query 0 (l = 0, r = 1, val = 1):
 *
 *
 *
 *
 * Decrement the values at indices [0, 1] by 1.
 *
 * The array will become [0, 1, 3, 2, 1].
 *
 *
 *
 * For query 1 (l = 1, r = 2, val = 1):
 *
 *
 *
 * Decrement the values at indices [1, 2] by 1.
 *
 * The array will become [0, 0, 2, 2, 1].
 *
 *
 *
 * For query 2 (l = 2, r = 3, val = 2):
 *
 *
 *
 * Decrement the values at indices [2, 3] by 2.
 *
 * The array will become [0, 0, 0, 0, 1].
 *
 *
 *
 * For query 3 (l = 3, r = 4, val = 1):
 *
 *
 *
 * Decrement the value at index 4 by 1.
 *
 * The array will become [0, 0, 0, 0, 0]. Therefore, the minimum value of k is 4.
 *
 *
 *
 * Example 4:
 *
 * Input: nums = [1,2,3,2,6], queries = [[0,1,1],[0,2,1],[1,4,2],[4,4,4],[3,4,1],[4,4,5]]
 *
 *
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 10
 *
 * 0 &lt;= nums[i] &lt;= 1000
 *
 * 1 &lt;= queries.length &lt;= 1000
 *
 * queries[i] = [li, ri, vali]
 *
 * 0 &lt;= li &lt;= ri &lt; nums.length
 *
 * 1 &lt;= vali &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: For each <code>nums[i]</code>, use DP to check whether the <code>queries[.][2]</code> values (i.e., the <code>val</code> values) of the queries that affect it can form a combination with a sum equal to <code>nums[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/zero-array-transformation-iv/">LeetCode #3489</a>
 */
public class ZeroArrayTransformationIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Zero Array Transformation IV");
    }

    public static void main(String[] args) {
        System.out.println("=== ZeroArrayTransformationIv ===");
        ZeroArrayTransformationIv sol = new ZeroArrayTransformationIv();
        System.out.println(sol.solve(null));
    }
}
