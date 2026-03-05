package org.leetcode.hard;


/**
 * <b>#3149 - Find the Minimum Cost Array Permutation</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums which is a permutation of [0, 1, 2, ..., n - 1]. The score of any permutation of [0, 1, 2, ..., n - 1] named perm is defined as:
 *
 *
 * score(perm) = |perm[0] - nums[perm[1]]| + |perm[1] - nums[perm[2]]| + ... + |perm[n - 1] - nums[perm[0]]|
 *
 *
 * Return the permutation perm which has the minimum possible score. If multiple permutations exist with this score, return the one that is lexicographically smallest among them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,2]
 *
 *
 * Output: [0,1,2]
 *
 *
 * Explanation:
 *
 * The lexicographically smallest permutation with minimum cost is [0,1,2]. The cost of this permutation is |0 - 0| + |1 - 2| + |2 - 1| = 2.
 *
 * Example 2:
 *
 * Input: nums = [0,2,1]
 *
 *
 * Output: [0,2,1]
 *
 *
 * Explanation:
 *
 * The lexicographically smallest permutation with minimum cost is [0,2,1]. The cost of this permutation is |0 - 1| + |2 - 2| + |1 - 0| = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == nums.length &lt;= 14
 *
 * nums is a permutation of [0, 1, 2, ..., n - 1].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The score function is cyclic, so we can always set <code>perm[0] = 0</code> for the smallest lexical order.
 * Hint 2: It’s similar to the Traveling Salesman Problem. Use Dynamic Programming.
 * Hint 3: Use a bitmask to track which elements have been assigned to <code>perm</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-cost-array-permutation/">LeetCode #3149</a>
 */
public class FindTheMinimumCostArrayPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Cost Array Permutation");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumCostArrayPermutation ===");
        FindTheMinimumCostArrayPermutation sol = new FindTheMinimumCostArrayPermutation();
        System.out.println(sol.solve(null));
    }
}
