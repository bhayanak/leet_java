package org.leetcode.medium;


/**
 * <b>#2275 - Largest Combination With Bitwise AND Greater Than Zero</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The bitwise AND of an array nums is the bitwise AND of all integers in nums.
 *
 *
 * For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 &amp; 5 &amp; 3 = 1.
 *
 * Also, for nums = [7], the bitwise AND is 7.
 *
 * You are given an array of positive integers candidates. Compute the bitwise AND for all possible combinations of elements in the candidates array.
 *
 *
 * Return the size of the largest combination of candidates with a bitwise AND greater than 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: candidates = [16,17,71,62,12,24,14]
 * Output: 4
 * Explanation: The combination [16,17,62,24] has a bitwise AND of 16 &amp; 17 &amp; 62 &amp; 24 = 16 &gt; 0.
 * The size of the combination is 4.
 * It can be shown that no combination with a size greater than 4 has a bitwise AND greater than 0.
 * Note that more than one combination may have the largest size.
 * For example, the combination [62,12,24,14] has a bitwise AND of 62 &amp; 12 &amp; 24 &amp; 14 = 8 &gt; 0.
 *
 * Example 2:
 *
 * Input: candidates = [8,8]
 * Output: 2
 * Explanation: The largest combination [8,8] has a bitwise AND of 8 &amp; 8 = 8 &gt; 0.
 * The size of the combination is 2, so we return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= candidates.length &lt;= 105
 *
 * 1 &lt;= candidates[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For the bitwise AND to be greater than zero, at least one bit should be 1 for every number in the combination.
 * Hint 2: The candidates are 24 bits long, so for every bit position, we can calculate the size of the largest combination such that the bitwise AND will have a 1 at that bit position.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Counting).
 *
 * @see <a href="https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/">LeetCode #2275</a>
 */
public class LargestCombinationWithBitwiseAndGreaterThanZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Combination With Bitwise AND Greater Than Zero");
    }

    public static void main(String[] args) {
        System.out.println("=== LargestCombinationWithBitwiseAndGreaterThanZero ===");
        LargestCombinationWithBitwiseAndGreaterThanZero sol = new LargestCombinationWithBitwiseAndGreaterThanZero();
        System.out.println(sol.solve(null));
    }
}
