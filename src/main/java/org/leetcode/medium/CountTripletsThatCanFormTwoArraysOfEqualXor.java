package org.leetcode.medium;


/**
 * <b>#1442 - Count Triplets That Can Form Two Arrays of Equal XOR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr.
 *
 *
 * We want to select three indices i, j and k where (0 &lt;= i &lt; j &lt;= k &lt; arr.length).
 *
 *
 * Let's define a and b as follows:
 *
 *
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
 *
 * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
 *
 * Note that ^ denotes the bitwise-xor operation.
 *
 *
 * Return the number of triplets (i, j and k) Where a == b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,3,1,6,7]
 * Output: 4
 * Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)
 *
 * Example 2:
 *
 * Input: arr = [1,1,1,1,1]
 * Output: 10
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 300
 *
 * 1 &lt;= arr[i] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We are searching for sub-array of length ≥ 2 and we need to split it to 2 non-empty arrays so that the xor of the first array is equal to the xor of the second array. This is equivalent to searching for sub-array with xor = 0.
 * Hint 2: Keep the prefix xor of arr in another array, check the xor of all sub-arrays in O(n^2), if the xor of sub-array of length x is 0 add x-1 to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/">LeetCode #1442</a>
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Triplets That Can Form Two Arrays of Equal XOR");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountTripletsThatCanFormTwoArraysOfEqualXor ===");
        CountTripletsThatCanFormTwoArraysOfEqualXor sol = new CountTripletsThatCanFormTwoArraysOfEqualXor();
        System.out.println(sol.solve(null));
    }
}
