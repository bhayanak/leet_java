package org.leetcode.hard;


/**
 * <b>#3082 - Find the Sum of the Power of All Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and a positive integer k.
 *
 *
 * The power of an array of integers is defined as the number of subsequences with their sum equal to k.
 *
 *
 * Return the sum of power of all subsequences of nums.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input:   nums = [1,2,3], k = 3 
 *
 *
 * Output:   6 
 *
 *
 * Explanation:
 *
 *
 * There are 5 subsequences of nums with non-zero power:
 *
 *
 * The subsequence [1,2,3] has 2 subsequences with sum == 3: [1,2,3] and [1,2,3].
 *
 * The subsequence [1,2,3] has 1 subsequence with sum == 3: [1,2,3].
 *
 * The subsequence [1,2,3] has 1 subsequence with sum == 3: [1,2,3].
 *
 * The subsequence [1,2,3] has 1 subsequence with sum == 3: [1,2,3].
 *
 * The subsequence [1,2,3] has 1 subsequence with sum == 3: [1,2,3].
 *
 * Hence the answer is 2 + 1 + 1 + 1 + 1 = 6.
 *
 * Example 2:
 *
 * Input:   nums = [2,3,3], k = 5 
 *
 *
 * Output:   4 
 *
 *
 * Explanation:
 *
 *
 * There are 3 subsequences of nums with non-zero power:
 *
 *
 * The subsequence [2,3,3] has 2 subsequences with sum == 5: [2,3,3] and [2,3,3].
 *
 * The subsequence [2,3,3] has 1 subsequence with sum == 5: [2,3,3].
 *
 * The subsequence [2,3,3] has 1 subsequence with sum == 5: [2,3,3].
 *
 * Hence the answer is 2 + 1 + 1 = 4.
 *
 * Example 3:
 *
 * Input:   nums = [1,2,3], k = 7 
 *
 *
 * Output:   0 
 *
 *
 * Explanation: There exists no subsequence with sum 7. Hence all subsequences of nums have power = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there is a subsequence of length <code>j</code> with the sum of elements <code>k</code>, it contributes <code>2<sup>n - j</sup></code> to the answer.
 * Hint 2: Let <code>dp[i][j]</code> represent the number of subsequences in the subarray <code>nums[0..i]</code> which have a sum of <code>j</code>.
 * Hint 3: We can find the <code>dp[i][k]</code> for all <code>0 &lt;= i &lt;= n-1</code> and multiply them with <code>2<sup>n - j</sup></code> to get final answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-the-sum-of-the-power-of-all-subsequences/">LeetCode #3082</a>
 */
public class FindTheSumOfThePowerOfAllSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Sum of the Power of All Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheSumOfThePowerOfAllSubsequences ===");
        FindTheSumOfThePowerOfAllSubsequences sol = new FindTheSumOfThePowerOfAllSubsequences();
        System.out.println(sol.solve(null));
    }
}
