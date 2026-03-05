package org.leetcode.medium;


/**
 * <b>#3587 - Minimum Adjacent Swaps to Alternate Parity</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of distinct integers.
 *
 *
 * In one operation, you can swap any two adjacent elements in the array.
 *
 *
 * An arrangement of the array is considered valid if the parity of adjacent elements alternates, meaning every pair of neighboring elements consists of one even and one odd number.
 *
 *
 * Return the minimum number of adjacent swaps required to transform nums into any valid arrangement.
 *
 *
 * If it is impossible to rearrange nums such that no two adjacent elements have the same parity, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,6,5,7]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Swapping 5 and 6, the array becomes [2,4,5,6,7]
 *
 *
 * Swapping 5 and 4, the array becomes [2,5,4,6,7]
 *
 *
 * Swapping 6 and 7, the array becomes [2,5,4,7,6]. The array is now a valid arrangement. Thus, the answer is 3.
 *
 * Example 2:
 *
 * Input: nums = [2,4,5,7]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * By swapping 4 and 5, the array becomes [2,5,4,7], which is a valid arrangement. Thus, the answer is 1.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The array is already a valid arrangement. Thus, no operations are needed.
 *
 * Example 4:
 *
 * Input: nums = [4,5,6,8]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * No valid arrangement is possible. Thus, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * All elements in nums are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compute <code>evenCnt</code> and <code>oddCnt</code> in <code>nums</code>. If abs(evenCnt - oddCnt) &gt; 1, return -1 immediately.
 * Hint 2: Let <code>n</code> = len(nums). You’ll try at most two target parity‐patterns: one starting with even at index 0, one with odd at index 0.
 * Hint 3: If <code>n</code> is odd, only the pattern whose starting parity matches the larger of <code>evenCnt</code> or <code>oddCnt</code> is feasible. If <code>n</code> is even, both starting‐even and starting‐odd patterns are possible—compute both and take the minimum.
 * Hint 4: For a given target pattern, collect the indices of all even elements in <code>nums</code> (or odd elements) and the indices where an even (or odd) should go in the pattern.
 * Hint 5: The minimum adjacent‐swap cost to align those elements is the sum of absolute differences between each element’s current index and its target index.
 * Hint 6: Return the smallest cost over valid patterns.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-adjacent-swaps-to-alternate-parity/">LeetCode #3587</a>
 */
public class MinimumAdjacentSwapsToAlternateParity {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Adjacent Swaps to Alternate Parity");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAdjacentSwapsToAlternateParity ===");
        MinimumAdjacentSwapsToAlternateParity sol = new MinimumAdjacentSwapsToAlternateParity();
        System.out.println(sol.solve(null));
    }
}
