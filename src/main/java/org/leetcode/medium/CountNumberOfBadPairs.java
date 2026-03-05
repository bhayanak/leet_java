package org.leetcode.medium;


/**
 * <b>#2364 - Count Number of Bad Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i &lt; j and j - i != nums[j] - nums[i].
 *
 *
 * Return the total number of bad pairs in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,1,3,3]
 * Output: 5
 * Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
 * The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
 * The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
 * The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
 * The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
 * There are a total of 5 bad pairs, so we return 5.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 0
 * Explanation: There are no bad pairs.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Would it be easier to count the number of pairs that are not bad pairs?
 * Hint 2: Notice that (j - i != nums[j] - nums[i]) is the same as (nums[i] - i != nums[j] - j).
 * Hint 3: Keep a counter of nums[i] - i. To be efficient, use a HashMap.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-bad-pairs/">LeetCode #2364</a>
 */
public class CountNumberOfBadPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Bad Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumberOfBadPairs ===");
        CountNumberOfBadPairs sol = new CountNumberOfBadPairs();
        System.out.println(sol.solve(null));
    }
}
