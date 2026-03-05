package org.leetcode.medium;


/**
 * <b>#3513 - Number of Unique XOR Triplets I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n, where nums is a permutation of the numbers in the range [1, n].
 *
 *
 * A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i &lt;= j &lt;= k.
 *
 *
 * Return the number of unique XOR triplet values from all possible triplets (i, j, k).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The possible XOR triplet values are:
 *
 *
 * (0, 0, 0) → 1 XOR 1 XOR 1 = 1
 *
 * (0, 0, 1) → 1 XOR 1 XOR 2 = 2
 *
 * (0, 1, 1) → 1 XOR 2 XOR 2 = 1
 *
 * (1, 1, 1) → 2 XOR 2 XOR 2 = 2
 *
 * The unique XOR values are {1, 2}, so the output is 2.
 *
 * Example 2:
 *
 * Input: nums = [3,1,2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The possible XOR triplet values include:
 *
 *
 * (0, 0, 0) → 3 XOR 3 XOR 3 = 3
 *
 * (0, 0, 1) → 3 XOR 3 XOR 1 = 1
 *
 * (0, 0, 2) → 3 XOR 3 XOR 2 = 2
 *
 * (0, 1, 2) → 3 XOR 1 XOR 2 = 0
 *
 * The unique XOR values are {0, 1, 2, 3}, so the output is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= n
 *
 * nums is a permutation of integers from 1 to n.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the maximum and minimum value we can obtain using the given numbers?
 * Hint 2: Can we generate all numbers within that range?
 * Hint 3: For <code>n &gt;= 3</code> we can obtain all numbers in <code>[0, 2^(msb(n) + 1) - 1]</code>, where <code>msb(n)</code> is the index of the most significant bit in <code>n</code>’s binary representation (i.e., the highest power of 2 less than or equal to <code>n</code>). Handle the case when <code>n &lt;= 2</code> separately.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-unique-xor-triplets-i/">LeetCode #3513</a>
 */
public class NumberOfUniqueXorTripletsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Unique XOR Triplets I");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfUniqueXorTripletsI ===");
        NumberOfUniqueXorTripletsI sol = new NumberOfUniqueXorTripletsI();
        System.out.println(sol.solve(null));
    }
}
