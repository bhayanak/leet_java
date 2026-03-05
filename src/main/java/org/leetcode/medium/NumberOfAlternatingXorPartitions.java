package org.leetcode.medium;


/**
 * <b>#3811 - Number of Alternating XOR Partitions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two distinct integers target1 and target2.
 *
 *
 * A partition of nums splits it into one or more contiguous, non-empty blocks that cover the entire array without overlap.
 *
 *
 * A partition is valid if the bitwise XOR of elements in its blocks alternates between target1 and target2, starting with target1.
 *
 *
 * Formally, for blocks b1, b2, …:
 *
 *
 * XOR(b1) = target1
 *
 * XOR(b2) = target2 (if it exists)
 *
 * XOR(b3) = target1, and so on.
 *
 * Return the number of valid partitions of nums, modulo 109 + 7.
 *
 *
 * Note: A single block is valid if its XOR equals target1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,4], target1 = 1, target2 = 5
 *
 *
 * Output: 1
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * The XOR of [2, 3] is 1, which matches target1.
 *
 * The XOR of the remaining block [1, 4] is 5, which matches target2.
 *
 * This is the only valid alternating partition, so the answer is 1.
 *
 * Example 2:
 *
 * Input: nums = [1,0,0], target1 = 1, target2 = 0
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​The XOR of [1, 0, 0] is 1, which matches target1.
 *
 * The XOR of [1] and [0, 0] are 1 and 0, matching target1 and target2.
 *
 * The XOR of [1, 0] and [0] are 1 and 0, matching target1 and target2.
 *
 * Thus, the answer is 3.​​​​​​​
 *
 * Example 3:
 *
 * Input: nums = [7], target1 = 1, target2 = 7
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The XOR of [7] is 7, which does not match target1, so no valid partition exists.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i], target1, target2 &lt;= 105
 *
 * target1 != target2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Compute prefix XORs so the XOR of a block <code>[l..r]</code> can be obtained as <code>pref[r] ^ pref[l - 1]</code>.
 * Hint 3: For each position, try ending a block whose XOR equals the expected target, and transition to the next state (alternating between <code>target1</code> and <code>target2</code>).
 * Hint 4: Use a hash map or array indexed by prefix XOR values to efficiently count valid previous split points.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-alternating-xor-partitions/">LeetCode #3811</a>
 */
public class NumberOfAlternatingXorPartitions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Alternating XOR Partitions");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfAlternatingXorPartitions ===");
        NumberOfAlternatingXorPartitions sol = new NumberOfAlternatingXorPartitions();
        System.out.println(sol.solve(null));
    }
}
