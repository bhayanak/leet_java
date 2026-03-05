package org.leetcode.hard;


/**
 * <b>#3470 - Permutations IV</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Combinatorics, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers, n and k, an alternating permutation is a permutation of the first n positive integers such that no two adjacent elements are both odd or both even.
 *
 *
 * Return the k-th alternating permutation sorted in lexicographical order. If there are fewer than k valid alternating permutations, return an empty list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, k = 6
 *
 *
 * Output: [3,4,1,2]
 *
 *
 * Explanation:
 *
 *
 * The lexicographically-sorted alternating permutations of [1, 2, 3, 4] are:
 *
 *
 * [1, 2, 3, 4]
 *
 * [1, 4, 3, 2]
 *
 * [2, 1, 4, 3]
 *
 * [2, 3, 4, 1]
 *
 * [3, 2, 1, 4]
 *
 * [3, 4, 1, 2] ← 6th permutation
 *
 * [4, 1, 2, 3]
 *
 * [4, 3, 2, 1]
 *
 * Since k = 6, we return [3, 4, 1, 2].
 *
 * Example 2:
 *
 * Input: n = 3, k = 2
 *
 *
 * Output: [3,2,1]
 *
 *
 * Explanation:
 *
 *
 * The lexicographically-sorted alternating permutations of [1, 2, 3] are:
 *
 *
 * [1, 2, 3]
 *
 * [3, 2, 1] ← 2nd permutation
 *
 * Since k = 2, we return [3, 2, 1].
 *
 * Example 3:
 *
 * Input: n = 2, k = 3
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * The lexicographically-sorted alternating permutations of [1, 2] are:
 *
 *
 * [1, 2]
 *
 * [2, 1]
 *
 * There are only 2 alternating permutations, but k = 3, which is out of range. Thus, we return an empty list [].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= k &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>n</code> is odd, the first number must be odd.
 * Hint 2: If <code>n</code> is even, the first number can be either odd or even.
 * Hint 3: From smallest to largest, place each number and subtract the number of permutations from <code>k</code>.
 * Hint 4: The number of permutations can be calculated using factorials.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Combinatorics, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/permutations-iv/">LeetCode #3470</a>
 */
public class PermutationsIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Permutations IV");
    }

    public static void main(String[] args) {
        System.out.println("=== PermutationsIv ===");
        PermutationsIv sol = new PermutationsIv();
        System.out.println(sol.solve(null));
    }
}
