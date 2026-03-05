package org.leetcode.hard;


/**
 * <b>#1803 - Count Pairs With XOR in a Range</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a (0-indexed) integer array nums and two integers low and high, return the number of nice pairs.
 *
 *
 * A nice pair is a pair (i, j) where 0 &lt;= i &lt; j &lt; nums.length and low &lt;= (nums[i] XOR nums[j]) &lt;= high.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: nums = [1,4,2,7], low = 2, high = 6
 * Output: 6
 * Explanation: All nice pairs (i, j) are as follows:
 *     - (0, 1): nums[0] XOR nums[1] = 5 
 *     - (0, 2): nums[0] XOR nums[2] = 3
 *     - (0, 3): nums[0] XOR nums[3] = 6
 *     - (1, 2): nums[1] XOR nums[2] = 6
 *     - (1, 3): nums[1] XOR nums[3] = 3
 *     - (2, 3): nums[2] XOR nums[3] = 5
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: nums = [9,8,4,2,1], low = 5, high = 14
 * Output: 8
 * Explanation: All nice pairs (i, j) are as follows:
 * ​​​​​    - (0, 2): nums[0] XOR nums[2] = 13
 *     - (0, 3): nums[0] XOR nums[3] = 11
 *     - (0, 4): nums[0] XOR nums[4] = 8
 *     - (1, 2): nums[1] XOR nums[2] = 12
 *     - (1, 3): nums[1] XOR nums[3] = 10
 *     - (1, 4): nums[1] XOR nums[4] = 9
 *     - (2, 3): nums[2] XOR nums[3] = 6
 *     - (2, 4): nums[2] XOR nums[4] = 5
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= nums.length &lt;= 2 * 104
 *
 * 1 &lt;= nums[i] &lt;= 2 * 104
 *
 * 1 &lt;= low &lt;= high &lt;= 2 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's note that we can count all pairs with XOR ≤ K, so the answer would be to subtract the number of pairs withs XOR &lt; low from the number of pairs with XOR ≤ high.
 * Hint 2: For each value, find out the number of values when you XOR it with the result is  ≤ K using a trie.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Trie).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-pairs-with-xor-in-a-range/">LeetCode #1803</a>
 */
public class CountPairsWithXorInARange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Pairs With XOR in a Range");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountPairsWithXorInARange ===");
        CountPairsWithXorInARange sol = new CountPairsWithXorInARange();
        System.out.println(sol.solve(null));
    }
}
