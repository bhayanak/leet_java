package org.leetcode.hard;


/**
 * <b>#1955 - Count Number of Special Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sequence is special if it consists of a positive number of 0s, followed by a positive number of 1s, then a positive number of 2s.
 *
 *
 * For example, [0,1,2] and [0,0,1,1,1,2] are special.
 *
 * In contrast, [2,1,0], [1], and [0,1,2,0] are not special.
 *
 * Given an array nums (consisting of only integers 0, 1, and 2), return the number of different subsequences that are special. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements. Two subsequences are different if the set of indices chosen are different.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2,2]
 * Output: 3
 * Explanation: The special subsequences are bolded [0,1,2,2], [0,1,2,2], and [0,1,2,2].
 *
 * Example 2:
 *
 * Input: nums = [2,2,0,0]
 * Output: 0
 * Explanation: There are no special subsequences in [2,2,0,0].
 *
 * Example 3:
 *
 * Input: nums = [0,1,2,0,1,2]
 * Output: 7
 * Explanation: The special subsequences are bolded:
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 * - [0,1,2,0,1,2]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we first solve a simpler problem? Counting the number of subsequences with 1s followed by 0s.
 * Hint 2: How can we keep track of the partially matched subsequences to help us find the answer?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-special-subsequences/">LeetCode #1955</a>
 */
public class CountNumberOfSpecialSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Special Subsequences");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountNumberOfSpecialSubsequences ===");
        CountNumberOfSpecialSubsequences sol = new CountNumberOfSpecialSubsequences();
        System.out.println(sol.solve(null));
    }
}
