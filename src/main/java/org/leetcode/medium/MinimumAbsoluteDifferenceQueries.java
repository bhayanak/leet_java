package org.leetcode.medium;


/**
 * <b>#1906 - Minimum Absolute Difference Queries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The minimum absolute difference of an array a is defined as the minimum value of |a[i] - a[j]|, where 0 &lt;= i &lt; j &lt; a.length and a[i] != a[j]. If all elements of a are the same, the minimum absolute difference is -1.
 *
 *
 * For example, the minimum absolute difference of the array [5,2,3,7,2] is |2 - 3| = 1. Note that it is not 0 because a[i] and a[j] must be different.
 *
 * You are given an integer array nums and the array queries where queries[i] = [li, ri]. For each query i, compute the minimum absolute difference of the subarray nums[li...ri] containing the elements of nums between the 0-based indices li and ri (inclusive).
 *
 *
 * Return an array ans where ans[i] is the answer to the ith query.
 *
 *
 * A subarray is a contiguous sequence of elements in an array.
 *
 *
 * The value of |x| is defined as:
 *
 *
 * x if x &gt;= 0.
 *
 * -x if x &lt; 0.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,4,8], queries = [[0,1],[1,2],[2,3],[0,3]]
 * Output: [2,1,4,1]
 * Explanation: The queries are processed as follows:
 * - queries[0] = [0,1]: The subarray is [1,3] and the minimum absolute difference is |1-3| = 2.
 * - queries[1] = [1,2]: The subarray is [3,4] and the minimum absolute difference is |3-4| = 1.
 * - queries[2] = [2,3]: The subarray is [4,8] and the minimum absolute difference is |4-8| = 4.
 * - queries[3] = [0,3]: The subarray is [1,3,4,8] and the minimum absolute difference is |3-4| = 1.
 *
 * Example 2:
 *
 * Input: nums = [4,5,2,2,7,10], queries = [[2,3],[0,2],[0,5],[3,5]]
 * Output: [-1,1,1,3]
 * Explanation: The queries are processed as follows:
 * - queries[0] = [2,3]: The subarray is [2,2] and the minimum absolute difference is -1 because all the
 *   elements are the same.
 * - queries[1] = [0,2]: The subarray is [4,5,2] and the minimum absolute difference is |4-5| = 1.
 * - queries[2] = [0,5]: The subarray is [4,5,2,2,7,10] and the minimum absolute difference is |4-5| = 1.
 * - queries[3] = [3,5]: The subarray is [2,7,10] and the minimum absolute difference is |7-10| = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= queries.length &lt;= 2 * 104
 *
 * 0 &lt;= li &lt; ri &lt; nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How does the maximum value being 100 help us?
 * Hint 2: How can we tell if a number exists in a given range?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-absolute-difference-queries/">LeetCode #1906</a>
 */
public class MinimumAbsoluteDifferenceQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Absolute Difference Queries");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumAbsoluteDifferenceQueries ===");
        MinimumAbsoluteDifferenceQueries sol = new MinimumAbsoluteDifferenceQueries();
        System.out.println(sol.solve(null));
    }
}
