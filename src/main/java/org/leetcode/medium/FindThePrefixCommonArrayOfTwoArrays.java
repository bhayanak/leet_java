package org.leetcode.medium;


/**
 * <b>#2657 - Find the Prefix Common Array of Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer permutations A and B of length n.
 *
 *
 * A prefix common array of A and B is an array C such that C[i] is equal to the count of numbers that are present at or before the index i in both A and B.
 *
 *
 * Return the prefix common array of A and B.
 *
 *
 * A sequence of n integers is called a permutation if it contains all integers from 1 to n exactly once.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,3,2,4], B = [3,1,2,4]
 * Output: [0,2,3,4]
 * Explanation: At i = 0: no number is common, so C[0] = 0.
 * At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
 * At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
 * At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
 *
 * Example 2:
 *
 * Input: A = [2,3,1], B = [3,1,2]
 * Output: [0,1,3]
 * Explanation: At i = 0: no number is common, so C[0] = 0.
 * At i = 1: only 3 is common in A and B, so C[1] = 1.
 * At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= A.length == B.length == n &lt;= 50
 *
 * 1 &lt;= A[i], B[i] &lt;= n
 *
 * It is guaranteed that A and B are both a permutation of n integers.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider keeping a frequency array that stores the count of occurrences of each number till index i.
 * Hint 2: If a number occurred two times, it means it occurred in both A and B since they’re both permutations so add one to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/">LeetCode #2657</a>
 */
public class FindThePrefixCommonArrayOfTwoArrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Prefix Common Array of Two Arrays");
    }

    public static void main(String[] args) {
        System.out.println("=== FindThePrefixCommonArrayOfTwoArrays ===");
        FindThePrefixCommonArrayOfTwoArrays sol = new FindThePrefixCommonArrayOfTwoArrays();
        System.out.println(sol.solve(null));
    }
}
