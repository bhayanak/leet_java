package org.leetcode.medium;


/**
 * <b>#1734 - Decode XORed Permutation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an integer array perm that is a permutation of the first n positive integers, where n is always odd.
 *
 *
 * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = perm[i] XOR perm[i + 1]. For example, if perm = [1,3,2], then encoded = [2,1].
 *
 *
 * Given the encoded array, return the original array perm. It is guaranteed that the answer exists and is unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: encoded = [3,1]
 * Output: [1,2,3]
 * Explanation: If perm = [1,2,3], then encoded = [1 XOR 2,2 XOR 3] = [3,1]
 *
 * Example 2:
 *
 * Input: encoded = [6,5,4,6]
 * Output: [2,4,1,5,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt; 105
 *
 * n is odd.
 *
 * encoded.length == n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compute the XOR of the numbers between 1 and n, and think about how it can be used. Let it be x.
 * Hint 2: Think why n is odd.
 * Hint 3: perm[0] = x XOR encoded[1] XOR encoded[3] XOR encoded[5] ...
 * Hint 4: perm[i] = perm[i-1] XOR encoded[i-1]
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/decode-xored-permutation/">LeetCode #1734</a>
 */
public class DecodeXoredPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Decode XORed Permutation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DecodeXoredPermutation ===");
        DecodeXoredPermutation sol = new DecodeXoredPermutation();
        System.out.println(sol.solve(null));
    }
}
