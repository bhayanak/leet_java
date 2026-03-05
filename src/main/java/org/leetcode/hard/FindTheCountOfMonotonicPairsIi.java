package org.leetcode.hard;


/**
 * <b>#3251 - Find the Count of Monotonic Pairs II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Combinatorics, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums of length n.
 *
 *
 * We call a pair of non-negative integer arrays (arr1, arr2) monotonic if:
 *
 *
 * The lengths of both arrays are n.
 *
 * arr1 is monotonically non-decreasing, in other words, arr1[0] &lt;= arr1[1] &lt;= ... &lt;= arr1[n - 1].
 *
 * arr2 is monotonically non-increasing, in other words, arr2[0] &gt;= arr2[1] &gt;= ... &gt;= arr2[n - 1].
 *
 * arr1[i] + arr2[i] == nums[i] for all 0 &lt;= i &lt;= n - 1.
 *
 * Return the count of monotonic pairs.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The good pairs are:
 *
 *
 * ([0, 1, 1], [2, 2, 1])
 *
 * ([0, 1, 2], [2, 2, 0])
 *
 * ([0, 2, 2], [2, 1, 0])
 *
 * ([1, 2, 2], [1, 1, 0])
 *
 * Example 2:
 *
 * Input: nums = [5,5,5,5]
 *
 *
 * Output: 126
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 2000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Combinatorics, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-count-of-monotonic-pairs-ii/">LeetCode #3251</a>
 */
public class FindTheCountOfMonotonicPairsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Count of Monotonic Pairs II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheCountOfMonotonicPairsIi ===");
        FindTheCountOfMonotonicPairsIi sol = new FindTheCountOfMonotonicPairsIi();
        System.out.println(sol.solve(null));
    }
}
