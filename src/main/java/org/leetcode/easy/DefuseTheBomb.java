package org.leetcode.easy;


/**
 * <b>#1652 - Defuse the Bomb</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
 *
 *
 * To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
 *
 *
 * If k &gt; 0, replace the ith number with the sum of the next k numbers.
 *
 * If k &lt; 0, replace the ith number with the sum of the previous -k numbers.
 *
 * If k == 0, replace the ith number with 0.
 *
 * As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
 *
 *
 * Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 *
 *
 *
 *
 * Example 1:
 *
 * Input: code = [5,7,1,4], k = 3
 * Output: [12,10,16,13]
 * Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
 *
 * Example 2:
 *
 * Input: code = [1,2,3,4], k = 0
 * Output: [0,0,0,0]
 * Explanation: When k is zero, the numbers are replaced by 0. 
 *
 * Example 3:
 *
 * Input: code = [2,4,9,3], k = -2
 * Output: [12,5,6,13]
 * Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4]. Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
 *
 *
 *
 * Constraints:
 *
 *
 * n == code.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= code[i] &lt;= 100
 *
 * -(n - 1) &lt;= k &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: As the array is circular, use modulo to find the correct index.
 * Hint 2: The constraints are low enough for a brute-force solution.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/defuse-the-bomb/">LeetCode #1652</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class DefuseTheBomb {

    /**
     * Solves the problem: Decrypt.
     *
     * @param code the code (int[])
     * @param k the k (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k==0) return res;
        for (int i=0;i<n;i++) {
            int sum=0;
            for (int j=1;j<=Math.abs(k);j++)
                sum += (k>0) ? code[(i+j)%n] : code[(i-j+n)%n];
            res[i]=sum;
        }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DefuseTheBomb sol = new DefuseTheBomb();
                System.out.println(java.util.Arrays.toString(sol.decrypt(new int[]{5,7,1,4}, 3))); // [12,10,16,13]
                System.out.println(java.util.Arrays.toString(sol.decrypt(new int[]{1,2,3,4}, 0))); // [0,0,0,0]
                System.out.println(java.util.Arrays.toString(sol.decrypt(new int[]{2,4,9,3}, -2))); // [12,5,6,13]
    }
}
