package org.leetcode.medium;


/**
 * <b>#1498 - Number of Subsequences That Satisfy the Given Sum Condition</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums and an integer target.
 *
 *
 * Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,5,6,7], target = 9
 * Output: 4
 * Explanation: There are 4 subsequences that satisfy the condition.
 * [3] -&gt; Min value + max value &lt;= target (3 + 3 &lt;= 9)
 * [3,5] -&gt; (3 + 5 &lt;= 9)
 * [3,5,6] -&gt; (3 + 6 &lt;= 9)
 * [3,6] -&gt; (3 + 6 &lt;= 9)
 *
 * Example 2:
 *
 * Input: nums = [3,3,6,8], target = 10
 * Output: 6
 * Explanation: There are 6 subsequences that satisfy the condition. (nums can have repeated numbers).
 * [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]
 *
 * Example 3:
 *
 * Input: nums = [2,3,3,4,6,7], target = 12
 * Output: 61
 * Explanation: There are 63 non-empty subsequences, two of them do not satisfy the condition ([6,7], [7]).
 * Number of valid subsequences (63 - 2 = 61).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 *
 * 1 &lt;= target &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array nums.
 * Hint 2: Use two pointers approach: Given an index i (choose it as the minimum in a subsequence) find the maximum j where j ≥ i and nums[i] +nums[j] ≤ target.
 * Hint 3: Count the number of subsequences.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/">LeetCode #1498</a>
 */
public class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Subsequences That Satisfy the Given Sum Condition");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubsequencesThatSatisfyTheGivenSumCondition ===");
        NumberOfSubsequencesThatSatisfyTheGivenSumCondition sol = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition();
        System.out.println(sol.solve(null));
    }
}
