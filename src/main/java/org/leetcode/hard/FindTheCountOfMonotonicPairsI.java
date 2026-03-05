package org.leetcode.hard;


/**
 * <b>#3250 - Find the Count of Monotonic Pairs I</b>
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
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i][s]</code> is the number of monotonic pairs of length <code>i</code> with the <code>arr1[i - 1] = s</code>.
 * Hint 2: If <code>arr1[i - 1] = s</code>, <code>arr2[i - 1] = nums[i - 1] - s</code>.
 * Hint 3: Check if the state in recurrence is valid.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Combinatorics, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-count-of-monotonic-pairs-i/">LeetCode #3250</a>
 */
public class FindTheCountOfMonotonicPairsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Count of Monotonic Pairs I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheCountOfMonotonicPairsI ===");
        FindTheCountOfMonotonicPairsI sol = new FindTheCountOfMonotonicPairsI();
        System.out.println(sol.solve(null));
    }
}
