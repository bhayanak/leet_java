package org.leetcode.medium;


/**
 * <b>#3728 - Stable Subarrays With Equal Boundary and Interior Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array capacity.
 *
 *
 * A subarray capacity[l..r] is considered stable if:
 *
 *
 * Its length is at least 3.
 *
 * The first and last elements are each equal to the sum of all elements strictly between them (i.e., capacity[l] = capacity[r] = capacity[l + 1] + capacity[l + 2] + ... + capacity[r - 1]).
 *
 * Return an integer denoting the number of stable subarrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: capacity = [9,3,3,3,9]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * [9,3,3,3,9] is stable because the first and last elements are both 9, and the sum of the elements strictly between them is 3 + 3 + 3 = 9.
 *
 * [3,3,3] is stable because the first and last elements are both 3, and the sum of the elements strictly between them is 3.
 *
 * Example 2:
 *
 * Input: capacity = [1,2,3,4,5]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No subarray of length at least 3 has equal first and last elements, so the answer is 0.
 *
 * Example 3:
 *
 * Input: capacity = [-4,4,0,0,-8,-4]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * [-4,4,0,0,-8,-4] is stable because the first and last elements are both -4, and the sum of the elements strictly between them is 4 + 0 + 0 + (-8) = -4
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= capacity.length &lt;= 105
 *
 * -109 &lt;= capacity[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix sums
 * Hint 2: Let the prefix sum array be <code>p</code>; notice that for a stable range <code>[l, r]</code>, the condition becomes <code>p[r - 1] - p[l] == a[r]</code> and <code>a[l] == a[r]</code>
 * Hint 3: For each index <code>r</code>, you want to count the number of previous indices <code>l</code> such that <code>p[l] == p[r - 1] - a[r]</code> and <code>a[l] == a[r]</code>
 * Hint 4: You can do this efficiently by maintaining a map from <code>(a[i], p[i])</code> to a frequency count as you iterate
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/stable-subarrays-with-equal-boundary-and-interior-sum/">LeetCode #3728</a>
 */
public class StableSubarraysWithEqualBoundaryAndInteriorSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stable Subarrays With Equal Boundary and Interior Sum");
    }

    public static void main(String[] args) {
        System.out.println("=== StableSubarraysWithEqualBoundaryAndInteriorSum ===");
        StableSubarraysWithEqualBoundaryAndInteriorSum sol = new StableSubarraysWithEqualBoundaryAndInteriorSum();
        System.out.println(sol.solve(null));
    }
}
