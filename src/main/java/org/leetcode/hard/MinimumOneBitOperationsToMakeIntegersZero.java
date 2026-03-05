package org.leetcode.hard;


/**
 * <b>#1611 - Minimum One Bit Operations to Make Integers Zero</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Bit Manipulation, Recursion, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, you must transform it into 0 using the following operations any number of times:
 *
 *
 * Change the rightmost (0th) bit in the binary representation of n.
 *
 * Change the ith bit in the binary representation of n if the (i-1)th bit is set to 1 and the (i-2)th through 0th bits are set to 0.
 *
 * Return the minimum number of operations to transform n into 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: 2
 * Explanation: The binary representation of 3 is "11".
 * "11" -&gt; "01" with the 2nd operation since the 0th bit is 1.
 * "01" -&gt; "00" with the 1st operation.
 *
 * Example 2:
 *
 * Input: n = 6
 * Output: 4
 * Explanation: The binary representation of 6 is "110".
 * "110" -&gt; "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.
 * "010" -&gt; "011" with the 1st operation.
 * "011" -&gt; "001" with the 2nd operation since the 0th bit is 1.
 * "001" -&gt; "000" with the 1st operation.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The fastest way to convert n to zero is to remove all set bits starting from the leftmost one. Try some simple examples to learn the rule of how many steps are needed to remove one set bit.
 * Hint 2: consider n=2^k case first, then solve for all n.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Bit Manipulation, Recursion, Memoization).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-one-bit-operations-to-make-integers-zero/">LeetCode #1611</a>
 */
public class MinimumOneBitOperationsToMakeIntegersZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum One Bit Operations to Make Integers Zero");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumOneBitOperationsToMakeIntegersZero ===");
        MinimumOneBitOperationsToMakeIntegersZero sol = new MinimumOneBitOperationsToMakeIntegersZero();
        System.out.println(sol.solve(null));
    }
}
