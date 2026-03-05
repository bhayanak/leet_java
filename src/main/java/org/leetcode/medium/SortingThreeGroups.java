package org.leetcode.medium;


/**
 * <b>#2826 - Sorting Three Groups</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. Each element in nums is 1, 2 or 3. In each operation, you can remove an element from nums. Return the minimum number of operations to make nums non-decreasing.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,2,1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * One of the optimal solutions is to remove nums[0], nums[2] and nums[3].
 *
 * Example 2:
 *
 * Input: nums = [1,3,2,1,3,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One of the optimal solutions is to remove nums[1] and nums[2].
 *
 * Example 3:
 *
 * Input: nums = [2,2,2,2,3,3]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * nums is already non-decreasing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 3
 *
 *
 * Follow-up: Can you come up with an algorithm that runs in O(n) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem asks to change the array nums to make it sorted (i.e., all the 1s are on the left of 2s, and all the 2s are on the left of 3s.).
 * Hint 2: We can try all the possibilities to make nums indices range in [0, i) to 0 and [i, j) to 1 and [j, n) to 2. Note the ranges are left-close and right-open; each might be empty. Namely, 0 &lt;= i &lt;= j &lt;= n.
 * Hint 3: Count the changes we need for each possibility by comparing the expected and original values at each index position.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/sorting-three-groups/">LeetCode #2826</a>
 */
public class SortingThreeGroups {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sorting Three Groups");
    }

    public static void main(String[] args) {
        System.out.println("=== SortingThreeGroups ===");
        SortingThreeGroups sol = new SortingThreeGroups();
        System.out.println(sol.solve(null));
    }
}
