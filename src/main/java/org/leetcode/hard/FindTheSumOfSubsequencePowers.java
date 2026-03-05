package org.leetcode.hard;


/**
 * <b>#3098 - Find the Sum of Subsequence Powers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n, and a positive integer k.
 *
 *
 * The power of a subsequence is defined as the minimum absolute difference between any two elements in the subsequence.
 *
 *
 * Return the sum of powers of all subsequences of nums which have length equal to k.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], k = 3
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * There are 4 subsequences in nums which have length 3: [1,2,3], [1,3,4], [1,2,4], and [2,3,4]. The sum of powers is |2 - 3| + |3 - 4| + |2 - 1| + |3 - 4| = 4.
 *
 * Example 2:
 *
 * Input: nums = [2,2], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The only subsequence in nums which has length 2 is [2,2]. The sum of powers is |2 - 2| = 0.
 *
 * Example 3:
 *
 * Input: nums = [4,3,-1], k = 2
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * There are 3 subsequences in nums which have length 2: [4,3], [4,-1], and [3,-1]. The sum of powers is |4 - 3| + |4 - (-1)| + |3 - (-1)| = 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == nums.length &lt;= 50
 *
 * -108 &lt;= nums[i] &lt;= 108 
 *
 * 2 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort <code>nums</code>.
 * Hint 2: There are at most <code>n<sup>2</sup></code> distinct differences.
 * Hint 3: For a particular difference <code>d</code>, let <code>dp[len][i][j]</code> be the number of subsequences of length <code>len</code> in the subarray <code>nums[0..i]</code> where the last element picked was at index <code>j</code>.
 * Hint 4: For each index, we can check if it can be picked if <code>nums[i] - nums[j] &lt;= d</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-the-sum-of-subsequence-powers/">LeetCode #3098</a>
 */
public class FindTheSumOfSubsequencePowers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Sum of Subsequence Powers");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheSumOfSubsequencePowers ===");
        FindTheSumOfSubsequencePowers sol = new FindTheSumOfSubsequencePowers();
        System.out.println(sol.solve(null));
    }
}
