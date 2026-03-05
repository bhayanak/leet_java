package org.leetcode.medium;


/**
 * <b>#1545 - Find Kth Bit in Nth Binary String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Recursion, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two positive integers n and k, the binary string Sn is formed as follows:
 *
 *
 * S1 = "0"
 *
 * Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i &gt; 1
 *
 * Where + denotes the concatenation operation, reverse(x) returns the reversed string x, and invert(x) inverts all the bits in x (0 changes to 1 and 1 changes to 0).
 *
 *
 * For example, the first four strings in the above sequence are:
 *
 *
 * S1 = "0"
 *
 * S2 = "011"
 *
 * S3 = "0111001"
 *
 * S4 = "011100110110001"
 *
 * Return the kth bit in Sn. It is guaranteed that k is valid for the given n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 1
 * Output: "0"
 * Explanation: S3 is "0111001".
 * The 1st bit is "0".
 *
 * Example 2:
 *
 * Input: n = 4, k = 11
 * Output: "1"
 * Explanation: S4 is "011100110110001".
 * The 11th bit is "1".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 20
 *
 * 1 &lt;= k &lt;= 2n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since n is small, we can simply simulate the process of constructing S1 to Sn.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Recursion, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/">LeetCode #1545</a>
 */
public class FindKthBitInNthBinaryString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Kth Bit in Nth Binary String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindKthBitInNthBinaryString ===");
        FindKthBitInNthBinaryString sol = new FindKthBitInNthBinaryString();
        System.out.println(sol.solve(null));
    }
}
