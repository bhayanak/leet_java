package org.leetcode.medium;


/**
 * <b>#2425 - Bitwise XOR of All Pairings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed arrays, nums1 and nums2, consisting of non-negative integers. Let there be another array, nums3, which contains the bitwise XOR of all pairings of integers between nums1 and nums2 (every integer in nums1 is paired with every integer in nums2 exactly once).
 *
 *
 * Return the bitwise XOR of all integers in nums3.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,1,3], nums2 = [10,2,5,0]
 * Output: 13
 * Explanation:
 * A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
 * The bitwise XOR of all these numbers is 13, so we return 13.
 *
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 0
 * Explanation:
 * All possible pairs of bitwise XORs are nums1[0] ^ nums2[0], nums1[0] ^ nums2[1], nums1[1] ^ nums2[0],
 * and nums1[1] ^ nums2[1].
 * Thus, one possible nums3 array is [2,5,1,6].
 * 2 ^ 5 ^ 1 ^ 6 = 0, so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 105
 *
 * 0 &lt;= nums1[i], nums2[j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think how the count of each individual integer affects the final answer.
 * Hint 2: If the length of nums1 is m and the length of nums2 is n, then each number in nums1 is repeated n times and each number in nums2 is repeated m times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Brainteaser).
 *
 * @see <a href="https://leetcode.com/problems/bitwise-xor-of-all-pairings/">LeetCode #2425</a>
 */
public class BitwiseXorOfAllPairings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Bitwise XOR of All Pairings");
    }

    public static void main(String[] args) {
        System.out.println("=== BitwiseXorOfAllPairings ===");
        BitwiseXorOfAllPairings sol = new BitwiseXorOfAllPairings();
        System.out.println(sol.solve(null));
    }
}
