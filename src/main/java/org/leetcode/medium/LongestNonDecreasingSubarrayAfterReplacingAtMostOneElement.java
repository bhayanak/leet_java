package org.leetcode.medium;


/**
 * <b>#3738 - Longest Non-Decreasing Subarray After Replacing at Most One Element</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You are allowed to replace at most one element in the array with any other integer value of your choice.
 *
 *
 * Return the length of the longest non-decreasing subarray that can be obtained after performing at most one replacement.
 *
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous one (if it exists).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Replacing nums[3] = 1 with 3 gives the array [1, 2, 3, 3, 2].
 *
 *
 * The longest non-decreasing subarray is [1, 2, 3, 3], which has a length of 4.
 *
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * All elements in nums are equal, so it is already non-decreasing and the entire nums forms a subarray of length 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix and suffix arrays
 * Hint 2: Create a prefix array where <code>pref[i]</code> denotes the maximum-length non-decreasing subarray ending at <code>i</code>
 * Hint 3: Create a suffix array where <code>suff[i]</code> denotes the maximum-length non-decreasing subarray starting at <code>i</code>
 * Hint 4: Let the initial maximum be <code>max(max(pref), max(suff))</code>
 * Hint 5: For each index <code>i</code>, try to combine the prefix ending at <code>i - 1</code> and the suffix starting at <code>i + 1</code> if possible; also consider the maximum without combining them
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-non-decreasing-subarray-after-replacing-at-most-one-element/">LeetCode #3738</a>
 */
public class LongestNonDecreasingSubarrayAfterReplacingAtMostOneElement {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Non-Decreasing Subarray After Replacing at Most One Element");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestNonDecreasingSubarrayAfterReplacingAtMostOneElement ===");
        LongestNonDecreasingSubarrayAfterReplacingAtMostOneElement sol = new LongestNonDecreasingSubarrayAfterReplacingAtMostOneElement();
        System.out.println(sol.solve(null));
    }
}
