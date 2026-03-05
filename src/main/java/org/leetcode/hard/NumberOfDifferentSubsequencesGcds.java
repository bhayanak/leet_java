package org.leetcode.hard;


/**
 * <b>#1819 - Number of Different Subsequences GCDs</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Counting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums that consists of positive integers.
 *
 *
 * The GCD of a sequence of numbers is defined as the greatest integer that divides all the numbers in the sequence evenly.
 *
 *
 * For example, the GCD of the sequence [4,6,16] is 2.
 *
 * A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.
 *
 *
 * For example, [2,5,10] is a subsequence of [1,2,1,2,4,1,5,10].
 *
 * Return the number of different GCDs among all non-empty subsequences of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,10,3]
 * Output: 5
 * Explanation: The figure shows all the non-empty subsequences and their GCDs.
 * The different GCDs are 6, 10, 3, 2, and 1.
 *
 * Example 2:
 *
 * Input: nums = [5,15,40,5,6]
 * Output: 7
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 2 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of how to check if a number x is a gcd of a subsequence.
 * Hint 2: If there is such subsequence, then all of it will be divisible by x. Moreover, if you divide each number in the subsequence by x , then the gcd of the resulting numbers will be 1.
 * Hint 3: Adding a number to a subsequence cannot increase its gcd. So, if there is a valid subsequence for x , then the subsequence that contains all multiples of x is a valid one too.
 * Hint 4: Iterate on all possiblex from 1 to 10^5, and check if there is a valid subsequence for x.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Counting, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-different-subsequences-gcds/">LeetCode #1819</a>
 */
public class NumberOfDifferentSubsequencesGcds {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Different Subsequences GCDs");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfDifferentSubsequencesGcds ===");
        NumberOfDifferentSubsequencesGcds sol = new NumberOfDifferentSubsequencesGcds();
        System.out.println(sol.solve(null));
    }
}
