package org.leetcode.medium;


/**
 * <b>#2834 - Find the Minimum Possible Sum of a Beautiful Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given positive integers n and target.
 *
 *
 * An array nums is beautiful if it meets the following conditions:
 *
 *
 * nums.length == n.
 *
 * nums consists of pairwise distinct positive integers.
 *
 * There doesn't exist two distinct indices, i and j, in the range [0, n - 1], such that nums[i] + nums[j] == target.
 *
 * Return the minimum possible sum that a beautiful array could have modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, target = 3
 * Output: 4
 * Explanation: We can see that nums = [1,3] is beautiful.
 * - The array nums has length n = 2.
 * - The array nums consists of pairwise distinct positive integers.
 * - There doesn't exist two distinct indices, i and j, with nums[i] + nums[j] == 3.
 * It can be proven that 4 is the minimum possible sum that a beautiful array could have.
 *
 * Example 2:
 *
 * Input: n = 3, target = 3
 * Output: 8
 * Explanation: We can see that nums = [1,3,4] is beautiful.
 * - The array nums has length n = 3.
 * - The array nums consists of pairwise distinct positive integers.
 * - There doesn't exist two distinct indices, i and j, with nums[i] + nums[j] == 3.
 * It can be proven that 8 is the minimum possible sum that a beautiful array could have.
 *
 * Example 3:
 *
 * Input: n = 1, target = 1
 * Output: 1
 * Explanation: We can see, that nums = [1] is beautiful.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * 1 &lt;= target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Greedily try to add the smallest possible number in the array <code>nums</code>, such that <code>nums</code> contains distinct positive integers, and there are no two indices <code>i</code> and <code>j</code> with <code>nums[i] + nums[j] == target</code>.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-possible-sum-of-a-beautiful-array/">LeetCode #2834</a>
 */
public class FindTheMinimumPossibleSumOfABeautifulArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Possible Sum of a Beautiful Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumPossibleSumOfABeautifulArray ===");
        FindTheMinimumPossibleSumOfABeautifulArray sol = new FindTheMinimumPossibleSumOfABeautifulArray();
        System.out.println(sol.solve(null));
    }
}
