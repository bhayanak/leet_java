package org.leetcode.medium;


/**
 * <b>#3164 - Find the Number of Good Pairs II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.
 *
 *
 * A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 &lt;= i &lt;= n - 1, 0 &lt;= j &lt;= m - 1).
 *
 *
 * Return the total number of good pairs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 * The 5 good pairs are (0, 0), (1, 0), (1, 1), (2, 0), and (2, 2).
 *
 *
 * Example 2:
 *
 * Input: nums1 = [1,2,4,12], nums2 = [2,4], k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The 2 good pairs are (3, 0) and (3, 1).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[j] &lt;= 106
 *
 * 1 &lt;= k &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>f[v]</code> be the number of occurrences of <code>v/k</code> in nums2.
 * Hint 2: For each value <code>v</code> in nums1, enumerating all its factors <code>d</code> (in <code>sqrt(v)</code> time) and sum up all the <code>f[d]</code> to get the final answer.
 * Hint 3: It is also possible to improve the complexity from <code>len(nums1) * sqrt(v)</code> to <code>len(nums1) * log(v)</code> - How?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-good-pairs-ii/">LeetCode #3164</a>
 */
public class FindTheNumberOfGoodPairsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Good Pairs II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfGoodPairsIi ===");
        FindTheNumberOfGoodPairsIi sol = new FindTheNumberOfGoodPairsIi();
        System.out.println(sol.solve(null));
    }
}
