package org.leetcode.hard;


/**
 * <b>#3266 - Final Array State After K Multiplication Operations II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums, an integer k, and an integer multiplier.
 *
 *
 * You need to perform k operations on nums. In each operation:
 *
 *
 * Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
 *
 * Replace the selected minimum value x with x * multiplier.
 *
 * After the k operations, apply modulo 109 + 7 to every value in nums.
 *
 *
 * Return an integer array denoting the final state of nums after performing all k operations and then applying the modulo.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
 *
 *
 * Output: [8,4,6,5,6]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Operation
 * 			Result
 *
 *
 *
 *
 * 			After operation 1
 * 			[2, 2, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 2
 * 			[4, 2, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 3
 * 			[4, 4, 3, 5, 6]
 *
 *
 *
 *
 * 			After operation 4
 * 			[4, 4, 6, 5, 6]
 *
 *
 *
 *
 * 			After operation 5
 * 			[8, 4, 6, 5, 6]
 *
 *
 *
 *
 * 			After applying modulo
 * 			[8, 4, 6, 5, 6]
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [100000,2000], k = 2, multiplier = 1000000
 *
 *
 * Output: [999999307,999999993]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Operation
 * 			Result
 *
 *
 *
 *
 * 			After operation 1
 * 			[100000, 2000000000]
 *
 *
 *
 *
 * 			After operation 2
 * 			[100000000000, 2000000000]
 *
 *
 *
 *
 * 			After applying modulo
 * 			[999999307, 999999993]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 109
 *
 * 1 &lt;= multiplier &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What happens when <code>min(nums) * multiplier &gt; max(nums)</code>?
 * Hint 2: A cycle of operations begins.
 * Hint 3: Simulate until <code>min(nums) * multiplier &gt; max(nums)</code>, then greedily distribute remaining multiplications.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-ii/">LeetCode #3266</a>
 */
public class FinalArrayStateAfterKMultiplicationOperationsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Final Array State After K Multiplication Operations II");
    }

    public static void main(String[] args) {
        System.out.println("=== FinalArrayStateAfterKMultiplicationOperationsIi ===");
        FinalArrayStateAfterKMultiplicationOperationsIi sol = new FinalArrayStateAfterKMultiplicationOperationsIi();
        System.out.println(sol.solve(null));
    }
}
