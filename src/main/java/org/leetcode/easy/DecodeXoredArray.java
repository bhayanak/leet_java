package org.leetcode.easy;


/**
 * <b>#1720 - Decode XORed Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a hidden integer array arr that consists of n non-negative integers.
 *
 *
 * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 *
 *
 * You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
 *
 *
 * Return the original array arr. It can be proved that the answer exists and is unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: encoded = [1,2,3], first = 1
 * Output: [1,0,2,1]
 * Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
 *
 * Example 2:
 *
 * Input: encoded = [6,2,7,3], first = 4
 * Output: [4,2,0,7,4]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 104
 *
 * encoded.length == n - 1
 *
 * 0 &lt;= encoded[i] &lt;= 105
 *
 * 0 &lt;= first &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since that encoded[i] = arr[i] XOR arr[i+1], then arr[i+1] = encoded[i] XOR arr[i].
 * Hint 2: Iterate on i from beginning to end, and set arr[i+1] = encoded[i] XOR arr[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/decode-xored-array/">LeetCode #1720</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class DecodeXoredArray {

    /**
     * Solves the problem: Decode.
     *
     * @param encoded the encoded (int[])
     * @param first the first (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0]=first;
        for (int i=0;i<encoded.length;i++) arr[i+1]=arr[i]^encoded[i];
        return arr;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DecodeXoredArray sol = new DecodeXoredArray();
                System.out.println(java.util.Arrays.toString(sol.decode(new int[]{1,2,3},1))); // [1,0,2,1]
                System.out.println(java.util.Arrays.toString(sol.decode(new int[]{6,2,7,3},4))); // [4,2,0,7,4]
    }
}
