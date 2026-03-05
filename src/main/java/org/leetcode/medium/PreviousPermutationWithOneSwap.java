package org.leetcode.medium;


/**
 * <b>#1053 - Previous Permutation With One Swap</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers arr (not necessarily distinct), return the lexicographically largest permutation that is smaller than arr, that can be made with exactly one swap. If it cannot be done, then return the same array.
 *
 *
 * Note that a swap exchanges the positions of two numbers arr[i] and arr[j]
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,2,1]
 * Output: [3,1,2]
 * Explanation: Swapping 2 and 1.
 *
 * Example 2:
 *
 * Input: arr = [1,1,5]
 * Output: [1,1,5]
 * Explanation: This is already the smallest permutation.
 *
 * Example 3:
 *
 * Input: arr = [1,9,4,6,7]
 * Output: [1,7,4,6,9]
 * Explanation: Swapping 9 and 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 1 &lt;= arr[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You need to swap two values, one larger than the other.  Where is the larger one located?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/previous-permutation-with-one-swap/">LeetCode #1053</a>
 */
public class PreviousPermutationWithOneSwap {

    /**
     * TODO: Implement "Previous Permutation With One Swap".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Previous Permutation With One Swap");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PreviousPermutationWithOneSwap.java &amp;&amp; java org.leetcode.medium.PreviousPermutationWithOneSwap</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PreviousPermutationWithOneSwap ===");
        PreviousPermutationWithOneSwap sol = new PreviousPermutationWithOneSwap();
        System.out.println(sol.solve(null));
    }
}
