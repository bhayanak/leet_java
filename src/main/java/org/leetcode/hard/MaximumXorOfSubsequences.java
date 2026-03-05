package org.leetcode.hard;


/**
 * <b>#3681 - Maximum XOR of Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n where each element is a non-negative integer.
 *
 *
 * Select two subsequences of nums (they may be empty and are allowed to overlap), each preserving the original order of elements, and let:
 *
 *
 * X be the bitwise XOR of all elements in the first subsequence.
 *
 * Y be the bitwise XOR of all elements in the second subsequence.
 *
 * Return the maximum possible value of X XOR Y.
 *
 *
 * Note: The XOR of an empty subsequence is 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Choose subsequences:
 *
 *
 * First subsequence [2], whose XOR is 2.
 *
 * Second subsequence [2,3], whose XOR is 1.
 *
 * Then, XOR of both subsequences = 2 XOR 1 = 3.
 *
 *
 * This is the maximum XOR value achievable from any two subsequences.
 *
 * Example 2:
 *
 * Input: nums = [5,2]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * Choose subsequences:
 *
 *
 * First subsequence [5], whose XOR is 5.
 *
 * Second subsequence [2], whose XOR is 2.
 *
 * Then, XOR of both subsequences = 5 XOR 2 = 7.
 *
 *
 * This is the maximum XOR value achievable from any two subsequences.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build a linear XOR basis from all numbers and take the maximum XOR achievable from it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-xor-of-subsequences/">LeetCode #3681</a>
 */
public class MaximumXorOfSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum XOR of Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumXorOfSubsequences ===");
        MaximumXorOfSubsequences sol = new MaximumXorOfSubsequences();
        System.out.println(sol.solve(null));
    }
}
