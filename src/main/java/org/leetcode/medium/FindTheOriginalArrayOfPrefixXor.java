package org.leetcode.medium;


/**
 * <b>#2433 - Find The Original Array of Prefix Xor</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
 *
 *
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 *
 * Note that ^ denotes the bitwise-xor operation.
 *
 *
 * It can be proven that the answer is unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: pref = [5,2,0,3,1]
 * Output: [5,7,2,3,2]
 * Explanation: From the array [5,7,2,3,2] we have the following:
 * - pref[0] = 5.
 * - pref[1] = 5 ^ 7 = 2.
 * - pref[2] = 5 ^ 7 ^ 2 = 0.
 * - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
 * - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
 *
 * Example 2:
 *
 * Input: pref = [13]
 * Output: [13]
 * Explanation: We have pref[0] = arr[0] = 13.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pref.length &lt;= 105
 *
 * 0 &lt;= pref[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the following equation: x ^ a = b. How can you find x?
 * Hint 2: Notice that arr[i] ^ pref[i-1] = pref[i]. This is the same as the previous equation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/">LeetCode #2433</a>
 */
public class FindTheOriginalArrayOfPrefixXor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find The Original Array of Prefix Xor");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheOriginalArrayOfPrefixXor ===");
        FindTheOriginalArrayOfPrefixXor sol = new FindTheOriginalArrayOfPrefixXor();
        System.out.println(sol.solve(null));
    }
}
