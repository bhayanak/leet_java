package org.leetcode.hard;


/**
 * <b>#3287 - Find the Maximum Sequence Value of Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k.
 *
 *
 * The value of a sequence seq of size 2 * x is defined as:
 *
 *
 * (seq[0] OR seq[1] OR ... OR seq[x - 1]) XOR (seq[x] OR seq[x + 1] OR ... OR seq[2 * x - 1]).
 *
 * Return the maximum value of any subsequence of nums having size 2 * k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,6,7], k = 1
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The subsequence [2, 7] has the maximum value of 2 XOR 7 = 5.
 *
 * Example 2:
 *
 * Input: nums = [4,2,5,6,7], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The subsequence [4, 5, 6, 7] has the maximum value of (4 OR 5) XOR (6 OR 7) = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 400
 *
 * 1 &lt;= nums[i] &lt; 27
 *
 * 1 &lt;= k &lt;= nums.length / 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find all the possible <code>OR</code> till each <code>i</code> with <code>k</code> elements backward and forward.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-sequence-value-of-array/">LeetCode #3287</a>
 */
public class FindTheMaximumSequenceValueOfArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Sequence Value of Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumSequenceValueOfArray ===");
        FindTheMaximumSequenceValueOfArray sol = new FindTheMaximumSequenceValueOfArray();
        System.out.println(sol.solve(null));
    }
}
